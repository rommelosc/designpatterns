package com.rommelosc.factorypattern.users;

public class StandardUser implements User{

	@Override
	public void login() {
		System.out.println("Hiding cPanel, I'm an ordinary mortal");
	}

}
