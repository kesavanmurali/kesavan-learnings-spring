package com.kesavan.spring;

import com.kesavan.spring.diwithspring.ConstructorInjectingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		ConstructorInjectingController constructorController = (ConstructorInjectingController)context.getBean("constructorInjectingController");
		System.out.println(constructorController.getGreetings());
	}

}
