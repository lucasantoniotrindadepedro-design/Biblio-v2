package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static final String USER = "postgres";
	private static final String PASS = "1234";

	private static DBConnection instance;
	private Connection connection;
	
	private DBConnection() {
		try {
			this.connection = DriverManager.getConnection(
			"jdbc:postgresql://localhost:5432/Livros",USER,PASS	
			);
		} catch (SQLException e) {
			throw new RuntimeException("Não conectou", e);
		};
	}
	
	public Connection getConnection() {
		return this.connection;
	};
	
	public static DBConnection getInstance() {
		if (instance == null) {
		synchronized (DBConnection.class) 
		{
		if (instance == null) {
		instance = new DBConnection();
				}
		
			}	
	
		}
		
		return instance;
	}
	
}
