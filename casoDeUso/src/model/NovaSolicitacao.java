package model;

public class NovaSolicitacao extends Status{
	
//	private Object Solicitacao;

	public void solicitar() {
			solicitacao.status = new AguardandoChefia();
		
	}

	public void aprovar() {
		throw new IllegalStateException("Esta solicitacao ainda nao pode ser aprovada!");
		
	}

	
	public void recusar() {
		throw new IllegalStateException("Esta solicitacao ainda nao pode ser aprovada!");
				
	}

	
	public void retornar(String mot) {
		throw new IllegalStateException("Esta solicitacao ainda nao pode ser aprovada!");
	
		
	}
	

}
