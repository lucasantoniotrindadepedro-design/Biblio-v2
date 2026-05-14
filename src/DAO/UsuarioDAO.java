package DAO;

import entidade.Usuario;

public interface UsuarioDAO {
	void salvar(Usuario u);
	
	void atualizar(Usuario u);
	
	Usuario ler(int id);
	
	void deletar(int id);

}
