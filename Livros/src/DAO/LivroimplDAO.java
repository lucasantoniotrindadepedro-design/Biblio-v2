package DAO;

import entidade.Livro;
import java.sql.*;

public class LivroimplDAO implements LivroDAO {

	@Override
	public void salvar(Livro l) throws SQLException {
	Connection conn = DBConnection.getInstance().getConnection();
	String sql = "INSERT INTO livro (id_livro,título,autor,genero,numero_paginas,status,id_biblioteca) VALUES(?,?,?,?,?,?,?)";
	
	PreparedStatement stmt = conn.prepareStatement(sql);
	stmt.setLong(1, l.getId_livro());
	stmt.setString(2, l.getTitulo());
	stmt.setString(3, l.getAutor());
	stmt.setString(4, l.getGenero());
	stmt.setLong(5, l.getPaginas());
	stmt.setString(6, l.getStatus());
	stmt.setLong(7, l.getId_biblioteca());
	
	stmt.executeUpdate();
	}

	@Override
	public void atualizar(Livro l) throws SQLException {
	Connection conn = DBConnection.getInstance().getConnection();	
	String sql = "UPDATE livro SET  título = ?, autor = ?, genero = ?, numero_paginas = ?, status = ?, id_biblioteca = ? WHERE id_livro = ? ";
		
	PreparedStatement stmt = conn.prepareStatement(sql);
	stmt.setString(1, l.getTitulo());
	stmt.setString(2, l.getAutor());
	stmt.setString(3, l.getGenero());
	stmt.setLong(4, l.getPaginas());
	stmt.setString(5, l.getStatus());
	}

	@Override	
	public Livro ler(int id) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "SELECT * FROM livro WHERE id_livro = ?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setLong(1, id);
		
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()) {
			Livro l = new Livro();
			
			l.setId_livro((int) rs.getLong("id_livro"));
			l.setId_biblioteca((int) rs.getLong("id_biblioteca"));
			l.setAutor(rs.getString("autor"));
			l.setGenero(rs.getString("genero"));
			l.setNome(rs.getString("nome"));
			l.setPaginas((int) rs.getLong("numero_paginas"));
			l.setStatus(rs.getString("status"));
			l.setTitulo(rs.getString("título"));
			
			System.out.println(l.toString());
			
			return l;
			
		} else {
			return null;
		}
		
	}

	@Override
	public void deletar(int id) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "DELETE FROM livro WHERE=?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setLong(1, id);
		
	}
	
	

}