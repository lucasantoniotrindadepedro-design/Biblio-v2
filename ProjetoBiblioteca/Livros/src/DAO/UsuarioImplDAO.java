package DAO;

import entidade.Usuario;

public class UsuarioImplDAO implements UsuarioDAO {
	
	

	@Override
	public void salvar(Usuario u) {
		String sql = "INSERT INTO usuario(id_usuario,nome,cpf,email,telefone,data_cadastro) VALUES(?,?,?,?,?,?)";
		
		sql = sql.replaceFirst("\\?", String.valueOf(u.nome) );
		sql = sql.replaceFirst("\\?", "" + u.cpf + "" + "" + "");
		sql = sql.replaceFirst("\\?",  ""  + "" + u.email + "" + "");
		sql = sql.replaceFirst("\\?",   "" + "" + "" + u.telef + "");
		sql = sql.replaceFirst("\\?", String.valueOf(u.dataCadastro));

	}

	@Override
	public void atualizar(Usuario u) {
		String sql = "UPDATE TABLE usuario SET nome = ?, cpf = ?, email = ?, telefone = ? WHERE id_usuario = ? ";
		
		sql = sql.replaceFirst("\\?", String.valueOf(u.nome)); 
		sql = sql.replaceFirst("\\?", String.valueOf("" + u.cpf + "" + "" + ""));
		sql = sql.replaceFirst("\\?", String.valueOf("" + "" + u.email + "" + ""));
		sql = sql.replaceFirst("\\?", String.valueOf("" + "" + "" + u.telef + ""));
		sql = sql.replaceFirst("\\?", String.valueOf(u.id)); 
	}

	@Override
	public Usuario ler(int id) {
		String sql = "SELECT * FROM usuario WHERE=?";
		sql = sql.replaceFirst("\\?", String.valueOf(id));
		
		return new Usuario();
	}

	@Override
	public void deletar(int id) {
		String sql = "DELETE FROM usuario WWHERE id_usuario=?";
		sql = sql.replaceFirst("\\?", String.valueOf(id));
	}

}
