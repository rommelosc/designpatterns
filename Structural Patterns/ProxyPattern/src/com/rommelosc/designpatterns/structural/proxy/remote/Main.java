package com.rommelosc.designpatterns.structural.proxy.remote;

/**
 * @author Alexys Lozada
 * <a href="http://youtu.be/kyY-5--C4HU">
 * Patrones de Diseño Cap 07 - PROXY
 * </a>
 * 
 * Proxy Design Pattern Usage in Java API: java.rmi.* package 
 * 
 * A remote proxy provides a local representative for an object in a different 
 * address space.Providing interface for remote resources such as web service or REST resources.
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		PersonProxy person;
		
		person = new PersonProxy();
		person.greeting();
		person.sayState();
		person.sayGoodbye();
		
	}
	
}
