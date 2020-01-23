package de.dc.javafx.mm.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.MmFactory;
import de.dc.javafx.mm.MmPackage;
import de.dc.javafx.mm.model.ExtEmfModel;

public class FxmlFile extends EmfFile<EmfModel>{

	public ExtEmfModel readExtEmfModel(String path) {
		return new ExtEmfModel(load(path));
	}
	
	@Override
	public EPackage getEPackageEInstance() {
		return MmPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return MmFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "javafx";
	}

}
