package org.esiea.fr.tetris_DABO_TRABAUD;

import static org.junit.Assert.*;

import javax.swing.Timer;

import junit.framework.TestCase;

import org.junit.Test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BoardTest extends TestCase implements ActionListener{

	@Test
	public void testBoard() {
	       assertTrue(setFocusable(true)); 
	       
	}

	@Test
	public void testActionPerformed(ActionEvent e) {
        if (isFallingFinished) {
            isFallingFinished = false;
            assertNotNull(newPiece());
        } else {
            oneLineDown();
        }
		
	}

	@Test
	public void testSquareWidth() {
		assertNotNull(SquareWidth());
	}

	@Test
	public void testSquareHeight() {
		assertNotNull(SquareHeight());
	}

	@Test
	public void testShapeAt() {
		assertNotNull(ShapeAt(1,1));
	}

	@Test
	public void testStart() {
		assertEquals(true,isStarted);
	}

	@Test
	public void testPaintGraphics(Graphics g) {
		assertNotNull(g);
	}

	@Test
	public void testParamString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccessibleContext() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUI() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUIClassID() {
		fail("Not yet implemented");
	}

	@Test
	public void testJPanelLayoutManagerBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testJPanelLayoutManager() {
		fail("Not yet implemented");
	}

	@Test
	public void testJPanelBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testJPanel() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUI() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUIPanelUI() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnable() {
		fail("Not yet implemented");
	}

	@Test
	public void testDisable() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsDoubleBuffered() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVisible() {
		assertTrue(SetVisible());
	}

	@Test
	public void testHide() {
		assertTrue(Hide());
	}

	@Test
	public void testSetForeground() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBackground() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFont() {
		fail("Not yet implemented");
	}

	@Test
	public void testReshape() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetX() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetY() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWidth() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHeight() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoundsRectangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSizeDimension() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLocationPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsOpaque() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPreferredSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPreferredSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMinimumSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMinimumSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMaximumSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMaximumSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAlignmentX() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAlignmentY() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBaseline() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBaselineResizeBehavior() {
		fail("Not yet implemented");
	}

	@Test
	public void testRevalidate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGraphics() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFontMetrics() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintGraphics1() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testRepaintLongIntIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrint() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testContainsIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessKeyEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessMouseEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessMouseMotionEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFocusTraversalKeys() {
		fail("Not yet implemented");
	}

	@Test
	public void testRequestFocus() {
		fail("Not yet implemented");
	}

	@Test
	public void testRequestFocusBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testRequestFocusInWindow() {
		fail("Not yet implemented");
	}

	@Test
	public void testRequestFocusInWindowBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirePropertyChangeStringBooleanBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirePropertyChangeStringIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirePropertyChangeStringCharChar() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInsets() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsValidateRoot() {
		fail("Not yet implemented");
	}

	@Test
	public void testSafelyGetGraphicsComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testSafelyGetGraphicsComponentComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGraphicsInvoked() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetManagingFocusForwardTraversalKeys() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetManagingFocusBackwardTraversalKeys() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetInheritsPopupMenu() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInheritsPopupMenu() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetComponentPopupMenu() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponentPopupMenu() {
		fail("Not yet implemented");
	}

	@Test
	public void testJComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUIComponentUI() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponentGraphics() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintChildren() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintBorder() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintForceDoubleBuffered() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPainting() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintChildren() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintBorder() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPaintingTile() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPaintingForPrint() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsManagingFocus() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNextFocusableComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNextFocusableComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetRequestFocusEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsRequestFocusEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testGrabFocus() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVerifyInputWhenFocusTarget() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVerifyInputWhenFocusTarget() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBorder() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBorder() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInsetsInsets() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAlignmentY() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAlignmentX() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetInputVerifier() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInputVerifier() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDebugGraphicsOptions() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDebugGraphicsOptions() {
		fail("Not yet implemented");
	}

	@Test
	public void testShouldDebugGraphics() {
		fail("Not yet implemented");
	}

	@Test
	public void testRegisterKeyboardActionActionListenerStringKeyStrokeInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testComponentInputMapChanged() {
		fail("Not yet implemented");
	}

	@Test
	public void testRegisterKeyboardActionActionListenerKeyStrokeInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testUnregisterKeyboardAction() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRegisteredKeyStrokes() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetConditionForKeyStroke() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetActionForKeyStroke() {
		fail("Not yet implemented");
	}

	@Test
	public void testResetKeyboardActions() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetInputMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInputMapInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInputMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetActionMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetActionMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInputMapIntBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetActionMapBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testRequestDefaultFocus() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDefaultLocale() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDefaultLocale() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessComponentKeyEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessKeyBinding() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessKeyBindings() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessKeyBindingsForAllComponents() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetToolTipText() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetToolTipText() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetToolTipTextMouseEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetToolTipLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPopupLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateToolTip() {
		fail("Not yet implemented");
	}

	@Test
	public void testScrollRectToVisible() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAutoscrolls() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAutoscrolls() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTransferHandler() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTransferHandler() {
		fail("Not yet implemented");
	}

	@Test
	public void testDropLocationForPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDropLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testDndDone() {
		fail("Not yet implemented");
	}

	@Test
	public void testSuperProcessMouseMotionEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCreatedDoubleBuffer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCreatedDoubleBuffer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClientProperty() {
		fail("Not yet implemented");
	}

	@Test
	public void testPutClientProperty() {
		fail("Not yet implemented");
	}

	@Test
	public void testClientPropertyChanged() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUIProperty() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsLightweightComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetOpaque() {
		fail("Not yet implemented");
	}

	@Test
	public void testRectangleIsObscured() {
		fail("Not yet implemented");
	}

	@Test
	public void testComputeVisibleRectComponentRectangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testComputeVisibleRectRectangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVisibleRect() {
		fail("Not yet implemented");
	}

	@Test
	public void testFireVetoableChange() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddVetoableChangeListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveVetoableChangeListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVetoableChangeListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTopLevelAncestor() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAncestorListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveAncestorListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAncestorListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testRepaintRectangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsOptimizedDrawingEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPaintingOrigin() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintImmediatelyIntIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintImmediatelyRectangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testAlwaysOnTop() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPaintingChild() {
		fail("Not yet implemented");
	}

	@Test
	public void test_paintImmediately() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintToOffscreen() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckIfChildObscuredBySibling() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetWriteObjCounter() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWriteObjCounter() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDoubleBuffered() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRootPane() {
		fail("Not yet implemented");
	}

	@Test
	public void testCompWriteObjectNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testInitializeFocusTraversalKeys() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateGraphicsData() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckGD() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSameOrAncestorOf() {
		fail("Not yet implemented");
	}

	@Test
	public void testContainsFocus() {
		fail("Not yet implemented");
	}

	@Test
	public void testClearMostRecentFocusOwnerOnHide() {
		fail("Not yet implemented");
	}

	@Test
	public void testClearCurrentFocusCycleRootOnHide() {
		fail("Not yet implemented");
	}

	@Test
	public void testPreferredSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testMinimumSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoLayout() {
		fail("Not yet implemented");
	}

	@Test
	public void testLayout() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidate() {
		fail("Not yet implemented");
	}

	@Test
	public void testInvalidate() {
		fail("Not yet implemented");
	}

	@Test
	public void testInvalidateParent() {
		fail("Not yet implemented");
	}

	@Test
	public void testLightweightPaint() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintHeavyweightComponents() {
		fail("Not yet implemented");
	}

	@Test
	public void testLightweightPrint() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintHeavyweightComponents() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponentAtIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testLocate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponentAtPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeliverEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testDispatchEventImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testEventEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumListening() {
		fail("Not yet implemented");
	}

	@Test
	public void testCountHierarchyMembers() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateHierarchyEvents() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testPostsOldMouseEvents() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFocusTraversalKeys() {
		fail("Not yet implemented");
	}

	@Test
	public void testAreFocusTraversalKeysSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsFocusCycleRootContainer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTraversalRoot() {
		fail("Not yet implemented");
	}

	@Test
	public void testListPrintStreamInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testListPrintWriterInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddPropertyChangeListenerPropertyChangeListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddPropertyChangeListenerStringPropertyChangeListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testApplyComponentOrientation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOpaqueShape() {
		fail("Not yet implemented");
	}

	@Test
	public void testMixOnShowing() {
		fail("Not yet implemented");
	}

	@Test
	public void testMixOnHiding() {
		fail("Not yet implemented");
	}

	@Test
	public void testMixOnReshaping() {
		fail("Not yet implemented");
	}

	@Test
	public void testMixOnZOrderChanging() {
		fail("Not yet implemented");
	}

	@Test
	public void testMixOnValidating() {
		fail("Not yet implemented");
	}

	@Test
	public void testContainer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponentCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testCountComponents() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponents() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponents_NoClientCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponentsSync() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsets() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddStringComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddComponentInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testCanContainFocusOwner() {
		fail("Not yet implemented");
	}

	@Test
	public void testHasHeavyweightDescendants() {
		fail("Not yet implemented");
	}

	@Test
	public void testHasLightweightDescendants() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHeavyweightContainer() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetComponentZOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponentZOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddComponentObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddComponentObjectInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdjustListeningChildren() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdjustDescendants() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdjustDecendantsOnParent() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateChildHierarchyEvents() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLayout() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLayout() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateUnconditionally() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateTree() {
		fail("Not yet implemented");
	}

	@Test
	public void testInvalidateTree() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintComponents() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintComponents() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddContainerListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveContainerListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetContainerListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessContainerEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testDispatchEventToSelf() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMouseEventTarget() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDropTargetEventTarget() {
		fail("Not yet implemented");
	}

	@Test
	public void testProxyEnableEvents() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMousePositionBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindComponentAtIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindComponentAtIntIntBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindComponentAtImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindComponentAtPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsAncestorOf() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFocusTraversalPolicy() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFocusTraversalPolicy() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsFocusTraversalPolicySet() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFocusCycleRoot() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsFocusCycleRoot() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFocusTraversalPolicyProvider() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsFocusTraversalPolicyProvider() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransferFocusDownCycle() {
		fail("Not yet implemented");
	}

	@Test
	public void testPreProcessKeyEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testPostProcessKeyEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccessibleAt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccessibleChildrenCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccessibleChild() {
		fail("Not yet implemented");
	}

	@Test
	public void testIncreaseComponentCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testDecreaseComponentCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecursiveSubtractAndApplyShapeRegion() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecursiveSubtractAndApplyShapeRegionInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecursiveSubtractAndApplyShapeRegionIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecursiveApplyCurrentShape() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecursiveApplyCurrentShapeInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecursiveApplyCurrentShapeIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsRecursivelyVisibleUpToHeavyweightContainer() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetObjectLock() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccessControlContext() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoundsOp() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBoundsOp() {
		fail("Not yet implemented");
	}

	@Test
	public void testComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testConstructComponentName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetParent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetParent_NoClientCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetContainer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPeer() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDropTarget() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDropTarget() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGraphicsConfiguration() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGraphicsConfiguration_NoClientCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetGraphicsConfiguration() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTreeLock() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckTreeLock() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetToolkit() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetToolkitImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsValid() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsDisplayable() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsVisible() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsVisible_NoClientCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsRecursivelyVisible() {
		fail("Not yet implemented");
	}

	@Test
	public void testPointRelativeToComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUnderMouseInWindow() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMousePosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsShowing() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEnabledImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnableBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnableInputMethods() {
		fail("Not yet implemented");
	}

	@Test
	public void testShow() {
		fail("Not yet implemented");
	}

	@Test
	public void testShowBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetForeground() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsForegroundSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBackground() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsBackgroundSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFont() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFont_NoClientCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsFontSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLocale() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLocale() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetColorModel() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLocationOnScreen() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLocationOnScreen_NoTreeLock() {
		fail("Not yet implemented");
	}

	@Test
	public void testLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLocationIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testMove() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLocationPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSizeIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testResizeIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSizeDimension() {
		fail("Not yet implemented");
	}

	@Test
	public void testResizeDimension() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBounds() {
		fail("Not yet implemented");
	}

	@Test
	public void testBounds() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBoundsIntIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBoundsRectangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsLightweight() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPreferredSizeSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsMinimumSizeSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsMaximumSizeSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testInvalidateIfValid() {
		fail("Not yet implemented");
	}

	@Test
	public void testRevalidateSynchronously() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGraphics_NoClientCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCursor() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateCursorImmediately() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCursor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCursor_NoClientCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsCursorSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testRepaint() {
		fail("Not yet implemented");
	}

	@Test
	public void testRepaintLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testRepaintIntIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testImageUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateImageImageProducer() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateImageIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateVolatileImageIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateVolatileImageIntIntImageCapabilities() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrepareImageImageImageObserver() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrepareImageImageIntIntImageObserver() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckImageImageImageObserver() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckImageImageIntIntImageObserver() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateBufferStrategyInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateBufferStrategyIntBufferCapabilities() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBufferStrategy() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBackBuffer() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetIgnoreRepaint() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIgnoreRepaint() {
		fail("Not yet implemented");
	}

	@Test
	public void testInside() {
		fail("Not yet implemented");
	}

	@Test
	public void testContainsPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testDispatchEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testAutoProcessMouseWheel() {
		fail("Not yet implemented");
	}

	@Test
	public void testDispatchMouseWheelToAncestor() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckWindowClosingException() {
		fail("Not yet implemented");
	}

	@Test
	public void testAreInputMethodsEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testEventTypeEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testPostEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddComponentListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveComponentListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponentListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddFocusListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveFocusListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFocusListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddHierarchyListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveHierarchyListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHierarchyListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddHierarchyBoundsListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveHierarchyBoundsListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHierarchyBoundsListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdjustListeningChildrenOnParent() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddKeyListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveKeyListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetKeyListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMouseListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveMouseListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMouseListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMouseMotionListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveMouseMotionListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMouseMotionListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMouseWheelListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveMouseWheelListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMouseWheelListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddInputMethodListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveInputMethodListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInputMethodListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInputMethodRequests() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInputContext() {
		fail("Not yet implemented");
	}

	@Test
	public void testEnableEvents() {
		fail("Not yet implemented");
	}

	@Test
	public void testDisableEvents() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsCoalescingEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testCoalesceEvents() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessComponentEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessFocusEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessMouseWheelEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessInputMethodEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessHierarchyEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessHierarchyBoundsEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testHandleEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testMouseDown() {
		fail("Not yet implemented");
	}

	@Test
	public void testMouseDrag() {
		fail("Not yet implemented");
	}

	@Test
	public void testMouseUp() {
		fail("Not yet implemented");
	}

	@Test
	public void testMouseMove() {
		fail("Not yet implemented");
	}

	@Test
	public void testMouseEnter() {
		fail("Not yet implemented");
	}

	@Test
	public void testMouseExit() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyDown() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyUp() {
		fail("Not yet implemented");
	}

	@Test
	public void testAction() {
		fail("Not yet implemented");
	}

	@Test
	public void testGotFocus() {
		fail("Not yet implemented");
	}

	@Test
	public void testLostFocus() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsFocusTraversable() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsFocusable() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFocusable() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsFocusTraversableOverridden() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFocusTraversalKeys_NoIDCheck() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFocusTraversalKeys_NoIDCheck() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFocusTraversalKeysEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFocusTraversalKeysEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testRequestFocusCause() {
		fail("Not yet implemented");
	}

	@Test
	public void testRequestFocusBooleanCause() {
		fail("Not yet implemented");
	}

	@Test
	public void testRequestFocusInWindowCause() {
		fail("Not yet implemented");
	}

	@Test
	public void testRequestFocusInWindowBooleanCause() {
		fail("Not yet implemented");
	}

	@Test
	public void testRequestFocusHelperBooleanBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testRequestFocusHelperBooleanBooleanCause() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetRequestFocusController() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFocusCycleRootAncestor() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransferFocus() {
		fail("Not yet implemented");
	}

	@Test
	public void testNextFocus() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransferFocusBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNextFocusCandidate() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransferFocusBackward() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransferFocusBackwardBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransferFocusUpCycle() {
		fail("Not yet implemented");
	}

	@Test
	public void testHasFocus() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsFocusOwner() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAutoFocusTransferOnDisposal() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsAutoFocusTransferOnDisposal() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddPopupMenu() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveMenuComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testList() {
		fail("Not yet implemented");
	}

	@Test
	public void testListPrintStream() {
		fail("Not yet implemented");
	}

	@Test
	public void testListPrintWriter() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNativeContainer() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemovePropertyChangeListenerPropertyChangeListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPropertyChangeListeners() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemovePropertyChangeListenerStringPropertyChangeListener() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPropertyChangeListenersString() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirePropertyChangeStringObjectObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirePropertyChangeStringByteByte() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirePropertyChangeStringShortShort() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirePropertyChangeStringLongLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirePropertyChangeStringFloatFloat() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirePropertyChangeStringDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetComponentOrientation() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComponentOrientation() {
		fail("Not yet implemented");
	}

	@Test
	public void testCanBeFocusOwner() {
		fail("Not yet implemented");
	}

	@Test
	public void testCanBeFocusOwnerRecursively() {
		fail("Not yet implemented");
	}

	@Test
	public void testRelocateComponent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetContainingWindow() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccessibleIndexInParent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccessibleStateSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsInstanceOf() {
		fail("Not yet implemented");
	}

	@Test
	public void testAreBoundsValid() {
		fail("Not yet implemented");
	}

	@Test
	public void testApplyCompoundShape() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLocationOnWindow() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNormalShape() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSiblingIndexAbove() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHWPeerAboveMe() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSiblingIndexBelow() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsNonOpaqueForMixing() {
		fail("Not yet implemented");
	}

	@Test
	public void testApplyCurrentShape() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtractAndApplyShape() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtractAndApplyShapeBelowMe() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsMixingNeeded() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateZOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}


}
