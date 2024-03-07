package com.first.game.firstspring;

import com.first.game.firstspring.game.GameRunner;
import com.first.game.firstspring.game.MarioGame;
import com.first.game.firstspring.game.PackmanGame;
import com.first.game.firstspring.game.SuperContraGame;

public class AppFirstGame {

	public static void main(String[] args) {

		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PackmanGame();
		var gamerunner = new GameRunner(game);
		gamerunner.run();




	}

}
