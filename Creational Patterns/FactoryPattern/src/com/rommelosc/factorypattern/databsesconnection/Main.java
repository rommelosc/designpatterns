package com.rommelosc.factorypattern.databsesconnection;

import java.util.Scanner;

/**
 * @author Alexys Lozada
 * <a href="http://www.youtube.com/watch?annotation_id=annotation_568521&feature=iv&src_vid=WnOVW2Yrqss&v=i6EOpt5lg7U">
 * Patrones de Diseño Cap 04 - FABRICA Y FABRICA ABSTRACTA
 * <a>
 * */
public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a database type:");
		String type = in.next();
		
		Connection connection = ConnectionFactory.createConnection(type);
		System.out.println("Starting connection...");
		System.out.println(connection.description());
		
	}
	
}
