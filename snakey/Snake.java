package snakey;

import java.util.LinkedList;

public class Snake {

	private LinkedList<Field> snake;

	private boolean isAlive = true;

	private Track track;
	private int n;
	private int m;

	private Apple apple;

	public Snake(int n, int m) {
		this.n = track.getWidth();
		this.m = track.getHeight();
		snake = new LinkedList<Field>();
		snake.addFirst(new Field(n / 2, m / 2));
		snake.addLast(new Field(n / 2 + 1, m / 2));
	}

	public void move(Direction d) {

		for (int i = 0; i < snake.size(); i++) { // end game!
			if (snake.getFirst() == snake.get(snake.size())) { // if the head is
																// colliding
																// with its body
																// the game
																// stops
				if (i != snake.size() - 1) { // checks that head doesn't collide
												// with head
					isAlive = false;
				}
			}
		}

		if (d == Direction.LEFT) {
			snake.addFirst(new Field(getHead().getColumn() - 1, getHead()
					.getRow()));
			if (!appleEaten()) {
				snake.removeLast();
			}
			if (snake.getFirst().getColumn() <= 0) {
				snake.getFirst().setColumn(n);

			}
		}

		if (d == Direction.RIGHT) {
			snake.addFirst(new Field(getHead().getColumn() + 1, getHead()
					.getRow()));
			if (!appleEaten()) {
				snake.removeLast();
			}
			if (snake.getFirst().getColumn() >= n) {
				snake.getFirst().setColumn(0);

			}
		}

		if (d == Direction.UP) {
			snake.addFirst(new Field(getHead().getColumn(),
					getHead().getRow() - 1));
			if (!appleEaten()) {
				snake.removeLast();
			}
			if (snake.getFirst().getRow() <= 0) {
				snake.getFirst().setRow(m);

			}
		}

		if (d == Direction.DOWN) {
			snake.addFirst(new Field(getHead().getColumn(),
					getHead().getRow() + 1));
			if (!appleEaten()) {
				snake.removeLast();
			}
			if (snake.getFirst().getRow() >= m) {
				snake.getFirst().setRow(0);
			}
		}

		
	}

	public Field getHead() {
		return snake.getFirst();
	}

	public boolean isAlive() {
		return isAlive;
	}

	public boolean appleEaten() {
		if (snake.getFirst().getRow() == apple.getxApple()
				&& snake.getFirst().getColumn() == apple.getyApple()) {
			apple.placeApple();
			return true;
		}
		return false;
	}

	/*
	 * public void placeSnake() { Point head = new Point(field.getWidth()/2,
	 * field.getHeight()/2); snake.add(head); Point tail = new
	 * Point(field.getWidth()/2+1, field.getHeight()/2); snake.addLast(tail);
	 * 
	 * }
	 */

}
