package de.dc.javafx.mm.editor.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;

public class ResourceManager{
 

	/**
	 * Close the edited file, if any ...
	 * 
	 * @throws PartInitException
	 */
	public static void closeEditor(IFile file, IWorkbenchWindow aww) throws PartInitException {
		if (aww == null) {
			aww = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		}
		IEditorReference[] references = aww.getActivePage().getEditorReferences();
		for (int i = 0; i < references.length; i++) {
			IEditorReference reference = references[i];
			IFile f = reference.getEditorInput().getAdapter(IFile.class);

			if (file.equals(f)) {
				reference.getPage().closeEditors(new IEditorReference[] { reference }, false);
			}
		}
	}

	/**
	 * Create a folder if it doesnt not exist
	 * 
	 * @param project
	 * @param folderPath
	 * @param monitor
	 * @return
	 * @throws CoreException
	 */
	public static IFolder ensureFolder(IProject project, String folderPath, IProgressMonitor monitor)
			throws CoreException {

		IFolder f = project.getFolder(folderPath);
		if (f.exists()) {
			return f;
		}
		StringTokenizer st = new StringTokenizer(folderPath, "/");
		StringBuffer sb = new StringBuffer();
		while (st.hasMoreTokens()) {
			sb.append(st.nextToken());
			IFolder folder = project.getFolder(sb.toString());
			if (!folder.exists()) {
				folder.create(IResource.NONE, true, monitor);
			}
			sb.append("/");
		}
		IFolder folder = project.getFolder(folderPath);
		return folder;
	}

	/**
	 * Return whether the candidate child is on the parent folder
	 * 
	 * @param parent
	 * @param candidateChild
	 * @return
	 */
	public static boolean isInFolder(IPath parent, IPath candidateChild) {
		return parent.isPrefixOf(candidateChild);
	}


	/**
	 * @param file
	 * @param content
	 * @throws CoreException
	 */
	public static void save(IFile file, String content, IProgressMonitor monitor) throws CoreException {
		try {
			byte[] source = content.getBytes(Charset.forName("UTF-8"));
			if (file.exists()) {
				file.setContents(new ByteArrayInputStream(source), IResource.KEEP_HISTORY, monitor);
			} else {
				file.create(new ByteArrayInputStream(source), true, monitor);
			}
		} catch (CoreException e) {
			System.err.println("XXXXXXX " + file.getFullPath());
			throw e;
		}
	}

	/**
	 * @param folder
	 * @throws CoreException
	 */
	public static void ensureFolder(IFolder folder) throws CoreException {
		if (!folder.exists()) {
			ensureFolder((IFolder) folder.getParent());
			folder.create(false, false, null);
		}
	}

	public static IFolder createFolder(IPath parentPath, IPath folder) throws CoreException {
		IWorkspaceRoot wroot = ResourcesPlugin.getWorkspace().getRoot();
		IFolder pf = wroot.getFolder(parentPath);
		int max = folder.segmentCount();
		IFolder childFolder = pf;
		for (int i = 0; i < max; i++) {
			childFolder = childFolder.getFolder(folder.segment(i));
			childFolder.create(IResource.NONE, true, new NullProgressMonitor());
		}
		return childFolder;
	}

	/**
	 * Create a subfolder
	 * 
	 * @param parentPath
	 * @param folder
	 * @throws CoreException
	 */
	public static IFolder createFolder(String parentPath, String folder) throws CoreException {
		IWorkspaceRoot wroot = ResourcesPlugin.getWorkspace().getRoot();
		IFolder pf = wroot.getFolder(new Path(parentPath));
		IFolder childFolder = pf.getFolder(new Path(folder));
		childFolder.create(IResource.NONE, true, new NullProgressMonitor());
		return childFolder;
	}

