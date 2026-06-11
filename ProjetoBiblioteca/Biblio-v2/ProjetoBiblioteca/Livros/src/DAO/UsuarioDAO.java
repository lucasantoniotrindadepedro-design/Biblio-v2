package DAO;

import java.sql.SQLException;

import entidade.Usuario;

public interface UsuarioDAO {
	void salvar(Usuario u) throws SQLException;
	
	void atualizar(Usuario u) throws SQLException;
	
	Usuario ler(int id) throws SQLException;
	
	void deletar(int id) throws SQLException;

}
