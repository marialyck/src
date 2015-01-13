package snake.model;

import java.util.LinkedList;

public class Snake {

	private LinkedList<Field> snakeList;

	@SuppressWarnings("unused")
	private boolean isAlive = true;
	private Direction d;

	private int score;

	private Model model;

	public Snake(Model model) {
		this.model = model;
		snakeList = new LinkedList<Field>();
		snakeList.addFirst(new Field(model.getTrack().getM() / 2, model.getTrack().getN() / 2));
		snakeList.addLast(new Field(model.getTrack().getM() / 2, model.getTrack().getN() / 2 + 1));
		
	}

	public LinkedList<Field> getSnakeList() {
		return snakeList;
	}

	public void setSnakeList(LinkedList<Field> snakeList) {
		this.snakeList = snakeList;
	}

	public void changeDirection(Direction d) {
		this.d = d;
	}

	public void move() {

		if (d == Direction.LEFT) {
			Field oldHead = getHead();
			snakeList.addFirst(new Field(oldHead.getRow(),
					oldHead.getColumn() - 1));
			if (snakeList.getFirst().getColumn() < 0) { // torus effect
				snakeList.getFirst().setColumn(model.getTrack().getN() - 1);

			}
			if (!appleEaten()) {
				snakeList.removeLast();
			}

		}

		if (d == Direction.RIGHT) {
			Field oldHead = getHead();
			snakeList.addFirst(new Field(oldHead.getRow(),
					oldHead.getColumn() + 1));
			if (snakeList.getFirst().getColumn() >= model.getTrack().getN()) {
				snakeList.getFirst().setColumn(0);

			}
			if (!appleEaten()) {
				snakeList.removeLast();
			}

		}

		if (d == Direction.UP) {
			Field oldHead = getHead();
			snakeList.addFirst(new Field(oldHead.getRow() - 1, oldHead
					.getColumn()));
			if (snakeList.getFirst().getRow() < 0) {
				snakeList.getFirst().setRow(model.getTrack().getM() - 1);

			}
			if (!appleEaten()) {
				snakeList.removeLast();
			}

		}

		if (d == Direction.DOWN) {
			Field oldHead = getHead();
			snakeList.addFirst(new Field(oldHead.getRow() + 1, oldHead
					.getColumn()));
			if (snakeList.getFirst().getRow() >= model.getTrack().getM()) {
				snakeList.getFirst().setRow(0);
			}
			if (!appleEaten()) {
				snakeList.removeLast();
			}

		}
	}

	public Field getHead() {
		return snakeList.getFirst();
	}

	public boolean isAlive() {
		for (int i = 1; i < snakeList.size(); i++) { // end game!
			if (snakeList.getFirst().equals(snakeList.get(i))) { // if the head
																	// is
																	// colliding
																	// with its
																	// body
																	// the game
				return false; // stops
			}
		}
		return true;
	}

	public boolean appleEaten() {
		if (snakeList.getFirst().getColumn() == model.getApple().getColumnApple()
				&& snakeList.getFirst().getRow() == model.getApple().getRowApple()) {
			score();
			while (isSnakeHere()) { // will always place an apple where there is
									// no snake
				model.getApple().placeApple();
			}
			return true;
		}
		return false;
	}

	public boolean isSnakeHere() { // method for checking if apples can spawn
		for (int i = 0; i < snakeList.size(); i++) {
			if (model.getApple().getColumnApple() == snakeList.get(i).getColumn()
					&& model.getApple().getRowApple() == snakeList.get(i).getRow()) {
				return true;
			}
		}
		return false;
	}

	public int score() {
		if ((snakeList.getFirst().getColumn() == model.getApple().getColumnApple() && snakeList
				.getFirst().getRow() == model.getApple().getRowApple())) {
			score++;
		}
		return score;
	}
}
