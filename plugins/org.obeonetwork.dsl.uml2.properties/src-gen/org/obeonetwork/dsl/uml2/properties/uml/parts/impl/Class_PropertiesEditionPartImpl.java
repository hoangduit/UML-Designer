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
package org.obeonetwork.dsl.uml2.properties.uml.parts.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart;
import org.obeonetwork.dsl.uml2.properties.uml.parts.UmlViewsRepository;

import org.obeonetwork.dsl.uml2.properties.uml.providers.UmlMessages;


/**
 * @author <a href="mailto:cedric.brun@obeo.fr">Cédric Brun</a>
 * @generated
 */
public class Class_PropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, Class_PropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer visibility;
	protected ReferencesTable clientDependency;
	protected List<ViewerFilter> clientDependencyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> clientDependencyFilters = new ArrayList<ViewerFilter>();
	protected Button isLeaf;
	protected EObjectFlatComboViewer owningTemplateParameter;
	protected EObjectFlatComboViewer templateParameter;
	protected Button isAbstract;
	protected ReferencesTable powertypeExtent;
	protected List<ViewerFilter> powertypeExtentBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> powertypeExtentFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable redefinedClassifier;
	protected List<ViewerFilter> redefinedClassifierBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> redefinedClassifierFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer representation;
	protected ReferencesTable useCase;
	protected List<ViewerFilter> useCaseBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> useCaseFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer classifierBehavior;
	protected Button isActive;



	protected ReferencesTable operations;
  protected List<ViewerFilter> operationsBusinessFilters = new ArrayList<ViewerFilter>();
  protected List<ViewerFilter> operationsFilters = new ArrayList<ViewerFilter>();



  /**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public Class_PropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
    super(editionComponent);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public Composite createFigure(final Composite parent) {
    view = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 3;
    view.setLayout(layout);
    createControls(view);
    return view;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public void createControls(Composite view) { 
    CompositionSequence class_Step = new BindingCompositionSequence(propertiesEditionComponent);
    CompositionStep propertiesStep = class_Step.addStep(UmlViewsRepository.Class_.Properties.class);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.name);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.visibility);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.clientDependency);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.isLeaf);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.owningTemplateParameter);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.templateParameter);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.isAbstract);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.powertypeExtent);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.redefinedClassifier);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.representation);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.useCase);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.classifierBehavior);
    propertiesStep.addStep(UmlViewsRepository.Class_.Properties.isActive);
    
    class_Step
      .addStep(UmlViewsRepository.Class_.Operations.class)
      .addStep(UmlViewsRepository.Class_.Operations.operations_);
    
    
    composer = new PartComposer(class_Step) {

      @Override
      public Composite addToPart(Composite parent, Object key) {
        if (key == UmlViewsRepository.Class_.Properties.class) {
          return createPropertiesGroup(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.name) {
          return createNameText(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.visibility) {
          return createVisibilityEMFComboViewer(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.clientDependency) {
          return createClientDependencyAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.isLeaf) {
          return createIsLeafCheckbox(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.owningTemplateParameter) {
          return createOwningTemplateParameterFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.templateParameter) {
          return createTemplateParameterFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.isAbstract) {
          return createIsAbstractCheckbox(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.powertypeExtent) {
          return createPowertypeExtentAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.redefinedClassifier) {
          return createRedefinedClassifierAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.representation) {
          return createRepresentationFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.useCase) {
          return createUseCaseAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.classifierBehavior) {
          return createClassifierBehaviorFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.Class_.Properties.isActive) {
          return createIsActiveCheckbox(parent);
        }
        if (key == UmlViewsRepository.Class_.Operations.class) {
          return createOperationsGroup(parent);
        }
        if (key == UmlViewsRepository.Class_.Operations.operations_) {
          return createOperationsAdvancedTableComposition(parent);
        }
        return parent;
      }
    };
    composer.compose(view);
  }

	/**
	 * @generated
	 */
	protected Composite createPropertiesGroup(Composite parent) {
    Group propertiesGroup = new Group(parent, SWT.NONE);
    propertiesGroup.setText(UmlMessages.Class_PropertiesEditionPart_PropertiesGroupLabel);
    GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
    propertiesGroupData.horizontalSpan = 3;
    propertiesGroup.setLayoutData(propertiesGroupData);
    GridLayout propertiesGroupLayout = new GridLayout();
    propertiesGroupLayout.numColumns = 3;
    propertiesGroup.setLayout(propertiesGroupLayout);
    return propertiesGroup;
  }

	/**
	 * @generated
	 */
	
	protected Composite createNameText(Composite parent) {
    createDescription(parent, UmlViewsRepository.Class_.Properties.name, UmlMessages.Class_PropertiesEditionPart_NameLabel);
    name = SWTUtils.createScrollableText(parent, SWT.BORDER);
    GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
    name.setLayoutData(nameData);
    name.addFocusListener(new FocusAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void focusLost(FocusEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
      }

    });
    name.addKeyListener(new KeyAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void keyPressed(KeyEvent e) {
        if (e.character == SWT.CR) {
          if (propertiesEditionComponent != null)
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
        }
      }

    });
    EditingUtils.setID(name, UmlViewsRepository.Class_.Properties.name);
    EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.name, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createVisibilityEMFComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.Class_.Properties.visibility, UmlMessages.Class_PropertiesEditionPart_VisibilityLabel);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
      }

    });
    visibility.setID(UmlViewsRepository.Class_.Properties.visibility);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.visibility, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createClientDependencyAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.Class_.Properties.clientDependency, UmlMessages.Class_PropertiesEditionPart_ClientDependencyLabel);		 
    this.clientDependency = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addClientDependency(); }
      public void handleEdit(EObject element) { editClientDependency(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveClientDependency(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromClientDependency(element); }
      public void navigateTo(EObject element) { }
    });
    this.clientDependency.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.clientDependency, UmlViewsRepository.SWT_KIND));
    this.clientDependency.createControls(parent);
    this.clientDependency.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.clientDependency, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData clientDependencyData = new GridData(GridData.FILL_HORIZONTAL);
    clientDependencyData.horizontalSpan = 3;
    this.clientDependency.setLayoutData(clientDependencyData);
    this.clientDependency.disableMove();
    clientDependency.setID(UmlViewsRepository.Class_.Properties.clientDependency);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.clientDependency,
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
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    clientDependency.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromClientDependency(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	
	protected Composite createIsLeafCheckbox(Composite parent) {
    isLeaf = new Button(parent, SWT.CHECK);
    isLeaf.setText(getDescription(UmlViewsRepository.Class_.Properties.isLeaf, UmlMessages.Class_PropertiesEditionPart_IsLeafLabel));
    isLeaf.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.isLeaf, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isLeaf.getSelection())));
      }

    });
    GridData isLeafData = new GridData(GridData.FILL_HORIZONTAL);
    isLeafData.horizontalSpan = 2;
    isLeaf.setLayoutData(isLeafData);
    EditingUtils.setID(isLeaf, UmlViewsRepository.Class_.Properties.isLeaf);
    EditingUtils.setEEFtype(isLeaf, "eef::Checkbox"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.isLeaf, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createOwningTemplateParameterFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.Class_.Properties.owningTemplateParameter, UmlMessages.Class_PropertiesEditionPart_OwningTemplateParameterLabel);
    owningTemplateParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.Class_.Properties.owningTemplateParameter, UmlViewsRepository.SWT_KIND));
    owningTemplateParameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    owningTemplateParameter.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.owningTemplateParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOwningTemplateParameter()));
      }

    });
    GridData owningTemplateParameterData = new GridData(GridData.FILL_HORIZONTAL);
    owningTemplateParameter.setLayoutData(owningTemplateParameterData);
    owningTemplateParameter.setID(UmlViewsRepository.Class_.Properties.owningTemplateParameter);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.owningTemplateParameter, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createTemplateParameterFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.Class_.Properties.templateParameter, UmlMessages.Class_PropertiesEditionPart_TemplateParameterLabel);
    templateParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.Class_.Properties.templateParameter, UmlViewsRepository.SWT_KIND));
    templateParameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    templateParameter.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.templateParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTemplateParameter()));
      }

    });
    GridData templateParameterData = new GridData(GridData.FILL_HORIZONTAL);
    templateParameter.setLayoutData(templateParameterData);
    templateParameter.setID(UmlViewsRepository.Class_.Properties.templateParameter);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.templateParameter, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsAbstractCheckbox(Composite parent) {
    isAbstract = new Button(parent, SWT.CHECK);
    isAbstract.setText(getDescription(UmlViewsRepository.Class_.Properties.isAbstract, UmlMessages.Class_PropertiesEditionPart_IsAbstractLabel));
    isAbstract.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.isAbstract, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isAbstract.getSelection())));
      }

    });
    GridData isAbstractData = new GridData(GridData.FILL_HORIZONTAL);
    isAbstractData.horizontalSpan = 2;
    isAbstract.setLayoutData(isAbstractData);
    EditingUtils.setID(isAbstract, UmlViewsRepository.Class_.Properties.isAbstract);
    EditingUtils.setEEFtype(isAbstract, "eef::Checkbox"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.isAbstract, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createPowertypeExtentAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.Class_.Properties.powertypeExtent, UmlMessages.Class_PropertiesEditionPart_PowertypeExtentLabel);		 
    this.powertypeExtent = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addPowertypeExtent(); }
      public void handleEdit(EObject element) { editPowertypeExtent(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { movePowertypeExtent(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromPowertypeExtent(element); }
      public void navigateTo(EObject element) { }
    });
    this.powertypeExtent.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.powertypeExtent, UmlViewsRepository.SWT_KIND));
    this.powertypeExtent.createControls(parent);
    this.powertypeExtent.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.powertypeExtent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData powertypeExtentData = new GridData(GridData.FILL_HORIZONTAL);
    powertypeExtentData.horizontalSpan = 3;
    this.powertypeExtent.setLayoutData(powertypeExtentData);
    this.powertypeExtent.disableMove();
    powertypeExtent.setID(UmlViewsRepository.Class_.Properties.powertypeExtent);
    powertypeExtent.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addPowertypeExtent() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(powertypeExtent.getInput(), powertypeExtentFilters, powertypeExtentBusinessFilters,
    "powertypeExtent", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.powertypeExtent,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        powertypeExtent.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void movePowertypeExtent(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.powertypeExtent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    powertypeExtent.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromPowertypeExtent(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.powertypeExtent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    powertypeExtent.refresh();
  }

	/**
	 * @generated
	 */
	protected void editPowertypeExtent(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        powertypeExtent.refresh();
      }
    }
  }

	/**
	 * @generated
	 */
	protected Composite createRedefinedClassifierAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.Class_.Properties.redefinedClassifier, UmlMessages.Class_PropertiesEditionPart_RedefinedClassifierLabel);		 
    this.redefinedClassifier = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addRedefinedClassifier(); }
      public void handleEdit(EObject element) { editRedefinedClassifier(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveRedefinedClassifier(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromRedefinedClassifier(element); }
      public void navigateTo(EObject element) { }
    });
    this.redefinedClassifier.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.redefinedClassifier, UmlViewsRepository.SWT_KIND));
    this.redefinedClassifier.createControls(parent);
    this.redefinedClassifier.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.redefinedClassifier, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData redefinedClassifierData = new GridData(GridData.FILL_HORIZONTAL);
    redefinedClassifierData.horizontalSpan = 3;
    this.redefinedClassifier.setLayoutData(redefinedClassifierData);
    this.redefinedClassifier.disableMove();
    redefinedClassifier.setID(UmlViewsRepository.Class_.Properties.redefinedClassifier);
    redefinedClassifier.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addRedefinedClassifier() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(redefinedClassifier.getInput(), redefinedClassifierFilters, redefinedClassifierBusinessFilters,
    "redefinedClassifier", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.redefinedClassifier,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        redefinedClassifier.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveRedefinedClassifier(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.redefinedClassifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    redefinedClassifier.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromRedefinedClassifier(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.redefinedClassifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    redefinedClassifier.refresh();
  }

	/**
	 * @generated
	 */
	protected void editRedefinedClassifier(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        redefinedClassifier.refresh();
      }
    }
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createRepresentationFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.Class_.Properties.representation, UmlMessages.Class_PropertiesEditionPart_RepresentationLabel);
    representation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.Class_.Properties.representation, UmlViewsRepository.SWT_KIND));
    representation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    representation.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.representation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRepresentation()));
      }

    });
    GridData representationData = new GridData(GridData.FILL_HORIZONTAL);
    representation.setLayoutData(representationData);
    representation.setID(UmlViewsRepository.Class_.Properties.representation);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.representation, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createUseCaseAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.Class_.Properties.useCase, UmlMessages.Class_PropertiesEditionPart_UseCaseLabel);		 
    this.useCase = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addUseCase(); }
      public void handleEdit(EObject element) { editUseCase(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveUseCase(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromUseCase(element); }
      public void navigateTo(EObject element) { }
    });
    this.useCase.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.useCase, UmlViewsRepository.SWT_KIND));
    this.useCase.createControls(parent);
    this.useCase.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.useCase, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData useCaseData = new GridData(GridData.FILL_HORIZONTAL);
    useCaseData.horizontalSpan = 3;
    this.useCase.setLayoutData(useCaseData);
    this.useCase.disableMove();
    useCase.setID(UmlViewsRepository.Class_.Properties.useCase);
    useCase.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addUseCase() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(useCase.getInput(), useCaseFilters, useCaseBusinessFilters,
    "useCase", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.useCase,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        useCase.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveUseCase(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.useCase, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    useCase.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromUseCase(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.useCase, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    useCase.refresh();
  }

	/**
	 * @generated
	 */
	protected void editUseCase(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        useCase.refresh();
      }
    }
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createClassifierBehaviorFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.Class_.Properties.classifierBehavior, UmlMessages.Class_PropertiesEditionPart_ClassifierBehaviorLabel);
    classifierBehavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.Class_.Properties.classifierBehavior, UmlViewsRepository.SWT_KIND));
    classifierBehavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    classifierBehavior.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.classifierBehavior, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getClassifierBehavior()));
      }

    });
    GridData classifierBehaviorData = new GridData(GridData.FILL_HORIZONTAL);
    classifierBehavior.setLayoutData(classifierBehaviorData);
    classifierBehavior.setID(UmlViewsRepository.Class_.Properties.classifierBehavior);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.classifierBehavior, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsActiveCheckbox(Composite parent) {
    isActive = new Button(parent, SWT.CHECK);
    isActive.setText(getDescription(UmlViewsRepository.Class_.Properties.isActive, UmlMessages.Class_PropertiesEditionPart_IsActiveLabel));
    isActive.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Properties.isActive, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isActive.getSelection())));
      }

    });
    GridData isActiveData = new GridData(GridData.FILL_HORIZONTAL);
    isActiveData.horizontalSpan = 2;
    isActive.setLayoutData(isActiveData);
    EditingUtils.setID(isActive, UmlViewsRepository.Class_.Properties.isActive);
    EditingUtils.setEEFtype(isActive, "eef::Checkbox"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Properties.isActive, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }


	/**
   * @generated
   */
  protected Composite createOperationsGroup(Composite parent) {
    Group operationsGroup = new Group(parent, SWT.NONE);
    operationsGroup.setText(UmlMessages.Class_PropertiesEditionPart_OperationsGroupLabel);
    GridData operationsGroupData = new GridData(GridData.FILL_HORIZONTAL);
    operationsGroupData.horizontalSpan = 3;
    operationsGroup.setLayoutData(operationsGroupData);
    GridLayout operationsGroupLayout = new GridLayout();
    operationsGroupLayout.numColumns = 3;
    operationsGroup.setLayout(operationsGroupLayout);
    return operationsGroup;
  }

  /**
   * @param container
   * @generated
   */
  protected Composite createOperationsAdvancedTableComposition(Composite parent) {
    this.operations = new ReferencesTable(getDescription(UmlViewsRepository.Class_.Operations.operations_, UmlMessages.Class_PropertiesEditionPart_OperationsLabel), new ReferencesTableListener() {
      public void handleAdd() { 
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Operations.operations_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
        operations.refresh();
      }
      public void handleEdit(EObject element) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Operations.operations_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
        operations.refresh();
      }
      public void handleMove(EObject element, int oldIndex, int newIndex) { 
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Operations.operations_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
        operations.refresh();
      }
      public void handleRemove(EObject element) { 
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Operations.operations_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
        operations.refresh();
      }
      public void navigateTo(EObject element) { }
    });
    for (ViewerFilter filter : this.operationsFilters) {
      this.operations.addFilter(filter);
    }
    this.operations.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.Class_.Operations.operations_, UmlViewsRepository.SWT_KIND));
    this.operations.createControls(parent);
    this.operations.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, UmlViewsRepository.Class_.Operations.operations_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData operationsData = new GridData(GridData.FILL_HORIZONTAL);
    operationsData.horizontalSpan = 3;
    this.operations.setLayoutData(operationsData);
    this.operations.setLowerBound(0);
    this.operations.setUpperBound(-1);
    operations.setID(UmlViewsRepository.Class_.Operations.operations_);
    operations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
    return name.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
    if (newValue != null) {
      name.setText(newValue);
    } else {
      name.setText(""); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.name);
    if (readOnly && name.isEnabled()) {
      name.setEnabled(false);
      name.setToolTipText(UmlMessages.Class__ReadOnly);
    } else if (!readOnly && !name.isEnabled()) {
      name.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#getVisibility()
	 * @generated
	 */
	public Enumerator getVisibility() {
    Enumerator selection = (Enumerator) ((StructuredSelection) visibility.getSelection()).getFirstElement();
    return selection;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#initVisibility(Object input, Enumerator current)
	 */
	public void initVisibility(Object input, Enumerator current) {
		visibility.setInput(input);
		visibility.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.visibility);
		if (readOnly && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(UmlMessages.Class__ReadOnly);
		} else if (!readOnly && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setVisibility(Enumerator newValue)
	 * @generated
	 */
	public void setVisibility(Enumerator newValue) {
    visibility.modelUpdating(new StructuredSelection(newValue));
    boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.visibility);
    if (readOnly && visibility.isEnabled()) {
      visibility.setEnabled(false);
      visibility.setToolTipText(UmlMessages.Class__ReadOnly);
    } else if (!readOnly && !visibility.isEnabled()) {
      visibility.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#initClientDependency(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClientDependency(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		clientDependency.setContentProvider(contentProvider);
		clientDependency.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.clientDependency);
		if (readOnly && clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(false);
			clientDependency.setToolTipText(UmlMessages.Class__ReadOnly);
		} else if (!readOnly && !clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#updateClientDependency()
	 * @generated
	 */
	public void updateClientDependency() {
  clientDependency.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToClientDependency(ViewerFilter filter) {
    clientDependencyFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addBusinessFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToClientDependency(ViewerFilter filter) {
    clientDependencyBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#isContainedInClientDependencyTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInClientDependencyTable(EObject element) {
    return ((ReferencesTableSettings)clientDependency.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#getIsLeaf()
	 * @generated
	 */
	public Boolean getIsLeaf() {
    return Boolean.valueOf(isLeaf.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setIsLeaf(Boolean newValue)
	 * @generated
	 */
	public void setIsLeaf(Boolean newValue) {
    if (newValue != null) {
      isLeaf.setSelection(newValue.booleanValue());
    } else {
      isLeaf.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.isLeaf);
    if (readOnly && isLeaf.isEnabled()) {
      isLeaf.setEnabled(false);
      isLeaf.setToolTipText(UmlMessages.Class__ReadOnly);
    } else if (!readOnly && !isLeaf.isEnabled()) {
      isLeaf.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#getOwningTemplateParameter()
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#initOwningTemplateParameter(EObjectFlatComboSettings)
	 */
	public void initOwningTemplateParameter(EObjectFlatComboSettings settings) {
		owningTemplateParameter.setInput(settings);
		if (current != null) {
			owningTemplateParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.owningTemplateParameter);
		if (readOnly && owningTemplateParameter.isEnabled()) {
			owningTemplateParameter.setEnabled(false);
			owningTemplateParameter.setToolTipText(UmlMessages.Class__ReadOnly);
		} else if (!readOnly && !owningTemplateParameter.isEnabled()) {
			owningTemplateParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setOwningTemplateParameter(EObject newValue)
	 * @generated
	 */
	public void setOwningTemplateParameter(EObject newValue) {
    if (newValue != null) {
      owningTemplateParameter.setSelection(new StructuredSelection(newValue));
    } else {
      owningTemplateParameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.owningTemplateParameter);
    if (readOnly && owningTemplateParameter.isEnabled()) {
      owningTemplateParameter.setEnabled(false);
      owningTemplateParameter.setToolTipText(UmlMessages.Class__ReadOnly);
    } else if (!readOnly && !owningTemplateParameter.isEnabled()) {
      owningTemplateParameter.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setOwningTemplateParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwningTemplateParameterButtonMode(ButtonsModeEnum newValue) {
		owningTemplateParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addFilterOwningTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToOwningTemplateParameter(ViewerFilter filter) {
    owningTemplateParameter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addBusinessFilterOwningTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToOwningTemplateParameter(ViewerFilter filter) {
    owningTemplateParameter.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#getTemplateParameter()
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#initTemplateParameter(EObjectFlatComboSettings)
	 */
	public void initTemplateParameter(EObjectFlatComboSettings settings) {
		templateParameter.setInput(settings);
		if (current != null) {
			templateParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.templateParameter);
		if (readOnly && templateParameter.isEnabled()) {
			templateParameter.setEnabled(false);
			templateParameter.setToolTipText(UmlMessages.Class__ReadOnly);
		} else if (!readOnly && !templateParameter.isEnabled()) {
			templateParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setTemplateParameter(EObject newValue)
	 * @generated
	 */
	public void setTemplateParameter(EObject newValue) {
    if (newValue != null) {
      templateParameter.setSelection(new StructuredSelection(newValue));
    } else {
      templateParameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.templateParameter);
    if (readOnly && templateParameter.isEnabled()) {
      templateParameter.setEnabled(false);
      templateParameter.setToolTipText(UmlMessages.Class__ReadOnly);
    } else if (!readOnly && !templateParameter.isEnabled()) {
      templateParameter.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setTemplateParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTemplateParameterButtonMode(ButtonsModeEnum newValue) {
		templateParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addFilterTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTemplateParameter(ViewerFilter filter) {
    templateParameter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addBusinessFilterTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTemplateParameter(ViewerFilter filter) {
    templateParameter.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#getIsAbstract()
	 * @generated
	 */
	public Boolean getIsAbstract() {
    return Boolean.valueOf(isAbstract.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setIsAbstract(Boolean newValue)
	 * @generated
	 */
	public void setIsAbstract(Boolean newValue) {
    if (newValue != null) {
      isAbstract.setSelection(newValue.booleanValue());
    } else {
      isAbstract.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.isAbstract);
    if (readOnly && isAbstract.isEnabled()) {
      isAbstract.setEnabled(false);
      isAbstract.setToolTipText(UmlMessages.Class__ReadOnly);
    } else if (!readOnly && !isAbstract.isEnabled()) {
      isAbstract.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#initPowertypeExtent(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPowertypeExtent(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		powertypeExtent.setContentProvider(contentProvider);
		powertypeExtent.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.powertypeExtent);
		if (readOnly && powertypeExtent.getTable().isEnabled()) {
			powertypeExtent.setEnabled(false);
			powertypeExtent.setToolTipText(UmlMessages.Class__ReadOnly);
		} else if (!readOnly && !powertypeExtent.getTable().isEnabled()) {
			powertypeExtent.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#updatePowertypeExtent()
	 * @generated
	 */
	public void updatePowertypeExtent() {
  powertypeExtent.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addFilterPowertypeExtent(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToPowertypeExtent(ViewerFilter filter) {
    powertypeExtentFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addBusinessFilterPowertypeExtent(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToPowertypeExtent(ViewerFilter filter) {
    powertypeExtentBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#isContainedInPowertypeExtentTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInPowertypeExtentTable(EObject element) {
    return ((ReferencesTableSettings)powertypeExtent.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#initRedefinedClassifier(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRedefinedClassifier(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		redefinedClassifier.setContentProvider(contentProvider);
		redefinedClassifier.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.redefinedClassifier);
		if (readOnly && redefinedClassifier.getTable().isEnabled()) {
			redefinedClassifier.setEnabled(false);
			redefinedClassifier.setToolTipText(UmlMessages.Class__ReadOnly);
		} else if (!readOnly && !redefinedClassifier.getTable().isEnabled()) {
			redefinedClassifier.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#updateRedefinedClassifier()
	 * @generated
	 */
	public void updateRedefinedClassifier() {
  redefinedClassifier.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addFilterRedefinedClassifier(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToRedefinedClassifier(ViewerFilter filter) {
    redefinedClassifierFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addBusinessFilterRedefinedClassifier(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToRedefinedClassifier(ViewerFilter filter) {
    redefinedClassifierBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#isContainedInRedefinedClassifierTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInRedefinedClassifierTable(EObject element) {
    return ((ReferencesTableSettings)redefinedClassifier.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#getRepresentation()
	 * @generated
	 */
	public EObject getRepresentation() {
    if (representation.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) representation.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#initRepresentation(EObjectFlatComboSettings)
	 */
	public void initRepresentation(EObjectFlatComboSettings settings) {
		representation.setInput(settings);
		if (current != null) {
			representation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.representation);
		if (readOnly && representation.isEnabled()) {
			representation.setEnabled(false);
			representation.setToolTipText(UmlMessages.Class__ReadOnly);
		} else if (!readOnly && !representation.isEnabled()) {
			representation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setRepresentation(EObject newValue)
	 * @generated
	 */
	public void setRepresentation(EObject newValue) {
    if (newValue != null) {
      representation.setSelection(new StructuredSelection(newValue));
    } else {
      representation.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.representation);
    if (readOnly && representation.isEnabled()) {
      representation.setEnabled(false);
      representation.setToolTipText(UmlMessages.Class__ReadOnly);
    } else if (!readOnly && !representation.isEnabled()) {
      representation.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setRepresentationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRepresentationButtonMode(ButtonsModeEnum newValue) {
		representation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addFilterRepresentation(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToRepresentation(ViewerFilter filter) {
    representation.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addBusinessFilterRepresentation(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToRepresentation(ViewerFilter filter) {
    representation.addBusinessRuleFilter(filter);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#initUseCase(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUseCase(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		useCase.setContentProvider(contentProvider);
		useCase.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.useCase);
		if (readOnly && useCase.getTable().isEnabled()) {
			useCase.setEnabled(false);
			useCase.setToolTipText(UmlMessages.Class__ReadOnly);
		} else if (!readOnly && !useCase.getTable().isEnabled()) {
			useCase.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#updateUseCase()
	 * @generated
	 */
	public void updateUseCase() {
  useCase.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addFilterUseCase(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToUseCase(ViewerFilter filter) {
    useCaseFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addBusinessFilterUseCase(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToUseCase(ViewerFilter filter) {
    useCaseBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#isContainedInUseCaseTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInUseCaseTable(EObject element) {
    return ((ReferencesTableSettings)useCase.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#getClassifierBehavior()
	 * @generated
	 */
	public EObject getClassifierBehavior() {
    if (classifierBehavior.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) classifierBehavior.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#initClassifierBehavior(EObjectFlatComboSettings)
	 */
	public void initClassifierBehavior(EObjectFlatComboSettings settings) {
		classifierBehavior.setInput(settings);
		if (current != null) {
			classifierBehavior.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.classifierBehavior);
		if (readOnly && classifierBehavior.isEnabled()) {
			classifierBehavior.setEnabled(false);
			classifierBehavior.setToolTipText(UmlMessages.Class__ReadOnly);
		} else if (!readOnly && !classifierBehavior.isEnabled()) {
			classifierBehavior.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setClassifierBehavior(EObject newValue)
	 * @generated
	 */
	public void setClassifierBehavior(EObject newValue) {
    if (newValue != null) {
      classifierBehavior.setSelection(new StructuredSelection(newValue));
    } else {
      classifierBehavior.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.classifierBehavior);
    if (readOnly && classifierBehavior.isEnabled()) {
      classifierBehavior.setEnabled(false);
      classifierBehavior.setToolTipText(UmlMessages.Class__ReadOnly);
    } else if (!readOnly && !classifierBehavior.isEnabled()) {
      classifierBehavior.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setClassifierBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setClassifierBehaviorButtonMode(ButtonsModeEnum newValue) {
		classifierBehavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addFilterClassifierBehavior(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToClassifierBehavior(ViewerFilter filter) {
    classifierBehavior.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addBusinessFilterClassifierBehavior(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToClassifierBehavior(ViewerFilter filter) {
    classifierBehavior.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#getIsActive()
	 * @generated
	 */
	public Boolean getIsActive() {
    return Boolean.valueOf(isActive.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#setIsActive(Boolean newValue)
	 * @generated
	 */
	public void setIsActive(Boolean newValue) {
    if (newValue != null) {
      isActive.setSelection(newValue.booleanValue());
    } else {
      isActive.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Properties.isActive);
    if (readOnly && isActive.isEnabled()) {
      isActive.setEnabled(false);
      isActive.setToolTipText(UmlMessages.Class__ReadOnly);
    } else if (!readOnly && !isActive.isEnabled()) {
      isActive.setEnabled(true);
    }	
    
  }






	/**
   * {@inheritDoc}
   * 
   * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#initOperations(EObject current, EReference containingFeature, EReference feature)
   */
  public void initOperations(ReferencesTableSettings settings) {
    if (current.eResource() != null && current.eResource().getResourceSet() != null)
      this.resourceSet = current.eResource().getResourceSet();
    ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
    operations.setContentProvider(contentProvider);
    operations.setInput(settings);
    boolean readOnly = isReadOnly(UmlViewsRepository.Class_.Operations.operations_);
    if (readOnly && operations.isEnabled()) {
      operations.setEnabled(false);
      operations.setToolTipText(UmlMessages.Class__ReadOnly);
    } else if (!readOnly && !operations.isEnabled()) {
      operations.setEnabled(true);
    }	
    
  }

  /**
   * {@inheritDoc}
   * 
   * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#updateOperations()
   * @generated
   */
  public void updateOperations() {
  operations.refresh();
}

  /**
   * {@inheritDoc}
   * 
   * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addFilterOperations(ViewerFilter filter)
   * @generated
   */
  public void addFilterToOperations(ViewerFilter filter) {
    operationsFilters.add(filter);
    if (this.operations != null) {
      this.operations.addFilter(filter);
    }
  }

  /**
   * {@inheritDoc}
   * 
   * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#addBusinessFilterOperations(ViewerFilter filter)
   * @generated
   */
  public void addBusinessFilterToOperations(ViewerFilter filter) {
    operationsBusinessFilters.add(filter);
  }

  /**
   * {@inheritDoc}
   * 
   * @see org.obeonetwork.dsl.uml2.properties.uml.parts.Class_PropertiesEditionPart#isContainedInOperationsTable(EObject element)
   * @generated
   */
  public boolean isContainedInOperationsTable(EObject element) {
    return ((ReferencesTableSettings)operations.getInput()).contains(element);
  }

  /**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return UmlMessages.Class__Part_Title;
  }



}
