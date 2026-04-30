package DAO;

import entidade.Emprestimo;

public interface EmprestimoDAO {

	void salvar(Emprestimo e);
	
	void atualizar(Emprestimo e);
	
	void ler(int id_emprestimo);
	
	void deletar(int id_emprestimo);
	
	
}
