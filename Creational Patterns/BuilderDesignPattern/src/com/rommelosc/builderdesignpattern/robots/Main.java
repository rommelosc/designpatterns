package com.rommelosc.builderdesignpattern.robots;

import java.util.Scanner;


/**
 * @author Alexys Lozada
 * <a href="http://youtu.be/pHr01mluNVU">
 * Patrones de Diseño Cap 05 - BUILDER
 * </a>
 * */
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Builder builder = new Builder();
		Robot robot;
		RobotEnum tipoRobot = null;
		
		System.out.println("Digite el tipo de robot que desea");
		
		int  i = 0;
		for(RobotEnum r: RobotEnum.values()){
			System.out.println(++i +". "+r.toString());
		}
			
		int intTipoRobot = in.nextInt();
		for(RobotEnum r: RobotEnum.values()){
			if( r.index == intTipoRobot ){
				tipoRobot = r;
			}
		}
		
		
		// Utilizando builder design pattern
		builder.setRobot(tipoRobot);
		builder.addRevisar();
		builder.addImposible();
		builder.addGetIngredientes();
		builder.addArmar();
		builder.addRevisar();
	
		robot = builder.getRobot();
		robot.trabajar();
		
	}
	
}
