package model;

import java.util.Date;

public class Solicitacao {
	private Funcionario funcionario;
	private Date inicio;
	private Date termino;
	private String motivo;
	private String observacao;
	
	
	protected Status status = new NovaSolicitacao();
	
	
	
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getTermino() {
		return termino;
	}

	public void setTermino(Date termino) {
		this.termino = termino;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Status getStatus() {
		return status;
	}

//	public void setStatus(Status status) {
//		this.status = status;
//	}

	public void solicitar() {
		status.setSolicitacao(this).solicitar();
		Repositorio.getInstance().add(this).persistAll();
	}
	
	public void aprovar() {
		status.setSolicitacao(this).aprovar();
		Repositorio.getInstance().add(this).persistAll();
//	throw new UnsupportedOperationException();
	
	}
	
	public void recusar() {
		status.setSolicitacao(this).recusar();
		Repositorio.getInstance().add(this).persistAll();
	}
	
	public void retornar(String motivo) {
		status.setSolicitacao(this).retornar(motivo);
		Repositorio.getInstance().add(this).persistAll();
	}

}