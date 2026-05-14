package DAO;

import entidade.Emprestimo;

public class EmprestimoimplDAO implements EmprestimoDAO {

	@Override
	public void salvar(Emprestimo e) {
		String sql = "INSERT INTO emprestimo(id_emprestimo,id_usuario,id_livro,id_biblioteca,data_emprestimo,data_prevista_devolucao,data_devolucao,status_emprestimo) VALUES(?,?,?,?,?,?,?,?)";
		
		sql = sql.replaceFirst("\\?", String.valueOf(e.getIdEmprestimo()) + "" + "" + "" + "" + "" + "" + "");
		sql = sql.replaceFirst("\\?", "" + String.valueOf(e.getIdUsuario()) + "" + "" + "" + "" + "" + "");
		sql = sql.replaceFirst("\\?", "" + "" + String.valueOf(e.getIdLivro()) + "" + "" + "" + "" + "");
		sql = sql.replaceFirst("\\?", "" + "" + "" + String.valueOf(e.getIdBiblioteca()) + "" + "" + "" + "");
		sql = sql.replaceFirst("\\?", "" + "" + "" + "" + String.valueOf(e.getDataEmprestimo()) + "" + "" + "");
		sql = sql.replaceFirst("\\?", "" + "" + "" + "" + "" + String.valueOf(e.getDataPrevistaDevolucao()) + "" + "");
		sql = sql.replaceFirst("\\?", "" + "" + "" + "" + "" + "" + String.valueOf(e.getDataDevolucao()) + "");
		sql = sql.replaceFirst("\\?", "" + "" + "" + "" + "" + "" + "" + String.valueOf(e.getStatusEmprestimo()));
	}

	@Override
	public void atualizar(Emprestimo e) {
		String sql = "UPDATE TABLE emprestimo SET id_emprestimo = ?, id_usuario = ?, id_livro = ?, id_biblioteca = ?, data_emprestimo = ?, data_prevista_devolucao = ?, data_devolucao = ?, status_emprestimo = ?";
		
		sql = sql.replaceFirst("\\?", "" + "" + "" + "" + "" + "" + "" + String.valueOf(e.getIdEmprestimo()));
		sql = sql.replaceFirst("\\?", String.valueOf(e.getIdUsuario()) + "" + "" + "" + "" + "" + "" + "");
		sql = sql.replaceFirst("\\?",  "" + String.valueOf(e.getIdLivro()) + "" + "" + "" + "" + "" + "");
		sql = sql.replaceFirst("\\?", "" + "" + String.valueOf(e.getIdBiblioteca()) + "" + "" + "" + "" + "");
		sql = sql.replaceFirst("\\?",  "" + "" + "" + String.valueOf(e.getDataEmprestimo()) + "" + "" + "" + "");
		sql = sql.replaceFirst("\\?",  "" + "" + "" + "" + String.valueOf(e.getDataPrevistaDevolucao()) + "" + "" + "");
		sql = sql.replaceFirst("\\?",  "" + "" + "" + "" + "" + String.valueOf(e.getDataDevolucao()) + "" + "");
		sql = sql.replaceFirst("\\?",  "" + "" + "" + "" + "" + "" + String.valueOf(e.getStatusEmprestimo()) + "");
	}

	@Override
	public void ler(int id_emprestimo) {
		String sql = "SELECT * FROM emprestimo WHERE = ?";
		sql = sql.replaceFirst("\\?",String.valueOf(id_emprestimo));
		
	
	}

	@Override
	public void deletar(int id_emprestimo) {
		String sql = "DELETE FROM emprestimo WHERE = ?";
		sql = sql.replaceFirst("\\?",String.valueOf(id_emprestimo));
		
	}
	
	
	

}
