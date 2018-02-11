package com.recursivetree;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;

public class DrawControlPanel extends JPanel implements ControlPanel{

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
        initSingleSpinner(new AtomicReference<>(xSpinner = new JSpinner()), 700);
        initSingleSpinner(new AtomicReference<>(ySpinner = new JSpinner()), 650);
        initSingleSpinner(new AtomicReference<>(lineLengthSpinner = new JSpinner()), 50);
        initSingleSpinner(new AtomicReference<>(depthSpinner = new JSpinner()), 10);
    }

    private void initSingleSpinner(AtomicReference<JSpinner> spinner, int value){
        spinner.get().setEditor(new JSpinner.DefaultEditor(spinner.get()));
        JSpinner.DefaultEditor defaultEditor = (JSpinner.DefaultEditor) spinner.get().getEditor();
        defaultEditor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);
        spinner.get().setValue(value);
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
