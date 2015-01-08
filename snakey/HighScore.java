package snakey;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import snakey.View;

public class HighScore extends View{
	
	public void paintComponent (Graphics g) {
		super.paintComponent (g);
		
		
		g.setColor(Color.BLACK);
		g.fillRect(n, 0, n+5*40,m);
}
}