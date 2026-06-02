package DAO;

import java.sql.SQLException;

import entidade.Emprestimo;

public interface EmprestimoDAO {

	void salvar(Emprestimo e) throws SQLException;
	
	void atualizar(Emprestimo e) throws SQLException;
	
	Emprestimo ler(int id_emprestimo) throws SQLException;
	
	void deletar(int id_emprestimo) throws SQLException;
	
	
}
