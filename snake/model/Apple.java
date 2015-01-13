package snake.model;

import java.util.Random;

public class Apple {

	private int rowApple, columnApple;
	private Model model;
	private Random r = new Random();

	public Apple(Model model) {
		this.model = model;
		placeApple();
	}
	
	public void placeApple() {
		rowApple = r.nextInt(model.getTrack().getM());
		columnApple = r.nextInt(model.getTrack().getN());
	}

	public int getRowApple() {
		return rowApple;
	}

	public void setRowApple(int rowApple) {
		this.rowApple = rowApple;
	}

	public int getColumnApple() {
		return columnApple;
	}

	public void setColumnApple(int columnApple) {
		this.columnApple = columnApple;
	}

}
