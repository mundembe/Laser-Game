package com.main;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends Canvas{

	private static final long serialVersionUID = -2111860594941368902L;

	public Window(int WIDTH, int HEIGHT, String title, Game game) {
		JFrame frame = new JFrame("Laser Walls");
				
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.add(game);
		game.start();
	}
	
}
