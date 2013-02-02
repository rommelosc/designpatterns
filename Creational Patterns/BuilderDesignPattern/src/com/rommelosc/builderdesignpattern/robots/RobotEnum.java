package com.rommelosc.builderdesignpattern.robots;

public enum RobotEnum {

	HAMBURGUESA(1),
	HOTDOG(2);
	
	private RobotEnum(int index) {
		this.index = index;
	}
	
	public int index;
	
}
