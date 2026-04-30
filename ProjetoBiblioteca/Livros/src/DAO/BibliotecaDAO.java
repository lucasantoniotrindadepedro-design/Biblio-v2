package DAO;

import entidade.Biblioteca;

public interface BibliotecaDAO {
	void salvar(Biblioteca b);
	
	void atualizar(Biblioteca b);
	
	void ler(int idBiblioteca);
	
	void deletar(int idBiblioteca);
}
