package entidade;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    private int idBiblioteca;
    private String nome;
    private String endereco;
    private String telefone;
    private List<Livro> livros;
    // Construtor
    
    public Biblioteca() {
    	
    };
    public Biblioteca(int idBiblioteca, String nome, String endereco, String telefone) {
        this.idBiblioteca = idBiblioteca;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {

    	return "id=" + idBiblioteca +" nome=" + nome +" endereco=" + endereco +" telefone=" + telefone +"";
    	
    };
    
    public List<Livro> getLivros(){
    	return this.livros;
    }
    
   
    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}