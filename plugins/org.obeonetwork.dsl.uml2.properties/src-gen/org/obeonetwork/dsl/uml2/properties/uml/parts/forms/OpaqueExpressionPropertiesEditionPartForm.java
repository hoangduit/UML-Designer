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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
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

import org.eclipse.jface.window.Window;

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

import org.eclipse.uml2.uml.UMLPackage;

import org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart;
import org.obeonetwork.dsl.uml2.properties.uml.parts.UmlViewsRepository;

import org.obeonetwork.dsl.uml2.properties.uml.providers.UmlMessages;


/**
 * @author <a href="mailto:cedric.brun@obeo.fr">Cédric Brun</a>
 * @generated
 */
public class OpaqueExpressionPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, OpaqueExpressionPropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer visibility;
	protected ReferencesTable clientDependency;
	protected List<ViewerFilter> clientDependencyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> clientDependencyFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer owningTemplateParameter;
	protected EObjectFlatComboViewer templateParameter;
	protected EObjectFlatComboViewer type;
	protected Text body;
	protected Button editBody;
	private EList bodyList;
	protected Text language;
	protected Button editLanguage;
	private EList languageList;
	protected EObjectFlatComboViewer behavior;



	/**
	 * For {@link ISection} use only.
	 */
	public OpaqueExpressionPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public OpaqueExpressionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
    CompositionSequence opaqueExpressionStep = new BindingCompositionSequence(propertiesEditionComponent);
    CompositionStep propertiesStep = opaqueExpressionStep.addStep(UmlViewsRepository.OpaqueExpression.Properties.class);
    propertiesStep.addStep(UmlViewsRepository.OpaqueExpression.Properties.name);
    propertiesStep.addStep(UmlViewsRepository.OpaqueExpression.Properties.visibility);
    propertiesStep.addStep(UmlViewsRepository.OpaqueExpression.Properties.clientDependency);
    propertiesStep.addStep(UmlViewsRepository.OpaqueExpression.Properties.owningTemplateParameter);
    propertiesStep.addStep(UmlViewsRepository.OpaqueExpression.Properties.templateParameter);
    propertiesStep.addStep(UmlViewsRepository.OpaqueExpression.Properties.type);
    propertiesStep.addStep(UmlViewsRepository.OpaqueExpression.Properties.body);
    propertiesStep.addStep(UmlViewsRepository.OpaqueExpression.Properties.language);
    propertiesStep.addStep(UmlViewsRepository.OpaqueExpression.Properties.behavior);
    
    
    composer = new PartComposer(opaqueExpressionStep) {

      @Override
      public Composite addToPart(Composite parent, Object key) {
        if (key == UmlViewsRepository.OpaqueExpression.Properties.class) {
          return createPropertiesGroup(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.OpaqueExpression.Properties.name) {
          return createNameText(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.OpaqueExpression.Properties.visibility) {
          return createVisibilityEMFComboViewer(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.OpaqueExpression.Properties.clientDependency) {
          return createClientDependencyReferencesTable(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.OpaqueExpression.Properties.owningTemplateParameter) {
          return createOwningTemplateParameterFlatComboViewer(parent, widgetFactory);
        }
        if (key == UmlViewsRepository.OpaqueExpression.Properties.templateParameter) {
          return createTemplateParameterFlatComboViewer(parent, widgetFactory);
        }
        if (key == UmlViewsRepository.OpaqueExpression.Properties.type) {
          return createTypeFlatComboViewer(parent, widgetFactory);
        }
        if (key == UmlViewsRepository.OpaqueExpression.Properties.body) {
          return createBodyMultiValuedEditor(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.OpaqueExpression.Properties.language) {
          return createLanguageMultiValuedEditor(widgetFactory, parent);
        }
        if (key == UmlViewsRepository.OpaqueExpression.Properties.behavior) {
          return createBehaviorFlatComboViewer(parent, widgetFactory);
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
    propertiesSection.setText(UmlMessages.OpaqueExpressionPropertiesEditionPart_PropertiesGroupLabel);
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
    createDescription(parent, UmlViewsRepository.OpaqueExpression.Properties.name, UmlMessages.OpaqueExpressionPropertiesEditionPart_NameLabel);
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
              OpaqueExpressionPropertiesEditionPartForm.this,
              UmlViewsRepository.OpaqueExpression.Properties.name,
              PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
          propertiesEditionComponent
              .firePropertiesChanged(new PropertiesEditionEvent(
                  OpaqueExpressionPropertiesEditionPartForm.this,
                  UmlViewsRepository.OpaqueExpression.Properties.name,
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
                  OpaqueExpressionPropertiesEditionPartForm.this,
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
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
        }
      }
    });
    EditingUtils.setID(name, UmlViewsRepository.OpaqueExpression.Properties.name);
    EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.OpaqueExpression.Properties.name, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createVisibilityEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
    createDescription(parent, UmlViewsRepository.OpaqueExpression.Properties.visibility, UmlMessages.OpaqueExpressionPropertiesEditionPart_VisibilityLabel);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
      }

    });
    visibility.setID(UmlViewsRepository.OpaqueExpression.Properties.visibility);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.OpaqueExpression.Properties.visibility, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createClientDependencyReferencesTable(FormToolkit widgetFactory, Composite parent) {
    this.clientDependency = new ReferencesTable(getDescription(UmlViewsRepository.OpaqueExpression.Properties.clientDependency, UmlMessages.OpaqueExpressionPropertiesEditionPart_ClientDependencyLabel), new ReferencesTableListener	() {
      public void handleAdd() { addClientDependency(); }
      public void handleEdit(EObject element) { editClientDependency(element); }
      public void handleMove(EObject element, int oldIndex, int newIndex) { moveClientDependency(element, oldIndex, newIndex); }
      public void handleRemove(EObject element) { removeFromClientDependency(element); }
      public void navigateTo(EObject element) { }
    });
    this.clientDependency.setHelpText(propertiesEditionComponent.getHelpContent(UmlViewsRepository.OpaqueExpression.Properties.clientDependency, UmlViewsRepository.FORM_KIND));
    this.clientDependency.createControls(parent, widgetFactory);
    this.clientDependency.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.clientDependency, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData clientDependencyData = new GridData(GridData.FILL_HORIZONTAL);
    clientDependencyData.horizontalSpan = 3;
    this.clientDependency.setLayoutData(clientDependencyData);
    this.clientDependency.disableMove();
    clientDependency.setID(UmlViewsRepository.OpaqueExpression.Properties.clientDependency);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.clientDependency,
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
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
    clientDependency.refresh();
  }

	/**
	 * @generated
	 */
	protected void removeFromClientDependency(EObject element) {
    propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.clientDependency, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createOwningTemplateParameterFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.OpaqueExpression.Properties.owningTemplateParameter, UmlMessages.OpaqueExpressionPropertiesEditionPart_OwningTemplateParameterLabel);
    owningTemplateParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.OpaqueExpression.Properties.owningTemplateParameter, UmlViewsRepository.FORM_KIND));
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.owningTemplateParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOwningTemplateParameter()));
      }

    });
    owningTemplateParameter.setID(UmlViewsRepository.OpaqueExpression.Properties.owningTemplateParameter);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.OpaqueExpression.Properties.owningTemplateParameter, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createTemplateParameterFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.OpaqueExpression.Properties.templateParameter, UmlMessages.OpaqueExpressionPropertiesEditionPart_TemplateParameterLabel);
    templateParameter = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.OpaqueExpression.Properties.templateParameter, UmlViewsRepository.FORM_KIND));
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.templateParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTemplateParameter()));
      }

    });
    templateParameter.setID(UmlViewsRepository.OpaqueExpression.Properties.templateParameter);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.OpaqueExpression.Properties.templateParameter, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.OpaqueExpression.Properties.type, UmlMessages.OpaqueExpressionPropertiesEditionPart_TypeLabel);
    type = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.OpaqueExpression.Properties.type, UmlViewsRepository.FORM_KIND));
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
      }

    });
    type.setID(UmlViewsRepository.OpaqueExpression.Properties.type);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.OpaqueExpression.Properties.type, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createBodyMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
    body = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
    GridData bodyData = new GridData(GridData.FILL_HORIZONTAL);
    bodyData.horizontalSpan = 2;
    body.setLayoutData(bodyData);
    EditingUtils.setID(body, UmlViewsRepository.OpaqueExpression.Properties.body);
    EditingUtils.setEEFtype(body, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
    editBody = widgetFactory.createButton(parent, getDescription(UmlViewsRepository.OpaqueExpression.Properties.body, UmlMessages.OpaqueExpressionPropertiesEditionPart_BodyLabel), SWT.NONE);
    GridData editBodyData = new GridData();
    editBody.setLayoutData(editBodyData);
    editBody.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * @generated
       */
      public void widgetSelected(SelectionEvent e) {
        EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
            body.getShell(), "OpaqueExpression", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
            bodyList, UMLPackage.eINSTANCE.getOpaqueExpression_Body().getEType(), null,
            false, true, 
            null, null);
        if (dialog.open() == Window.OK) {
          bodyList = dialog.getResult();
          if (bodyList == null) {
            bodyList = new BasicEList();
          }
          body.setText(bodyList.toString());
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.body, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(bodyList)));
          setHasChanged(true);
        }
      }
    });
    EditingUtils.setID(editBody, UmlViewsRepository.OpaqueExpression.Properties.body);
    EditingUtils.setEEFtype(editBody, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @generated
	 */
	protected Composite createLanguageMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
    language = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
    GridData languageData = new GridData(GridData.FILL_HORIZONTAL);
    languageData.horizontalSpan = 2;
    language.setLayoutData(languageData);
    EditingUtils.setID(language, UmlViewsRepository.OpaqueExpression.Properties.language);
    EditingUtils.setEEFtype(language, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
    editLanguage = widgetFactory.createButton(parent, getDescription(UmlViewsRepository.OpaqueExpression.Properties.language, UmlMessages.OpaqueExpressionPropertiesEditionPart_LanguageLabel), SWT.NONE);
    GridData editLanguageData = new GridData();
    editLanguage.setLayoutData(editLanguageData);
    editLanguage.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * @generated
       */
      public void widgetSelected(SelectionEvent e) {
        EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
            language.getShell(), "OpaqueExpression", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
            languageList, UMLPackage.eINSTANCE.getOpaqueExpression_Language().getEType(), null,
            false, true, 
            null, null);
        if (dialog.open() == Window.OK) {
          languageList = dialog.getResult();
          if (languageList == null) {
            languageList = new BasicEList();
          }
          language.setText(languageList.toString());
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.language, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(languageList)));
          setHasChanged(true);
        }
      }
    });
    EditingUtils.setID(editLanguage, UmlViewsRepository.OpaqueExpression.Properties.language);
    EditingUtils.setEEFtype(editLanguage, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createBehaviorFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, UmlViewsRepository.OpaqueExpression.Properties.behavior, UmlMessages.OpaqueExpressionPropertiesEditionPart_BehaviorLabel);
    behavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(UmlViewsRepository.OpaqueExpression.Properties.behavior, UmlViewsRepository.FORM_KIND));
    widgetFactory.adapt(behavior);
    behavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    GridData behaviorData = new GridData(GridData.FILL_HORIZONTAL);
    behavior.setLayoutData(behaviorData);
    behavior.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OpaqueExpressionPropertiesEditionPartForm.this, UmlViewsRepository.OpaqueExpression.Properties.behavior, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBehavior()));
      }

    });
    behavior.setID(UmlViewsRepository.OpaqueExpression.Properties.behavior);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(UmlViewsRepository.OpaqueExpression.Properties.behavior, UmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
    return name.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
    if (newValue != null) {
      name.setText(newValue);
    } else {
      name.setText(""); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.name);
    if (readOnly && name.isEnabled()) {
      name.setEnabled(false);
      name.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
    } else if (!readOnly && !name.isEnabled()) {
      name.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#getVisibility()
	 * @generated
	 */
	public Enumerator getVisibility() {
    Enumerator selection = (Enumerator) ((StructuredSelection) visibility.getSelection()).getFirstElement();
    return selection;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#initVisibility(Object input, Enumerator current)
	 */
	public void initVisibility(Object input, Enumerator current) {
		visibility.setInput(input);
		visibility.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.visibility);
		if (readOnly && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
		} else if (!readOnly && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setVisibility(Enumerator newValue)
	 * @generated
	 */
	public void setVisibility(Enumerator newValue) {
    visibility.modelUpdating(new StructuredSelection(newValue));
    boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.visibility);
    if (readOnly && visibility.isEnabled()) {
      visibility.setEnabled(false);
      visibility.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
    } else if (!readOnly && !visibility.isEnabled()) {
      visibility.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#initClientDependency(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClientDependency(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		clientDependency.setContentProvider(contentProvider);
		clientDependency.setInput(settings);
		boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.clientDependency);
		if (readOnly && clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(false);
			clientDependency.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
		} else if (!readOnly && !clientDependency.getTable().isEnabled()) {
			clientDependency.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#updateClientDependency()
	 * @generated
	 */
	public void updateClientDependency() {
  clientDependency.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#addFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToClientDependency(ViewerFilter filter) {
    clientDependencyFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#addBusinessFilterClientDependency(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToClientDependency(ViewerFilter filter) {
    clientDependencyBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#isContainedInClientDependencyTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInClientDependencyTable(EObject element) {
    return ((ReferencesTableSettings)clientDependency.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#getOwningTemplateParameter()
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#initOwningTemplateParameter(EObjectFlatComboSettings)
	 */
	public void initOwningTemplateParameter(EObjectFlatComboSettings settings) {
		owningTemplateParameter.setInput(settings);
		if (current != null) {
			owningTemplateParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.owningTemplateParameter);
		if (readOnly && owningTemplateParameter.isEnabled()) {
			owningTemplateParameter.setEnabled(false);
			owningTemplateParameter.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
		} else if (!readOnly && !owningTemplateParameter.isEnabled()) {
			owningTemplateParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setOwningTemplateParameter(EObject newValue)
	 * @generated
	 */
	public void setOwningTemplateParameter(EObject newValue) {
    if (newValue != null) {
      owningTemplateParameter.setSelection(new StructuredSelection(newValue));
    } else {
      owningTemplateParameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.owningTemplateParameter);
    if (readOnly && owningTemplateParameter.isEnabled()) {
      owningTemplateParameter.setEnabled(false);
      owningTemplateParameter.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
    } else if (!readOnly && !owningTemplateParameter.isEnabled()) {
      owningTemplateParameter.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setOwningTemplateParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwningTemplateParameterButtonMode(ButtonsModeEnum newValue) {
		owningTemplateParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#addFilterOwningTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToOwningTemplateParameter(ViewerFilter filter) {
    owningTemplateParameter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#addBusinessFilterOwningTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToOwningTemplateParameter(ViewerFilter filter) {
    owningTemplateParameter.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#getTemplateParameter()
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#initTemplateParameter(EObjectFlatComboSettings)
	 */
	public void initTemplateParameter(EObjectFlatComboSettings settings) {
		templateParameter.setInput(settings);
		if (current != null) {
			templateParameter.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.templateParameter);
		if (readOnly && templateParameter.isEnabled()) {
			templateParameter.setEnabled(false);
			templateParameter.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
		} else if (!readOnly && !templateParameter.isEnabled()) {
			templateParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setTemplateParameter(EObject newValue)
	 * @generated
	 */
	public void setTemplateParameter(EObject newValue) {
    if (newValue != null) {
      templateParameter.setSelection(new StructuredSelection(newValue));
    } else {
      templateParameter.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.templateParameter);
    if (readOnly && templateParameter.isEnabled()) {
      templateParameter.setEnabled(false);
      templateParameter.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
    } else if (!readOnly && !templateParameter.isEnabled()) {
      templateParameter.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setTemplateParameterButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTemplateParameterButtonMode(ButtonsModeEnum newValue) {
		templateParameter.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#addFilterTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTemplateParameter(ViewerFilter filter) {
    templateParameter.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#addBusinessFilterTemplateParameter(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTemplateParameter(ViewerFilter filter) {
    templateParameter.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#getType()
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
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#initType(EObjectFlatComboSettings)
	 */
	public void initType(EObjectFlatComboSettings settings) {
		type.setInput(settings);
		if (current != null) {
			type.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.type);
		if (readOnly && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
		} else if (!readOnly && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setType(EObject newValue)
	 * @generated
	 */
	public void setType(EObject newValue) {
    if (newValue != null) {
      type.setSelection(new StructuredSelection(newValue));
    } else {
      type.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.type);
    if (readOnly && type.isEnabled()) {
      type.setEnabled(false);
      type.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
    } else if (!readOnly && !type.isEnabled()) {
      type.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue) {
		type.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#addFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToType(ViewerFilter filter) {
    type.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#addBusinessFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToType(ViewerFilter filter) {
    type.addBusinessRuleFilter(filter);
  }

	/**
   * {@inheritDoc}
   * 
   * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#getBody()
   * @generated
   */
  public EList getBody() {
    return bodyList;
  }

  /**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setBody(EList newValue)
	 * @generated
	 */
	public void setBody(EList newValue) {
    bodyList = newValue;
    if (newValue != null) {
      body.setText(bodyList.toString());
    } else {
      body.setText(""); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.body);
    if (readOnly && body.isEnabled()) {
      body.setEnabled(false);
      body.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
    } else if (!readOnly && !body.isEnabled()) {
      body.setEnabled(true);
    }	
    
  }

	public void addToBody(Object newValue) {
		bodyList.add(newValue);
		if (newValue != null) {
			body.setText(bodyList.toString());
		} else {
			body.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToBody(Object newValue) {
		bodyList.remove(newValue);
		if (newValue != null) {
			body.setText(bodyList.toString());
		} else {
			body.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#getLanguage()
	 * @generated
	 */
	public EList getLanguage() {
    return languageList;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setLanguage(EList newValue)
	 * @generated
	 */
	public void setLanguage(EList newValue) {
    languageList = newValue;
    if (newValue != null) {
      language.setText(languageList.toString());
    } else {
      language.setText(""); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.language);
    if (readOnly && language.isEnabled()) {
      language.setEnabled(false);
      language.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
    } else if (!readOnly && !language.isEnabled()) {
      language.setEnabled(true);
    }	
    
  }

	public void addToLanguage(Object newValue) {
		languageList.add(newValue);
		if (newValue != null) {
			language.setText(languageList.toString());
		} else {
			language.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToLanguage(Object newValue) {
		languageList.remove(newValue);
		if (newValue != null) {
			language.setText(languageList.toString());
		} else {
			language.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#getBehavior()
	 * @generated
	 */
	public EObject getBehavior() {
    if (behavior.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) behavior.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#initBehavior(EObjectFlatComboSettings)
	 */
	public void initBehavior(EObjectFlatComboSettings settings) {
		behavior.setInput(settings);
		if (current != null) {
			behavior.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.behavior);
		if (readOnly && behavior.isEnabled()) {
			behavior.setEnabled(false);
			behavior.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
		} else if (!readOnly && !behavior.isEnabled()) {
			behavior.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setBehavior(EObject newValue)
	 * @generated
	 */
	public void setBehavior(EObject newValue) {
    if (newValue != null) {
      behavior.setSelection(new StructuredSelection(newValue));
    } else {
      behavior.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean readOnly = isReadOnly(UmlViewsRepository.OpaqueExpression.Properties.behavior);
    if (readOnly && behavior.isEnabled()) {
      behavior.setEnabled(false);
      behavior.setToolTipText(UmlMessages.OpaqueExpression_ReadOnly);
    } else if (!readOnly && !behavior.isEnabled()) {
      behavior.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#setBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBehaviorButtonMode(ButtonsModeEnum newValue) {
		behavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#addFilterBehavior(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToBehavior(ViewerFilter filter) {
    behavior.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.uml2.properties.uml.parts.OpaqueExpressionPropertiesEditionPart#addBusinessFilterBehavior(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToBehavior(ViewerFilter filter) {
    behavior.addBusinessRuleFilter(filter);
  }






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return UmlMessages.OpaqueExpression_Part_Title;
  }



}
