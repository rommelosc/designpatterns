package com.rommelosc.prototypepattern.figuras;

import java.util.Scanner;

/**
 * @author Alexys Lozada
 * <a href="http://youtu.be/3qJdehZ2Y9U">
 * Patrones de Diseño Cap 06 - PROTOTIPO
 * </a>
 * 
 * Prototype Design Pattern Usage in Java API: interface Cloneable 
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		Cuadrado cuadrado = new Cuadrado();
		
		circulo.setNombre("Mi circulo");
		circulo.mover(12,  34);
		
		cuadrado.setNombre("Mi cuadrado");
		cuadrado.mover(200, 200);
		
		System.out.println("Estas son las figuras originales:");
		System.out.println("\tCirculo: "+circulo.getNombre());
		System.out.println("\tCuadrado: "+cuadrado.getNombre());
		System.out.println("Estas son las posiciones originales: ");
		circulo.getPosicion();
		cuadrado.getPosicion();
		
		Scanner in = new Scanner(System.in);
		Figura figura = null;
		int opcion;
		int posX;
		int posY;
		
		System.out.println("1. Circulo \n2. Cuadrado");
		opcion = in.nextInt();
		
		switch (opcion) {
		case 1:
			figura = circulo.clonar();
			break;
		case 2:
			figura = cuadrado.clonar();
			break;
		default:
			break;
		}
		
		figura.setNombre(figura.getNombre() + " clonado");
		System.out.println("Digite la nueva posición en X: ");
		posX = in.nextInt();
		System.out.println("Digite la nueva posición en y: ");
		posY = in.nextInt();
		figura.mover(posX, posY);
				
		System.out.println("Esta es la figura clonada:");
		System.out.println(figura.getNombre());
		System.out.println("Esta es la posición:");
		figura.getPosicion();
		
		System.out.println("Estas son las figuras originales:");
		System.out.println("\tCirculo: "+circulo.getNombre());
		System.out.println("\tCuadrado: "+cuadrado.getNombre());
		System.out.println("Estas son las posiciones originales: ");
		circulo.getPosicion();
		cuadrado.getPosicion();
	}
	
}
