package DAO;

import entidade.Livro;

public class LivroimplDAO implements LivroDAO {

	@Override
	public void salvar(Livro l) {
	String sql = "INSERT INTO livro (id_livro,título,autor,genero,numero_paginas,status,id_biblioteca) VALUES(?,?,?,?,?,?,?)";
	
	sql = sql.replaceFirst("\\?", String.valueOf(l.getId_livro()));
	sql = sql.replaceFirst("\\?", String.valueOf("" + l.getTitulo() + "" + ""  + "" + "" + ""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+l.getAutor()+""+""+""+""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+""+l.getGenero()+""+""+""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+""+""+l.getPaginas()+""+""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+""+""+""+l.getStatus()+""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+""+""+""+""+""));
	}

	@Override
	public void atualizar(Livro l) {
	String sql = "UPDATE livro SET  título = ?, autor = ?, genero = ?, numero_paginas = ?, status = ?, id_biblioteca = ? WHERE id_livro = ? ";
		
	sql = sql.replaceFirst("\\?", String.valueOf(l.getTitulo() + "" + ""  + "" + "" + "" + ""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+l.getAutor()+""+""+""+""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+""+l.getGenero()+""+""+""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+""+""+l.getPaginas()+""+""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+""+""+""+l.getStatus()+""));
	}

	@Override	
	public Livro ler(int id) {
		return null;
		
	}

	@Override
	public void deletar(int id) {
		
		
	}
	
	

}