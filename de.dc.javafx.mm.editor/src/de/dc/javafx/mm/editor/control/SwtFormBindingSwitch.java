package de.dc.javafx.mm.editor.control;

import de.dc.javafx.mm.EBinding;
import de.dc.javafx.mm.EBindingDirection;
import de.dc.javafx.mm.EBindingType;
import de.dc.javafx.mm.EControlBinding;
import de.dc.javafx.mm.EText;
import de.dc.javafx.mm.MmFactory;
import de.dc.javafx.mm.util.MmSwitch;

public class SwtFormBindingSwitch extends MmSwitch<EBinding>{

	@Override
	public EBinding caseEText(EText object) {
		EBinding binding = MmFactory.eINSTANCE.createEBinding();
		binding.setBindingType(EBindingType.STRING_PROPERTY);
		binding.setBinding(EControlBinding.TEXT_PROPERTY);
		binding.setName("property");
		binding.setNode(object);
		binding.setDirection(EBindingDirection.BIND_BIDIRECTIONAL);
		return binding;
	}
}
