package com.rommelosc.factorypattern.databsesconnection;

public class ConnectionFactory {
	
	
	public static Connection createConnection(String type){
		
		if( type.equalsIgnoreCase("Oracle")){
			return new OracleConnection();
		}
		else if( type.equalsIgnoreCase("mysql")){
			return new MySQLConnection();
		}
		else if( type.equalsIgnoreCase("postgresql")){
			return new PostgreSQLConnection();
		}
		
		throw new IllegalArgumentException("No such type");
	}
}