	/**
	 * @param container
	 * @param path
	 * @return
	 * @throws CoreException
	 */
	private static IFile processContainer(IContainer container, String path) throws CoreException {
		IResource[] members = container.members();
		for (IResource member : members) {
			if (member instanceof IContainer) {
				IFile file = processContainer((IContainer) member, path);
				if (file != null) {
					IPath p = ResourceManager.getPathWithinPackageFragment(file); // avoid
																					// file
																					// within
																					// classes
																					// directory
					if (p != null)
						return file;
				}
			} else if (member instanceof IFile) {
				IFile ifile = (IFile) member;
				if (ifile.getFullPath().toString().endsWith(path)) {
					return ifile;
				}
			}
		}
		return null;
	}

	/**
	 * @param container
	 * @param files
	 * @throws CoreException
	 */
	public static void getAllJUnitResultFiles(String projectName, List<IFile> files) throws CoreException {
		if (projectName == null)
			return;
		IContainer container = ResourceManager.getProject(projectName);
		container.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		IResource[] members = container.members();
		for (IResource member : members) {
			if (member instanceof IFile) {
				IFile file = (IFile) member;
				if (isJUnitResultFile(file)) {
					files.add(file);
				}
			}
		}
	}

	public static void getAllWorkBookFiles(String projectName, List<IFile> files) throws CoreException {
		if (projectName == null)
			return;
		IContainer container = ResourceManager.getProject(projectName);
		container.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		IResource[] members = container.members();
		for (IResource member : members) {
			if (member instanceof IFile) {
				IFile file = (IFile) member;
				if (isWorkBookFile(file)) {
					files.add(file);
				}
			}
		}
	}

	public static boolean isWorkBookFile(IFile file) throws CoreException {
		String extension = file.getFileExtension();
		if ("xlsx".equalsIgnoreCase(extension)) {
			return true;
		}
		return false;
	}

	
	public static boolean isJUnitResultFile(IFile file) throws CoreException {
		String filename = file.getName();
		String extension = file.getFileExtension();
		if (filename.startsWith("TEST-GraphWalker-") && "xml".equalsIgnoreCase(extension)) {
			return true;
		}
		return false;
	}

	/**
	 * @param path
	 * @return
	 * @throws CoreException
	 */
	public static IPath find(IProject project, String path) throws CoreException {
		IContainer root = (IContainer) getWorkspaceRoot().findMember(project.getName());
		IFile file = processContainer(root, path);
		if (file != null) {
			return file.getFullPath();
		}
		return null;
	}

	/**
	 * Create a file in a folder with the specified name and content
	 * 
	 * @param projectname
	 * @param destFolder
	 * @param filename
	 * @param content
	 * @throws CoreException
	 */
	public static IFile createFile(String projectname, String destFolder, String pkg, String filename, String content)
			throws CoreException {
		IProject project = getProject(projectname);
		IFolder folder = project.getFolder(new Path(destFolder));
		if (!folder.exists())
			folder.create(true, true, null);
		IFolder container = folder;
		if (pkg != null) {
			StringTokenizer st = new StringTokenizer(pkg, "/");
			while (st.hasMoreTokens()) {
				String dir = st.nextToken();
				IFolder f = container.getFolder(new Path(dir));
				if (!f.exists()) {
					f.create(true, true, null);
				}
				container = f;
			}
		}

		IFile newFile = container.getFile(new Path(filename));
		newFile.create(new ByteArrayInputStream(content.getBytes()), true, null);
		return newFile;
	}

	/**
	 * @param projectname
	 * @param folder
	 * @param filename
	 * @return whether the file exists in the specified project & folder
	 * @throws CoreException
	 */
	public static File getFile(String projectname, String folder, String pkg, String filename) throws CoreException {
		IProject project = getProject(projectname);
		IFolder destFolder = project.getFolder(new Path(folder));
		IFolder container = destFolder;
		if (pkg != null) {
			StringTokenizer st = new StringTokenizer(pkg, "/");
			while (st.hasMoreTokens()) {
				String dir = st.nextToken();
				IFolder f = container.getFolder(new Path(dir));
				if (!f.exists()) {
					f.create(true, true, null);
				}
				container = f;
			}
		}
		IFile file = container.getFile(new Path(filename));
		return file.getRawLocation().makeAbsolute().toFile();
	}

