package model;

public class AguardandoRH extends Status {

	public void solicitar() {
		throw new IllegalStateException("Esta solicitacao esta aguardando RH!");
	}

	public void aprovar() {
		solicitacao.status = new Aprovado();
	}

	public void recusar() {
		solicitacao.status = new Recusada();
	}

	public void retornar(String mot) {
		if (mot == null || mot.isEmpty()) {
			throw new IllegalArgumentException("Motivo não informado");
		}
		solicitacao.setObservacao(mot);
		solicitacao.status = new AguardandoChefia();
		
	}

}
