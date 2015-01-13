package snake.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import snake.model.Model;

public class GamePanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int cell;
	private Model model;
	
	public GamePanel(Model model) {
		this.model = model;
		this.setBackground(new Color(0, 0, 30));
		this.setPreferredSize(new Dimension(500,500));//same size of window, different scaling depending on input
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//finding greatest common divisor to make sure the field of the track is squared
		int panelWidthPixels = this.getWidth();
		int panelHeightPixels = this.getHeight();
		int maxcellWidth = panelWidthPixels / model.getTrack().getN();
		int maxcellHeight = panelHeightPixels / model.getTrack().getM();

		cell = Math.min(maxcellHeight, maxcellWidth);
		
		// painting Track to show where to play if you chose to play on a non-square track
				for (int j = 0; j <= model.getTrack().getM(); j++) {
					for(int i=0; i <=model.getTrack().getN(); i++){

					g.setColor(new Color(0, 150, 30));
					g.fillRect(0, 0, model.getTrack().getN()*cell,
							model.getTrack().getM()*cell);
						}
				}
		
		//painting apple
		g.setColor(Color.RED);
		g.fillRect(model.getApple().getColumnApple()*cell, model.getApple().getRowApple()*cell, cell, cell);
		g.setColor(Color.GREEN);// fancy apple
		g.fillRect(model.getApple().getColumnApple()*cell+5, model.getApple().getRowApple()*cell+5, cell-10, cell-10);
		
		//painting snake
		for(int i = 0; i < model.getSnake().getSnakeList().size(); i++){
			g.setColor(Color.BLACK);		
			g.fillRect(model.getSnake().getSnakeList().get(i).getColumn()*cell, model.getSnake().getSnakeList().get(i).getRow()*cell, cell, cell);
			g.setColor(Color.YELLOW);
			g.fillRect(model.getSnake().getSnakeList().get(i).getColumn()*cell+5, model.getSnake().getSnakeList().get(i).getRow()*cell+5, cell-10, cell-10);
			
		}
		
	}
}