	/**
	 * @param project
	 * @param qualifiedName
	 * @return
	 * @throws CoreException
	 */
	public static IFile getIFileFromQualifiedName(String projectname, String qualifiedName) throws CoreException {
		IProject project = getProject(projectname);
		IJavaProject jproject = JavaCore.create(project);
		IPackageFragment[] pkgs = jproject.getPackageFragments();
		String spath = qualifiedName.replace(".", "/");
		for (int i = 0; i < pkgs.length; i++) {
			if (pkgs[i].getKind() != IPackageFragmentRoot.K_SOURCE)
				continue;
			IPath path = pkgs[i].getPath().append(spath);
			IFile iFile = (IFile) ResourceManager.getResource(path.toString() + ".java");
			if (iFile != null && iFile.exists())
				return iFile;
		}
		return null;
	}

	public static IFile toIFile(IStructuredSelection selection) {
		Object obj = selection.getFirstElement();
		IFile file = (IFile) Platform.getAdapterManager().getAdapter(obj, IFile.class);
		if (file == null) {
			if (obj instanceof IAdaptable) {
				file = (IFile) ((IAdaptable) obj).getAdapter(IFile.class);
			}
		}
		return file;
	}

	/**
	 * @param file
	 * @throws CoreException
	 * @throws FileNotFoundException
	 * @throws InterruptedException
	 */
	public static File createFile(IFile file, IProgressMonitor monitor) throws CoreException, FileNotFoundException {
		if (file.exists()) {
			return ResourceManager.toFile(file.getFullPath());
		}

		byte[] content = "".getBytes(Charset.forName("UTF-8"));
		file.create(new ByteArrayInputStream(content), IResource.KEEP_HISTORY, monitor);
		IResource resource = getWorkspaceRoot().findMember(file.getFullPath());
		IPath path = resource.getRawLocation();
		return new File(path.makeAbsolute().toString());
	}

	/**
	 * Return the OS File
	 * 
	 * @param in
	 * @return
	 * @throws FileNotFoundException
	 */
	public static File toFile(IPath ipath) throws FileNotFoundException {
		if (ipath == null)
			throw new FileNotFoundException("");

		IResource resource = getWorkspaceRoot().findMember(ipath);
		if (resource == null)
			throw new FileNotFoundException(ipath.toString());
		IPath path = resource.getRawLocation();
		String file = path.makeAbsolute().toString();
		return new File(file);
	}

	public static File getProjectLocation(String project) throws FileNotFoundException {
		if ( project == null)
			throw new FileNotFoundException("");

		IResource resource = getWorkspaceRoot().findMember(project);
		if (resource == null)
			throw new FileNotFoundException(project.toString());
		IPath path = resource.getRawLocation();
		if (path == null) {
			path = resource.getLocation();
		}
		String file = path.makeAbsolute().toString();
		return new File(file);
	}

	
	/**
	 * @param ipath
	 * @return
	 * @throws FileNotFoundException
	 */
	public static java.nio.file.Path toPath(IPath ipath) throws FileNotFoundException {
		if (ipath == null)
			throw new FileNotFoundException("");
		return toFile(ipath).toPath();
	}

	/**
	 * Return the workbench resource
	 * 
	 * @param in
	 * @return
	 * 
	 */
	public static IResource toResource(IPath ipath) throws FileNotFoundException {
		if (ipath == null)
			throw new FileNotFoundException("");

		IResource resource = getWorkspaceRoot().findMember(ipath);
		return resource;
	}

	/**
	 * Return the absolute OS path
	 * 
	 * @param in
	 * @return
	 * @throws FileNotFoundException
	 */
	public static String getAbsolutePath(IFile in) throws FileNotFoundException {
		if (in == null)
			throw new FileNotFoundException("");
		IPath ipath = in.getRawLocation();
		String file = ipath.makeAbsolute().toString();
		return file;
	}


