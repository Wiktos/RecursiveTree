package com.recursivetree;

import java.awt.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Recursive tree");
		
		RecursiveTree tree = new RecursiveTree(700, 600, 50, 10);
		Dimension windowSize = new Dimension(1600, 800);

		DrawControllPanel controllPanel = new DrawControllPanel(new Dimension(400, 1200));

		EventQueue.invokeLater(() -> {
			AppWindow window = new AppWindow(windowSize, "Recursive Tree Graphic Application");
			window.setLayout(null);
			window.add(tree);
			tree.setBounds(300, 0, window.getWidth() - 300, window.getHeight());
			window.add(controllPanel);
			controllPanel.setBounds(20, 20, 300, 200);
		});
		
	}

}
