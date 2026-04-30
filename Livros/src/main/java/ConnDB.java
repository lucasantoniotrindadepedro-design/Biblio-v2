package main.java;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnDB {
	
	
	private static final String URL = "jdbc:postgresql://localhost:5432/Livros";
	private static final String USER = "postgres";
	private static final String PASS = "1234";
	
	public static Connection conectar() throws Exception {
		return DriverManager.getConnection(URL,USER,PASS);
	}
	
	public static void main(String[] args) throws Exception {
		Connection con = conectar();
		System.out.println("Conexão DU CARALHO!");
		con.close();
		}
}
