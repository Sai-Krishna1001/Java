package com.java.gui.mouselistener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{

	JLabel label;
	
	ImageIcon smile;
	ImageIcon nervous;
	ImageIcon pain;
	ImageIcon dizzy;
	
	public MyFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500,500);
		
		smile = new ImageIcon("images/smile.png");
		nervous = new ImageIcon("images/nervous.png");
		pain = new ImageIcon("images/pain.png");
		dizzy = new ImageIcon("images/dizzy.png");
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
//		label.setBackground(Color.red);
//		label.setOpaque(true);
		label.setIcon(dizzy);
		label.addMouseListener(this);
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		//System.out.println("You clicked the mouse");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when the mouse button has been pressed on a component
		System.out.println("You pressed the mouse");
		//label.setBackground(Color.yellow);
		label.setIcon(smile);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when the mouse button has been released on a component
		System.out.println("You released the mouse");
		//label.setBackground(Color.green);
		label.setIcon(nervous);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		System.out.println("You entered the component");
		//label.setBackground(Color.blue);
		label.setIcon(pain);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		System.out.println("You exited the component");
		//label.setBackground(Color.red);
		label.setIcon(dizzy);
		
	}
}
