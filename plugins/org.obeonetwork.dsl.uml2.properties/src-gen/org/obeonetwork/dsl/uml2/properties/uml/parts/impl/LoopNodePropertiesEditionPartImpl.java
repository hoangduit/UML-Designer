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

import org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart;
import org.obeonetwork.dsl.uml2.properties.uml.parts.UmlViewsRepository;

import org.obeonetwork.dsl.uml2.properties.uml.providers.UmlMessages;


/**
 * @author <a href="mailto:cedric.brun@obeo.fr">Cédric Brun</a>
 * @generated
 */
public class LoopNodePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, LoopNodePropertiesEditionPart {

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
	protected EObjectFlatComboViewer inActivity;
	protected Button mustIsolate;
	protected Button isTestedFirst;
	protected ReferencesTable bodyPart;
	protected List<ViewerFilter> bodyPartBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> bodyPartFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable setupPart;
	protected List<ViewerFilter> setupPartBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> setupPartFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer decider;
	protected ReferencesTable test;
	protected List<ViewerFilter> testBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> testFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable loopVariable;
	protected List<ViewerFilter> loopVariableBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> loopVariableFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable bodyOutput;
	protected List<ViewerFilter> bodyOutputBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> bodyOutputFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public LoopNodePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    CompositionSequence loopNodeStep = new BindingCompositionSequence(propertiesEditionComponent);
    CompositionStep propertiesStep = loopNodeStep.addStep(UmlViewsRepository.LoopNode.Properties.class);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.name);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.visibility);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.clientDependency);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.isLeaf);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.inStructuredNode);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.activity);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.outgoing);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.incoming);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.inPartition);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.inInterruptibleRegion);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.redefinedNode);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.inActivity);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.mustIsolate);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.isTestedFirst);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.bodyPart);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.setupPart);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.decider);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.test);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.loopVariable);
    propertiesStep.addStep(UmlViewsRepository.LoopNode.Properties.bodyOutput);
    
    
    composer = new PartComposer(loopNodeStep) {

      @Override
      public Composite addToPart(Composite parent, Object key) {
        if (key == UmlViewsRepository.LoopNode.Properties.class) {
          return createPropertiesGroup(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.name) {
          return createNameText(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.visibility) {
          return createVisibilityEMFComboViewer(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.clientDependency) {
          return createClientDependencyAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.isLeaf) {
          return createIsLeafCheckbox(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.inStructuredNode) {
          return createInStructuredNodeFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.activity) {
          return createActivityFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.outgoing) {
          return createOutgoingAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.incoming) {
          return createIncomingAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.inPartition) {
          return createInPartitionAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.inInterruptibleRegion) {
          return createInInterruptibleRegionAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.redefinedNode) {
          return createRedefinedNodeAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.inActivity) {
          return createInActivityFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.mustIsolate) {
          return createMustIsolateCheckbox(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.isTestedFirst) {
          return createIsTestedFirstCheckbox(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.bodyPart) {
          return createBodyPartAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.setupPart) {
          return createSetupPartAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.decider) {
          return createDeciderFlatComboViewer(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.test) {
          return createTestAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.loopVariable) {
          return createLoopVariableAdvancedReferencesTable(parent);
        }
        if (key == UmlViewsRepository.LoopNode.Properties.bodyOutput) {
          return createBodyOutputAdvancedReferencesTable(parent);
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
    propertiesGroup.setText(UmlMessages.LoopNodePropertiesEditionPart_PropertiesGroupLabel);
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
    createDescription(parent, UmlViewsRepository.LoopNode.Properties.name, UmlMessages.LoopNodePropertiesEditionPart_NameLabel);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
        }
      }

    });
    EditingUtils.setID(name, UmlViewsRepository.LoopNode.Properties.name);
    EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.name, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createVisibilityEMFComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.LoopNode.Properties.visibility, UmlMessages.LoopNodePropertiesEditionPart_VisibilityLabel);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
      }

    });
    visibility.setID(UmlViewsRepository.LoopNode.Properties.visibility);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.visibility, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createClientDependencyAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.LoopNode.Properties.clientDependency, UmlMessages.LoopNodePropertiesEditionPart_ClientDependencyLabel);		 
    this.clientDependency = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addClientDependency(); }
      public void handleEdit(EObject element) { editClientDependency(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveClientDependency(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromClientDependency(element); }
      public void navigateTo(EObject element) { }
    });
    this.clientDependency.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.clientDependency, UmlViewsRepository.SWT_KIND));
    this.clientDependency.createControls(parent);
    this.clientDependency.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.clientDependency, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData clientDependencyData = new GridData(GridData.FILL_HORIZONTAL);
    clientDependencyData.horizontalSpan = 3;
    this.clientDependency.setLayoutData(clientDependencyData);
    this.clientDependency.disableMove();
    clientDependency.setID(UmlViewsRepository.LoopNode.Properties.clientDependency);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.clientDependency,
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
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    clientDependency.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromClientDependency(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
    isLeaf.setText(getDescription(UmlViewsRepository.LoopNode.Properties.isLeaf, UmlMessages.LoopNodePropertiesEditionPart_IsLeafLabel));
    isLeaf.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.isLeaf, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isLeaf.getSelection())));
      }

    });
    GridData isLeafData = new GridData(GridData.FILL_HORIZONTAL);
    isLeafData.horizontalSpan = 2;
    isLeaf.setLayoutData(isLeafData);
    EditingUtils.setID(isLeaf, UmlViewsRepository.LoopNode.Properties.isLeaf);
    EditingUtils.setEEFtype(isLeaf, "eef::Checkbox"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.isLeaf, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createInStructuredNodeFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.LoopNode.Properties.inStructuredNode, UmlMessages.LoopNodePropertiesEditionPart_InStructuredNodeLabel);
    inStructuredNode = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.LoopNode.Properties.inStructuredNode, UmlViewsRepository.SWT_KIND));
    inStructuredNode.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    inStructuredNode.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.inStructuredNode, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getInStructuredNode()));
      }

    });
    GridData inStructuredNodeData = new GridData(GridData.FILL_HORIZONTAL);
    inStructuredNode.setLayoutData(inStructuredNodeData);
    inStructuredNode.setID(UmlViewsRepository.LoopNode.Properties.inStructuredNode);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.inStructuredNode, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createActivityFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.LoopNode.Properties.activity, UmlMessages.LoopNodePropertiesEditionPart_ActivityLabel);
    activity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.LoopNode.Properties.activity, UmlViewsRepository.SWT_KIND));
    activity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    activity.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.activity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getActivity()));
      }

    });
    GridData activityData = new GridData(GridData.FILL_HORIZONTAL);
    activity.setLayoutData(activityData);
    activity.setID(UmlViewsRepository.LoopNode.Properties.activity);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.activity, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createOutgoingAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.LoopNode.Properties.outgoing, UmlMessages.LoopNodePropertiesEditionPart_OutgoingLabel);		 
    this.outgoing = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addOutgoing(); }
      public void handleEdit(EObject element) { editOutgoing(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoing(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromOutgoing(element); }
      public void navigateTo(EObject element) { }
    });
    this.outgoing.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.outgoing, UmlViewsRepository.SWT_KIND));
    this.outgoing.createControls(parent);
    this.outgoing.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.outgoing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData outgoingData = new GridData(GridData.FILL_HORIZONTAL);
    outgoingData.horizontalSpan = 3;
    this.outgoing.setLayoutData(outgoingData);
    this.outgoing.disableMove();
    outgoing.setID(UmlViewsRepository.LoopNode.Properties.outgoing);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.outgoing,
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
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    outgoing.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromOutgoing(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
    String label = getDescription(UmlViewsRepository.LoopNode.Properties.incoming, UmlMessages.LoopNodePropertiesEditionPart_IncomingLabel);		 
    this.incoming = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addIncoming(); }
      public void handleEdit(EObject element) { editIncoming(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncoming(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromIncoming(element); }
      public void navigateTo(EObject element) { }
    });
    this.incoming.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.incoming, UmlViewsRepository.SWT_KIND));
    this.incoming.createControls(parent);
    this.incoming.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.incoming, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData incomingData = new GridData(GridData.FILL_HORIZONTAL);
    incomingData.horizontalSpan = 3;
    this.incoming.setLayoutData(incomingData);
    this.incoming.disableMove();
    incoming.setID(UmlViewsRepository.LoopNode.Properties.incoming);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.incoming,
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
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    incoming.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromIncoming(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
    String label = getDescription(UmlViewsRepository.LoopNode.Properties.inPartition, UmlMessages.LoopNodePropertiesEditionPart_InPartitionLabel);		 
    this.inPartition = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addInPartition(); }
      public void handleEdit(EObject element) { editInPartition(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveInPartition(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromInPartition(element); }
      public void navigateTo(EObject element) { }
    });
    this.inPartition.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.inPartition, UmlViewsRepository.SWT_KIND));
    this.inPartition.createControls(parent);
    this.inPartition.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.inPartition, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData inPartitionData = new GridData(GridData.FILL_HORIZONTAL);
    inPartitionData.horizontalSpan = 3;
    this.inPartition.setLayoutData(inPartitionData);
    this.inPartition.disableMove();
    inPartition.setID(UmlViewsRepository.LoopNode.Properties.inPartition);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.inPartition,
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
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.inPartition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    inPartition.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromInPartition(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.inPartition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
    String label = getDescription(UmlViewsRepository.LoopNode.Properties.inInterruptibleRegion, UmlMessages.LoopNodePropertiesEditionPart_InInterruptibleRegionLabel);		 
    this.inInterruptibleRegion = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addInInterruptibleRegion(); }
      public void handleEdit(EObject element) { editInInterruptibleRegion(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveInInterruptibleRegion(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromInInterruptibleRegion(element); }
      public void navigateTo(EObject element) { }
    });
    this.inInterruptibleRegion.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.inInterruptibleRegion, UmlViewsRepository.SWT_KIND));
    this.inInterruptibleRegion.createControls(parent);
    this.inInterruptibleRegion.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.inInterruptibleRegion, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData inInterruptibleRegionData = new GridData(GridData.FILL_HORIZONTAL);
    inInterruptibleRegionData.horizontalSpan = 3;
    this.inInterruptibleRegion.setLayoutData(inInterruptibleRegionData);
    this.inInterruptibleRegion.disableMove();
    inInterruptibleRegion.setID(UmlViewsRepository.LoopNode.Properties.inInterruptibleRegion);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.inInterruptibleRegion,
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
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.inInterruptibleRegion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    inInterruptibleRegion.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromInInterruptibleRegion(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.inInterruptibleRegion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
    String label = getDescription(UmlViewsRepository.LoopNode.Properties.redefinedNode, UmlMessages.LoopNodePropertiesEditionPart_RedefinedNodeLabel);		 
    this.redefinedNode = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addRedefinedNode(); }
      public void handleEdit(EObject element) { editRedefinedNode(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveRedefinedNode(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromRedefinedNode(element); }
      public void navigateTo(EObject element) { }
    });
    this.redefinedNode.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.redefinedNode, UmlViewsRepository.SWT_KIND));
    this.redefinedNode.createControls(parent);
    this.redefinedNode.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.redefinedNode, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData redefinedNodeData = new GridData(GridData.FILL_HORIZONTAL);
    redefinedNodeData.horizontalSpan = 3;
    this.redefinedNode.setLayoutData(redefinedNodeData);
    this.redefinedNode.disableMove();
    redefinedNode.setID(UmlViewsRepository.LoopNode.Properties.redefinedNode);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.redefinedNode,
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
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.redefinedNode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    redefinedNode.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromRedefinedNode(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.redefinedNode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createInActivityFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.LoopNode.Properties.inActivity, UmlMessages.LoopNodePropertiesEditionPart_InActivityLabel);
    inActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.LoopNode.Properties.inActivity, UmlViewsRepository.SWT_KIND));
    inActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    inActivity.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.inActivity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getInActivity()));
      }

    });
    GridData inActivityData = new GridData(GridData.FILL_HORIZONTAL);
    inActivity.setLayoutData(inActivityData);
    inActivity.setID(UmlViewsRepository.LoopNode.Properties.inActivity);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.inActivity, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createMustIsolateCheckbox(Composite parent) {
    mustIsolate = new Button(parent, SWT.CHECK);
    mustIsolate.setText(getDescription(UmlViewsRepository.LoopNode.Properties.mustIsolate, UmlMessages.LoopNodePropertiesEditionPart_MustIsolateLabel));
    mustIsolate.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.mustIsolate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(mustIsolate.getSelection())));
      }

    });
    GridData mustIsolateData = new GridData(GridData.FILL_HORIZONTAL);
    mustIsolateData.horizontalSpan = 2;
    mustIsolate.setLayoutData(mustIsolateData);
    EditingUtils.setID(mustIsolate, UmlViewsRepository.LoopNode.Properties.mustIsolate);
    EditingUtils.setEEFtype(mustIsolate, "eef::Checkbox"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.mustIsolate, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsTestedFirstCheckbox(Composite parent) {
    isTestedFirst = new Button(parent, SWT.CHECK);
    isTestedFirst.setText(getDescription(UmlViewsRepository.LoopNode.Properties.isTestedFirst, UmlMessages.LoopNodePropertiesEditionPart_IsTestedFirstLabel));
    isTestedFirst.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.isTestedFirst, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isTestedFirst.getSelection())));
      }

    });
    GridData isTestedFirstData = new GridData(GridData.FILL_HORIZONTAL);
    isTestedFirstData.horizontalSpan = 2;
    isTestedFirst.setLayoutData(isTestedFirstData);
    EditingUtils.setID(isTestedFirst, UmlViewsRepository.LoopNode.Properties.isTestedFirst);
    EditingUtils.setEEFtype(isTestedFirst, "eef::Checkbox"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.isTestedFirst, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createBodyPartAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.LoopNode.Properties.bodyPart, UmlMessages.LoopNodePropertiesEditionPart_BodyPartLabel);		 
    this.bodyPart = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addBodyPart(); }
      public void handleEdit(EObject element) { editBodyPart(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveBodyPart(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromBodyPart(element); }
      public void navigateTo(EObject element) { }
    });
    this.bodyPart.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.bodyPart, UmlViewsRepository.SWT_KIND));
    this.bodyPart.createControls(parent);
    this.bodyPart.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.bodyPart, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData bodyPartData = new GridData(GridData.FILL_HORIZONTAL);
    bodyPartData.horizontalSpan = 3;
    this.bodyPart.setLayoutData(bodyPartData);
    this.bodyPart.disableMove();
    bodyPart.setID(UmlViewsRepository.LoopNode.Properties.bodyPart);
    bodyPart.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addBodyPart() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(bodyPart.getInput(), bodyPartFilters, bodyPartBusinessFilters,
    "bodyPart", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.bodyPart,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        bodyPart.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveBodyPart(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.bodyPart, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    bodyPart.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromBodyPart(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.bodyPart, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    bodyPart.refresh();
  }

	/**
	 * @generated
	 */
	protected void editBodyPart(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        bodyPart.refresh();
      }
    }
  }

	/**
	 * @generated
	 */
	protected Composite createSetupPartAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.LoopNode.Properties.setupPart, UmlMessages.LoopNodePropertiesEditionPart_SetupPartLabel);		 
    this.setupPart = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addSetupPart(); }
      public void handleEdit(EObject element) { editSetupPart(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveSetupPart(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromSetupPart(element); }
      public void navigateTo(EObject element) { }
    });
    this.setupPart.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.setupPart, UmlViewsRepository.SWT_KIND));
    this.setupPart.createControls(parent);
    this.setupPart.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.setupPart, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData setupPartData = new GridData(GridData.FILL_HORIZONTAL);
    setupPartData.horizontalSpan = 3;
    this.setupPart.setLayoutData(setupPartData);
    this.setupPart.disableMove();
    setupPart.setID(UmlViewsRepository.LoopNode.Properties.setupPart);
    setupPart.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addSetupPart() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(setupPart.getInput(), setupPartFilters, setupPartBusinessFilters,
    "setupPart", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.setupPart,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        setupPart.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveSetupPart(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.setupPart, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    setupPart.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromSetupPart(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.setupPart, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    setupPart.refresh();
  }

	/**
	 * @generated
	 */
	protected void editSetupPart(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        setupPart.refresh();
      }
    }
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createDeciderFlatComboViewer(Composite parent) {
    createDescription(parent, UmlViewsRepository.LoopNode.Properties.decider, UmlMessages.LoopNodePropertiesEditionPart_DeciderLabel);
    decider = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.LoopNode.Properties.decider, UmlViewsRepository.SWT_KIND));
    decider.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    decider.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.decider, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDecider()));
      }

    });
    GridData deciderData = new GridData(GridData.FILL_HORIZONTAL);
    decider.setLayoutData(deciderData);
    decider.setID(UmlViewsRepository.LoopNode.Properties.decider);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.decider, UmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createTestAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.LoopNode.Properties.test, UmlMessages.LoopNodePropertiesEditionPart_TestLabel);		 
    this.test = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addTest(); }
      public void handleEdit(EObject element) { editTest(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveTest(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromTest(element); }
      public void navigateTo(EObject element) { }
    });
    this.test.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.test, UmlViewsRepository.SWT_KIND));
    this.test.createControls(parent);
    this.test.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.test, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData testData = new GridData(GridData.FILL_HORIZONTAL);
    testData.horizontalSpan = 3;
    this.test.setLayoutData(testData);
    this.test.disableMove();
    test.setID(UmlViewsRepository.LoopNode.Properties.test);
    test.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addTest() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(test.getInput(), testFilters, testBusinessFilters,
    "test", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.test,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        test.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveTest(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.test, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    test.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromTest(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.test, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    test.refresh();
  }

	/**
	 * @generated
	 */
	protected void editTest(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        test.refresh();
      }
    }
  }

	/**
	 * @generated
	 */
	protected Composite createLoopVariableAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.LoopNode.Properties.loopVariable, UmlMessages.LoopNodePropertiesEditionPart_LoopVariableLabel);		 
    this.loopVariable = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addLoopVariable(); }
      public void handleEdit(EObject element) { editLoopVariable(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveLoopVariable(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromLoopVariable(element); }
      public void navigateTo(EObject element) { }
    });
    this.loopVariable.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.loopVariable, UmlViewsRepository.SWT_KIND));
    this.loopVariable.createControls(parent);
    this.loopVariable.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.loopVariable, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData loopVariableData = new GridData(GridData.FILL_HORIZONTAL);
    loopVariableData.horizontalSpan = 3;
    this.loopVariable.setLayoutData(loopVariableData);
    this.loopVariable.disableMove();
    loopVariable.setID(UmlViewsRepository.LoopNode.Properties.loopVariable);
    loopVariable.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addLoopVariable() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(loopVariable.getInput(), loopVariableFilters, loopVariableBusinessFilters,
    "loopVariable", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.loopVariable,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        loopVariable.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveLoopVariable(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.loopVariable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    loopVariable.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromLoopVariable(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.loopVariable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    loopVariable.refresh();
  }

	/**
	 * @generated
	 */
	protected void editLoopVariable(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        loopVariable.refresh();
      }
    }
  }

	/**
	 * @generated
	 */
	protected Composite createBodyOutputAdvancedReferencesTable(Composite parent) {
    String label = getDescription(UmlViewsRepository.LoopNode.Properties.bodyOutput, UmlMessages.LoopNodePropertiesEditionPart_BodyOutputLabel);		 
    this.bodyOutput = new ReferencesTable(label, new ReferencesTableListener() {
      public void handleAdd() { addBodyOutput(); }
      public void handleEdit(EObject element) { editBodyOutput(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveBodyOutput(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromBodyOutput(element); }
      public void navigateTo(EObject element) { }
    });
    this.bodyOutput.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.LoopNode.Properties.bodyOutput, UmlViewsRepository.SWT_KIND));
    this.bodyOutput.createControls(parent);
    this.bodyOutput.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.bodyOutput, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData bodyOutputData = new GridData(GridData.FILL_HORIZONTAL);
    bodyOutputData.horizontalSpan = 3;
    this.bodyOutput.setLayoutData(bodyOutputData);
    this.bodyOutput.disableMove();
    bodyOutput.setID(UmlViewsRepository.LoopNode.Properties.bodyOutput);
    bodyOutput.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected void addBodyOutput() {
    TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(bodyOutput.getInput(), bodyOutputFilters, bodyOutputBusinessFilters,
    "bodyOutput", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
      @Override
      public void process(IStructuredSelection selection) {
        for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
          EObject elem = (EObject) iter.next();
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.bodyOutput,
            PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
        }
        bodyOutput.refresh();
      }
    };
    dialog.open();
  }

	/**
	 * @generated
	 */
	protected void moveBodyOutput(EObject element, int oldIndex, int newIndex) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.bodyOutput, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    bodyOutput.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromBodyOutput(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoopNodePropertiesEditionPartImpl.this, UmlViewsRepository.LoopNode.Properties.bodyOutput, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
    bodyOutput.refresh();
  }

	/**
	 * @generated
	 */
	protected void editBodyOutput(EObject element) {
    EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
    PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
    if (provider != null) {
      PropertiesEditingPolicy policy = provider.getPolicy(context);
      if (policy != null) {
        policy.execute();
        bodyOutput.refresh();
      }
    }
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
    return name.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
    if (newValue != null) {
      name.setText(newValue);
    } else {
      name.setText(""); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.name);
    if (readOnly && name.isEnabled()) {
      name.setEnabled(false);
      name.setToolTipText(UmlMessages.LoopNode_ReadOnly);
    } else if (!readOnly && !name.isEnabled()) {
      name.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#getVisibility()
	 * @generated
	 */
	public Enumerator getVisibility() {
    Enumerator selection = (Enumerator) ((StructuredSelection) visibility.getSelection()).getFirstElement();
    return selection;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initVisibility(Object input, Enumerator current)
	 */
	public void initVisibility(Object input, Enumerator current) {
		visibility.setInput(input);
		visibility.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.visibility);
		if (readOnly && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setVisibility(Enumerator newValue)
	 * @generated
	 */
	public void setVisibility(Enumerator newValue) {
    visibility.modelUpdating(new StructuredSelection(newValue));
    boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.visibility);
    if (readOnly && visibility.isEnabled()) {
      visibility.setEnabled(false);
      visibility.setToolTipText(UmlMessages.LoopNode_ReadOnly);
    } else if (!readOnly && !visibility.isEnabled()) {
      visibility.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initClientDependency(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClientDependency(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		clientDependency.setContentProvider(contentProvider);
		clientDependency.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.clientDependency);
		if (readOnly && clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(false);
			clientDependency.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#updateClientDependency()
	 * @generated
	 */
	public void updateClientDependency() {
  clientDependency.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToClientDependency(ViewerFilter filter) {
    clientDependencyFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToClientDependency(ViewerFilter filter) {
    clientDependencyBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#isContainedInClientDependencyTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInClientDependencyTable(EObject element) {
    return ((ReferencesTableSettings)clientDependency.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#getIsLeaf()
	 * @generated
	 */
	public Boolean getIsLeaf() {
    return Boolean.valueOf(isLeaf.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setIsLeaf(Boolean newValue)
	 * @generated
	 */
	public void setIsLeaf(Boolean newValue) {
    if (newValue != null) {
      isLeaf.setSelection(newValue.booleanValue());
    } else {
      isLeaf.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.isLeaf);
    if (readOnly && isLeaf.isEnabled()) {
      isLeaf.setEnabled(false);
      isLeaf.setToolTipText(UmlMessages.LoopNode_ReadOnly);
    } else if (!readOnly && !isLeaf.isEnabled()) {
      isLeaf.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#getInStructuredNode()
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initInStructuredNode(EObjectFlatComboSettings)
	 */
	public void initInStructuredNode(EObjectFlatComboSettings settings) {
		inStructuredNode.setInput(settings);
		if (current != null) {
			inStructuredNode.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.inStructuredNode);
		if (readOnly && inStructuredNode.isEnabled()) {
			inStructuredNode.setEnabled(false);
			inStructuredNode.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !inStructuredNode.isEnabled()) {
			inStructuredNode.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setInStructuredNode(EObject newValue)
	 * @generated
	 */
	public void setInStructuredNode(EObject newValue) {
    if (newValue != null) {
      inStructuredNode.setSelection(new StructuredSelection(newValue));
    } else {
      inStructuredNode.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.inStructuredNode);
    if (readOnly && inStructuredNode.isEnabled()) {
      inStructuredNode.setEnabled(false);
      inStructuredNode.setToolTipText(UmlMessages.LoopNode_ReadOnly);
    } else if (!readOnly && !inStructuredNode.isEnabled()) {
      inStructuredNode.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setInStructuredNodeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInStructuredNodeButtonMode(ButtonsModeEnum newValue) {
		inStructuredNode.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterInStructuredNode(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToInStructuredNode(ViewerFilter filter) {
    inStructuredNode.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterInStructuredNode(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToInStructuredNode(ViewerFilter filter) {
    inStructuredNode.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#getActivity()
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initActivity(EObjectFlatComboSettings)
	 */
	public void initActivity(EObjectFlatComboSettings settings) {
		activity.setInput(settings);
		if (current != null) {
			activity.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.activity);
		if (readOnly && activity.isEnabled()) {
			activity.setEnabled(false);
			activity.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !activity.isEnabled()) {
			activity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setActivity(EObject newValue)
	 * @generated
	 */
	public void setActivity(EObject newValue) {
    if (newValue != null) {
      activity.setSelection(new StructuredSelection(newValue));
    } else {
      activity.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.activity);
    if (readOnly && activity.isEnabled()) {
      activity.setEnabled(false);
      activity.setToolTipText(UmlMessages.LoopNode_ReadOnly);
    } else if (!readOnly && !activity.isEnabled()) {
      activity.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setActivityButtonMode(ButtonsModeEnum newValue) {
		activity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterActivity(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToActivity(ViewerFilter filter) {
    activity.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterActivity(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToActivity(ViewerFilter filter) {
    activity.addBusinessRuleFilter(filter);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initOutgoing(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoing(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoing.setContentProvider(contentProvider);
		outgoing.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.outgoing);
		if (readOnly && outgoing.getTable().isEnabled()) {
			outgoing.setEnabled(false);
			outgoing.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !outgoing.getTable().isEnabled()) {
			outgoing.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#updateOutgoing()
	 * @generated
	 */
	public void updateOutgoing() {
  outgoing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterOutgoing(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToOutgoing(ViewerFilter filter) {
    outgoingFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterOutgoing(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToOutgoing(ViewerFilter filter) {
    outgoingBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#isContainedInOutgoingTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInOutgoingTable(EObject element) {
    return ((ReferencesTableSettings)outgoing.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initIncoming(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncoming(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incoming.setContentProvider(contentProvider);
		incoming.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.incoming);
		if (readOnly && incoming.getTable().isEnabled()) {
			incoming.setEnabled(false);
			incoming.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !incoming.getTable().isEnabled()) {
			incoming.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#updateIncoming()
	 * @generated
	 */
	public void updateIncoming() {
  incoming.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterIncoming(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToIncoming(ViewerFilter filter) {
    incomingFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterIncoming(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToIncoming(ViewerFilter filter) {
    incomingBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#isContainedInIncomingTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInIncomingTable(EObject element) {
    return ((ReferencesTableSettings)incoming.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initInPartition(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInPartition(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inPartition.setContentProvider(contentProvider);
		inPartition.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.inPartition);
		if (readOnly && inPartition.getTable().isEnabled()) {
			inPartition.setEnabled(false);
			inPartition.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !inPartition.getTable().isEnabled()) {
			inPartition.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#updateInPartition()
	 * @generated
	 */
	public void updateInPartition() {
  inPartition.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterInPartition(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToInPartition(ViewerFilter filter) {
    inPartitionFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterInPartition(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToInPartition(ViewerFilter filter) {
    inPartitionBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#isContainedInInPartitionTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInInPartitionTable(EObject element) {
    return ((ReferencesTableSettings)inPartition.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initInInterruptibleRegion(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInInterruptibleRegion(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inInterruptibleRegion.setContentProvider(contentProvider);
		inInterruptibleRegion.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.inInterruptibleRegion);
		if (readOnly && inInterruptibleRegion.getTable().isEnabled()) {
			inInterruptibleRegion.setEnabled(false);
			inInterruptibleRegion.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !inInterruptibleRegion.getTable().isEnabled()) {
			inInterruptibleRegion.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#updateInInterruptibleRegion()
	 * @generated
	 */
	public void updateInInterruptibleRegion() {
  inInterruptibleRegion.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterInInterruptibleRegion(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToInInterruptibleRegion(ViewerFilter filter) {
    inInterruptibleRegionFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterInInterruptibleRegion(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToInInterruptibleRegion(ViewerFilter filter) {
    inInterruptibleRegionBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#isContainedInInInterruptibleRegionTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInInInterruptibleRegionTable(EObject element) {
    return ((ReferencesTableSettings)inInterruptibleRegion.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initRedefinedNode(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRedefinedNode(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		redefinedNode.setContentProvider(contentProvider);
		redefinedNode.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.redefinedNode);
		if (readOnly && redefinedNode.getTable().isEnabled()) {
			redefinedNode.setEnabled(false);
			redefinedNode.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !redefinedNode.getTable().isEnabled()) {
			redefinedNode.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#updateRedefinedNode()
	 * @generated
	 */
	public void updateRedefinedNode() {
  redefinedNode.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterRedefinedNode(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToRedefinedNode(ViewerFilter filter) {
    redefinedNodeFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterRedefinedNode(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToRedefinedNode(ViewerFilter filter) {
    redefinedNodeBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#isContainedInRedefinedNodeTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInRedefinedNodeTable(EObject element) {
    return ((ReferencesTableSettings)redefinedNode.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#getInActivity()
	 * @generated
	 */
	public EObject getInActivity() {
    if (inActivity.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) inActivity.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initInActivity(EObjectFlatComboSettings)
	 */
	public void initInActivity(EObjectFlatComboSettings settings) {
		inActivity.setInput(settings);
		if (current != null) {
			inActivity.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.inActivity);
		if (readOnly && inActivity.isEnabled()) {
			inActivity.setEnabled(false);
			inActivity.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !inActivity.isEnabled()) {
			inActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setInActivity(EObject newValue)
	 * @generated
	 */
	public void setInActivity(EObject newValue) {
    if (newValue != null) {
      inActivity.setSelection(new StructuredSelection(newValue));
    } else {
      inActivity.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.inActivity);
    if (readOnly && inActivity.isEnabled()) {
      inActivity.setEnabled(false);
      inActivity.setToolTipText(UmlMessages.LoopNode_ReadOnly);
    } else if (!readOnly && !inActivity.isEnabled()) {
      inActivity.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setInActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInActivityButtonMode(ButtonsModeEnum newValue) {
		inActivity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterInActivity(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToInActivity(ViewerFilter filter) {
    inActivity.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterInActivity(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToInActivity(ViewerFilter filter) {
    inActivity.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#getMustIsolate()
	 * @generated
	 */
	public Boolean getMustIsolate() {
    return Boolean.valueOf(mustIsolate.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setMustIsolate(Boolean newValue)
	 * @generated
	 */
	public void setMustIsolate(Boolean newValue) {
    if (newValue != null) {
      mustIsolate.setSelection(newValue.booleanValue());
    } else {
      mustIsolate.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.mustIsolate);
    if (readOnly && mustIsolate.isEnabled()) {
      mustIsolate.setEnabled(false);
      mustIsolate.setToolTipText(UmlMessages.LoopNode_ReadOnly);
    } else if (!readOnly && !mustIsolate.isEnabled()) {
      mustIsolate.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#getIsTestedFirst()
	 * @generated
	 */
	public Boolean getIsTestedFirst() {
    return Boolean.valueOf(isTestedFirst.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setIsTestedFirst(Boolean newValue)
	 * @generated
	 */
	public void setIsTestedFirst(Boolean newValue) {
    if (newValue != null) {
      isTestedFirst.setSelection(newValue.booleanValue());
    } else {
      isTestedFirst.setSelection(false);
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.isTestedFirst);
    if (readOnly && isTestedFirst.isEnabled()) {
      isTestedFirst.setEnabled(false);
      isTestedFirst.setToolTipText(UmlMessages.LoopNode_ReadOnly);
    } else if (!readOnly && !isTestedFirst.isEnabled()) {
      isTestedFirst.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initBodyPart(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initBodyPart(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		bodyPart.setContentProvider(contentProvider);
		bodyPart.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.bodyPart);
		if (readOnly && bodyPart.getTable().isEnabled()) {
			bodyPart.setEnabled(false);
			bodyPart.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !bodyPart.getTable().isEnabled()) {
			bodyPart.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#updateBodyPart()
	 * @generated
	 */
	public void updateBodyPart() {
  bodyPart.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterBodyPart(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToBodyPart(ViewerFilter filter) {
    bodyPartFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterBodyPart(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToBodyPart(ViewerFilter filter) {
    bodyPartBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#isContainedInBodyPartTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInBodyPartTable(EObject element) {
    return ((ReferencesTableSettings)bodyPart.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initSetupPart(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSetupPart(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		setupPart.setContentProvider(contentProvider);
		setupPart.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.setupPart);
		if (readOnly && setupPart.getTable().isEnabled()) {
			setupPart.setEnabled(false);
			setupPart.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !setupPart.getTable().isEnabled()) {
			setupPart.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#updateSetupPart()
	 * @generated
	 */
	public void updateSetupPart() {
  setupPart.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterSetupPart(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToSetupPart(ViewerFilter filter) {
    setupPartFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterSetupPart(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToSetupPart(ViewerFilter filter) {
    setupPartBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#isContainedInSetupPartTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInSetupPartTable(EObject element) {
    return ((ReferencesTableSettings)setupPart.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#getDecider()
	 * @generated
	 */
	public EObject getDecider() {
    if (decider.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) decider.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initDecider(EObjectFlatComboSettings)
	 */
	public void initDecider(EObjectFlatComboSettings settings) {
		decider.setInput(settings);
		if (current != null) {
			decider.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.decider);
		if (readOnly && decider.isEnabled()) {
			decider.setEnabled(false);
			decider.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !decider.isEnabled()) {
			decider.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setDecider(EObject newValue)
	 * @generated
	 */
	public void setDecider(EObject newValue) {
    if (newValue != null) {
      decider.setSelection(new StructuredSelection(newValue));
    } else {
      decider.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.decider);
    if (readOnly && decider.isEnabled()) {
      decider.setEnabled(false);
      decider.setToolTipText(UmlMessages.LoopNode_ReadOnly);
    } else if (!readOnly && !decider.isEnabled()) {
      decider.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#setDeciderButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDeciderButtonMode(ButtonsModeEnum newValue) {
		decider.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterDecider(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToDecider(ViewerFilter filter) {
    decider.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterDecider(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToDecider(ViewerFilter filter) {
    decider.addBusinessRuleFilter(filter);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initTest(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTest(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		test.setContentProvider(contentProvider);
		test.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.test);
		if (readOnly && test.getTable().isEnabled()) {
			test.setEnabled(false);
			test.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !test.getTable().isEnabled()) {
			test.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#updateTest()
	 * @generated
	 */
	public void updateTest() {
  test.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterTest(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTest(ViewerFilter filter) {
    testFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterTest(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTest(ViewerFilter filter) {
    testBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#isContainedInTestTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInTestTable(EObject element) {
    return ((ReferencesTableSettings)test.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initLoopVariable(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLoopVariable(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		loopVariable.setContentProvider(contentProvider);
		loopVariable.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.loopVariable);
		if (readOnly && loopVariable.getTable().isEnabled()) {
			loopVariable.setEnabled(false);
			loopVariable.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !loopVariable.getTable().isEnabled()) {
			loopVariable.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#updateLoopVariable()
	 * @generated
	 */
	public void updateLoopVariable() {
  loopVariable.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterLoopVariable(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToLoopVariable(ViewerFilter filter) {
    loopVariableFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterLoopVariable(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToLoopVariable(ViewerFilter filter) {
    loopVariableBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#isContainedInLoopVariableTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInLoopVariableTable(EObject element) {
    return ((ReferencesTableSettings)loopVariable.getInput()).contains(element);
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#initBodyOutput(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initBodyOutput(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		bodyOutput.setContentProvider(contentProvider);
		bodyOutput.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.LoopNode.Properties.bodyOutput);
		if (readOnly && bodyOutput.getTable().isEnabled()) {
			bodyOutput.setEnabled(false);
			bodyOutput.setToolTipText(UmlMessages.LoopNode_ReadOnly);
		} else if (!readOnly && !bodyOutput.getTable().isEnabled()) {
			bodyOutput.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#updateBodyOutput()
	 * @generated
	 */
	public void updateBodyOutput() {
  bodyOutput.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addFilterBodyOutput(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToBodyOutput(ViewerFilter filter) {
    bodyOutputFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#addBusinessFilterBodyOutput(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToBodyOutput(ViewerFilter filter) {
    bodyOutputBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.LoopNodePropertiesEditionPart#isContainedInBodyOutputTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInBodyOutputTable(EObject element) {
    return ((ReferencesTableSettings)bodyOutput.getInput()).contains(element);
  }






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return UmlMessages.LoopNode_Part_Title;
  }



}
