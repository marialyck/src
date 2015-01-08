package snakey;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class View extends JPanel {
	static String width = JOptionPane.showInputDialog(null,
			"Angiv banens bredde", "Le ver rose avec des cerises",
			JOptionPane.PLAIN_MESSAGE);
	
	static String height = JOptionPane.showInputDialog(null,
			"Angiv banens højde", "Le ver rose avec des cerises",
			JOptionPane.PLAIN_MESSAGE);
	
	public static int row = Integer.parseInt(width)*10;
	public static int column = Integer.parseInt(height)*10;


	public void Field() {

		JFrame f = new JFrame("Le ver rose qui mange des cerises");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HighScore p = new HighScore();
		f.add(p);
		f.setSize(row + 5 * 40, column);
		f.setVisible(true);

	}

}