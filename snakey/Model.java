package snakey;

public class Model {

	// private LinkedList<Point> snake;

	protected int x;
	protected int y;

	// private int xBody, yBody;

	// private Snake snakeCoor = new Snake(xBody,yBody);

	private Apple apple;
	private Snake snakePlacement;
	private int size = 2; // number of blocks in the beginning of the game
	private int tileSize = 20; // size of blocks of snake
	private Track track;
	private Field field;
	private int n = track.getWidth();
	private int m = track.getHeight();

	public Model() {
		field = new Field(n, m);
		apple = new Apple(field);

	}

	/*
	 * public void initialize(){//place apple and snake apple.placeApple();
	 * snakePlacement.placeSnake();
	 * 
	 * }
	 */
}
