package main.java;

import entidade.*;

import java.sql.*;

import DAO.*;

public class App {
	public static void main(String[] args) throws SQLException {
		
	 Biblioteca b = new Biblioteca(1,"Teste","Rua 1","7721963958");
	 
	 BibliotecaDAO bDAO = new BibliotecaimplDAO();
	 
	 bDAO.ler(1);
	};
}