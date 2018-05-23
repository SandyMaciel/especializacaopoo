package model;

public class Recusada extends Status {


	
	public void solicitar() {
		throw new IllegalStateException("Esta solicitacao ja esta recusada!");
	}

	
	public void aprovar() {
		throw new IllegalStateException("Esta solicitacao ja esta recusada!");
	}

	
	public void recusar() {
		solicitacao.status = new Recusada();
	}

	
	public void retornar(String mot) {
		throw new IllegalStateException("Esta solicitacao ja esta recusada!");
	//	return null;
	}

}
