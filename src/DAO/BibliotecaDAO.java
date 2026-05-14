package DAO;

import java.sql.SQLException;

import entidade.Biblioteca;

public interface BibliotecaDAO {
	void salvar(Biblioteca b) throws SQLException;
	
	void atualizar(Biblioteca b) throws SQLException;
	
	void ler(int idBiblioteca) throws SQLException;
	
	void deletar(int idBiblioteca) throws SQLException;
}
