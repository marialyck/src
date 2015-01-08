package snakey;

import java.awt.Color;
import java.awt.Graphics;

import snakey.View;

@SuppressWarnings("serial")
public class HighScore extends View{
	
	public void paintComponent (Graphics g) {
		super.paintComponent (g);
		
		g.setColor(Color.BLACK);
		g.fillRect(row, 0, row+200,column);
		
		g.setColor(Color.YELLOW);
		g.drawString("Current Score",row+60,20);
		
		g.setColor(Color.YELLOW);
		g.drawString("High Score",row+70,60);
		
}
}