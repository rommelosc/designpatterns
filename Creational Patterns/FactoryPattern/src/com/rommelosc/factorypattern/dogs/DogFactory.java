package com.rommelosc.factorypattern.dogs;

public class DogFactory {

	public static Dog createDog(String criteria){
		
		if( criteria.equalsIgnoreCase("small") ){
			return new Poodle();
		}
		else if( criteria.equalsIgnoreCase("big") ){
			return new Rottweiler();
		}
		else if( criteria.equalsIgnoreCase("working") ){
			return new SiberianHusky();
		}
		
		throw new IllegalArgumentException("No criteria matches");
	}
	
}
