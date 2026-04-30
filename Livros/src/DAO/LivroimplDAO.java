package DAO;

import entidade.Livro;

public class LivroimplDAO implements LivroDAO {

	@Override
	public void salvar(Livro u) {
	String sql = "INSERT INTO livro (id_livro,título,autor,genero,numero_paginas,status,id_biblioteca) VALUES(?,?,?,?,?,?,?)";
	
	sql = sql.replaceFirst("\\?", String.valueOf(u.getId_livro()));
	sql = sql.replaceFirst("\\?", String.valueOf("" + u.getTitulo() + "" + ""  + "" + "" + ""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+u.getAutor()+""+""+""+""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+""+u.getGenero()+""+""+""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+""+""+u.getPaginas()+""+""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+""+""+""+u.getStatus()+""));
	sql = sql.replaceFirst("\\?", String.valueOf(""+""+""+""+""+""+""));
	}

	@Override
	public void atualizar(Livro u) {
		
		
	}

	@Override
	public Livro ler(int id) {
		return null;
		
	}

	@Override
	public void deletar(int id) {
		
		
	}
	
	

}
