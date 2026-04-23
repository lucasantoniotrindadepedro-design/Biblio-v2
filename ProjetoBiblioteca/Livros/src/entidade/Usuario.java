package entidade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	public int id;
    public String nome;	
    public String email;
    public int telef;
    public int cpf;
    public LocalDate dataCadastro;
    public List<Emprestimo> emprestimo;

    // Construtor completo
    public Usuario(int id, String nome, String email, int telef, int cpf, LocalDate dataCadastro) {
    	this.id = id;
        this.nome = nome;
        this.email = email;
        this.telef = telef;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
        this.emprestimo = new ArrayList<>();
    }
    public List<Emprestimo> getEmprestimo(){
    	return this.emprestimo;
    }

    public void adicionarEmprestimo(Emprestimo e1) {
    	 this.emprestimo.add(e1);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelef() {
        return telef;
    }

    public void setTelef(int telef) {
        this.telef = telef;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}