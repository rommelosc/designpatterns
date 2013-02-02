package com.rommelosc.builderdesignpattern.robots;

import java.util.List;


public interface Robot {
	
	public void trabajar();
	
	public void cargarAcciones(List<AccionEnum> acciones);

}
