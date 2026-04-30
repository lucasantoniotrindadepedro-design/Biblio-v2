package DAO;

import entidade.Biblioteca;

public class BibliotecaimplDAO implements BibliotecaDAO {

	@Override
	public void salvar(Biblioteca b) {
		String sql = "INSERT INTO biblioteca(id_biblioteca,nome,endereco,telefone) VALUES(?,?,?,?)";
		
		sql = sql.replaceFirst("\\?", String.valueOf(b.getIdBiblioteca()) + "" + "" + "");
		sql = sql.replaceFirst("\\?", "" + String.valueOf(b.getNome()) + "" + "");
		sql = sql.replaceFirst("\\?", "" + "" + String.valueOf(b.getEndereco()) + "");
		sql = sql.replaceFirst("\\?", "" + "" + "" + String.valueOf(b.getTelefone()));
		
	}

	@Override
	public void atualizar(Biblioteca b) {
		String sql = "UPDATE TABLE biblioteca SET nome = ?,endereco = ?, telefone = ? WHERE id_biblioteca = ?";
		
		sql = sql.replaceFirst("\\?", "" + String.valueOf(b.getNome()) + "" + "");
		sql = sql.replaceFirst("\\?", "" + "" + String.valueOf(b.getEndereco()) + "");
		sql = sql.replaceFirst("\\?", "" + "" + "" + String.valueOf(b.getTelefone()));
		sql = sql.replaceFirst("\\?", "" + "" + "" + String.valueOf(b.getIdBiblioteca()));
	}

	@Override
	public void ler(int idBiblioteca) {
		String sql = "SELECT * FROM biblioteca WHERE=?";
		
		sql = sql.replaceFirst("\\?", String.valueOf(idBiblioteca));
		
	}

	@Override
	public void deletar(int idBiblioteca) {
		String sql = "DELETE FROM biblioteca WHERE=?";
		
		sql = sql.replaceFirst("\\?", String.valueOf(idBiblioteca));
	}

}
