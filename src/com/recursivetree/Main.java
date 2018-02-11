package com.recursivetree;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;

public class Main {


	public static void main(String[] args) {

		Dimension windowSize = new Dimension(1600, 800);
        DrawControlPanel controlPanel = new DrawControlPanel(new Dimension(300, windowSize.height));
        RecursiveTree tree = new RecursiveTree(700, 650, 50, 10);

		EventQueue.invokeLater(() -> {
            AppWindow window = new AppWindow(windowSize, "Recursive Tree Graphic Application");
			addChangeListeners(window, controlPanel, new AtomicReference<>(tree));
			buildWindowLayout(window, tree, controlPanel);
		});
		
	}

	private static void buildWindowLayout(AppWindow window, JComponent... components){
        window.setLayout(null);
        window.add(components[0]);
        components[0].setBounds(300, 0, window.getWidth() - 300, window.getHeight());
        window.add(components[1]);
        components[1].setBounds(10, 20, 300, 200);
    }

	private static void addChangeListeners(AppWindow window, ControlPanel controlPanel, AtomicReference<RecursiveTree> tree){
		controlPanel.getXSpinner().addChangeListener(new SpinnerChangeListener(window, controlPanel, tree));
		controlPanel.getYSpinner().addChangeListener(new SpinnerChangeListener(window, controlPanel, tree));
		controlPanel.getLineLengthSpinner().addChangeListener(new SpinnerChangeListener(window, controlPanel, tree));
		controlPanel.getDepthSpinner().addChangeListener(new SpinnerChangeListener(window, controlPanel, tree));
	}

}
