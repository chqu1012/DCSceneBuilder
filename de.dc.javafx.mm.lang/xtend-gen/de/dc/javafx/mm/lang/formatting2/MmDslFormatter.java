/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.mm.lang.formatting2;

import com.google.inject.Inject;
import de.dc.javafx.mm.EInsets;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.lang.services.MmDslGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class MmDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MmDslGrammarAccess _mmDslGrammarAccess;
  
  protected void _format(final EmfModel emfModel, @Extension final IFormattableDocument document) {
    document.<ENode>format(emfModel.getRoot());
  }
  
  protected void _format(final ENode eRegion, @Extension final IFormattableDocument document) {
    document.<EInsets>format(eRegion.getMargin());
    EList<ENode> _children = eRegion.getChildren();
    for (final ENode eNode : _children) {
      document.<ENode>format(eNode);
    }
    document.<EInsets>format(eRegion.getPadding());
  }
  
  public void format(final Object eRegion, final IFormattableDocument document) {
    if (eRegion instanceof XtextResource) {
      _format((XtextResource)eRegion, document);
      return;
    } else if (eRegion instanceof ENode) {
      _format((ENode)eRegion, document);
      return;
    } else if (eRegion instanceof EmfModel) {
      _format((EmfModel)eRegion, document);
      return;
    } else if (eRegion instanceof EObject) {
      _format((EObject)eRegion, document);
      return;
    } else if (eRegion == null) {
      _format((Void)null, document);
      return;
    } else if (eRegion != null) {
      _format(eRegion, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eRegion, document).toString());
    }
  }
}
