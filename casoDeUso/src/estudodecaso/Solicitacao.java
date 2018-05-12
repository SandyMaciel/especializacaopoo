package estudodecaso;

import java.util.Date;

public class Solicitacao {
	Funcionario funcionario;
	Date inicio;
	Date termino;
	String motivo;
	String observacao;
	Status status = new NovaSolicitacao();
	
	
	public void solicitar() {
		status.solicitar();
	}
	
	public void aprovar() {
		status.aprovar();
	}
	
	public void recusar() {
		status.recusar();		
	}
	
	public String retornar(String motivo) {
		
		return status.retornar(motivo);
	}

}