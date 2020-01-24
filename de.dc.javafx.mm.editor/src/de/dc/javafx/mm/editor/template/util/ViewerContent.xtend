package de.dc.javafx.mm.editor.template.util

class ViewerContent {
	
	def static createContent(String name)'''
	// Binding for view «name»
	private ObservableList<«name»> data«name» = FXCollections.observableArrayList(); 
	private FilteredList<«name»> filteredData«name» = new FilteredList<>(data«name»,p->true); 
	private SortedList<«name»> sortedData«name» = new SortedList<>(filteredData«name»); 
	public ObjectProperty<«name»> selected«name» = new SimpleObjectProperty<>();
	public ObservableList<«name»> data«name»(){ return data«name»;}
	public FilteredList<«name»> filteredData«name»(){ return filteredData«name»;}
	public SortedList<«name»> sortedData«name»(){return sortedData«name»;}; 
	public ObjectProperty<«name»> selected«name»(){return selected«name»;}; 
	public void add«name»(«name» «name.toFirstLower»){ this.data«name».add(«name.toFirstLower»);}
	public void remove«name»(«name» «name.toFirstLower»){ this.data«name».remove(«name.toFirstLower»);}
	'''
}