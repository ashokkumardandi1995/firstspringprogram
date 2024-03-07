package com.first.game.firstspring;

import com.first.game.firstspring.game.GameRunner;
import com.first.game.firstspring.game.GamingConsole;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSecondGame {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);){
//			context.getBean(GamingConsole.class).down();
			context.getBean(GameRunner.class).run();
		}
		
	}

}
