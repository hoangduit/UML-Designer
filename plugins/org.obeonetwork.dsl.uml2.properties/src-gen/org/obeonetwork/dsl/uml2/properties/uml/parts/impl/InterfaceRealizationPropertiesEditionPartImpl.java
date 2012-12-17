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

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart;
import org.obeonetwork.dsl.uml2.properties.uml.parts.UmlViewsRepository;

import org.obeonetwork.dsl.uml2.properties.uml.providers.UmlMessages;


/**
 * @author <a href="mailto:cedric.brun@obeo.fr">Cédric Brun</a>
 * @generated
 */
public class InterfaceRealizationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InterfaceRealizationPropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer visibility;
	protected ReferencesTable clientDependency;
	protected List<ViewerFilter> clientDependencyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> clientDependencyFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer owningTemplateParameter;
	protected EObjectFlatComboViewer templateParameter;
	protected ReferencesTable supplier;
	protected List<ViewerFilter> supplierBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> supplierFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable client;
	protected List<ViewerFilter> clientBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> clientFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer contract;
	protected EObjectFlatComboViewer implementingClassifier;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public InterfaceRealizationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    CompositionSequence interfaceRealizationStep = new BindingCompositionSequence(propertiesEditionComponent);
    CompositionStep propertiesStep = interfaceRealizationStep.addStep(UmlViewsRepository.InterfaceRealization.Properties.class);
    propertiesStep.addStep(UmlViewsRepository.InterfaceRealization.Properties.name);
    propertiesStep.addStep(UmlViewsRepository.InterfaceRealization.Properties.visibility);
    propertiesStep.addStep(UmlViewsRepository.InterfaceRealization.Properties.clientDependency);
    propertiesStep.addStep(UmlViewsRepository.InterfaceRealization.Properties.owningTemplateParameter);
    propertiesStep.addStep(UmlViewsRepository.InterfaceRealization.Properties.templateParameter);
    propertiesStep.addStep(UmlViewsRepository.InterfaceRealization.Properties.supplier);
    propertiesStep.addStep(UmlViewsRepository.InterfaceRealization.Properties.client);
    propertiesStep.addStep(UmlViewsRepository.InterfaceRealization.Properties.contract);
    propertiesStep.addStep(UmlViewsRepository.InterfaceRealization.Properties.implementingClassifier);
    
    
    composer = new PartComposer(interfaceRealizationStep) {

      @Override
      public Composite addToPart(Composite parent, Object key) {
        if (key == UmlViewsRepository.InterfaceRealization.Properties.class) {
          return createPropertiesGroup(parent);
        }
        if (key == UmlViewsRepository.InterfaceRealization.Properties.name) {
          return createNameText(parent);
        }
        if (key == UmlViewsRepository.InterfaceRealization.Properties.visibility) {
          return createVisibilityEMFComboViewer(parent);
        }
        if (key == UmlViewsRepository.InterfaceRealization.Properties.clientDependency) {
          return createClientDependencyAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.InterfaceRealization.Properties.owningTemplateParameter) {
          return createOwningTemplateParameterFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.InterfaceRealization.Properties.templateParameter) {
          return createTemplateParameterFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.InterfaceRealization.Properties.supplier) {
          return createSupplierAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.InterfaceRealization.Properties.client) {
          return createClientAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.InterfaceRealization.Properties.contract) {
          return createContractFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.InterfaceRealization.Properties.implementingClassifier) {
          return createImplementingClassifierFlatComboViewer(parent);
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
    propertiesGroup.setText(UmlMessages.InterfaceRealizationPropertiesEditionPart_PropertiesGroupLabel);
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
    createDescription(parent, UmlViewsRepository.InterfaceRealization.Properties.name, UmlMessages.InterfaceRealizationPropertiesEditionPart_NameLabel);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
        }
      }

    });
    EditingUtils.setID(name, UmlViewsRepository.InterfaceRealization.Properties.name);
    EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.InterfaceRealization.Properties.name, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createVisibilityEMFComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.InterfaceRealization.Properties.visibility, UmlMessages.InterfaceRealizationPropertiesEditionPart_VisibilityLabel);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
      }

    });
    visibility.setID(UmlViewsRepository.InterfaceRealization.Properties.visibility);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.InterfaceRealization.Properties.visibility, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createClientDependencyAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.InterfaceRealization.Properties.clientDependency, UmlMessages.InterfaceRealizationPropertiesEditionPart_ClientDependencyLabel);		 
    this.clientDependency = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addClientDependency(); }
      public void handleEdit(EObject element) { editClientDependency(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveClientDependency(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromClientDependency(element); }
      public void navigateTo(EObject element) { }
    });
    this.clientDependency.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.InterfaceRealization.Properties.clientDependency, UmlViewsRepository.SWT_KIND));
    this.clientDependency.createControls(parent);
    this.clientDependency.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.clientDependency, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData clientDependencyData = new GridData(GridData.FILL_HORIZONTAL);
    clientDependencyData.horizontalSpan = 3;
    this.clientDependency.setLayoutData(clientDependencyData);
    this.clientDependency.disableMove();
    clientDependency.setID(UmlViewsRepository.InterfaceRealization.Properties.clientDependency);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.clientDependency,
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
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    clientDependency.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromClientDependency(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createOwningTemplateParameterFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.InterfaceRealization.Properties.owningTemplateParameter, UmlMessages.InterfaceRealizationPropertiesEditionPart_OwningTemplateParameterLabel);
    owningTemplateParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.InterfaceRealization.Properties.owningTemplateParameter, UmlViewsRepository.SWT_KIND));
    owningTemplateParameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    owningTemplateParameter.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.owningTemplateParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOwningTemplateParameter()));
      }

    });
    GridData owningTemplateParameterData = new GridData(GridData.FILL_HORIZONTAL);
    owningTemplateParameter.setLayoutData(owningTemplateParameterData);
    owningTemplateParameter.setID(UmlViewsRepository.InterfaceRealization.Properties.owningTemplateParameter);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.InterfaceRealization.Properties.owningTemplateParameter, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createTemplateParameterFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.InterfaceRealization.Properties.templateParameter, UmlMessages.InterfaceRealizationPropertiesEditionPart_TemplateParameterLabel);
    templateParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.InterfaceRealization.Properties.templateParameter, UmlViewsRepository.SWT_KIND));
    templateParameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    templateParameter.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.templateParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTemplateParameter()));
      }

    });
    GridData templateParameterData = new GridData(GridData.FILL_HORIZONTAL);
    templateParameter.setLayoutData(templateParameterData);
    templateParameter.setID(UmlViewsRepository.InterfaceRealization.Properties.templateParameter);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.InterfaceRealization.Properties.templateParameter, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createSupplierAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.InterfaceRealization.Properties.supplier, UmlMessages.InterfaceRealizationPropertiesEditionPart_SupplierLabel);		 
    this.supplier = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addSupplier(); }
      public void handleEdit(EObject element) { editSupplier(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveSupplier(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromSupplier(element); }
      public void navigateTo(EObject element) { }
    });
    this.supplier.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.InterfaceRealization.Properties.supplier, UmlViewsRepository.SWT_KIND));
    this.supplier.createControls(parent);
    this.supplier.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.supplier, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData supplierData = new GridData(GridData.FILL_HORIZONTAL);
    supplierData.horizontalSpan = 3;
    this.supplier.setLayoutData(supplierData);
    this.supplier.disableMove();
    supplier.setID(UmlViewsRepository.InterfaceRealization.Properties.supplier);
    supplier.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addSupplier() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(supplier.getInput(), supplierFilters, supplierBusinessFilters,
    "supplier", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.supplier,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        supplier.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveSupplier(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.supplier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    supplier.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromSupplier(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.supplier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    supplier.refresh();
  }

	/**
	 * @generated
	 */
	protected void editSupplier(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        supplier.refresh();
      }
    }
  }

	/**
	 * @generated
	 */
	protected Composite createClientAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.InterfaceRealization.Properties.client, UmlMessages.InterfaceRealizationPropertiesEditionPart_ClientLabel);		 
    this.client = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addClient(); }
      public void handleEdit(EObject element) { editClient(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveClient(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromClient(element); }
      public void navigateTo(EObject element) { }
    });
    this.client.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.InterfaceRealization.Properties.client, UmlViewsRepository.SWT_KIND));
    this.client.createControls(parent);
    this.client.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.client, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData clientData = new GridData(GridData.FILL_HORIZONTAL);
    clientData.horizontalSpan = 3;
    this.client.setLayoutData(clientData);
    this.client.disableMove();
    client.setID(UmlViewsRepository.InterfaceRealization.Properties.client);
    client.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addClient() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(client.getInput(), clientFilters, clientBusinessFilters,
    "client", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.client,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        client.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveClient(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.client, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    client.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromClient(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.client, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    client.refresh();
  }

	/**
	 * @generated
	 */
	protected void editClient(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        client.refresh();
      }
    }
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createContractFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.InterfaceRealization.Properties.contract, UmlMessages.InterfaceRealizationPropertiesEditionPart_ContractLabel);
    contract = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.InterfaceRealization.Properties.contract, UmlViewsRepository.SWT_KIND));
    contract.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    contract.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.contract, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getContract()));
      }

    });
    GridData contractData = new GridData(GridData.FILL_HORIZONTAL);
    contract.setLayoutData(contractData);
    contract.setID(UmlViewsRepository.InterfaceRealization.Properties.contract);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.InterfaceRealization.Properties.contract, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createImplementingClassifierFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.InterfaceRealization.Properties.implementingClassifier, UmlMessages.InterfaceRealizationPropertiesEditionPart_ImplementingClassifierLabel);
    implementingClassifier = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.InterfaceRealization.Properties.implementingClassifier, UmlViewsRepository.SWT_KIND));
    implementingClassifier.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    implementingClassifier.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterfaceRealizationPropertiesEditionPartImpl.this, UmlViewsRepository.InterfaceRealization.Properties.implementingClassifier, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getImplementingClassifier()));
      }

    });
    GridData implementingClassifierData = new GridData(GridData.FILL_HORIZONTAL);
    implementingClassifier.setLayoutData(implementingClassifierData);
    implementingClassifier.setID(UmlViewsRepository.InterfaceRealization.Properties.implementingClassifier);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.InterfaceRealization.Properties.implementingClassifier, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
    return name.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
    if (newValue != null) {
      name.setText(newValue);
    } else {
      name.setText(""); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.name);
    if (readOnly && name.isEnabled()) {
      name.setEnabled(false);
      name.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
    } else if (!readOnly && !name.isEnabled()) {
      name.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#getVisibility()
	 * @generated
	 */
	public Enumerator getVisibility() {
    Enumerator selection = (Enumerator) ((StructuredSelection) visibility.getSelection()).getFirstElement();
    return selection;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#initVisibility(Object input, Enumerator current)
	 */
	public void initVisibility(Object input, Enumerator current) {
		visibility.setInput(input);
		visibility.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.visibility);
		if (readOnly && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
		} else if (!readOnly && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#setVisibility(Enumerator newValue)
	 * @generated
	 */
	public void setVisibility(Enumerator newValue) {
    visibility.modelUpdating(new StructuredSelection(newValue));
    boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.visibility);
    if (readOnly && visibility.isEnabled()) {
      visibility.setEnabled(false);
      visibility.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
    } else if (!readOnly && !visibility.isEnabled()) {
      visibility.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#initClientDependency(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClientDependency(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		clientDependency.setContentProvider(contentProvider);
		clientDependency.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.clientDependency);
		if (readOnly && clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(false);
			clientDependency.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
		} else if (!readOnly && !clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#updateClientDependency()
	 * @generated
	 */
	public void updateClientDependency() {
  clientDependency.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToClientDependency(ViewerFilter filter) {
    clientDependencyFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addBusinessFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToClientDependency(ViewerFilter filter) {
    clientDependencyBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#isContainedInClientDependencyTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInClientDependencyTable(EObject element) {
    return ((ReferencesTableSettings)clientDependency.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#getOwningTemplateParameter()
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#initOwningTemplateParameter(EObjectFlatComboSettings)
	 */
	public void initOwningTemplateParameter(EObjectFlatComboSettings settings) {
		owningTemplateParameter.setInput(settings);
		if (current != null) {
			owningTemplateParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.owningTemplateParameter);
		if (readOnly && owningTemplateParameter.isEnabled()) {
			owningTemplateParameter.setEnabled(false);
			owningTemplateParameter.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
		} else if (!readOnly && !owningTemplateParameter.isEnabled()) {
			owningTemplateParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#setOwningTemplateParameter(EObject newValue)
	 * @generated
	 */
	public void setOwningTemplateParameter(EObject newValue) {
    if (newValue != null) {
      owningTemplateParameter.setSelection(new StructuredSelection(newValue));
    } else {
      owningTemplateParameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.owningTemplateParameter);
    if (readOnly && owningTemplateParameter.isEnabled()) {
      owningTemplateParameter.setEnabled(false);
      owningTemplateParameter.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
    } else if (!readOnly && !owningTemplateParameter.isEnabled()) {
      owningTemplateParameter.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#setOwningTemplateParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwningTemplateParameterButtonMode(ButtonsModeEnum newValue) {
		owningTemplateParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addFilterOwningTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToOwningTemplateParameter(ViewerFilter filter) {
    owningTemplateParameter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addBusinessFilterOwningTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToOwningTemplateParameter(ViewerFilter filter) {
    owningTemplateParameter.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#getTemplateParameter()
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#initTemplateParameter(EObjectFlatComboSettings)
	 */
	public void initTemplateParameter(EObjectFlatComboSettings settings) {
		templateParameter.setInput(settings);
		if (current != null) {
			templateParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.templateParameter);
		if (readOnly && templateParameter.isEnabled()) {
			templateParameter.setEnabled(false);
			templateParameter.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
		} else if (!readOnly && !templateParameter.isEnabled()) {
			templateParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#setTemplateParameter(EObject newValue)
	 * @generated
	 */
	public void setTemplateParameter(EObject newValue) {
    if (newValue != null) {
      templateParameter.setSelection(new StructuredSelection(newValue));
    } else {
      templateParameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.templateParameter);
    if (readOnly && templateParameter.isEnabled()) {
      templateParameter.setEnabled(false);
      templateParameter.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
    } else if (!readOnly && !templateParameter.isEnabled()) {
      templateParameter.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#setTemplateParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTemplateParameterButtonMode(ButtonsModeEnum newValue) {
		templateParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addFilterTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTemplateParameter(ViewerFilter filter) {
    templateParameter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addBusinessFilterTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTemplateParameter(ViewerFilter filter) {
    templateParameter.addBusinessRuleFilter(filter);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#initSupplier(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSupplier(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		supplier.setContentProvider(contentProvider);
		supplier.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.supplier);
		if (readOnly && supplier.getTable().isEnabled()) {
			supplier.setEnabled(false);
			supplier.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
		} else if (!readOnly && !supplier.getTable().isEnabled()) {
			supplier.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#updateSupplier()
	 * @generated
	 */
	public void updateSupplier() {
  supplier.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addFilterSupplier(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToSupplier(ViewerFilter filter) {
    supplierFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addBusinessFilterSupplier(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToSupplier(ViewerFilter filter) {
    supplierBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#isContainedInSupplierTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInSupplierTable(EObject element) {
    return ((ReferencesTableSettings)supplier.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#initClient(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClient(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		client.setContentProvider(contentProvider);
		client.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.client);
		if (readOnly && client.getTable().isEnabled()) {
			client.setEnabled(false);
			client.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
		} else if (!readOnly && !client.getTable().isEnabled()) {
			client.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#updateClient()
	 * @generated
	 */
	public void updateClient() {
  client.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addFilterClient(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToClient(ViewerFilter filter) {
    clientFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addBusinessFilterClient(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToClient(ViewerFilter filter) {
    clientBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#isContainedInClientTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInClientTable(EObject element) {
    return ((ReferencesTableSettings)client.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#getContract()
	 * @generated
	 */
	public EObject getContract() {
    if (contract.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) contract.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#initContract(EObjectFlatComboSettings)
	 */
	public void initContract(EObjectFlatComboSettings settings) {
		contract.setInput(settings);
		if (current != null) {
			contract.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.contract);
		if (readOnly && contract.isEnabled()) {
			contract.setEnabled(false);
			contract.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
		} else if (!readOnly && !contract.isEnabled()) {
			contract.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#setContract(EObject newValue)
	 * @generated
	 */
	public void setContract(EObject newValue) {
    if (newValue != null) {
      contract.setSelection(new StructuredSelection(newValue));
    } else {
      contract.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.contract);
    if (readOnly && contract.isEnabled()) {
      contract.setEnabled(false);
      contract.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
    } else if (!readOnly && !contract.isEnabled()) {
      contract.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#setContractButtonMode(ButtonsModeEnum newValue)
	 */
	public void setContractButtonMode(ButtonsModeEnum newValue) {
		contract.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addFilterContract(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToContract(ViewerFilter filter) {
    contract.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addBusinessFilterContract(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToContract(ViewerFilter filter) {
    contract.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#getImplementingClassifier()
	 * @generated
	 */
	public EObject getImplementingClassifier() {
    if (implementingClassifier.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) implementingClassifier.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#initImplementingClassifier(EObjectFlatComboSettings)
	 */
	public void initImplementingClassifier(EObjectFlatComboSettings settings) {
		implementingClassifier.setInput(settings);
		if (current != null) {
			implementingClassifier.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.implementingClassifier);
		if (readOnly && implementingClassifier.isEnabled()) {
			implementingClassifier.setEnabled(false);
			implementingClassifier.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
		} else if (!readOnly && !implementingClassifier.isEnabled()) {
			implementingClassifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#setImplementingClassifier(EObject newValue)
	 * @generated
	 */
	public void setImplementingClassifier(EObject newValue) {
    if (newValue != null) {
      implementingClassifier.setSelection(new StructuredSelection(newValue));
    } else {
      implementingClassifier.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.InterfaceRealization.Properties.implementingClassifier);
    if (readOnly && implementingClassifier.isEnabled()) {
      implementingClassifier.setEnabled(false);
      implementingClassifier.setToolTipText(UmlMessages.InterfaceRealization_ReadOnly);
    } else if (!readOnly && !implementingClassifier.isEnabled()) {
      implementingClassifier.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#setImplementingClassifierButtonMode(ButtonsModeEnum newValue)
	 */
	public void setImplementingClassifierButtonMode(ButtonsModeEnum newValue) {
		implementingClassifier.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addFilterImplementingClassifier(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToImplementingClassifier(ViewerFilter filter) {
    implementingClassifier.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.InterfaceRealizationPropertiesEditionPart#addBusinessFilterImplementingClassifier(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToImplementingClassifier(ViewerFilter filter) {
    implementingClassifier.addBusinessRuleFilter(filter);
  }






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return UmlMessages.InterfaceRealization_Part_Title;
  }



}
