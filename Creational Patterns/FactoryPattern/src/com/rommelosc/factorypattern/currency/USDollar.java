package com.rommelosc.factorypattern.currency;

/*
 * Concrete USDollar class
 * */
public class USDollar implements Currency {

	@Override
	public String getSymbol() {
		return "USD";
	}
	
}