	/**
	 * Return a file named postfix in the same folder as the passed resource
	 * Fails if the file does not exist
	 * 
	 * @param resource
	 * @param postfix
	 * @return
	 * @throws FileNotFoundException
	 */
	public static File getExistingFileInTheSameFolder(IFile resource, String postfix) throws FileNotFoundException {
		if ((resource == null) || resource.getParent() == null) {
			throw new FileNotFoundException(String.valueOf(resource) + " " + postfix);
		}
		IPath path = resource.getParent().getRawLocation().append(postfix);
		File file = path.toFile();
		if (!file.exists()) {
			throw new FileNotFoundException("Expecting a " + postfix + " file in " + resource.getParent().getFullPath()
					+ " including " + resource.getFullPath());
		}
		return file;
	}


	/**
	 * Return the outputstream corresponding to the passed parameter
	 * 
	 * @param resource
	 * @return
	 * @throws FileNotFoundException
	 */
	public static OutputStream getIFileAsOutputStream(IFile resource, String name) throws FileNotFoundException {
		File file = ResourceManager.getExistingFileInTheSameFolder(resource, name);
		OutputStream out = null;
		try {
			out = new FileOutputStream(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return out;
	}

	/**
	 * Return the OS path of the selected file
	 * 
	 * @param selection
	 * @return
	 */
	public static String getSelectedFileLocation(IFile file) {
		IPath ipath = file.getRawLocation();
		return ipath.makeAbsolute().toString();
	}

	/**
	 * Return the passed parameters (a file) as an IFile
	 * 
	 * @param file
	 * @return
	 */
	public static IFile toIFile(File file) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPath location = Path.fromOSString(file.getAbsolutePath());
		return workspace.getRoot().getFileForLocation(location);
	}

 
	
	/**
	 * Return the passed parameters (a file) as an IFolder
	 * 
	 * @param file
	 * @return
	 */
	public static IFolder toIFolder(File file) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPath location = Path.fromOSString(file.getAbsolutePath());
		IFile ifile = workspace.getRoot().getFileForLocation(location);
		return workspace.getRoot().getFolder(ifile.getFullPath());
	}

	/**
	 * Return the passed parameters (a folder and a file) as an absolute OS path
	 * file
	 * 
	 * @param containerFullPath
	 * @param filename
	 * @return
	 */
	public static String getSelectedOuputFileLocation(IPath path, String filename) {
		IWorkspaceRoot wroot = ResourcesPlugin.getWorkspace().getRoot();
		IFile resource = wroot.getFile(path);
		String location = resource.getRawLocation().makeAbsolute().toString();
		File targetDir = new File(location);
		return new File(targetDir, filename).getAbsolutePath();
	}

	public static IResource ensureFolderPath(IPath path) throws CoreException {
		IPath p = path;
		List<IPath> list = new ArrayList<>();
		while (p.segmentCount() > 0) {
			IResource resource = getWorkspaceRoot().findMember(p);
			if (resource == null) {
				list.add((IPath) p.clone());
			} else {
				break;
			}
			p = p.removeLastSegments(1);
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			IFolder folder = (IFolder) getWorkspaceRoot().findMember(p);
			IPath pth = list.get(i);
			folder = folder.getFolder(pth.lastSegment());
			folder.create(true, true, new NullProgressMonitor());
			p = pth;
		}

		return getWorkspaceRoot().findMember(path);
	}

	/**
	 * Return the resource corresponding to the passed path
	 * 
	 * @param path
	 * @return
	 */
	public static IResource getResource(String path) {
		IResource resource = getWorkspaceRoot().findMember(new Path(path));
		if (resource == null)
			return null;
		return resource;
	}

