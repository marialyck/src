package snake.controller;

import javax.swing.JOptionPane;

import snake.model.Model;
import snake.view.View;

public class Controller {

	public static Model model;
	public static View view;

	public static void main(String[] args) {

		model = new Model();
		view = new View(model);
		view.addKeyListener(new Key(model, view));
	}

	public static void stop() {
		if (!model.getSnake().isAlive()) {
			JOptionPane.showMessageDialog(view,
					"You Lost! #UninstallGame fgt L2P.\nYour noob score: "
							+ model.getSnake().score(), "Ouch!",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
