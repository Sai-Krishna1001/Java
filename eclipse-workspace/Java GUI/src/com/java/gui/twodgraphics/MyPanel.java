package com.java.gui.twodgraphics;

import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel {

	Image image;
	
	MyPanel(){
		
		image = new ImageIcon("images/sky.jpeg ").getImage();
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(image, 0, 0, null);
		
		g2D.setStroke(new BasicStroke(5));
		//g2D.setPaint(Color.blue);
		//g2D.drawLine(0, 0, 500, 500);
		
//		g2D.drawRect(50, 50, 200, 100);
//		g2D.fillRect(50, 50, 200, 100);
		
//		g2D.setPaint(Color.orange);
//		g2D.drawOval(10, 10, 100, 100);
//		g2D.fillOval(10,10, 100, 100);
		
//		g2D.setPaint(Color.red);
//		g2D.drawArc(100, 100, 200, 100, 0, 270);
//		g2D.fillArc(100, 100, 200, 100, 0, 270);
		
//		int[] xPoints = {150,200,250};
//		int[] yPoints = {300,150,300};
//		g2D.setPaint(Color.yellow);
//		//g2D.drawPolygon(xPoints,yPoints,3);		
//		g2D.fillPolygon(xPoints,yPoints,3);		
		
		g2D.setPaint(Color.magenta);
		g2D.setFont(new Font("Ink Free",Font.BOLD,50));
		g2D.drawString("U R A Winner! :)", 100, 100);
		
		
		
		
	}
		
}
