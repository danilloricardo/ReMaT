/**
 */
package frameweb.provider;


import frameweb.FramewebFactory;
import frameweb.ServiceInterface;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.InterfaceItemProvider;

/**
 * This is the item provider adapter for a {@link frameweb.ServiceInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceInterfaceItemProvider extends InterfaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterfaceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns ServiceInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceInterface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceInterface_type") :
			getString("_UI_ServiceInterface_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				 FramewebFactory.eINSTANCE.createPageConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				 FramewebFactory.eINSTANCE.createResultConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				 FramewebFactory.eINSTANCE.createMethodCosntraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				 FramewebFactory.eINSTANCE.createChainingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				 FramewebFactory.eINSTANCE.createDomainConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				 FramewebFactory.eINSTANCE.createVocabularyConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createServiceGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createDomainGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createNavigationGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createDAOGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createNavigationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createServiceControllerAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDomainClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createResult()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createUIComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createResultType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createClassMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAttributeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createTagExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createControllerExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createResultExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createClassMappingExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAttributeMappingExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createVocabularyAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createAnnotationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createVocabularyDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER,
				 FramewebFactory.eINSTANCE.createVocabularyClass()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createUIComponentField()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createNavigationCompositionPart()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createNavigationCompositionWhole()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDomainProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createControllerExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createTagExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createResultExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createClassMappingExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createAttributeMappingExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createControllerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createTagProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createResultProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createClassMappingPropery()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createAttributeMappingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDomainMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createServiceMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.INTERFACE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDAOMethod()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE ||
			childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION ||
			childFeature == UMLPackage.Literals.CLASSIFIER__OWNED_USE_CASE ||
			childFeature == UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER ||
			childFeature == UMLPackage.Literals.INTERFACE__PROTOCOL;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FrameWebEditPlugin.INSTANCE;
	}

}
