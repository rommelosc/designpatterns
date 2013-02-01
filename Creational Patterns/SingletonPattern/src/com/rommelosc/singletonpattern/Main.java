package com.rommelosc.singletonpattern;

/**
 * @author Oscar Romero
 * */
public class Main {

	public static void main(String ... args){
		
		DataBase dataBase = DataBase.getInstance();
		dataBase.create();
		dataBase.read();
		dataBase.upadte();
		dataBase.delete();
		
		DataBase dataBaseTwo = DataBase.getInstance();
		dataBaseTwo.upadte();
		
		DataBase dataBaseThree = DataBase.getInstance();
		DataBase dataBaseFour = DataBase.getInstance();
		DataBase dataBaseFive = DataBase.getInstance();
		DataBase dataBaseSix = DataBase.getInstance();
		DataBase dataBaseSeven = DataBase.getInstance();
		
	}
	
}
