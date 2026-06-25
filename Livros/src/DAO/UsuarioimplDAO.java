package DAO;

import entidade.Usuario;
import java.sql.*;

public class UsuarioimplDAO implements UsuarioDAO {
	
	

	@Override
	public void salvar(Usuario u) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "INSERT INTO usuario(id_usuario,nome,cpf,email,telefone,data_cadastro) VALUES(?,?,?,?,?,?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setLong(1, u.getId());
		stmt.setString(2, u.getNome());
		stmt.setLong(3, u.getCpf());
		stmt.setString(4, u.getEmail());
		stmt.setLong(5, u.getTelef());
		stmt.setString(6,String.valueOf(u.getDataCadastro()));
		stmt.executeUpdate();
		
		conn.close();
	}

	@Override
	public void atualizar(Usuario u) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "UPDATE usuario SET nome = ?, cpf = ?, email = ?, telefone = ? WHERE id_usuario = ? ";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, u.getNome());
		stmt.setLong(2, u.getCpf());
		stmt.setString(3, u.getEmail());
		stmt.setLong(4, u.getTelef());
		stmt.setLong(5, u.getId());
		stmt.executeUpdate();
		
		
	}

	@Override
	public Usuario ler(int id) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "SELECT * FROM usuario WHERE=?";
		sql = sql.replaceFirst("\\?", String.valueOf(id));
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setLong(1, id);
		
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()) {
			Usuario Usuario = new Usuario();
			
			Usuario.setNome(rs.getString("nome"));
			Usuario.setCpf(rs.getInt("cpf"));
			Usuario.setDataCadastro(rs.getDate("data_cadastro"));
			Usuario.setEmail(rs.getString("email"));
			Usuario.setId(rs.getInt("id_usuario"));
			Usuario.setTelef(rs.getInt("telefone"));
			
			
			System.out.println(Usuario.toString());
			
			return Usuario;	
			
			
			
		} else {
			return null;
		}
	}

	@Override
	public void deletar(int id) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "DELETE FROM usuario WHERE id_usuario=?";
		sql = sql.replaceFirst("\\?", String.valueOf(id));
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setLong(1, id);
	}

}
