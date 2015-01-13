package snake.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import snake.model.Direction;
import snake.model.Model;
import snake.view.View;

public class Key implements KeyListener {

	private Model model;
	private View view;
	private boolean right = false, left = true, up = false, down = false; // starting
																			// to
																			// the
																			// left

	public Key(Model model, View view) {
		this.model = model;
		this.view = view;

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode(); // declares key codes as 'key' so no key
									// numbers are needed to be remembered

		if (model.getSnake().isAlive()) { //while snake is alive, you can control it
			if (key == KeyEvent.VK_RIGHT && !left) { // making sure it can't
														// move into itself
				up = false;
				down = false;
				right = true;
				model.requestNewDirection(Direction.RIGHT); // calling movement															// methods
				model.move();
				Controller.stop();
				view.repaint();
			}

			if (key == KeyEvent.VK_LEFT && !right) {
				up = false;
				down = false;
				left = true;
				model.requestNewDirection(Direction.LEFT);
				model.move();
				Controller.stop();
				view.repaint();
			}

			if (key == KeyEvent.VK_UP && !down) {
				up = true;
				right = false;
				left = false;
				model.requestNewDirection(Direction.UP);
				model.move();
				Controller.stop();
				view.repaint();
			}

			if (key == KeyEvent.VK_DOWN && !up) {
				down = true;
				right = false;
				left = false;
				model.requestNewDirection(Direction.DOWN);
				model.move();
				Controller.stop();
				view.repaint();
			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}