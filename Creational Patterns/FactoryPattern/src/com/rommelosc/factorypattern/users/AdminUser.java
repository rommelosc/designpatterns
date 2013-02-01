package com.rommelosc.factorypattern.users;

public class AdminUser implements User{

	@Override
	public void login() {
		System.out.println("Show cPanel, I'm an admin!");	
	}

}
