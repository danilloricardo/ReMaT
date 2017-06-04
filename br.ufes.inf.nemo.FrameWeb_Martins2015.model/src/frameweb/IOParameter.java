/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link frameweb.IOParameter#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @see frameweb.FramewebPackage#getIOParameter()
 * @model
 * @generated
 */
public interface IOParameter extends NavigationAttribute {
	/**
	 * Returns the value of the '<em><b>Display</b></em>' reference list.
	 * The list contents are of type {@link UIComponent}.
	 * It is bidirectional and its opposite is '{@link UIComponent#getInject <em>Inject</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' reference list.
	 * @see frameweb.FramewebPackage#getIOParameter_Display()
	 * @see UIComponent#getInject
	 * @model type="frameweb.UIComponentField" opposite="inject" derived="true"
	 * @generated
	 */
	EList<UIComponent> getDisplay();

} // IOParameter
