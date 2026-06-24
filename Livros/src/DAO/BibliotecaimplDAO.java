package DAO;

import java.sql.*;
import entidade.Biblioteca;

public class BibliotecaimplDAO implements BibliotecaDAO {

	@Override
	public void salvar(Biblioteca b) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "INSERT INTO biblioteca(id_biblioteca,nome,endereco,telefone) VALUES(?,?,?,?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setLong(1, b.getIdBiblioteca());
		stmt.setString(2, b.getNome());
		stmt.setString(3, b.getEndereco());
		stmt.setString(4, String.valueOf(b.getTelefone()));
		stmt.executeUpdate();
		
		System.out.println("Deu Certo salvar");
		conn.close();
	}

	@Override
	public void atualizar(Biblioteca b) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "UPDATE TABLE biblioteca SET nome = ?,endereco = ?, telefone = ? WHERE id_biblioteca = ?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, b.getNome());
		stmt.setString(2, b.getEndereco());
		stmt.setString(3, String.valueOf(b.getTelefone()));
		stmt.setString(4, String.valueOf(b.getIdBiblioteca()));
		stmt.executeUpdate();
		
	}
	
	

	@Override
	public Biblioteca ler(int idBiblioteca) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "SELECT * FROM biblioteca WHERE id_biblioteca = ?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setLong(1, idBiblioteca);
		
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()) {
			Biblioteca Biblioteca = new Biblioteca();
			
			Biblioteca.setNome(rs.getString("nome"));
			Biblioteca.setEndereco(rs.getString("endereco"));
			Biblioteca.setIdBiblioteca(rs.getInt("id_biblioteca"));
			Biblioteca.setTelefone("telefone");
			
			System.out.print(Biblioteca.toString());
			
			return Biblioteca;	
			
			
			
		} else {
			return null;
		}
		
	}

	@Override
	public void deletar(int idBiblioteca) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "DELETE FROM biblioteca WHERE=?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setLong(1, idBiblioteca);
	}

}
