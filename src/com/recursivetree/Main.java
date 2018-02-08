package com.recursivetree;

import java.awt.Dimension;
import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		System.out.println("Recursive tree");
		
		RecursiveTree tree = new RecursiveTree(800, 700, 50, 10);
		Dimension windowSize = new Dimension(1600, 1200);
		
		EventQueue.invokeLater(() -> {
			AppWindow window = new AppWindow(windowSize, "Recursive Tree Graphic Application");
			window.add(tree);
		});
		
	}

}
