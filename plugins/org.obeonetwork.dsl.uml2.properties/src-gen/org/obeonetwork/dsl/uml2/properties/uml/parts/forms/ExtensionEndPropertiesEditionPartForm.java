/*******************************************************************************
 * Copyright (c) 2009, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.uml2.properties.uml.parts.forms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart;
import org.obeonetwork.dsl.uml2.properties.uml.parts.UmlViewsRepository;

import org.obeonetwork.dsl.uml2.properties.uml.providers.UmlMessages;


/**
 * @author <a href="mailto:cedric.brun@obeo.fr">Cédric Brun</a>
 * @generated
 */
public class ExtensionEndPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ExtensionEndPropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer visibility;
	protected ReferencesTable clientDependency;
	protected List<ViewerFilter> clientDependencyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> clientDependencyFilters = new ArrayList<ViewerFilter>();
	protected Button isLeaf;
	protected Button isStatic;
	protected EObjectFlatComboViewer type;
	protected Button isOrdered;
	protected Button isUnique;
	protected Button isReadOnly;
	protected EObjectFlatComboViewer owningTemplateParameter;
	protected EObjectFlatComboViewer templateParameter;
	protected EObjectFlatComboViewer class_;
	protected EObjectFlatComboViewer datatype;
	protected Button isDerived;
	protected Button isDerivedUnion;
	protected EMFComboViewer aggregation;
	protected ReferencesTable redefinedProperty;
	protected List<ViewerFilter> redefinedPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> redefinedPropertyFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer owningAssociation;
	protected ReferencesTable subsettedProperty;
	protected List<ViewerFilter> subsettedPropertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> subsettedPropertyFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer association;
	protected EObjectFlatComboViewer associationEnd;



	/**
	 * For {@link ISection} use only.
	 */
	public ExtensionEndPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public ExtensionEndPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
    super(editionComponent);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * @generated
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
    ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
    Form form = scrolledForm.getForm();
    view = form.getBody();
    GridLayout layout = new GridLayout();
    layout.numColumns = 3;
    view.setLayout(layout);
    createControls(widgetFactory, view);
    return scrolledForm;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
    CompositionSequence extensionEndStep = new BindingCompositionSequence(propertiesEditionComponent);
    CompositionStep propertiesStep = extensionEndStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.class);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.name);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.visibility);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.clientDependency);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.isLeaf);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.isStatic);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.type);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.isOrdered);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.isUnique);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.isReadOnly);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.owningTemplateParameter);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.templateParameter);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.class_);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.datatype);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.isDerived);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.isDerivedUnion);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.aggregation);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.redefinedProperty);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.owningAssociation);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.subsettedProperty);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.association);
    propertiesStep.addStep(UmlViewsRepository.ExtensionEnd.Properties.associationEnd);
    
    
    composer = new PartComposer(extensionEndStep) {

      @Override
      public Composite addToPart(Composite parent, Object key) {
        if (key == UmlViewsRepository.ExtensionEnd.Properties.class) {
          return createPropertiesGroup(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.name) {
          return createNameText(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.visibility) {
          return createVisibilityEMFComboViewer(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.clientDependency) {
          return createClientDependencyReferencesTable(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.isLeaf) {
          return createIsLeafCheckbox(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.isStatic) {
          return createIsStaticCheckbox(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.type) {
          return createTypeFlatComboViewer(parent, widgetFactory);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.isOrdered) {
          return createIsOrderedCheckbox(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.isUnique) {
          return createIsUniqueCheckbox(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.isReadOnly) {
          return createIsReadOnlyCheckbox(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.owningTemplateParameter) {
          return createOwningTemplateParameterFlatComboViewer(parent, widgetFactory);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.templateParameter) {
          return createTemplateParameterFlatComboViewer(parent, widgetFactory);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.class_) {
          return createClass_FlatComboViewer(parent, widgetFactory);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.datatype) {
          return createDatatypeFlatComboViewer(parent, widgetFactory);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.isDerived) {
          return createIsDerivedCheckbox(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.isDerivedUnion) {
          return createIsDerivedUnionCheckbox(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.aggregation) {
          return createAggregationEMFComboViewer(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.redefinedProperty) {
          return createRedefinedPropertyReferencesTable(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.owningAssociation) {
          return createOwningAssociationFlatComboViewer(parent, widgetFactory);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.subsettedProperty) {
          return createSubsettedPropertyReferencesTable(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.association) {
          return createAssociationFlatComboViewer(parent, widgetFactory);
        }
        if (key == UmlViewsRepository.ExtensionEnd.Properties.associationEnd) {
          return createAssociationEndFlatComboViewer(parent, widgetFactory);
        }
        return parent;
      }
    };
    composer.compose(view);
  }
	/**
	 * @generated
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
    Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
    propertiesSection.setText(UmlMessages.ExtensionEndPropertiesEditionPart_PropertiesGroupLabel);
    GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
    propertiesSectionData.horizontalSpan = 3;
    propertiesSection.setLayoutData(propertiesSectionData);
    Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
    GridLayout propertiesGroupLayout = new GridLayout();
    propertiesGroupLayout.numColumns = 3;
    propertiesGroup.setLayout(propertiesGroupLayout);
    propertiesSection.setClient(propertiesGroup);
    return propertiesGroup;
  }

	/**
	 * @generated
	 */
	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
    createDescription(parent, UmlViewsRepository.ExtensionEnd.Properties.name, UmlMessages.ExtensionEndPropertiesEditionPart_NameLabel);
    name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
    name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
    widgetFactory.paintBordersFor(parent);
    GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
    name.setLayoutData(nameData);
    name.addFocusListener(new FocusAdapter() {
      /**
       * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void focusLost(FocusEvent e) {
        if (propertiesEditionComponent != null) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
              ExtensionEndPropertiesEditionPartForm.this,
              UmlViewsRepository.ExtensionEnd.Properties.name,
              PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
          propertiesEditionComponent
              .firePropertiesChanged(new PropertiesEditionEvent(
                  ExtensionEndPropertiesEditionPartForm.this,
                  UmlViewsRepository.ExtensionEnd.Properties.name,
                  PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
                  null, name.getText()));
        }
      }

      /**
       * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
       */
      @Override
      public void focusGained(FocusEvent e) {
        if (propertiesEditionComponent != null) {
          propertiesEditionComponent
              .firePropertiesChanged(new PropertiesEditionEvent(
                  ExtensionEndPropertiesEditionPartForm.this,
                  null,
                  PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
                  null, null));
        }
      }
    });
    name.addKeyListener(new KeyAdapter() {
      /**
       * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void keyPressed(KeyEvent e) {
        if (e.character == SWT.CR) {
          if (propertiesEditionComponent != null)
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
        }
      }
    });
    EditingUtils.setID(name, UmlViewsRepository.ExtensionEnd.Properties.name);
    EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.name, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createVisibilityEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
    createDescription(parent, UmlViewsRepository.ExtensionEnd.Properties.visibility, UmlMessages.ExtensionEndPropertiesEditionPart_VisibilityLabel);
    visibility = new EMFComboViewer(parent);
    visibility.setContentProvider(new ArrayContentProvider());
    visibility.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
    GridData visibilityData = new GridData(GridData.FILL_HORIZONTAL);
    visibility.getCombo().setLayoutData(visibilityData);
    visibility.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       * 	@generated
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
      }

    });
    visibility.setID(UmlViewsRepository.ExtensionEnd.Properties.visibility);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.visibility, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createClientDependencyReferencesTable(FormToolkit widgetFactory, Composite parent) {
    this.clientDependency = new ReferencesTable(getDescription(UmlViewsRepository.ExtensionEnd.Properties.clientDependency, UmlMessages.ExtensionEndPropertiesEditionPart_ClientDependencyLabel), new ReferencesTableListener	() {
      public void handleAdd() { addClientDependency(); }
      public void handleEdit(EObject element) { editClientDependency(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveClientDependency(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromClientDependency(element); }
      public void navigateTo(EObject element) { }
    });
    this.clientDependency.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.clientDependency, UmlViewsRepository.FORM_KIND));
    this.clientDependency.createControls(parent, widgetFactory);
    this.clientDependency.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.clientDependency, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData clientDependencyData = new GridData(GridData.FILL_HORIZONTAL);
    clientDependencyData.horizontalSpan = 3;
    this.clientDependency.setLayoutData(clientDependencyData);
    this.clientDependency.disableMove();
    clientDependency.setID(UmlViewsRepository.ExtensionEnd.Properties.clientDependency);
    clientDependency.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addClientDependency() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(clientDependency.getInput(), clientDependencyFilters, clientDependencyBusinessFilters,
    "clientDependency", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.clientDependency,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        clientDependency.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveClientDependency(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    clientDependency.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromClientDependency(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    clientDependency.refresh();
  }

	/**
	 * @generated
	 */
	protected void editClientDependency(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        clientDependency.refresh();
      }
    }
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsLeafCheckbox(FormToolkit widgetFactory, Composite parent) {
    isLeaf = widgetFactory.createButton(parent, getDescription(UmlViewsRepository.ExtensionEnd.Properties.isLeaf, UmlMessages.ExtensionEndPropertiesEditionPart_IsLeafLabel), SWT.CHECK);
    isLeaf.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.isLeaf, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isLeaf.getSelection())));
      }

    });
    GridData isLeafData = new GridData(GridData.FILL_HORIZONTAL);
    isLeafData.horizontalSpan = 2;
    isLeaf.setLayoutData(isLeafData);
    EditingUtils.setID(isLeaf, UmlViewsRepository.ExtensionEnd.Properties.isLeaf);
    EditingUtils.setEEFtype(isLeaf, "eef::Checkbox"); //$NON-NLS-1$
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.isLeaf, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsStaticCheckbox(FormToolkit widgetFactory, Composite parent) {
    isStatic = widgetFactory.createButton(parent, getDescription(UmlViewsRepository.ExtensionEnd.Properties.isStatic, UmlMessages.ExtensionEndPropertiesEditionPart_IsStaticLabel), SWT.CHECK);
    isStatic.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.isStatic, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isStatic.getSelection())));
      }

    });
    GridData isStaticData = new GridData(GridData.FILL_HORIZONTAL);
    isStaticData.horizontalSpan = 2;
    isStatic.setLayoutData(isStaticData);
    EditingUtils.setID(isStatic, UmlViewsRepository.ExtensionEnd.Properties.isStatic);
    EditingUtils.setEEFtype(isStatic, "eef::Checkbox"); //$NON-NLS-1$
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.isStatic, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.ExtensionEnd.Properties.type, UmlMessages.ExtensionEndPropertiesEditionPart_TypeLabel);
    type = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ExtensionEnd.Properties.type, UmlViewsRepository.FORM_KIND));
    widgetFactory.adapt(type);
    type.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
    type.setLayoutData(typeData);
    type.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
      }

    });
    type.setID(UmlViewsRepository.ExtensionEnd.Properties.type);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.type, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsOrderedCheckbox(FormToolkit widgetFactory, Composite parent) {
    isOrdered = widgetFactory.createButton(parent, getDescription(UmlViewsRepository.ExtensionEnd.Properties.isOrdered, UmlMessages.ExtensionEndPropertiesEditionPart_IsOrderedLabel), SWT.CHECK);
    isOrdered.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.isOrdered, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOrdered.getSelection())));
      }

    });
    GridData isOrderedData = new GridData(GridData.FILL_HORIZONTAL);
    isOrderedData.horizontalSpan = 2;
    isOrdered.setLayoutData(isOrderedData);
    EditingUtils.setID(isOrdered, UmlViewsRepository.ExtensionEnd.Properties.isOrdered);
    EditingUtils.setEEFtype(isOrdered, "eef::Checkbox"); //$NON-NLS-1$
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.isOrdered, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsUniqueCheckbox(FormToolkit widgetFactory, Composite parent) {
    isUnique = widgetFactory.createButton(parent, getDescription(UmlViewsRepository.ExtensionEnd.Properties.isUnique, UmlMessages.ExtensionEndPropertiesEditionPart_IsUniqueLabel), SWT.CHECK);
    isUnique.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.isUnique, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isUnique.getSelection())));
      }

    });
    GridData isUniqueData = new GridData(GridData.FILL_HORIZONTAL);
    isUniqueData.horizontalSpan = 2;
    isUnique.setLayoutData(isUniqueData);
    EditingUtils.setID(isUnique, UmlViewsRepository.ExtensionEnd.Properties.isUnique);
    EditingUtils.setEEFtype(isUnique, "eef::Checkbox"); //$NON-NLS-1$
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.isUnique, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsReadOnlyCheckbox(FormToolkit widgetFactory, Composite parent) {
    isReadOnly = widgetFactory.createButton(parent, getDescription(UmlViewsRepository.ExtensionEnd.Properties.isReadOnly, UmlMessages.ExtensionEndPropertiesEditionPart_IsReadOnlyLabel), SWT.CHECK);
    isReadOnly.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.isReadOnly, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isReadOnly.getSelection())));
      }

    });
    GridData isReadOnlyData = new GridData(GridData.FILL_HORIZONTAL);
    isReadOnlyData.horizontalSpan = 2;
    isReadOnly.setLayoutData(isReadOnlyData);
    EditingUtils.setID(isReadOnly, UmlViewsRepository.ExtensionEnd.Properties.isReadOnly);
    EditingUtils.setEEFtype(isReadOnly, "eef::Checkbox"); //$NON-NLS-1$
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.isReadOnly, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createOwningTemplateParameterFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.ExtensionEnd.Properties.owningTemplateParameter, UmlMessages.ExtensionEndPropertiesEditionPart_OwningTemplateParameterLabel);
    owningTemplateParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ExtensionEnd.Properties.owningTemplateParameter, UmlViewsRepository.FORM_KIND));
    widgetFactory.adapt(owningTemplateParameter);
    owningTemplateParameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    GridData owningTemplateParameterData = new GridData(GridData.FILL_HORIZONTAL);
    owningTemplateParameter.setLayoutData(owningTemplateParameterData);
    owningTemplateParameter.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.owningTemplateParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOwningTemplateParameter()));
      }

    });
    owningTemplateParameter.setID(UmlViewsRepository.ExtensionEnd.Properties.owningTemplateParameter);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.owningTemplateParameter, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createTemplateParameterFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.ExtensionEnd.Properties.templateParameter, UmlMessages.ExtensionEndPropertiesEditionPart_TemplateParameterLabel);
    templateParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ExtensionEnd.Properties.templateParameter, UmlViewsRepository.FORM_KIND));
    widgetFactory.adapt(templateParameter);
    templateParameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    GridData templateParameterData = new GridData(GridData.FILL_HORIZONTAL);
    templateParameter.setLayoutData(templateParameterData);
    templateParameter.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.templateParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTemplateParameter()));
      }

    });
    templateParameter.setID(UmlViewsRepository.ExtensionEnd.Properties.templateParameter);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.templateParameter, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createClass_FlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.ExtensionEnd.Properties.class_, UmlMessages.ExtensionEndPropertiesEditionPart_Class_Label);
    class_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ExtensionEnd.Properties.class_, UmlViewsRepository.FORM_KIND));
    widgetFactory.adapt(class_);
    class_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    GridData class_Data = new GridData(GridData.FILL_HORIZONTAL);
    class_.setLayoutData(class_Data);
    class_.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.class_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getClass_()));
      }

    });
    class_.setID(UmlViewsRepository.ExtensionEnd.Properties.class_);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.class_, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createDatatypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.ExtensionEnd.Properties.datatype, UmlMessages.ExtensionEndPropertiesEditionPart_DatatypeLabel);
    datatype = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ExtensionEnd.Properties.datatype, UmlViewsRepository.FORM_KIND));
    widgetFactory.adapt(datatype);
    datatype.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    GridData datatypeData = new GridData(GridData.FILL_HORIZONTAL);
    datatype.setLayoutData(datatypeData);
    datatype.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.datatype, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDatatype()));
      }

    });
    datatype.setID(UmlViewsRepository.ExtensionEnd.Properties.datatype);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.datatype, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsDerivedCheckbox(FormToolkit widgetFactory, Composite parent) {
    isDerived = widgetFactory.createButton(parent, getDescription(UmlViewsRepository.ExtensionEnd.Properties.isDerived, UmlMessages.ExtensionEndPropertiesEditionPart_IsDerivedLabel), SWT.CHECK);
    isDerived.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.isDerived, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isDerived.getSelection())));
      }

    });
    GridData isDerivedData = new GridData(GridData.FILL_HORIZONTAL);
    isDerivedData.horizontalSpan = 2;
    isDerived.setLayoutData(isDerivedData);
    EditingUtils.setID(isDerived, UmlViewsRepository.ExtensionEnd.Properties.isDerived);
    EditingUtils.setEEFtype(isDerived, "eef::Checkbox"); //$NON-NLS-1$
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.isDerived, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsDerivedUnionCheckbox(FormToolkit widgetFactory, Composite parent) {
    isDerivedUnion = widgetFactory.createButton(parent, getDescription(UmlViewsRepository.ExtensionEnd.Properties.isDerivedUnion, UmlMessages.ExtensionEndPropertiesEditionPart_IsDerivedUnionLabel), SWT.CHECK);
    isDerivedUnion.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.isDerivedUnion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isDerivedUnion.getSelection())));
      }

    });
    GridData isDerivedUnionData = new GridData(GridData.FILL_HORIZONTAL);
    isDerivedUnionData.horizontalSpan = 2;
    isDerivedUnion.setLayoutData(isDerivedUnionData);
    EditingUtils.setID(isDerivedUnion, UmlViewsRepository.ExtensionEnd.Properties.isDerivedUnion);
    EditingUtils.setEEFtype(isDerivedUnion, "eef::Checkbox"); //$NON-NLS-1$
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.isDerivedUnion, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createAggregationEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
    createDescription(parent, UmlViewsRepository.ExtensionEnd.Properties.aggregation, UmlMessages.ExtensionEndPropertiesEditionPart_AggregationLabel);
    aggregation = new EMFComboViewer(parent);
    aggregation.setContentProvider(new ArrayContentProvider());
    aggregation.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
    GridData aggregationData = new GridData(GridData.FILL_HORIZONTAL);
    aggregation.getCombo().setLayoutData(aggregationData);
    aggregation.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       * 	@generated
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.aggregation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAggregation()));
      }

    });
    aggregation.setID(UmlViewsRepository.ExtensionEnd.Properties.aggregation);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.aggregation, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createRedefinedPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
    this.redefinedProperty = new ReferencesTable(getDescription(UmlViewsRepository.ExtensionEnd.Properties.redefinedProperty, UmlMessages.ExtensionEndPropertiesEditionPart_RedefinedPropertyLabel), new ReferencesTableListener	() {
      public void handleAdd() { addRedefinedProperty(); }
      public void handleEdit(EObject element) { editRedefinedProperty(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveRedefinedProperty(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromRedefinedProperty(element); }
      public void navigateTo(EObject element) { }
    });
    this.redefinedProperty.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.redefinedProperty, UmlViewsRepository.FORM_KIND));
    this.redefinedProperty.createControls(parent, widgetFactory);
    this.redefinedProperty.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.redefinedProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData redefinedPropertyData = new GridData(GridData.FILL_HORIZONTAL);
    redefinedPropertyData.horizontalSpan = 3;
    this.redefinedProperty.setLayoutData(redefinedPropertyData);
    this.redefinedProperty.disableMove();
    redefinedProperty.setID(UmlViewsRepository.ExtensionEnd.Properties.redefinedProperty);
    redefinedProperty.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addRedefinedProperty() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(redefinedProperty.getInput(), redefinedPropertyFilters, redefinedPropertyBusinessFilters,
    "redefinedProperty", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.redefinedProperty,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        redefinedProperty.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveRedefinedProperty(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.redefinedProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    redefinedProperty.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromRedefinedProperty(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.redefinedProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    redefinedProperty.refresh();
  }

	/**
	 * @generated
	 */
	protected void editRedefinedProperty(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        redefinedProperty.refresh();
      }
    }
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createOwningAssociationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.ExtensionEnd.Properties.owningAssociation, UmlMessages.ExtensionEndPropertiesEditionPart_OwningAssociationLabel);
    owningAssociation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ExtensionEnd.Properties.owningAssociation, UmlViewsRepository.FORM_KIND));
    widgetFactory.adapt(owningAssociation);
    owningAssociation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    GridData owningAssociationData = new GridData(GridData.FILL_HORIZONTAL);
    owningAssociation.setLayoutData(owningAssociationData);
    owningAssociation.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.owningAssociation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOwningAssociation()));
      }

    });
    owningAssociation.setID(UmlViewsRepository.ExtensionEnd.Properties.owningAssociation);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.owningAssociation, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createSubsettedPropertyReferencesTable(FormToolkit widgetFactory, Composite parent) {
    this.subsettedProperty = new ReferencesTable(getDescription(UmlViewsRepository.ExtensionEnd.Properties.subsettedProperty, UmlMessages.ExtensionEndPropertiesEditionPart_SubsettedPropertyLabel), new ReferencesTableListener	() {
      public void handleAdd() { addSubsettedProperty(); }
      public void handleEdit(EObject element) { editSubsettedProperty(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveSubsettedProperty(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromSubsettedProperty(element); }
      public void navigateTo(EObject element) { }
    });
    this.subsettedProperty.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.subsettedProperty, UmlViewsRepository.FORM_KIND));
    this.subsettedProperty.createControls(parent, widgetFactory);
    this.subsettedProperty.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.subsettedProperty, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData subsettedPropertyData = new GridData(GridData.FILL_HORIZONTAL);
    subsettedPropertyData.horizontalSpan = 3;
    this.subsettedProperty.setLayoutData(subsettedPropertyData);
    this.subsettedProperty.disableMove();
    subsettedProperty.setID(UmlViewsRepository.ExtensionEnd.Properties.subsettedProperty);
    subsettedProperty.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addSubsettedProperty() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(subsettedProperty.getInput(), subsettedPropertyFilters, subsettedPropertyBusinessFilters,
    "subsettedProperty", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.subsettedProperty,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        subsettedProperty.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveSubsettedProperty(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.subsettedProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    subsettedProperty.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromSubsettedProperty(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.subsettedProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    subsettedProperty.refresh();
  }

	/**
	 * @generated
	 */
	protected void editSubsettedProperty(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        subsettedProperty.refresh();
      }
    }
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createAssociationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.ExtensionEnd.Properties.association, UmlMessages.ExtensionEndPropertiesEditionPart_AssociationLabel);
    association = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ExtensionEnd.Properties.association, UmlViewsRepository.FORM_KIND));
    widgetFactory.adapt(association);
    association.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    GridData associationData = new GridData(GridData.FILL_HORIZONTAL);
    association.setLayoutData(associationData);
    association.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.association, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAssociation()));
      }

    });
    association.setID(UmlViewsRepository.ExtensionEnd.Properties.association);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.association, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createAssociationEndFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.ExtensionEnd.Properties.associationEnd, UmlMessages.ExtensionEndPropertiesEditionPart_AssociationEndLabel);
    associationEnd = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ExtensionEnd.Properties.associationEnd, UmlViewsRepository.FORM_KIND));
    widgetFactory.adapt(associationEnd);
    associationEnd.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    GridData associationEndData = new GridData(GridData.FILL_HORIZONTAL);
    associationEnd.setLayoutData(associationEndData);
    associationEnd.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExtensionEndPropertiesEditionPartForm.this, UmlViewsRepository.ExtensionEnd.Properties.associationEnd, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAssociationEnd()));
      }

    });
    associationEnd.setID(UmlViewsRepository.ExtensionEnd.Properties.associationEnd);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ExtensionEnd.Properties.associationEnd, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
    return name.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
    if (newValue != null) {
      name.setText(newValue);
    } else {
      name.setText(""); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.name);
    if (readOnly && name.isEnabled()) {
      name.setEnabled(false);
      name.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !name.isEnabled()) {
      name.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getVisibility()
	 * @generated
	 */
	public Enumerator getVisibility() {
    Enumerator selection = (Enumerator) ((StructuredSelection) visibility.getSelection()).getFirstElement();
    return selection;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initVisibility(Object input, Enumerator current)
	 */
	public void initVisibility(Object input, Enumerator current) {
		visibility.setInput(input);
		visibility.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.visibility);
		if (readOnly && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setVisibility(Enumerator newValue)
	 * @generated
	 */
	public void setVisibility(Enumerator newValue) {
    visibility.modelUpdating(new StructuredSelection(newValue));
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.visibility);
    if (readOnly && visibility.isEnabled()) {
      visibility.setEnabled(false);
      visibility.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !visibility.isEnabled()) {
      visibility.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initClientDependency(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClientDependency(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		clientDependency.setContentProvider(contentProvider);
		clientDependency.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.clientDependency);
		if (readOnly && clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(false);
			clientDependency.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#updateClientDependency()
	 * @generated
	 */
	public void updateClientDependency() {
  clientDependency.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToClientDependency(ViewerFilter filter) {
    clientDependencyFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addBusinessFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToClientDependency(ViewerFilter filter) {
    clientDependencyBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#isContainedInClientDependencyTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInClientDependencyTable(EObject element) {
    return ((ReferencesTableSettings)clientDependency.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getIsLeaf()
	 * @generated
	 */
	public Boolean getIsLeaf() {
    return Boolean.valueOf(isLeaf.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setIsLeaf(Boolean newValue)
	 * @generated
	 */
	public void setIsLeaf(Boolean newValue) {
    if (newValue != null) {
      isLeaf.setSelection(newValue.booleanValue());
    } else {
      isLeaf.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.isLeaf);
    if (readOnly && isLeaf.isEnabled()) {
      isLeaf.setEnabled(false);
      isLeaf.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !isLeaf.isEnabled()) {
      isLeaf.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getIsStatic()
	 * @generated
	 */
	public Boolean getIsStatic() {
    return Boolean.valueOf(isStatic.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setIsStatic(Boolean newValue)
	 * @generated
	 */
	public void setIsStatic(Boolean newValue) {
    if (newValue != null) {
      isStatic.setSelection(newValue.booleanValue());
    } else {
      isStatic.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.isStatic);
    if (readOnly && isStatic.isEnabled()) {
      isStatic.setEnabled(false);
      isStatic.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !isStatic.isEnabled()) {
      isStatic.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getType()
	 * @generated
	 */
	public EObject getType() {
    if (type.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) type.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initType(EObjectFlatComboSettings)
	 */
	public void initType(EObjectFlatComboSettings settings) {
		type.setInput(settings);
		if (current != null) {
			type.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.type);
		if (readOnly && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setType(EObject newValue)
	 * @generated
	 */
	public void setType(EObject newValue) {
    if (newValue != null) {
      type.setSelection(new StructuredSelection(newValue));
    } else {
      type.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.type);
    if (readOnly && type.isEnabled()) {
      type.setEnabled(false);
      type.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !type.isEnabled()) {
      type.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue) {
		type.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToType(ViewerFilter filter) {
    type.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addBusinessFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToType(ViewerFilter filter) {
    type.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getIsOrdered()
	 * @generated
	 */
	public Boolean getIsOrdered() {
    return Boolean.valueOf(isOrdered.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setIsOrdered(Boolean newValue)
	 * @generated
	 */
	public void setIsOrdered(Boolean newValue) {
    if (newValue != null) {
      isOrdered.setSelection(newValue.booleanValue());
    } else {
      isOrdered.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.isOrdered);
    if (readOnly && isOrdered.isEnabled()) {
      isOrdered.setEnabled(false);
      isOrdered.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !isOrdered.isEnabled()) {
      isOrdered.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getIsUnique()
	 * @generated
	 */
	public Boolean getIsUnique() {
    return Boolean.valueOf(isUnique.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setIsUnique(Boolean newValue)
	 * @generated
	 */
	public void setIsUnique(Boolean newValue) {
    if (newValue != null) {
      isUnique.setSelection(newValue.booleanValue());
    } else {
      isUnique.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.isUnique);
    if (readOnly && isUnique.isEnabled()) {
      isUnique.setEnabled(false);
      isUnique.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !isUnique.isEnabled()) {
      isUnique.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getIsReadOnly()
	 * @generated
	 */
	public Boolean getIsReadOnly() {
    return Boolean.valueOf(isReadOnly.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setIsReadOnly(Boolean newValue)
	 * @generated
	 */
	public void setIsReadOnly(Boolean newValue) {
    if (newValue != null) {
      isReadOnly.setSelection(newValue.booleanValue());
    } else {
      isReadOnly.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.isReadOnly);
    if (readOnly && isReadOnly.isEnabled()) {
      isReadOnly.setEnabled(false);
      isReadOnly.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !isReadOnly.isEnabled()) {
      isReadOnly.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getOwningTemplateParameter()
	 * @generated
	 */
	public EObject getOwningTemplateParameter() {
    if (owningTemplateParameter.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) owningTemplateParameter.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initOwningTemplateParameter(EObjectFlatComboSettings)
	 */
	public void initOwningTemplateParameter(EObjectFlatComboSettings settings) {
		owningTemplateParameter.setInput(settings);
		if (current != null) {
			owningTemplateParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.owningTemplateParameter);
		if (readOnly && owningTemplateParameter.isEnabled()) {
			owningTemplateParameter.setEnabled(false);
			owningTemplateParameter.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !owningTemplateParameter.isEnabled()) {
			owningTemplateParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setOwningTemplateParameter(EObject newValue)
	 * @generated
	 */
	public void setOwningTemplateParameter(EObject newValue) {
    if (newValue != null) {
      owningTemplateParameter.setSelection(new StructuredSelection(newValue));
    } else {
      owningTemplateParameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.owningTemplateParameter);
    if (readOnly && owningTemplateParameter.isEnabled()) {
      owningTemplateParameter.setEnabled(false);
      owningTemplateParameter.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !owningTemplateParameter.isEnabled()) {
      owningTemplateParameter.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setOwningTemplateParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwningTemplateParameterButtonMode(ButtonsModeEnum newValue) {
		owningTemplateParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addFilterOwningTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToOwningTemplateParameter(ViewerFilter filter) {
    owningTemplateParameter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addBusinessFilterOwningTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToOwningTemplateParameter(ViewerFilter filter) {
    owningTemplateParameter.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getTemplateParameter()
	 * @generated
	 */
	public EObject getTemplateParameter() {
    if (templateParameter.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) templateParameter.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initTemplateParameter(EObjectFlatComboSettings)
	 */
	public void initTemplateParameter(EObjectFlatComboSettings settings) {
		templateParameter.setInput(settings);
		if (current != null) {
			templateParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.templateParameter);
		if (readOnly && templateParameter.isEnabled()) {
			templateParameter.setEnabled(false);
			templateParameter.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !templateParameter.isEnabled()) {
			templateParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setTemplateParameter(EObject newValue)
	 * @generated
	 */
	public void setTemplateParameter(EObject newValue) {
    if (newValue != null) {
      templateParameter.setSelection(new StructuredSelection(newValue));
    } else {
      templateParameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.templateParameter);
    if (readOnly && templateParameter.isEnabled()) {
      templateParameter.setEnabled(false);
      templateParameter.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !templateParameter.isEnabled()) {
      templateParameter.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setTemplateParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTemplateParameterButtonMode(ButtonsModeEnum newValue) {
		templateParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addFilterTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTemplateParameter(ViewerFilter filter) {
    templateParameter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addBusinessFilterTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTemplateParameter(ViewerFilter filter) {
    templateParameter.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getClass_()
	 * @generated
	 */
	public EObject getClass_() {
    if (class_.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) class_.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initClass_(EObjectFlatComboSettings)
	 */
	public void initClass_(EObjectFlatComboSettings settings) {
		class_.setInput(settings);
		if (current != null) {
			class_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.class_);
		if (readOnly && class_.isEnabled()) {
			class_.setEnabled(false);
			class_.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !class_.isEnabled()) {
			class_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setClass_(EObject newValue)
	 * @generated
	 */
	public void setClass_(EObject newValue) {
    if (newValue != null) {
      class_.setSelection(new StructuredSelection(newValue));
    } else {
      class_.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.class_);
    if (readOnly && class_.isEnabled()) {
      class_.setEnabled(false);
      class_.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !class_.isEnabled()) {
      class_.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setClass_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setClass_ButtonMode(ButtonsModeEnum newValue) {
		class_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addFilterClass_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToClass_(ViewerFilter filter) {
    class_.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addBusinessFilterClass_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToClass_(ViewerFilter filter) {
    class_.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getDatatype()
	 * @generated
	 */
	public EObject getDatatype() {
    if (datatype.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) datatype.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initDatatype(EObjectFlatComboSettings)
	 */
	public void initDatatype(EObjectFlatComboSettings settings) {
		datatype.setInput(settings);
		if (current != null) {
			datatype.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.datatype);
		if (readOnly && datatype.isEnabled()) {
			datatype.setEnabled(false);
			datatype.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !datatype.isEnabled()) {
			datatype.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setDatatype(EObject newValue)
	 * @generated
	 */
	public void setDatatype(EObject newValue) {
    if (newValue != null) {
      datatype.setSelection(new StructuredSelection(newValue));
    } else {
      datatype.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.datatype);
    if (readOnly && datatype.isEnabled()) {
      datatype.setEnabled(false);
      datatype.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !datatype.isEnabled()) {
      datatype.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setDatatypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDatatypeButtonMode(ButtonsModeEnum newValue) {
		datatype.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addFilterDatatype(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToDatatype(ViewerFilter filter) {
    datatype.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addBusinessFilterDatatype(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToDatatype(ViewerFilter filter) {
    datatype.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getIsDerived()
	 * @generated
	 */
	public Boolean getIsDerived() {
    return Boolean.valueOf(isDerived.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setIsDerived(Boolean newValue)
	 * @generated
	 */
	public void setIsDerived(Boolean newValue) {
    if (newValue != null) {
      isDerived.setSelection(newValue.booleanValue());
    } else {
      isDerived.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.isDerived);
    if (readOnly && isDerived.isEnabled()) {
      isDerived.setEnabled(false);
      isDerived.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !isDerived.isEnabled()) {
      isDerived.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getIsDerivedUnion()
	 * @generated
	 */
	public Boolean getIsDerivedUnion() {
    return Boolean.valueOf(isDerivedUnion.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setIsDerivedUnion(Boolean newValue)
	 * @generated
	 */
	public void setIsDerivedUnion(Boolean newValue) {
    if (newValue != null) {
      isDerivedUnion.setSelection(newValue.booleanValue());
    } else {
      isDerivedUnion.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.isDerivedUnion);
    if (readOnly && isDerivedUnion.isEnabled()) {
      isDerivedUnion.setEnabled(false);
      isDerivedUnion.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !isDerivedUnion.isEnabled()) {
      isDerivedUnion.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getAggregation()
	 * @generated
	 */
	public Enumerator getAggregation() {
    Enumerator selection = (Enumerator) ((StructuredSelection) aggregation.getSelection()).getFirstElement();
    return selection;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initAggregation(Object input, Enumerator current)
	 */
	public void initAggregation(Object input, Enumerator current) {
		aggregation.setInput(input);
		aggregation.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.aggregation);
		if (readOnly && aggregation.isEnabled()) {
			aggregation.setEnabled(false);
			aggregation.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !aggregation.isEnabled()) {
			aggregation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setAggregation(Enumerator newValue)
	 * @generated
	 */
	public void setAggregation(Enumerator newValue) {
    aggregation.modelUpdating(new StructuredSelection(newValue));
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.aggregation);
    if (readOnly && aggregation.isEnabled()) {
      aggregation.setEnabled(false);
      aggregation.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !aggregation.isEnabled()) {
      aggregation.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initRedefinedProperty(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRedefinedProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		redefinedProperty.setContentProvider(contentProvider);
		redefinedProperty.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.redefinedProperty);
		if (readOnly && redefinedProperty.getTable().isEnabled()) {
			redefinedProperty.setEnabled(false);
			redefinedProperty.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !redefinedProperty.getTable().isEnabled()) {
			redefinedProperty.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#updateRedefinedProperty()
	 * @generated
	 */
	public void updateRedefinedProperty() {
  redefinedProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addFilterRedefinedProperty(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToRedefinedProperty(ViewerFilter filter) {
    redefinedPropertyFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addBusinessFilterRedefinedProperty(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToRedefinedProperty(ViewerFilter filter) {
    redefinedPropertyBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#isContainedInRedefinedPropertyTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInRedefinedPropertyTable(EObject element) {
    return ((ReferencesTableSettings)redefinedProperty.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getOwningAssociation()
	 * @generated
	 */
	public EObject getOwningAssociation() {
    if (owningAssociation.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) owningAssociation.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initOwningAssociation(EObjectFlatComboSettings)
	 */
	public void initOwningAssociation(EObjectFlatComboSettings settings) {
		owningAssociation.setInput(settings);
		if (current != null) {
			owningAssociation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.owningAssociation);
		if (readOnly && owningAssociation.isEnabled()) {
			owningAssociation.setEnabled(false);
			owningAssociation.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !owningAssociation.isEnabled()) {
			owningAssociation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setOwningAssociation(EObject newValue)
	 * @generated
	 */
	public void setOwningAssociation(EObject newValue) {
    if (newValue != null) {
      owningAssociation.setSelection(new StructuredSelection(newValue));
    } else {
      owningAssociation.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.owningAssociation);
    if (readOnly && owningAssociation.isEnabled()) {
      owningAssociation.setEnabled(false);
      owningAssociation.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !owningAssociation.isEnabled()) {
      owningAssociation.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setOwningAssociationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwningAssociationButtonMode(ButtonsModeEnum newValue) {
		owningAssociation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addFilterOwningAssociation(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToOwningAssociation(ViewerFilter filter) {
    owningAssociation.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addBusinessFilterOwningAssociation(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToOwningAssociation(ViewerFilter filter) {
    owningAssociation.addBusinessRuleFilter(filter);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initSubsettedProperty(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSubsettedProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		subsettedProperty.setContentProvider(contentProvider);
		subsettedProperty.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.subsettedProperty);
		if (readOnly && subsettedProperty.getTable().isEnabled()) {
			subsettedProperty.setEnabled(false);
			subsettedProperty.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !subsettedProperty.getTable().isEnabled()) {
			subsettedProperty.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#updateSubsettedProperty()
	 * @generated
	 */
	public void updateSubsettedProperty() {
  subsettedProperty.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addFilterSubsettedProperty(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToSubsettedProperty(ViewerFilter filter) {
    subsettedPropertyFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addBusinessFilterSubsettedProperty(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToSubsettedProperty(ViewerFilter filter) {
    subsettedPropertyBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#isContainedInSubsettedPropertyTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInSubsettedPropertyTable(EObject element) {
    return ((ReferencesTableSettings)subsettedProperty.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getAssociation()
	 * @generated
	 */
	public EObject getAssociation() {
    if (association.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) association.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initAssociation(EObjectFlatComboSettings)
	 */
	public void initAssociation(EObjectFlatComboSettings settings) {
		association.setInput(settings);
		if (current != null) {
			association.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.association);
		if (readOnly && association.isEnabled()) {
			association.setEnabled(false);
			association.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !association.isEnabled()) {
			association.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setAssociation(EObject newValue)
	 * @generated
	 */
	public void setAssociation(EObject newValue) {
    if (newValue != null) {
      association.setSelection(new StructuredSelection(newValue));
    } else {
      association.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.association);
    if (readOnly && association.isEnabled()) {
      association.setEnabled(false);
      association.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !association.isEnabled()) {
      association.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setAssociationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAssociationButtonMode(ButtonsModeEnum newValue) {
		association.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addFilterAssociation(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToAssociation(ViewerFilter filter) {
    association.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addBusinessFilterAssociation(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToAssociation(ViewerFilter filter) {
    association.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#getAssociationEnd()
	 * @generated
	 */
	public EObject getAssociationEnd() {
    if (associationEnd.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) associationEnd.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#initAssociationEnd(EObjectFlatComboSettings)
	 */
	public void initAssociationEnd(EObjectFlatComboSettings settings) {
		associationEnd.setInput(settings);
		if (current != null) {
			associationEnd.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.associationEnd);
		if (readOnly && associationEnd.isEnabled()) {
			associationEnd.setEnabled(false);
			associationEnd.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
		} else if (!readOnly && !associationEnd.isEnabled()) {
			associationEnd.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setAssociationEnd(EObject newValue)
	 * @generated
	 */
	public void setAssociationEnd(EObject newValue) {
    if (newValue != null) {
      associationEnd.setSelection(new StructuredSelection(newValue));
    } else {
      associationEnd.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ExtensionEnd.Properties.associationEnd);
    if (readOnly && associationEnd.isEnabled()) {
      associationEnd.setEnabled(false);
      associationEnd.setToolTipText(UmlMessages.ExtensionEnd_ReadOnly);
    } else if (!readOnly && !associationEnd.isEnabled()) {
      associationEnd.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#setAssociationEndButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAssociationEndButtonMode(ButtonsModeEnum newValue) {
		associationEnd.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addFilterAssociationEnd(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToAssociationEnd(ViewerFilter filter) {
    associationEnd.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ExtensionEndPropertiesEditionPart#addBusinessFilterAssociationEnd(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToAssociationEnd(ViewerFilter filter) {
    associationEnd.addBusinessRuleFilter(filter);
  }






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return UmlMessages.ExtensionEnd_Part_Title;
  }



}
