package com.rommelosc.factorypattern.databsesconnection;

public class MySQLConnection implements Connection{

	@Override
	public String description() {
		return "MySQL Connection";
	}

}
