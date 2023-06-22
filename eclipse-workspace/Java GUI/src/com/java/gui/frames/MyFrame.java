package com.java.gui.frames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame(){
		
		this.setTitle("Jframe Title Goes Here"); // sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of application
		this.setSize(420,420); //sets the X-dimension and Y-dimension this
		this.setVisible(true); // make this visible
		
		ImageIcon image = new ImageIcon("images/twitter.png"); //create an ImageIcon
		this.setIconImage(image.getImage()); //change icon of this
		
		this.getContentPane().setBackground(new Color(0x123456)); //change color of background
		
	}
}
