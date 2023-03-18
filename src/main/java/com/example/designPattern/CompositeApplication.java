package com.example.designPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositeApplication.class, args);

		Person michel = new Person("Michel");
		Person cedric = new Person("Cedric");
		Person yoann = new Person("Yoann");
		Person cyril = new Person("Cyril");

		michel.addDescendant(cyril);
		michel.addDescendant(cedric);
		michel.addDescendant(yoann);
		
		cyril.addDescendant(new Person("Sacha"));
		cyril.addDescendant(new Person("Sophia"));

		yoann.addDescendant(new Person("Leo"));

		cedric.addDescendant(new Person("Simon"));
		cedric.addDescendant(new Person("Quentin"));
		cedric.addDescendant(new Person("Noe"));

		michel.sayName();
	}
}
