package com.rommelosc.builderdesignpattern.robots;

import java.util.List;

public class RobotHamburguesa implements Robot {

	private List<AccionEnum> acciones;

	public RobotHamburguesa() {
	}

	private void iniciar() {
		System.out.println("Iniciando la hamburguesa");
	}

	private void getIngredientes() {
		System.out.println("Buscando: Pan, Hamburguesa, Salsas");
	}

	private void armar() {
		System.out.println("Armando la hamburguesa");
	}

	private void revisar() {
		System.out.println("Revisando el proceso");
	}

	private void terminar() {
		System.out.println("Proceso terminado");
	}

	@Override
	public void trabajar() {

		iniciar();

		for (AccionEnum accion : acciones) {
			switch (accion) {
			case OBTENER_INGREDIENTES:
				getIngredientes();
				break;
			case ARMAR:
				armar();
				break;
			case REVISAR:
				revisar();
				break;

			default:
				System.out.println("Esa acción no la puedo realizar");
				break;
			}
		}
		
		terminar();
	}

	@Override
	public void cargarAcciones(List<AccionEnum> acciones) {
		this.acciones = acciones;
	}

}
