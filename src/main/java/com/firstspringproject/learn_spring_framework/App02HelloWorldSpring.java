package com.firstspringproject.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.firstspringproject.learn_spring_framework.game.GameRunner;
import com.firstspringproject.learn_spring_framework.game.MarioGame;
import com.firstspringproject.learn_spring_framework.game.PacManGame;
import com.firstspringproject.learn_spring_framework.game.SuperContraGame;

//Example for tight & loose coupling where we used interface to make tightly coupled code into loosely coupled.
public class App02HelloWorldSpring {

	public static void main(String[] args) {

		//Launch Spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println("Hello " + context.getBean("name"));
	}

}
