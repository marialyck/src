package snakey;

import java.util.Random;

public class Apple {

	private int xApple, yApple;
	private Field field;
	private Random r;

	public Apple(Field field) {
		this.field = field;
		placeApple();
	}

	public void placeApple() {
		xApple = r.nextInt(field.getRow());
		yApple = r.nextInt(field.getColumn());
	}

	public int getxApple() {
		return xApple;
	}

	public void setxApple(int xApple) {
		this.xApple = xApple;
	}

	public int getyApple() {
		return yApple;
	}

	public void setyApple(int yApple) {
		this.yApple = yApple;
	}

}
