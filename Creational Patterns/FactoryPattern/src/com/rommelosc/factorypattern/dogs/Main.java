package com.rommelosc.factorypattern.dogs;

/**
 * @author
 * <a href="http://alvinalexander.com/java/java-factory-pattern-example">
 * A Java Factory Pattern example
 * </a>
 *   
 * */
public class Main {

	public static void main(String[] args) {

		// create a small dog
		Dog dog = DogFactory.createDog("small");
		dog.speak();

		// create a big dog
		dog = DogFactory.createDog("big");
		dog.speak();

		// create a working dog
		dog = DogFactory.createDog("working");
		dog.speak();

	}

}
