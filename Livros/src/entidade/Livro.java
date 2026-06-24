package entidade;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	private int id_livro;
    private String titulo;
    private int paginas;
    private String status;
    private String genero;
    private String autor;
    private int id_biblioteca;
	private List<Emprestimo> emprestimo;

    // Construtor completo
    public Livro(int id_livro, String titulo, int paginas, String genero, String autor){
        this.id_livro = id_livro;
    	this.titulo = titulo;
        this.paginas = paginas;
        this.genero = genero;
        this.autor = autor;
        this.emprestimo = new ArrayList<>();
    }
    
    public Livro() {
    	
    }
    
    public List<Emprestimo> getEmprestimo(){
    	return this.emprestimo;
    }

    public void adicionarEmprestimo(Emprestimo e1) {
    	this.emprestimo.add(e1);
    }
    	
    public String getNome() {
        return titulo;
    }

    public void setNome(String nome) {
        this.titulo = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId_livro() {
		return id_livro;
	}
	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
	}
	public int getId_biblioteca() {
		return id_biblioteca;
	}
	public void setId_biblioteca(int id_biblioteca) {
		this.id_biblioteca = id_biblioteca;
	}
}