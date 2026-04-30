package DAO;

import entidade.Livro;

public interface LivroDAO {

	void salvar(Livro u);
	
	void atualizar(Livro u);
	
	Livro ler(int id);
	
	void deletar(int id);
	
	
	
}
