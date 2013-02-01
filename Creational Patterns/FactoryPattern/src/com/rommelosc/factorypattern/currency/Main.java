package com.rommelosc.factorypattern.currency;

import java.util.Scanner;

/**
 * @author 
 * 
 * <a href="http://javarevisited.blogspot.mx/2011/12/factory-design-pattern-java-example.html">
 * What is Factory method Design Pattern in Java with Example - Tutorial
 * <a>
 * 
 * */
public class Main {
	public static void main(String ... args){

		Scanner in = new Scanner(System.in);
		System.out.println("Give me a country:");
		String country = in.next();
		
		Currency currency = CurrencyFactory.createCurrency(country);
		System.out.println(currency.getSymbol());
		
	}
}
