package com.java.gui.joptionpane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// JOptionPane = 	Pop up a standard dialog box that prompts users for a value
		// 					or informs them of something.
		
//		JOptionPane.showMessageDialog(null, "This is some useless Info", "plainMsg",JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Here is more usefless Info", "Info",JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Really?", "Question",JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "You're computer has A VIRUS", "Warning",JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Call tech Support Now or Else", "Error",JOptionPane.ERROR_MESSAGE);
		
//		int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even Code","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
//		System.out.println("answer: " + answer);
		
//		String name = JOptionPane.showInputDialog("What is your name?:");
//		System.out.println("Hello, " + name);
		
		String[] responses = {"No, You're Awesome!", "Thank You!", "*Blash*"};
		ImageIcon icon = new ImageIcon("images/smile.png");
		JOptionPane.showOptionDialog(
				null, 
				"You're Awesome",
				"Secret Msg",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, 
				icon,
				responses,
				0);
		
	}
	

}
