package com.rommelosc.factorypattern.currency;

/*
 * Concrete Rupee class
 * */
public class Rupee implements Currency{

	@Override
	public String getSymbol() {
		return "Rs";
	}

}
