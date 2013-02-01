package com.rommelosc.singletonpattern;

public final class DataBase {
	
	private static DataBase dataBase = new DataBase();
	
	private DataBase(){
		System.out.println("Creating connection with database...");
	}
	
	public static DataBase getInstance(){ return dataBase; }
	
	public void create(){
		System.out.println("Creating...");
	}
	
	public void read(){
		System.out.println("Reading...");
	}
	
	public void upadte(){
		System.out.println("Updating...");
	}
	
	public void delete(){
		System.out.println("Deleting...");
	}

}
