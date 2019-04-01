/**
 * generated by Xtext 2.17.0
 */
package quickGUI.quickGUI.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import quickGUI.quickGUI.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuickGUIFactoryImpl extends EFactoryImpl implements QuickGUIFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QuickGUIFactory init()
  {
    try
    {
      QuickGUIFactory theQuickGUIFactory = (QuickGUIFactory)EPackage.Registry.INSTANCE.getEFactory(QuickGUIPackage.eNS_URI);
      if (theQuickGUIFactory != null)
      {
        return theQuickGUIFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QuickGUIFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuickGUIFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QuickGUIPackage.GUI: return createGUI();
      case QuickGUIPackage.ELEMENT: return createElement();
      case QuickGUIPackage.LAYOUT: return createLayout();
      case QuickGUIPackage.HORIZONTAL: return createHorizontal();
      case QuickGUIPackage.VERTICAL: return createVertical();
      case QuickGUIPackage.BUTTON: return createButton();
      case QuickGUIPackage.TEXT_BOX: return createTextBox();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GUI createGUI()
  {
    GUIImpl gui = new GUIImpl();
    return gui;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Layout createLayout()
  {
    LayoutImpl layout = new LayoutImpl();
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Horizontal createHorizontal()
  {
    HorizontalImpl horizontal = new HorizontalImpl();
    return horizontal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Vertical createVertical()
  {
    VerticalImpl vertical = new VerticalImpl();
    return vertical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TextBox createTextBox()
  {
    TextBoxImpl textBox = new TextBoxImpl();
    return textBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QuickGUIPackage getQuickGUIPackage()
  {
    return (QuickGUIPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QuickGUIPackage getPackage()
  {
    return QuickGUIPackage.eINSTANCE;
  }

} //QuickGUIFactoryImpl
