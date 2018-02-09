package com.recursivetree;

import javax.swing.*;
import java.awt.*;

public class DrawControllPanel extends JPanel {

    private final JLabel xLb;
    private final JLabel yLb;
    private final JLabel lineLengthLb;
    private final JLabel depthLb;
    private JSpinner xSpinner;
    private JSpinner ySpinner;
    private JSpinner lineLengthSpinner;
    private JSpinner depthSpinner;

    public DrawControllPanel(Dimension size){
        setPreferredSize(size);

        xLb = new JLabel("X", SwingConstants.CENTER);
        yLb = new JLabel("Y", SwingConstants.CENTER);
        lineLengthLb = new JLabel("Initial line length", SwingConstants.CENTER);
        depthLb = new JLabel("Recursion depth", SwingConstants.CENTER);

        initSpinners();
        setLayout(new GridLayout(4, 4));
        addComponents();
    }

    private void initSpinners(){
        xSpinner = new JSpinner();
        xSpinner.setEditor(new JSpinner.DefaultEditor(xSpinner));
        JSpinner.DefaultEditor xDefaultEditor = (JSpinner.DefaultEditor) xSpinner.getEditor();
        xDefaultEditor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);
        xDefaultEditor.getTextField().setText("700");

        ySpinner = new JSpinner();
        ySpinner.setEditor(new JSpinner.DefaultEditor(ySpinner));
        JSpinner.DefaultEditor yDefaultEditor = (JSpinner.DefaultEditor) ySpinner.getEditor();
        yDefaultEditor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);
        yDefaultEditor.getTextField().setText("600");

        lineLengthSpinner = new JSpinner();
        lineLengthSpinner.setEditor(new JSpinner.DefaultEditor(lineLengthSpinner));
        JSpinner.DefaultEditor lineLenDefaultEditor = (JSpinner.DefaultEditor) lineLengthSpinner.getEditor();
        lineLenDefaultEditor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);
        lineLenDefaultEditor.getTextField().setText("100");

        depthSpinner = new JSpinner();
        depthSpinner.setEditor(new JSpinner.DefaultEditor(depthSpinner));
        JSpinner.DefaultEditor defaultEditor = (JSpinner.DefaultEditor) depthSpinner.getEditor();
        defaultEditor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);
        defaultEditor.getTextField().setText("10");
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
