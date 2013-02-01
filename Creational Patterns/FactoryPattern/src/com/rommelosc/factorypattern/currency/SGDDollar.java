package com.rommelosc.factorypattern.currency;

/*
 * Concrete SGD class
 * */
public class SGDDollar implements Currency{

	@Override
	public String getSymbol() {
		return "SGD";
	}

}
