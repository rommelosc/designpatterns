package com.rommelosc.prototypepattern.figuras;

public class Cuadrado implements Figura{

	private String nombre;
	private int posicionX;
	private int posicionY;
	
	public Cuadrado() {
	}
	
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void mover(int x, int y) {
		this.posicionX = x;
		this.posicionY = y;
	}

	@Override
	public void getPosicion() {
		System.out.println("Cuadrado en x; "+this.posicionX);
		System.out.println("Cuadrado en y: "+this.posicionY);
	}

	@Override
	public Figura clonar() {
		Figura figura = new Cuadrado();
		figura.setNombre(this.nombre);
		figura.mover(this.posicionX, this.posicionY);
		return figura;
	}

}
