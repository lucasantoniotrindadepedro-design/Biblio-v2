package entidade;

import java.sql.Date;

public class Emprestimo {

	private int idBiblioteca;
    private int idEmprestimo;
    private int idUsuario;
    private int idLivro;
    private Date dataEmprestimo;
    private Date dataPrevistaDevolucao;
    private Date dataDevolucao;
    private String statusEmprestimo;

    // Construtor completo
    public Emprestimo(int idBiblioteca, int idEmprestimo, int idUsuario,int idLivro,Date dataEmprestimo,Date dataPrevistaDevolucao,Date dataDevolucao,String statusEmprestimo) {
        this.idBiblioteca = idBiblioteca;
    	this.idEmprestimo = idEmprestimo;
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
        this.dataDevolucao = dataDevolucao;
        this.statusEmprestimo = statusEmprestimo;
    }


	public Emprestimo() {
		// TODO Auto-generated constructor stub
	}


	public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date date) {
        this.dataEmprestimo = date;
    }

    public Date getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(Date date) {
        this.dataPrevistaDevolucao = date;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date date) {
        this.dataDevolucao = date;
    }

    public String getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(String statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }

	public int getIdBiblioteca() {
		return idBiblioteca;
	}

	public void setIdBiblioteca(int idBiblioteca) {
		this.idBiblioteca = idBiblioteca;
	}
}