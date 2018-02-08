package com.recursivetree;

import java.awt.Dimension;
import javax.swing.JFrame;

public class AppWindow extends JFrame{
	
	private final Dimension size;
	private final String title;
	
	public AppWindow(Dimension size, String title){
		this.size = size;
		this.title = title;
		setWindowAttribs();
	}
	
	private void setWindowAttribs() {
		setTitle(title);
		setSize(size);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
