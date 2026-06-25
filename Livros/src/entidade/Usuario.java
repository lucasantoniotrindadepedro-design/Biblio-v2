package entidade;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private int id;
	private String nome;	
	private String email;
	private int telef;
	private int cpf;
	private Date dataCadastro;
	private List<Emprestimo> emprestimo;

	@Override
	public String toString() {
	    return "Usuario{" +
	            "id=" + id +
	            ", nome='" + nome + '\'' +
	            ", email='" + email + '\'' +
	            ", telef=" + telef +
	            ", cpf=" + cpf +
	            ", dataCadastro=" + dataCadastro +
	            ", emprestimo=" + emprestimo +
	            '}';
	}
	
    // Construtor completo
    public Usuario(int id, String nome, String email, int telef, int cpf, Date dataCadastro) {
    	this.id = id;
        this.nome = nome;
        this.email = email;
        this.telef = telef;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
        this.emprestimo = new ArrayList<>();
    }
    public Usuario() {
		// TODO Auto-generated constructor stub
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date date) {
        this.dataCadastro = date;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}