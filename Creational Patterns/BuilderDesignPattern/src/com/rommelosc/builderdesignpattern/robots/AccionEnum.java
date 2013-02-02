package com.rommelosc.builderdesignpattern.robots;

public enum AccionEnum {

	TRABAJAR("Trabajando"),
	OBTENER_INGREDIENTES("Obteniendo ingredientes"),
	ARMAR("Armando"),
	REVISAR("Revisando el proceso"),
	TERMINAR("Terminando"),
	IMPOSIBLE("Imposible");
	
	private AccionEnum(String descripcion) {
		this.descripcion = descripcion;
	}
	
	private String descripcion;
		
	@Override
	public String toString(){
		return descripcion;
	}
	
}
