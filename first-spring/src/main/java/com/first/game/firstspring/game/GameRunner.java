package com.first.game.firstspring.game;

public class GameRunner {
	private GamingConsole game;

	public GameRunner (GamingConsole game) {

		this.game = game;
	}
	
	public void run() {
		
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
