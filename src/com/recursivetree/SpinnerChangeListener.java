package com.recursivetree;

import javax.swing.*;
import javax.swing.event.*;
import java.util.concurrent.atomic.AtomicReference;

public class SpinnerChangeListener implements ChangeListener {

    private JFrame window;
    private ControlPanel controlPanel;
    private AtomicReference<RecursiveTree> tree;

    public SpinnerChangeListener(JFrame window, ControlPanel panel, AtomicReference<RecursiveTree> tree){
        this.window = window;
        controlPanel = panel;
        this.tree = tree;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(!areSpinnerCurrValuesValid())
            return;

        window.remove(tree.get());
        tree.set(new RecursiveTree(controlPanel));
        window.add(tree.get());
        tree.get().setBounds(300, 0, window.getWidth() - 300, window.getHeight());
        window.revalidate();
        window.repaint();
    }

    private boolean areSpinnerCurrValuesValid(){
        return checkXValueCorrectness() &&
                checkYValueCorrectness() &&
                checkLineLenValueCorrectness() &&
                checkDepthValueCorrectness();
    }

    private boolean checkXValueCorrectness() {
        int xCurrVal = (int) controlPanel.getXSpinner().getValue();
        if (isZero(xCurrVal)) {
            controlPanel.getXSpinner().setValue(1);
            return false;
        }
        return true;
    }

    private boolean checkYValueCorrectness() {
        int yCurrVal = (int) controlPanel.getYSpinner().getValue();
        if (isZero(yCurrVal)) {
            controlPanel.getYSpinner().setValue(1);
            return false;
        }
        return true;
    }

    private boolean checkLineLenValueCorrectness() {
        int lineLenCurrVal = (int) controlPanel.getLineLengthSpinner().getValue();
        if (isZero(lineLenCurrVal)) {
            controlPanel.getLineLengthSpinner().setValue(1);
            return false;
        }
        return true;
    }

    private boolean checkDepthValueCorrectness() {
        int depthCurrVal = (int) controlPanel.getDepthSpinner().getValue();
        if (isZero(depthCurrVal)) {
            controlPanel.getDepthSpinner().setValue(1);
            return false;
        }
        return true;
    }

    private boolean isZero(int val){
        return val == 0;
    }
}
