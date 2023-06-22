package com.java.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		// JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon icon = new ImageIcon("images/gimp-icon.png");
		
		JLabel label = new JLabel();
		label.setText("Hello");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(0,0,75,75);
		
		JPanel redPanel =  new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(null);
		
		
		JPanel bluePanel =  new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(null);
		
		JPanel greenPanel =  new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.getContentPane().setBackground(new Color(0x123456));
		frame.setVisible(true);
		
		bluePanel.add(label);
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		

	}

}
