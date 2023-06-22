package com.java.gui.buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("images/gimp-icon.png");
		ImageIcon icon2 = new ImageIcon("images/Emoji-Weird-Out-icon.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150,250,150,150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100,100,250,100);
		button.addActionListener(this);
		button.setText("I'm a button!");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-10);
		button.setForeground(new Color(123,50,250));
		button.setBackground(new Color(250,250,0));
		button.setBorder(BorderFactory.createLineBorder(Color.red,3));
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.getContentPane().setBackground(new Color(0x123456));
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			//System.out.println("poo");
			//button.setEnabled(false); //click button only once
			label.setVisible(true);
		}
	}
}
