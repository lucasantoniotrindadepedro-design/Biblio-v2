package DAO;


import entidade.Emprestimo;
import java.sql.*;

public class EmprestimoimplDAO implements EmprestimoDAO {

	@Override
	public void salvar(Emprestimo e) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "INSERT INTO emprestimo(id_emprestimo,id_usuario,id_livro,id_biblioteca,data_emprestimo,data_prevista_devolucao,data_devolucao,status_emprestimo) VALUES(?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setLong(1,e.getIdBiblioteca());
		stmt.setLong(2, e.getIdUsuario());
		stmt.setLong(3, e.getIdLivro());
		stmt.setLong(4, e.getIdBiblioteca());
		stmt.setString(5, String.valueOf(e.getDataEmprestimo()));
		stmt.setString(6, String.valueOf(e.getDataPrevistaDevolucao()));
		stmt.setString(7, String.valueOf(e.getDataDevolucao()));
		stmt.setString(8, String.valueOf(e.getStatusEmprestimo()));
		stmt.executeQuery(sql);
	}

	@Override
	public void atualizar(Emprestimo e) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "UPDATE TABLE emprestimo SET id_emprestimo = ?, id_usuario = ?, id_livro = ?, id_biblioteca = ?, data_emprestimo = ?, data_prevista_devolucao = ?, data_devolucao = ?, status_emprestimo = ?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setLong(1,e.getIdEmprestimo());
		stmt.setLong(2, e.getIdUsuario());
		stmt.setLong(3, e.getIdUsuario());
		stmt.setLong(4, e.getIdLivro());
		stmt.setLong(5, e.getIdBiblioteca());
		stmt.setString(6, String.valueOf(e.getDataEmprestimo()));
		stmt.setString(7, String.valueOf(e.getDataPrevistaDevolucao()));
		stmt.setString(8, String.valueOf(e.getDataDevolucao()));
		stmt.setString(9, String.valueOf(e.getStatusEmprestimo()));
		stmt.executeQuery(sql);
		}

	@Override
	public Emprestimo ler(int id_emprestimo) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "SELECT * FROM emprestimo WHERE = ?";
		sql = sql.replaceFirst("\\?",String.valueOf(id_emprestimo));
		
		PreparedStatement stmt;
		
		stmt = conn.prepareStatement(sql);
		
		stmt.setLong(1, id_emprestimo);
		
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()) {
			Emprestimo e = new Emprestimo();
			
			e.setIdEmprestimo(rs.getInt("id_emprestiomo"));
			e.setIdBiblioteca(rs.getInt("id_biblioteca"));
			e.setIdLivro(rs.getInt("id_livro"));
			e.setIdUsuario(rs.getInt("id_usuario"));
			e.setDataDevolucao(rs.getDate("data_devolucao"));
			e.setDataPrevistaDevolucao(rs.getDate("data_prevista_devolucao"));
			e.setDataEmprestimo(rs.getDate("data_emprestimo"));
			e.setStatusEmprestimo(rs.getString("status_emprestimo"));
			
			System.out.print(e.toString());
			
			return e;	
			
			
			
		} else {
			return null;
		}
	}

	@Override
	public void deletar(int id_emprestimo) throws SQLException {
		Connection conn = DBConnection.getInstance().getConnection();
		String sql = "DELETE FROM emprestimo WHERE = ?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setLong(1, id_emprestimo);
		
		stmt.executeQuery(sql);
	}
	
	
	

}
