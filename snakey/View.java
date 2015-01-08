package snakey;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class View extends JPanel {

	// Tilesize =30x30
	static String width = JOptionPane.showInputDialog(null,
			"Angiv banens bredde", "Le ver rose avec des cerises",
			JOptionPane.PLAIN_MESSAGE);

	static String height = JOptionPane.showInputDialog(null,
			"Angiv banens højde", "Le ver rose avec des cerises",
			JOptionPane.PLAIN_MESSAGE);

	public static int n = Integer.parseInt(width) * 20;
	public static int m = Integer.parseInt(height) * 20;
	
	

	public static void main(String[] args) {

		JFrame f = new JFrame("Le ver rose qui mange des cerises");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HighScore p = new HighScore();
		f.add(p);
		f.setSize(n + 5 * 40, m);
		f.setVisible(true);

	}

}