package com.firstspringproject.learn_spring_framework;

import com.firstspringproject.learn_spring_framework.game.GameRunner;
import com.firstspringproject.learn_spring_framework.game.MarioGame;
import com.firstspringproject.learn_spring_framework.game.PacManGame;
import com.firstspringproject.learn_spring_framework.game.SuperContraGame;

//Example for tight & loose coupling where we used interface to make tightly coupled code into loosely coupled.
public class App01GamingBasicJava {

	public static void main(String[] args) {

		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();
		
		var gameRunner = new GameRunner(game);
		gameRunner.run();


	}

}
