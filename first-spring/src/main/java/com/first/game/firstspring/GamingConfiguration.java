package com.first.game.firstspring;

import com.first.game.firstspring.game.GameRunner;
import com.first.game.firstspring.game.GamingConsole;
import com.first.game.firstspring.game.PackmanGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game(){
		var game = new PackmanGame();
		return game ;
	}
		@Bean
		public GameRunner gamerunner(GamingConsole game){
			var gamerunner = new GameRunner(game);
			return gamerunner ;
	}
	
}
