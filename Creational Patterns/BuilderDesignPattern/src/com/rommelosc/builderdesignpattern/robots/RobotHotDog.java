package com.rommelosc.builderdesignpattern.robots;

import java.util.List;

public class RobotHotDog implements Robot{

	private List<AccionEnum>acciones;
	
	public RobotHotDog() {
	}
	
	private void start(){
		System.out.println("Iniciando el Hotdog");
	}
	
	private void getParts(){
		System.out.println("Buscando: Pan, Salchicha, Salsas");
	}
	
	private void build(){
		System.out.println("Armando el Hotdog");
	}
	
	private void check(){
		System.out.println("Revisando el proceso");
	}
	
	private void finish() {
		System.out.println("Proceso terminado");
	}
	
	@Override
	public void cargarAcciones(List<AccionEnum> acciones) {
		this.acciones = acciones;	
	}
	
	@Override
	public void trabajar() {
		
		start();
		
		for(AccionEnum accion: acciones){
			switch (accion) {
			case OBTENER_INGREDIENTES:
				getParts();
				break;
			case TRABAJAR:
				build();
				break;
			case REVISAR:
				check();
				break;
			default:
				System.out.println("Esa acción no la puedo realizar");
				break;
			}
		}
		
		finish();
	}

}