	/**
	 * @param projectName
	 * @return the direct child folders of the project
	 * @throws CoreException
	 */
	public static List<String> getFilteredSourceFolders(String projectName, String[] excludes) throws CoreException {
		List<String> ret = new ArrayList<String>();
		IJavaProject javaProject = (IJavaProject) JavaCore.create(getProject(projectName));
		IClasspathEntry[] entries = javaProject.getRawClasspath();
		for (int i = 0; i < entries.length; i++) {
			IClasspathEntry entry = entries[i];
			if (entry.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
				IPath path = entry.getPath().makeRelativeTo(new Path(projectName));
				boolean isExcluded = false;
				for (int j = 0; j < excludes.length; j++) {

					if (excludes[j].equalsIgnoreCase(path.toString())) {
						isExcluded = true;
						break;
					}
				}
				if (!isExcluded) {
					String p = path.toString();
					ret.add(p);
				}
			}
		}

		return ret;
	}

	/**
	 * Return the project in the workspace
	 * 
	 * @param projectName
	 * @return
	 */
	public static IProject getProject(String projectName) {
		IProject project = getWorkspaceRoot().getProject(projectName);
		return project;
	}

	/**
	 * Return package fragment of the passed resource
	 * 
	 * @param project
	 * @param path
	 * @return
	 * @throws JavaModelException
	 */
	public static IPackageFragmentRoot getPackageFragmentRoot(IProject project, IPackageFragment pkg)
			throws JavaModelException {
		IJavaProject jproject = JavaCore.create(project);
		IPackageFragmentRoot[] roots = jproject.getPackageFragmentRoots();
		for (int i = 0; i < roots.length; i++) {
			IPackageFragmentRoot root = roots[i];
			IPackageFragment pf = root.getPackageFragment(pkg.getElementName());
			if (pf.equals(pkg))
				return root;
		}
		return null;
	}

	/**
	 * Return package fragment of the passed resource
	 * 
	 * @param project
	 * @param path
	 * @return
	 * @throws CoreException
	 */
	public static IPackageFragment getPackageFragment(IProject project, IPath path) throws CoreException {
		IFolder folder = ResourceManager.ensureFolder(project, path.toString(), new NullProgressMonitor());
		IJavaElement element = JavaCore.create(folder);
		if (element instanceof IPackageFragment) {
			return (IPackageFragment) element;
		}
		if (element instanceof IPackageFragmentRoot) {
			IPackageFragmentRoot root = (IPackageFragmentRoot) element;
			element = root.getPackageFragment("");
			return (IPackageFragment) element;
		}
		return null;
	}

	/**
	 * Return a path relative to its package fragment root
	 * 
	 * @param project
	 * @param path
	 * @return
	 * @throws JavaModelException
	 */
	public static IPath getPathWithinPackageFragment(IResource ifile) throws JavaModelException {
		IProject project = ifile.getProject();
		IPath path = ifile.getFullPath();
		String[] segments = path.segments();
		IJavaProject jproject = JavaCore.create(project);
		IPackageFragment[] pkgs = jproject.getPackageFragments();
		IPath p = new Path("/");
		for (int i = 0; i < segments.length; i++) {
			for (int j = 0; j < pkgs.length; j++) {
				if (pkgs[j].getPath().equals(p)) {
					return path.makeRelativeTo(pkgs[j].getPath());
				}
			}
			p = p.append(segments[i]);
		}
		return null;
	}

	/**
	 * Lets get the path of hat have been selected in the UI - the complete path
	 * a path is something like "src/main/resources"
	 * 
	 * @param receiver
	 * @return
	 */
	public static String getSelectedPathInProject(Object receiver) {
		if (!ResourceManager.isPackageFragmentRoot(receiver)) {
			return null;
		}
		IPackageFragmentRoot pkg = (IPackageFragmentRoot) receiver;

		IJavaProject javaProject = pkg.getJavaProject();
		if (javaProject == null)
			return null;

		String projectName = pkg.getJavaProject().getElementName();
		int pos = projectName.length();
		return pkg.getPath().toString().substring(pos + 2);
	}

