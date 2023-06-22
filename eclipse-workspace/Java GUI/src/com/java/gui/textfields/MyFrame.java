package com.java.gui.textfields;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton submitButton;
	JTextField textField;
	JLabel label;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.PLAIN,25));
		textField.setForeground(new Color(0x00ff00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		//textField.setText("username");
		
		
		label = new JLabel("Enter Your Name:");
		
		this.add(label);
		this.add(textField);
		this.add(submitButton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == submitButton) {
			
			System.out.println("Welcome " + textField.getText());
			submitButton.setEnabled(false);
			textField.setEditable(false);
		}
	}

}
