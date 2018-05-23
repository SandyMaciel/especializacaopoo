package model;

public class Aprovado extends Status {

	
	public void solicitar() {
		throw new IllegalStateException("Esta solicitacao ja esta aprovada!");
	}

	
	public void aprovar() {
		solicitacao.status = new Aprovado();
	}

	
	public void recusar() {
		throw new IllegalStateException("Esta solicitacao ja esta aprovada!");
	}

	
	public void retornar(String mot) {
		throw new IllegalStateException("Esta solicitacao ja esta aprovada!");
	//	return null;
	}

}
