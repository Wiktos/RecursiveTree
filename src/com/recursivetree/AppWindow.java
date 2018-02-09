package com.recursivetree;

import java.awt.Dimension;
import javax.swing.JFrame;

public class AppWindow extends JFrame{
	
	private final Dimension size;
	private final String title;

	public AppWindow(Dimension size, String title){
	    if(!isProperSize(size))
	        throw new IllegalArgumentException("Size is too small");

		this.size = size;
		this.title = title;
		setWindowAttribs();
	}

	private boolean isProperSize(Dimension size){
		return size.width >= 1200 && size.height >= 800;
	}
	
	private void setWindowAttribs() {
		setTitle(title);
		setSize(size);
		setLocationByPlatform(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
