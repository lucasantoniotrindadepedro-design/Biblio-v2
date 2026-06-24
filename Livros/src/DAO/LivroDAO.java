package DAO;

import java.sql.SQLException;

import entidade.Livro;

public interface LivroDAO {

	void salvar(Livro l) throws SQLException;
	
	void atualizar(Livro l) throws SQLException;
	
	Livro ler(int id) throws SQLException;
	
	void deletar(int id) throws SQLException;
	
	
	
}
