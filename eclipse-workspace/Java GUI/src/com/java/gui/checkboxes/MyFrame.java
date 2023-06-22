package com.java.gui.checkboxes;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton submit;
	JCheckBox checkBox;
	ImageIcon cancel;
	ImageIcon checked;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		submit = new JButton();
		submit.setText("Submit");
		submit.addActionListener(this);
		
		cancel = new ImageIcon("images/cancel.png");
		//Image scaleImage = cancel.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)
		checked = new ImageIcon("images/checked.png");
		
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
		checkBox.setIcon(cancel);
		checkBox.setSelectedIcon(checked);
		
				
		this.add(checkBox);
		this.add(submit); 
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == submit) {
			System.out.println(checkBox.isSelected());
		}
	}


}
