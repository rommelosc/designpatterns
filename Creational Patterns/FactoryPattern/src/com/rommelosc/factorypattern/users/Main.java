package com.rommelosc.factorypattern.users;

import java.util.Scanner;

/**
 * @author Oscar Romero
 * */
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a user role: ");
		String role = in.next();
		
		User user = UserFactory.createUser(role);
		user.login();
		
	}
	
}
