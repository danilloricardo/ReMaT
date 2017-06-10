/**
 */
package frameweb.provider;


import frameweb.DomainAssociation;
import frameweb.FramewebFactory;
import frameweb.FramewebPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.AssociationItemProvider;

/**
 * This is the item provider adapter for a {@link frameweb.DomainAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainAssociationItemProvider extends AssociationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addCollectionPropertyDescriptor(object);
			addCascadePropertyDescriptor(object);
			addFetchPropertyDescriptor(object);
			addOrderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Collection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainAssociation_collection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainAssociation_collection_feature", "_UI_DomainAssociation_type"),
				 FramewebPackage.Literals.DOMAIN_ASSOCIATION__COLLECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cascade feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCascadePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainAssociation_cascade_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainAssociation_cascade_feature", "_UI_DomainAssociation_type"),
				 FramewebPackage.Literals.DOMAIN_ASSOCIATION__CASCADE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fetch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFetchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainAssociation_fetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainAssociation_fetch_feature", "_UI_DomainAssociation_type"),
				 FramewebPackage.Literals.DOMAIN_ASSOCIATION__FETCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainAssociation_order_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainAssociation_order_feature", "_UI_DomainAssociation_type"),
				 FramewebPackage.Literals.DOMAIN_ASSOCIATION__ORDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DomainAssociation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DomainAssociation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DomainAssociation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DomainAssociation_type") :
			getString("_UI_DomainAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(DomainAssociation.class)) {
			case FramewebPackage.DOMAIN_ASSOCIATION__COLLECTION:
			case FramewebPackage.DOMAIN_ASSOCIATION__CASCADE:
			case FramewebPackage.DOMAIN_ASSOCIATION__FETCH:
			case FramewebPackage.DOMAIN_ASSOCIATION__ORDER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
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
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createDomainAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createUIComponentField()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createNavigationCompositionPart()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createNavigationCompositionWhole()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createDomainProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createControllerExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createTagExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createResultExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createClassMappingExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createAttributeMappingExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createControllerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createTagProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createResultProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createClassMappingPropery()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createAttributeMappingProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createDomainAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createUIComponentField()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createNavigationCompositionPart()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createNavigationCompositionWhole()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createDomainProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createControllerExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createTagExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createResultExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createClassMappingExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createAttributeMappingExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createControllerProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createTagProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createResultProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createClassMappingPropery()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createAttributeMappingProperty()));
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
			childFeature == UMLPackage.Literals.ASSOCIATION__OWNED_END ||
			childFeature == UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END;

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
