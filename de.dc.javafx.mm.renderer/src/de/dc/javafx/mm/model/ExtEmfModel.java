package de.dc.javafx.mm.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EmfModel;

public class ExtEmfModel{

	private Map<String, ENode> ids = new HashMap<>();
	private EmfModel model;
	
	public ExtEmfModel(EmfModel model) {
		this.model = model;
		
		mapId(model.getRoot());
	}

	public boolean existId(String id) {
		return ids.get(id) != null;
	}
	
	public Optional<ENode> findById(String id){
		if (ids.get(id)!=null) {
			return Optional.of(ids.get(id));
		}
		return Optional.empty();
	}
	
	public void mapId(ENode node) {
		String id = node.getId();
		if (id!=null) {
			ids.put(id, node);
		}
		node.getChildren().forEach(e-> mapId(e));
	}
	
	public EmfModel getModel() {
		return model;
	}
}
