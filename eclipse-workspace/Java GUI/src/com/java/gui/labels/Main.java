package com.java.gui.labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("images/twitter.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel(); //create a label 
		label.setText("Bro, do you even code?"); //set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of ImageIcon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of ImageIcon
		label.setForeground(new Color(0x00ff00)); //set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font of text
		label.setIconTextGap(-25); //set gap of text to image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); //display background color
		label.setBorder(border); // set border line
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
		//label.setBounds(100, 100, 350, 350); // set x,y position within frame as well as dimensions
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(800,800);
		//frame.setLayout(null);
		frame.setVisible(true);
		
		frame.add(label);
		frame.pack(); 
	}

}