	/**
	 * Return the Eclipse workspace
	 * 
	 * @return
	 */
	public static IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	/**
	 * Return whether the resource is in of the passed folders
	 * 
	 * @param resource
	 * @param folders
	 * @return
	 */
	public static boolean isFileInFolders(IFile resource, String[] folders) {
		if (resource == null)
			return false;
		IProject p = resource.getProject();
		IJavaProject javaProject = JavaCore.create(p);
		for (int i = 0; i < folders.length; i++) {
			IPath folderPath = javaProject.getPath().append(folders[i]);
			String allowedPAth = folderPath.toString();
			String resourcePath = resource.getFullPath().toString();
			if (resourcePath.startsWith(allowedPAth)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Return whether the passed object is a PackageFragmentRoot
	 * 
	 * @param receiver
	 * @return
	 */
	public static boolean isPackageFragmentRoot(Object receiver) {
		return (receiver instanceof IPackageFragmentRoot);
	}

	public static Properties loadProperties(File buildPoliciesFile) throws FileNotFoundException {
		Properties p = new Properties();

		InputStream in = null;
		try {
			in = new FileInputStream(buildPoliciesFile);
			p.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ignore) {
			}
		}
		return p;
	}

	/**
	 * Load the resource as a Properties java object
	 * 
	 * @param resource
	 * @param file
	 * @return
	 * @throws FileNotFoundException
	 */
	public static Properties loadIFileAsProperties(IFile resource, String file) throws FileNotFoundException {
		File buildPoliciesFile = ResourceManager.getExistingFileInTheSameFolder(resource, file);
		if ((buildPoliciesFile == null) || !buildPoliciesFile.exists()) {
			throw new FileNotFoundException("Expecting a " + file + " file in " + resource.getParent().getFullPath()
					+ " including " + resource.getFullPath());
		}
		return getProperties(buildPoliciesFile);
	}

	/**
	 * @param propertyFile
	 * @return
	 * @throws FileNotFoundException
	 */
	public static Properties getProperties(File propertyFile) throws FileNotFoundException {
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = new FileInputStream(propertyFile);
			p.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ignore) {
			}
		}
		return p;
	}

	/**
	 * Return whether the project exists
	 * 
	 * @param projectName
	 * @return
	 */
	public static boolean projectExists(String projectName) {
		IProject project = ResourceManager.getWorkspaceRoot().getProject(projectName);
		return project.exists();
	}

	/**
	 * Refresh the passed container
	 * 
	 * @param folder
	 * @throws CoreException
	 */
	public static void resfresh(IContainer folder) throws CoreException {
		if (folder == null)
			return;
		folder.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
	}

