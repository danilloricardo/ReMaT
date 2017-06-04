/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link frameweb.VocabularyClass#getVocabularyproperty <em>Vocabularyproperty</em>}</li>
 * </ul>
 *
 * @see frameweb.FramewebPackage#getVocabularyClass()
 * @model
 * @generated
 */
public interface VocabularyClass extends VocabularyEntity, VocabularyClassExpression {
	/**
	 * Returns the value of the '<em><b>Vocabularyproperty</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.VocabularyProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vocabularyproperty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocabularyproperty</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getVocabularyClass_Vocabularyproperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<VocabularyProperty> getVocabularyproperty();

} // VocabularyClass
