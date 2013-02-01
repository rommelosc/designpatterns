package com.rommelosc.factorypattern.databsesconnection;

public class PostgreSQLConnection implements Connection{

	@Override
	public String description() {
		return "PostgreSQL Connection";
	}

}
