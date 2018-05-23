package model;

public class AguardandoChefia extends Status {

	public void solicitar() {
		throw new IllegalStateException("Esta solicitacao esta aguardando a chefia!");
	}

	public void aprovar() {
		solicitacao.status = new AguardandoRH();
	}

	public void recusar() {
		solicitacao.status = new Recusada();
	}

	public void retornar(String mot) {
		throw new IllegalStateException("Esta solicitacao esta aguardando a chefia!");
	}

	

}
