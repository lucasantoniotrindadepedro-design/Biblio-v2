package DAO;

import entidade.Livro;

public interface LivroDAO {

	void salvar(Livro l);
	
	void atualizar(Livro l);
	
	Livro ler(int id);
	
	void deletar(int id);
	
	
	
}
