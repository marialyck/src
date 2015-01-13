package snake.model;

import javax.swing.JOptionPane;

public class Track {

	public int n; // size of width and the track
	public int m;
	

	

	public Track() {
		this.n=0;
		this.m=0;
		
		while (n < 5 || n > 100 || m < 5 || m > 100) {
			String width = JOptionPane.showInputDialog(null,
					"Angiv antal felter til banens bredde (min 5, max 100)",
					"Snake", JOptionPane.PLAIN_MESSAGE);
			String height = JOptionPane.showInputDialog(null,
					"Angiv antal felter til banens højde (min 5, max 100)",
					"Snake", JOptionPane.PLAIN_MESSAGE);
			this.n = Integer.parseInt(width);
			this.m = Integer.parseInt(height);
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

}