	/**
	 * Refresh the passed file which is located in the same folder as the first
	 * parameter
	 * 
	 * @param resource
	 * @param filetorefresh
	 * @return
	 * @throws CoreException
	 * @throws InterruptedException
	 */
	/**
	 * @param folder
	 * @param filetorefresh
	 * @return
	 * @throws CoreException
	 * @throws InterruptedException
	 */
	public static IResource resfreshFileInContainer(IContainer folder, String filetorefresh)
			throws CoreException, InterruptedException {
		final IResource buildfile = find(folder, filetorefresh);
		Job job = new WorkspaceJob("Refresh folders") {
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				if (buildfile != null && buildfile.exists()) {
					try {
						buildfile.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();

		return buildfile;
	}

	/**
	 * @param folder
	 * @param file
	 * @return
	 * @throws CoreException
	 * @throws InterruptedException
	 */
	public static IResource find(IContainer folder, String file) {
		final IResource buildfile = folder.findMember(file);
		return buildfile;
	}

	/**
	 * @param folder
	 * @param file
	 * @return
	 */
	public static IFile get(IContainer folder, String file) {
		final IFile buildfile = folder.getFile(new Path(file));
		return buildfile;
	}

	/**
	 * Return whether the path corresponds to an existing resource
	 * 
	 * @param path
	 * @return
	 */
	public static boolean resourcePathExists(String path) {
		IWorkspaceRoot root = ResourceManager.getWorkspaceRoot();
		IPath p = new Path(path);
		return root.exists(p);
	}

	/**
	 * Process recursively the containers until we found a resource with the
	 * specified path
	 * 
	 * @param container
	 * @param path
	 * @return
	 * @throws CoreException
	 */
	private static boolean resourceExistsIn(IContainer container, IPath path) throws CoreException {
		boolean found = false;
		IResource[] members = container.members();
		for (IResource member : members) {
			if (member instanceof IContainer) {

				found = resourceExistsIn((IContainer) member, path);
				if (found)
					break;
			} else if (member instanceof IFile) {
				IFile file = (IFile) member;

				if (path.equals(file.getFullPath()))
					return true;
			}
		}
		return found;
	}

	/**
	 * Return whether the path corresponds to an existing resource
	 * 
	 * @param path
	 * @return
	 * @throws CoreException
	 */
	public static boolean fileExists(IProject project, String path) throws CoreException {
		IPath p = new Path(path);
		boolean exists = resourceExistsIn(project, p);
		return exists;
	}

	/**
	 * Show the package explorer
	 */
	public static void showPackageExplorer() {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		ResourceSelectionDialog dialog = new ResourceSelectionDialog(shell, ResourcesPlugin.getWorkspace().getRoot(),
				"Select Resource:");
		dialog.setTitle("Resource Selection");

		dialog.open();
	}

	/**
	 * @param filename
	 * @throws CoreException
	 */
	public static void deleteFile(IContainer container, String filename) throws CoreException {
		IResource[] members = container.members();
		for (IResource member : members) {
			if (member instanceof IContainer) {
				deleteFile((IContainer) member, filename);
			} else if (member instanceof IFile) {
				IFile file = (IFile) member;
				if (file.getName().equals(filename)) {
					file.delete(true, new NullProgressMonitor());
				}
			}
		}
	}

	/**
	 * @param container
	 * @param filename
	 * @throws CoreException
	 */
	public static void renameFile(IContainer container, String oldName, String newName) throws CoreException {
		if (oldName.equals(newName))
			return;
		IResource[] members = container.members();
		for (IResource member : members) {
			if (member instanceof IContainer) {
				renameFile((IContainer) member, oldName, newName);
			} else if (member instanceof IFile) {
				IFile file = (IFile) member;
				if (file.getName().equals(oldName)) {
					IProgressMonitor monitor = new NullProgressMonitor();
					IPath path = file.getFullPath().removeLastSegments(1).append(newName);
					file.copy(path, true, monitor);
					file.delete(true, monitor);
				}
			}
		}
	}

	/**
	 * Convert the passed path to an OS absolute path
	 * 
	 * @param path
	 * @return
	 */
	public static File stringPathToFile(String path) {
		IResource resource = ResourceManager.getResource(path);
		if (resource == null)
			return null;
		return resource.getRawLocation().makeAbsolute().toFile();
	}

	/**
	 * Return the file name of the passed selection without its extension file,
	 * if it is a file ...
	 * 
	 * @param selection
	 * @return
	 */
	public static String stripFileExtension(IStructuredSelection selection) {
		Object obj = ((IStructuredSelection) selection).getFirstElement();
		if (!(obj instanceof IFile))
			return "";
		IFile file = ((IFile) obj);
		String extension = file.getFileExtension();
		String name = file.getName();
		int pos = name.indexOf("." + extension);
		return name.substring(0, pos);
	}

	/**
	 * Validate the passed project path
	 * 
	 * @param projectName
	 * @return
	 */
	public static boolean validProjectPath(String projectName) {
		IStatus status = ResourcesPlugin.getWorkspace().validatePath(IPath.SEPARATOR + projectName, IResource.PROJECT);
		boolean ok = status.isOK();
		if (!ok)
			return false;
		boolean validSegment = Path.ROOT.isValidSegment(projectName);
		if (!validSegment)
			return false;
		return true;
	}

	/**
	 * @param value
	 */
	public static void setAutoBuilding(boolean value) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		if (workspace.isAutoBuilding() == value)
			return;
		IWorkspaceDescription desc = workspace.getDescription();
		desc.setAutoBuilding(value);
		try {
			workspace.setDescription(desc);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return
	 */
	public static boolean isAutoBuilding() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceDescription desc = workspace.getDescription();
		return desc.isAutoBuilding();

	}
}