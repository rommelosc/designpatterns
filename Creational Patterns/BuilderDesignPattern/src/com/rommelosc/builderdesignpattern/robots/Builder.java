package com.rommelosc.builderdesignpattern.robots;

import java.util.ArrayList;
import java.util.List;

public class Builder {

	private Robot robot;
	private List<AccionEnum>acciones;
	
	public Builder() {
		acciones = new ArrayList<AccionEnum>();
	}
	
	public void setRobot(RobotEnum tipoRobot) {
		
		switch (tipoRobot) {
		case HAMBURGUESA:
			robot = new RobotHamburguesa();
			break;
		case HOTDOG:
			robot = new RobotHotDog();
			break;
		default:
			throw new IllegalArgumentException("Ese tipo de robots no existe");
		}
		
	}
	
	public void addGetIngredientes(){
		acciones.add(AccionEnum.OBTENER_INGREDIENTES);
	}
	
	public void addArmar() {
		acciones.add(AccionEnum.ARMAR);
	}
	
	public void addRevisar() {
		acciones.add(AccionEnum.REVISAR);
	}
	
	public void addImposible() {
		acciones.add(AccionEnum.IMPOSIBLE);
	}
	
	public Robot getRobot() {
		robot.cargarAcciones(acciones);
		return robot;
	}
}
