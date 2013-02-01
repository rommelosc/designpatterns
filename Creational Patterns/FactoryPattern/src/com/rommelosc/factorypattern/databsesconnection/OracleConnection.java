package com.rommelosc.factorypattern.databsesconnection;

public class OracleConnection implements Connection{

	@Override
	public String description() {
		return "Oracle connection";
	}

}
