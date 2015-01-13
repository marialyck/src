package snake.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import snake.model.Model;

@SuppressWarnings("serial")
public class View extends JFrame {

	@SuppressWarnings("unused")
	private Model model;

	public View(Model model) {
		super("Snake");
		this.model = model;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new GamePanel(model), BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}