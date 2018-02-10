package com.recursivetree;

import javax.swing.*;
import java.awt.*;

public class DrawControlPanel extends JPanel {

    private final JLabel xLb;
    private final JLabel yLb;
    private final JLabel lineLengthLb;
    private final JLabel depthLb;
    private JSpinner xSpinner;
    private JSpinner ySpinner;
    private JSpinner lineLengthSpinner;
    private JSpinner depthSpinner;

    public DrawControlPanel(Dimension size){
        setPreferredSize(size);

        xLb = new JLabel("X", SwingConstants.CENTER);
        yLb = new JLabel("Y", SwingConstants.CENTER);
        lineLengthLb = new JLabel("Initial line length", SwingConstants.CENTER);
        depthLb = new JLabel("Recursion depth", SwingConstants.CENTER);

        initSpinners();
        setLayout(new GridLayout(4, 4));
        addComponents();
    }

    public JSpinner getXSpinner() {
        return xSpinner;
    }

    public JSpinner getYSpinner() {
        return ySpinner;
    }

    public JSpinner getLineLengthSpinner() {
        return lineLengthSpinner;
    }

    public JSpinner getDepthSpinner() {
        return depthSpinner;
    }

    private void initSpinners(){
        xSpinner = new JSpinner();
        xSpinner.setEditor(new JSpinner.DefaultEditor(xSpinner));
        JSpinner.DefaultEditor xDefaultEditor = (JSpinner.DefaultEditor) xSpinner.getEditor();
        xDefaultEditor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);
        xSpinner.setValue(700);

        ySpinner = new JSpinner();
        ySpinner.setEditor(new JSpinner.DefaultEditor(ySpinner));
        JSpinner.DefaultEditor yDefaultEditor = (JSpinner.DefaultEditor) ySpinner.getEditor();
        yDefaultEditor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);
        ySpinner.setValue(650);

        lineLengthSpinner = new JSpinner();
        lineLengthSpinner.setEditor(new JSpinner.DefaultEditor(lineLengthSpinner));
        JSpinner.DefaultEditor lineLenDefaultEditor = (JSpinner.DefaultEditor) lineLengthSpinner.getEditor();
        lineLenDefaultEditor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);
        lineLengthSpinner.setValue(50);

        depthSpinner = new JSpinner();
        depthSpinner.setEditor(new JSpinner.DefaultEditor(depthSpinner));
        JSpinner.DefaultEditor defaultEditor = (JSpinner.DefaultEditor) depthSpinner.getEditor();
        defaultEditor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);
        depthSpinner.setValue(10);
    }

    private void addComponents(){
        add(xLb);
        add(xSpinner);
        add(yLb);
        add(ySpinner);
        add(lineLengthLb);
        add(lineLengthSpinner);
        add(depthLb);
        add(depthSpinner);
    }
}
