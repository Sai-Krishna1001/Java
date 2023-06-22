package com.java.gui.dragdrop;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	DragPanel dragPanel = new DragPanel();
	
	MyFrame(){
		
		this.add(dragPanel);
		this.setTitle("Drag & Drop demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setVisible(true);
		
	}
}
