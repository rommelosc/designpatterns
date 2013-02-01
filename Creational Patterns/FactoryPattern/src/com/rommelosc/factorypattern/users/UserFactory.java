package com.rommelosc.factorypattern.users;

public class UserFactory {

	public static User createUser(String role){
		
		if( role.equalsIgnoreCase("admin") ){
			return new AdminUser();
		}
		else if( role.equalsIgnoreCase("standard")){
			return new StandardUser();
		}
		
		throw new IllegalArgumentException("No such user");
		
	}
		
}
