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

import org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart;
import org.obeonetwork.dsl.uml2.properties.uml.parts.UmlViewsRepository;

import org.obeonetwork.dsl.uml2.properties.uml.providers.UmlMessages;


/**
 * @author <a href="mailto:cedric.brun@obeo.fr">Cédric Brun</a>
 * @generated
 */
public class ActivityParameterNodePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ActivityParameterNodePropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer visibility;
	protected ReferencesTable clientDependency;
	protected List<ViewerFilter> clientDependencyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> clientDependencyFilters = new ArrayList<ViewerFilter>();
	protected Button isLeaf;
	protected EObjectFlatComboViewer inStructuredNode;
	protected EObjectFlatComboViewer activity;
	protected ReferencesTable outgoing;
	protected List<ViewerFilter> outgoingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outgoingFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable incoming;
	protected List<ViewerFilter> incomingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> incomingFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable inPartition;
	protected List<ViewerFilter> inPartitionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inPartitionFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable inInterruptibleRegion;
	protected List<ViewerFilter> inInterruptibleRegionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inInterruptibleRegionFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable redefinedNode;
	protected List<ViewerFilter> redefinedNodeBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> redefinedNodeFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer type;
	protected EMFComboViewer ordering;
	protected Button isControlType;
	protected ReferencesTable inState;
	protected List<ViewerFilter> inStateBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inStateFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer selection;
	protected EObjectFlatComboViewer parameter;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public ActivityParameterNodePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    CompositionSequence activityParameterNodeStep = new BindingCompositionSequence(propertiesEditionComponent);
    CompositionStep propertiesStep = activityParameterNodeStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.class);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.name);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.visibility);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.clientDependency);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.isLeaf);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.inStructuredNode);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.activity);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.outgoing);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.incoming);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.inPartition);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.inInterruptibleRegion);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.redefinedNode);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.type);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.ordering);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.isControlType);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.inState);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.selection);
    propertiesStep.addStep(UmlViewsRepository.ActivityParameterNode.Properties.parameter);
    
    
    composer = new PartComposer(activityParameterNodeStep) {

      @Override
      public Composite addToPart(Composite parent, Object key) {
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.class) {
          return createPropertiesGroup(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.name) {
          return createNameText(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.visibility) {
          return createVisibilityEMFComboViewer(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.clientDependency) {
          return createClientDependencyAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.isLeaf) {
          return createIsLeafCheckbox(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.inStructuredNode) {
          return createInStructuredNodeFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.activity) {
          return createActivityFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.outgoing) {
          return createOutgoingAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.incoming) {
          return createIncomingAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.inPartition) {
          return createInPartitionAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.inInterruptibleRegion) {
          return createInInterruptibleRegionAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.redefinedNode) {
          return createRedefinedNodeAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.type) {
          return createTypeFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.ordering) {
          return createOrderingEMFComboViewer(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.isControlType) {
          return createIsControlTypeCheckbox(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.inState) {
          return createInStateAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.selection) {
          return createSelectionFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.ActivityParameterNode.Properties.parameter) {
          return createParameterFlatComboViewer(parent);
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
    propertiesGroup.setText(UmlMessages.ActivityParameterNodePropertiesEditionPart_PropertiesGroupLabel);
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
    createDescription(parent, UmlViewsRepository.ActivityParameterNode.Properties.name, UmlMessages.ActivityParameterNodePropertiesEditionPart_NameLabel);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
        }
      }

    });
    EditingUtils.setID(name, UmlViewsRepository.ActivityParameterNode.Properties.name);
    EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.name, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createVisibilityEMFComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.ActivityParameterNode.Properties.visibility, UmlMessages.ActivityParameterNodePropertiesEditionPart_VisibilityLabel);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
      }

    });
    visibility.setID(UmlViewsRepository.ActivityParameterNode.Properties.visibility);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.visibility, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createClientDependencyAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.ActivityParameterNode.Properties.clientDependency, UmlMessages.ActivityParameterNodePropertiesEditionPart_ClientDependencyLabel);		 
    this.clientDependency = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addClientDependency(); }
      public void handleEdit(EObject element) { editClientDependency(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveClientDependency(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromClientDependency(element); }
      public void navigateTo(EObject element) { }
    });
    this.clientDependency.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.clientDependency, UmlViewsRepository.SWT_KIND));
    this.clientDependency.createControls(parent);
    this.clientDependency.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.clientDependency, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData clientDependencyData = new GridData(GridData.FILL_HORIZONTAL);
    clientDependencyData.horizontalSpan = 3;
    this.clientDependency.setLayoutData(clientDependencyData);
    this.clientDependency.disableMove();
    clientDependency.setID(UmlViewsRepository.ActivityParameterNode.Properties.clientDependency);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.clientDependency,
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
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    clientDependency.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromClientDependency(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
    isLeaf.setText(getDescription(UmlViewsRepository.ActivityParameterNode.Properties.isLeaf, UmlMessages.ActivityParameterNodePropertiesEditionPart_IsLeafLabel));
    isLeaf.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.isLeaf, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isLeaf.getSelection())));
      }

    });
    GridData isLeafData = new GridData(GridData.FILL_HORIZONTAL);
    isLeafData.horizontalSpan = 2;
    isLeaf.setLayoutData(isLeafData);
    EditingUtils.setID(isLeaf, UmlViewsRepository.ActivityParameterNode.Properties.isLeaf);
    EditingUtils.setEEFtype(isLeaf, "eef::Checkbox"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.isLeaf, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createInStructuredNodeFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.ActivityParameterNode.Properties.inStructuredNode, UmlMessages.ActivityParameterNodePropertiesEditionPart_InStructuredNodeLabel);
    inStructuredNode = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ActivityParameterNode.Properties.inStructuredNode, UmlViewsRepository.SWT_KIND));
    inStructuredNode.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    inStructuredNode.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inStructuredNode, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getInStructuredNode()));
      }

    });
    GridData inStructuredNodeData = new GridData(GridData.FILL_HORIZONTAL);
    inStructuredNode.setLayoutData(inStructuredNodeData);
    inStructuredNode.setID(UmlViewsRepository.ActivityParameterNode.Properties.inStructuredNode);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.inStructuredNode, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createActivityFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.ActivityParameterNode.Properties.activity, UmlMessages.ActivityParameterNodePropertiesEditionPart_ActivityLabel);
    activity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ActivityParameterNode.Properties.activity, UmlViewsRepository.SWT_KIND));
    activity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    activity.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.activity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getActivity()));
      }

    });
    GridData activityData = new GridData(GridData.FILL_HORIZONTAL);
    activity.setLayoutData(activityData);
    activity.setID(UmlViewsRepository.ActivityParameterNode.Properties.activity);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.activity, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createOutgoingAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.ActivityParameterNode.Properties.outgoing, UmlMessages.ActivityParameterNodePropertiesEditionPart_OutgoingLabel);		 
    this.outgoing = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addOutgoing(); }
      public void handleEdit(EObject element) { editOutgoing(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoing(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromOutgoing(element); }
      public void navigateTo(EObject element) { }
    });
    this.outgoing.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.outgoing, UmlViewsRepository.SWT_KIND));
    this.outgoing.createControls(parent);
    this.outgoing.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.outgoing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData outgoingData = new GridData(GridData.FILL_HORIZONTAL);
    outgoingData.horizontalSpan = 3;
    this.outgoing.setLayoutData(outgoingData);
    this.outgoing.disableMove();
    outgoing.setID(UmlViewsRepository.ActivityParameterNode.Properties.outgoing);
    outgoing.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addOutgoing() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoing.getInput(), outgoingFilters, outgoingBusinessFilters,
    "outgoing", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.outgoing,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        outgoing.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveOutgoing(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    outgoing.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromOutgoing(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    outgoing.refresh();
  }

	/**
	 * @generated
	 */
	protected void editOutgoing(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        outgoing.refresh();
      }
    }
  }

	/**
	 * @generated
	 */
	protected Composite createIncomingAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.ActivityParameterNode.Properties.incoming, UmlMessages.ActivityParameterNodePropertiesEditionPart_IncomingLabel);		 
    this.incoming = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addIncoming(); }
      public void handleEdit(EObject element) { editIncoming(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncoming(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromIncoming(element); }
      public void navigateTo(EObject element) { }
    });
    this.incoming.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.incoming, UmlViewsRepository.SWT_KIND));
    this.incoming.createControls(parent);
    this.incoming.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.incoming, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData incomingData = new GridData(GridData.FILL_HORIZONTAL);
    incomingData.horizontalSpan = 3;
    this.incoming.setLayoutData(incomingData);
    this.incoming.disableMove();
    incoming.setID(UmlViewsRepository.ActivityParameterNode.Properties.incoming);
    incoming.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addIncoming() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incoming.getInput(), incomingFilters, incomingBusinessFilters,
    "incoming", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.incoming,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        incoming.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveIncoming(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    incoming.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromIncoming(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    incoming.refresh();
  }

	/**
	 * @generated
	 */
	protected void editIncoming(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        incoming.refresh();
      }
    }
  }

	/**
	 * @generated
	 */
	protected Composite createInPartitionAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.ActivityParameterNode.Properties.inPartition, UmlMessages.ActivityParameterNodePropertiesEditionPart_InPartitionLabel);		 
    this.inPartition = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addInPartition(); }
      public void handleEdit(EObject element) { editInPartition(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveInPartition(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromInPartition(element); }
      public void navigateTo(EObject element) { }
    });
    this.inPartition.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.inPartition, UmlViewsRepository.SWT_KIND));
    this.inPartition.createControls(parent);
    this.inPartition.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inPartition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData inPartitionData = new GridData(GridData.FILL_HORIZONTAL);
    inPartitionData.horizontalSpan = 3;
    this.inPartition.setLayoutData(inPartitionData);
    this.inPartition.disableMove();
    inPartition.setID(UmlViewsRepository.ActivityParameterNode.Properties.inPartition);
    inPartition.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addInPartition() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(inPartition.getInput(), inPartitionFilters, inPartitionBusinessFilters,
    "inPartition", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inPartition,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        inPartition.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveInPartition(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inPartition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    inPartition.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromInPartition(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inPartition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    inPartition.refresh();
  }

	/**
	 * @generated
	 */
	protected void editInPartition(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        inPartition.refresh();
      }
    }
  }

	/**
	 * @generated
	 */
	protected Composite createInInterruptibleRegionAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.ActivityParameterNode.Properties.inInterruptibleRegion, UmlMessages.ActivityParameterNodePropertiesEditionPart_InInterruptibleRegionLabel);		 
    this.inInterruptibleRegion = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addInInterruptibleRegion(); }
      public void handleEdit(EObject element) { editInInterruptibleRegion(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveInInterruptibleRegion(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromInInterruptibleRegion(element); }
      public void navigateTo(EObject element) { }
    });
    this.inInterruptibleRegion.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.inInterruptibleRegion, UmlViewsRepository.SWT_KIND));
    this.inInterruptibleRegion.createControls(parent);
    this.inInterruptibleRegion.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inInterruptibleRegion, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData inInterruptibleRegionData = new GridData(GridData.FILL_HORIZONTAL);
    inInterruptibleRegionData.horizontalSpan = 3;
    this.inInterruptibleRegion.setLayoutData(inInterruptibleRegionData);
    this.inInterruptibleRegion.disableMove();
    inInterruptibleRegion.setID(UmlViewsRepository.ActivityParameterNode.Properties.inInterruptibleRegion);
    inInterruptibleRegion.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addInInterruptibleRegion() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(inInterruptibleRegion.getInput(), inInterruptibleRegionFilters, inInterruptibleRegionBusinessFilters,
    "inInterruptibleRegion", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inInterruptibleRegion,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        inInterruptibleRegion.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveInInterruptibleRegion(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inInterruptibleRegion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    inInterruptibleRegion.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromInInterruptibleRegion(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inInterruptibleRegion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    inInterruptibleRegion.refresh();
  }

	/**
	 * @generated
	 */
	protected void editInInterruptibleRegion(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        inInterruptibleRegion.refresh();
      }
    }
  }

	/**
	 * @generated
	 */
	protected Composite createRedefinedNodeAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.ActivityParameterNode.Properties.redefinedNode, UmlMessages.ActivityParameterNodePropertiesEditionPart_RedefinedNodeLabel);		 
    this.redefinedNode = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addRedefinedNode(); }
      public void handleEdit(EObject element) { editRedefinedNode(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveRedefinedNode(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromRedefinedNode(element); }
      public void navigateTo(EObject element) { }
    });
    this.redefinedNode.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.redefinedNode, UmlViewsRepository.SWT_KIND));
    this.redefinedNode.createControls(parent);
    this.redefinedNode.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.redefinedNode, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData redefinedNodeData = new GridData(GridData.FILL_HORIZONTAL);
    redefinedNodeData.horizontalSpan = 3;
    this.redefinedNode.setLayoutData(redefinedNodeData);
    this.redefinedNode.disableMove();
    redefinedNode.setID(UmlViewsRepository.ActivityParameterNode.Properties.redefinedNode);
    redefinedNode.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addRedefinedNode() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(redefinedNode.getInput(), redefinedNodeFilters, redefinedNodeBusinessFilters,
    "redefinedNode", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.redefinedNode,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        redefinedNode.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveRedefinedNode(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.redefinedNode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    redefinedNode.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromRedefinedNode(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.redefinedNode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    redefinedNode.refresh();
  }

	/**
	 * @generated
	 */
	protected void editRedefinedNode(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        redefinedNode.refresh();
      }
    }
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createTypeFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.ActivityParameterNode.Properties.type, UmlMessages.ActivityParameterNodePropertiesEditionPart_TypeLabel);
    type = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ActivityParameterNode.Properties.type, UmlViewsRepository.SWT_KIND));
    type.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    type.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.type, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getType()));
      }

    });
    GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
    type.setLayoutData(typeData);
    type.setID(UmlViewsRepository.ActivityParameterNode.Properties.type);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.type, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createOrderingEMFComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.ActivityParameterNode.Properties.ordering, UmlMessages.ActivityParameterNodePropertiesEditionPart_OrderingLabel);
    ordering = new EMFComboViewer(parent);
    ordering.setContentProvider(new ArrayContentProvider());
    ordering.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
    GridData orderingData = new GridData(GridData.FILL_HORIZONTAL);
    ordering.getCombo().setLayoutData(orderingData);
    ordering.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       * 	@generated
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.ordering, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOrdering()));
      }

    });
    ordering.setID(UmlViewsRepository.ActivityParameterNode.Properties.ordering);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.ordering, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsControlTypeCheckbox(Composite parent) {
    isControlType = new Button(parent, SWT.CHECK);
    isControlType.setText(getDescription(UmlViewsRepository.ActivityParameterNode.Properties.isControlType, UmlMessages.ActivityParameterNodePropertiesEditionPart_IsControlTypeLabel));
    isControlType.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.isControlType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isControlType.getSelection())));
      }

    });
    GridData isControlTypeData = new GridData(GridData.FILL_HORIZONTAL);
    isControlTypeData.horizontalSpan = 2;
    isControlType.setLayoutData(isControlTypeData);
    EditingUtils.setID(isControlType, UmlViewsRepository.ActivityParameterNode.Properties.isControlType);
    EditingUtils.setEEFtype(isControlType, "eef::Checkbox"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.isControlType, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createInStateAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.ActivityParameterNode.Properties.inState, UmlMessages.ActivityParameterNodePropertiesEditionPart_InStateLabel);		 
    this.inState = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addInState(); }
      public void handleEdit(EObject element) { editInState(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveInState(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromInState(element); }
      public void navigateTo(EObject element) { }
    });
    this.inState.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.inState, UmlViewsRepository.SWT_KIND));
    this.inState.createControls(parent);
    this.inState.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inState, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData inStateData = new GridData(GridData.FILL_HORIZONTAL);
    inStateData.horizontalSpan = 3;
    this.inState.setLayoutData(inStateData);
    this.inState.disableMove();
    inState.setID(UmlViewsRepository.ActivityParameterNode.Properties.inState);
    inState.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addInState() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(inState.getInput(), inStateFilters, inStateBusinessFilters,
    "inState", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inState,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        inState.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveInState(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inState, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    inState.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromInState(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.inState, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    inState.refresh();
  }

	/**
	 * @generated
	 */
	protected void editInState(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        inState.refresh();
      }
    }
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createSelectionFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.ActivityParameterNode.Properties.selection, UmlMessages.ActivityParameterNodePropertiesEditionPart_SelectionLabel);
    selection = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ActivityParameterNode.Properties.selection, UmlViewsRepository.SWT_KIND));
    selection.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    selection.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.selection, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSelection()));
      }

    });
    GridData selectionData = new GridData(GridData.FILL_HORIZONTAL);
    selection.setLayoutData(selectionData);
    selection.setID(UmlViewsRepository.ActivityParameterNode.Properties.selection);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.selection, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createParameterFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.ActivityParameterNode.Properties.parameter, UmlMessages.ActivityParameterNodePropertiesEditionPart_ParameterLabel);
    parameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.ActivityParameterNode.Properties.parameter, UmlViewsRepository.SWT_KIND));
    parameter.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    parameter.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityParameterNodePropertiesEditionPartImpl.this, UmlViewsRepository.ActivityParameterNode.Properties.parameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParameter()));
      }

    });
    GridData parameterData = new GridData(GridData.FILL_HORIZONTAL);
    parameter.setLayoutData(parameterData);
    parameter.setID(UmlViewsRepository.ActivityParameterNode.Properties.parameter);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.ActivityParameterNode.Properties.parameter, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
    return name.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
    if (newValue != null) {
      name.setText(newValue);
    } else {
      name.setText(""); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.name);
    if (readOnly && name.isEnabled()) {
      name.setEnabled(false);
      name.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
    } else if (!readOnly && !name.isEnabled()) {
      name.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#getVisibility()
	 * @generated
	 */
	public Enumerator getVisibility() {
    Enumerator selection = (Enumerator) ((StructuredSelection) visibility.getSelection()).getFirstElement();
    return selection;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initVisibility(Object input, Enumerator current)
	 */
	public void initVisibility(Object input, Enumerator current) {
		visibility.setInput(input);
		visibility.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.visibility);
		if (readOnly && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setVisibility(Enumerator newValue)
	 * @generated
	 */
	public void setVisibility(Enumerator newValue) {
    visibility.modelUpdating(new StructuredSelection(newValue));
    boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.visibility);
    if (readOnly && visibility.isEnabled()) {
      visibility.setEnabled(false);
      visibility.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
    } else if (!readOnly && !visibility.isEnabled()) {
      visibility.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initClientDependency(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClientDependency(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		clientDependency.setContentProvider(contentProvider);
		clientDependency.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.clientDependency);
		if (readOnly && clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(false);
			clientDependency.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#updateClientDependency()
	 * @generated
	 */
	public void updateClientDependency() {
  clientDependency.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToClientDependency(ViewerFilter filter) {
    clientDependencyFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToClientDependency(ViewerFilter filter) {
    clientDependencyBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#isContainedInClientDependencyTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInClientDependencyTable(EObject element) {
    return ((ReferencesTableSettings)clientDependency.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#getIsLeaf()
	 * @generated
	 */
	public Boolean getIsLeaf() {
    return Boolean.valueOf(isLeaf.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setIsLeaf(Boolean newValue)
	 * @generated
	 */
	public void setIsLeaf(Boolean newValue) {
    if (newValue != null) {
      isLeaf.setSelection(newValue.booleanValue());
    } else {
      isLeaf.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.isLeaf);
    if (readOnly && isLeaf.isEnabled()) {
      isLeaf.setEnabled(false);
      isLeaf.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
    } else if (!readOnly && !isLeaf.isEnabled()) {
      isLeaf.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#getInStructuredNode()
	 * @generated
	 */
	public EObject getInStructuredNode() {
    if (inStructuredNode.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) inStructuredNode.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initInStructuredNode(EObjectFlatComboSettings)
	 */
	public void initInStructuredNode(EObjectFlatComboSettings settings) {
		inStructuredNode.setInput(settings);
		if (current != null) {
			inStructuredNode.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.inStructuredNode);
		if (readOnly && inStructuredNode.isEnabled()) {
			inStructuredNode.setEnabled(false);
			inStructuredNode.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !inStructuredNode.isEnabled()) {
			inStructuredNode.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setInStructuredNode(EObject newValue)
	 * @generated
	 */
	public void setInStructuredNode(EObject newValue) {
    if (newValue != null) {
      inStructuredNode.setSelection(new StructuredSelection(newValue));
    } else {
      inStructuredNode.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.inStructuredNode);
    if (readOnly && inStructuredNode.isEnabled()) {
      inStructuredNode.setEnabled(false);
      inStructuredNode.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
    } else if (!readOnly && !inStructuredNode.isEnabled()) {
      inStructuredNode.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setInStructuredNodeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInStructuredNodeButtonMode(ButtonsModeEnum newValue) {
		inStructuredNode.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterInStructuredNode(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToInStructuredNode(ViewerFilter filter) {
    inStructuredNode.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterInStructuredNode(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToInStructuredNode(ViewerFilter filter) {
    inStructuredNode.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#getActivity()
	 * @generated
	 */
	public EObject getActivity() {
    if (activity.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) activity.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initActivity(EObjectFlatComboSettings)
	 */
	public void initActivity(EObjectFlatComboSettings settings) {
		activity.setInput(settings);
		if (current != null) {
			activity.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.activity);
		if (readOnly && activity.isEnabled()) {
			activity.setEnabled(false);
			activity.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !activity.isEnabled()) {
			activity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setActivity(EObject newValue)
	 * @generated
	 */
	public void setActivity(EObject newValue) {
    if (newValue != null) {
      activity.setSelection(new StructuredSelection(newValue));
    } else {
      activity.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.activity);
    if (readOnly && activity.isEnabled()) {
      activity.setEnabled(false);
      activity.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
    } else if (!readOnly && !activity.isEnabled()) {
      activity.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setActivityButtonMode(ButtonsModeEnum newValue) {
		activity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterActivity(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToActivity(ViewerFilter filter) {
    activity.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterActivity(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToActivity(ViewerFilter filter) {
    activity.addBusinessRuleFilter(filter);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initOutgoing(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoing(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoing.setContentProvider(contentProvider);
		outgoing.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.outgoing);
		if (readOnly && outgoing.getTable().isEnabled()) {
			outgoing.setEnabled(false);
			outgoing.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !outgoing.getTable().isEnabled()) {
			outgoing.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#updateOutgoing()
	 * @generated
	 */
	public void updateOutgoing() {
  outgoing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterOutgoing(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToOutgoing(ViewerFilter filter) {
    outgoingFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterOutgoing(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToOutgoing(ViewerFilter filter) {
    outgoingBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#isContainedInOutgoingTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInOutgoingTable(EObject element) {
    return ((ReferencesTableSettings)outgoing.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initIncoming(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncoming(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incoming.setContentProvider(contentProvider);
		incoming.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.incoming);
		if (readOnly && incoming.getTable().isEnabled()) {
			incoming.setEnabled(false);
			incoming.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !incoming.getTable().isEnabled()) {
			incoming.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#updateIncoming()
	 * @generated
	 */
	public void updateIncoming() {
  incoming.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterIncoming(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToIncoming(ViewerFilter filter) {
    incomingFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterIncoming(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToIncoming(ViewerFilter filter) {
    incomingBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#isContainedInIncomingTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInIncomingTable(EObject element) {
    return ((ReferencesTableSettings)incoming.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initInPartition(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInPartition(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inPartition.setContentProvider(contentProvider);
		inPartition.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.inPartition);
		if (readOnly && inPartition.getTable().isEnabled()) {
			inPartition.setEnabled(false);
			inPartition.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !inPartition.getTable().isEnabled()) {
			inPartition.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#updateInPartition()
	 * @generated
	 */
	public void updateInPartition() {
  inPartition.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterInPartition(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToInPartition(ViewerFilter filter) {
    inPartitionFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterInPartition(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToInPartition(ViewerFilter filter) {
    inPartitionBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#isContainedInInPartitionTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInInPartitionTable(EObject element) {
    return ((ReferencesTableSettings)inPartition.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initInInterruptibleRegion(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInInterruptibleRegion(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inInterruptibleRegion.setContentProvider(contentProvider);
		inInterruptibleRegion.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.inInterruptibleRegion);
		if (readOnly && inInterruptibleRegion.getTable().isEnabled()) {
			inInterruptibleRegion.setEnabled(false);
			inInterruptibleRegion.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !inInterruptibleRegion.getTable().isEnabled()) {
			inInterruptibleRegion.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#updateInInterruptibleRegion()
	 * @generated
	 */
	public void updateInInterruptibleRegion() {
  inInterruptibleRegion.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterInInterruptibleRegion(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToInInterruptibleRegion(ViewerFilter filter) {
    inInterruptibleRegionFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterInInterruptibleRegion(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToInInterruptibleRegion(ViewerFilter filter) {
    inInterruptibleRegionBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#isContainedInInInterruptibleRegionTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInInInterruptibleRegionTable(EObject element) {
    return ((ReferencesTableSettings)inInterruptibleRegion.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initRedefinedNode(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRedefinedNode(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		redefinedNode.setContentProvider(contentProvider);
		redefinedNode.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.redefinedNode);
		if (readOnly && redefinedNode.getTable().isEnabled()) {
			redefinedNode.setEnabled(false);
			redefinedNode.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !redefinedNode.getTable().isEnabled()) {
			redefinedNode.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#updateRedefinedNode()
	 * @generated
	 */
	public void updateRedefinedNode() {
  redefinedNode.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterRedefinedNode(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToRedefinedNode(ViewerFilter filter) {
    redefinedNodeFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterRedefinedNode(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToRedefinedNode(ViewerFilter filter) {
    redefinedNodeBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#isContainedInRedefinedNodeTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInRedefinedNodeTable(EObject element) {
    return ((ReferencesTableSettings)redefinedNode.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#getType()
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initType(EObjectFlatComboSettings)
	 */
	public void initType(EObjectFlatComboSettings settings) {
		type.setInput(settings);
		if (current != null) {
			type.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.type);
		if (readOnly && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setType(EObject newValue)
	 * @generated
	 */
	public void setType(EObject newValue) {
    if (newValue != null) {
      type.setSelection(new StructuredSelection(newValue));
    } else {
      type.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.type);
    if (readOnly && type.isEnabled()) {
      type.setEnabled(false);
      type.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
    } else if (!readOnly && !type.isEnabled()) {
      type.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue) {
		type.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToType(ViewerFilter filter) {
    type.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToType(ViewerFilter filter) {
    type.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#getOrdering()
	 * @generated
	 */
	public Enumerator getOrdering() {
    Enumerator selection = (Enumerator) ((StructuredSelection) ordering.getSelection()).getFirstElement();
    return selection;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initOrdering(Object input, Enumerator current)
	 */
	public void initOrdering(Object input, Enumerator current) {
		ordering.setInput(input);
		ordering.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.ordering);
		if (readOnly && ordering.isEnabled()) {
			ordering.setEnabled(false);
			ordering.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !ordering.isEnabled()) {
			ordering.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setOrdering(Enumerator newValue)
	 * @generated
	 */
	public void setOrdering(Enumerator newValue) {
    ordering.modelUpdating(new StructuredSelection(newValue));
    boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.ordering);
    if (readOnly && ordering.isEnabled()) {
      ordering.setEnabled(false);
      ordering.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
    } else if (!readOnly && !ordering.isEnabled()) {
      ordering.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#getIsControlType()
	 * @generated
	 */
	public Boolean getIsControlType() {
    return Boolean.valueOf(isControlType.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setIsControlType(Boolean newValue)
	 * @generated
	 */
	public void setIsControlType(Boolean newValue) {
    if (newValue != null) {
      isControlType.setSelection(newValue.booleanValue());
    } else {
      isControlType.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.isControlType);
    if (readOnly && isControlType.isEnabled()) {
      isControlType.setEnabled(false);
      isControlType.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
    } else if (!readOnly && !isControlType.isEnabled()) {
      isControlType.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initInState(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInState(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inState.setContentProvider(contentProvider);
		inState.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.inState);
		if (readOnly && inState.getTable().isEnabled()) {
			inState.setEnabled(false);
			inState.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !inState.getTable().isEnabled()) {
			inState.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#updateInState()
	 * @generated
	 */
	public void updateInState() {
  inState.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterInState(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToInState(ViewerFilter filter) {
    inStateFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterInState(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToInState(ViewerFilter filter) {
    inStateBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#isContainedInInStateTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInInStateTable(EObject element) {
    return ((ReferencesTableSettings)inState.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#getSelection()
	 * @generated
	 */
	public EObject getSelection() {
    if (selection.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) selection.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initSelection(EObjectFlatComboSettings)
	 */
	public void initSelection(EObjectFlatComboSettings settings) {
		selection.setInput(settings);
		if (current != null) {
			selection.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.selection);
		if (readOnly && selection.isEnabled()) {
			selection.setEnabled(false);
			selection.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !selection.isEnabled()) {
			selection.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setSelection(EObject newValue)
	 * @generated
	 */
	public void setSelection(EObject newValue) {
    if (newValue != null) {
      selection.setSelection(new StructuredSelection(newValue));
    } else {
      selection.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.selection);
    if (readOnly && selection.isEnabled()) {
      selection.setEnabled(false);
      selection.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
    } else if (!readOnly && !selection.isEnabled()) {
      selection.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setSelectionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSelectionButtonMode(ButtonsModeEnum newValue) {
		selection.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterSelection(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToSelection(ViewerFilter filter) {
    selection.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterSelection(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToSelection(ViewerFilter filter) {
    selection.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#getParameter()
	 * @generated
	 */
	public EObject getParameter() {
    if (parameter.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) parameter.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#initParameter(EObjectFlatComboSettings)
	 */
	public void initParameter(EObjectFlatComboSettings settings) {
		parameter.setInput(settings);
		if (current != null) {
			parameter.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.parameter);
		if (readOnly && parameter.isEnabled()) {
			parameter.setEnabled(false);
			parameter.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
		} else if (!readOnly && !parameter.isEnabled()) {
			parameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setParameter(EObject newValue)
	 * @generated
	 */
	public void setParameter(EObject newValue) {
    if (newValue != null) {
      parameter.setSelection(new StructuredSelection(newValue));
    } else {
      parameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.ActivityParameterNode.Properties.parameter);
    if (readOnly && parameter.isEnabled()) {
      parameter.setEnabled(false);
      parameter.setToolTipText(UmlMessages.ActivityParameterNode_ReadOnly);
    } else if (!readOnly && !parameter.isEnabled()) {
      parameter.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#setParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParameterButtonMode(ButtonsModeEnum newValue) {
		parameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addFilterParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParameter(ViewerFilter filter) {
    parameter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.ActivityParameterNodePropertiesEditionPart#addBusinessFilterParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParameter(ViewerFilter filter) {
    parameter.addBusinessRuleFilter(filter);
  }






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return UmlMessages.ActivityParameterNode_Part_Title;
  }



}
