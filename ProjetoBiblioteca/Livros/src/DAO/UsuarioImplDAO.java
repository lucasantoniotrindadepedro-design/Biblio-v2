package DAO;

import entidade.Usuario;

public class UsuarioimplDAO implements UsuarioDAO {
	
	

	@Override
	public void salvar(Usuario u) {
		String sql = "INSERT INTO usuario(id_usuario,nome,cpf,email,telefone,data_cadastro) VALUES(?,?,?,?,?,?)";
		
		sql = sql.replaceFirst("\\?", String.valueOf(u.getNome()) );
		sql = sql.replaceFirst("\\?", "" + u.getCpf() + "" + "" + "");
		sql = sql.replaceFirst("\\?",  ""  + "" + u.getEmail() + "" + "");
		sql = sql.replaceFirst("\\?",   "" + "" + "" + u.getTelef() + "");
		sql = sql.replaceFirst("\\?", String.valueOf(u.getDataCadastro()));

	}

	@Override
	public void atualizar(Usuario u) {
		String sql = "UPDATE TABLE usuario SET nome = ?, cpf = ?, email = ?, telefone = ? WHERE id_usuario = ? ";
		
		sql = sql.replaceFirst("\\?", String.valueOf(u.getNome())); 
		sql = sql.replaceFirst("\\?", String.valueOf("" + u.getCpf() + "" + "" + ""));
		sql = sql.replaceFirst("\\?", String.valueOf("" + "" + u.getEmail() + "" + ""));
		sql = sql.replaceFirst("\\?", String.valueOf("" + "" + "" + u.getTelef() + ""));
		sql = sql.replaceFirst("\\?", String.valueOf(u.getId())); 
	}

	@Override
	public Usuario ler(int id) {
		String sql = "SELECT * FROM usuario WHERE=?";
		sql = sql.replaceFirst("\\?", String.valueOf(id));
		
		return new Usuario();
	}

	@Override
	public void deletar(int id) {
		String sql = "DELETE FROM usuario WHERE id_usuario=?";
		sql = sql.replaceFirst("\\?", String.valueOf(id));
	}

}
