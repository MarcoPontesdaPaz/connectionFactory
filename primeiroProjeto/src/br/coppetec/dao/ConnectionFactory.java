package br.coppetec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	/**
	 * retorna uma conexão
	 */	
	public Connection getConnection() {
		
		try {

			return DriverManager.getConnection("jdbc:sqlserver://146.164.65.214:1433;databasename=COPPETEC;user=sa;password=segredo.3#;encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2;");
			
		} catch (SQLException	e) {
			
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}