package test;

import static org.junit.Assert.*;
import org.junit.Test;

import model.Funcionario;
import model.NovaSolicitacao;
import model.Solicitacao;

public class NovaSolicitacaoTest {

	
	@Test(expected = IllegalStateException.class)
	public void testaSolicitar(){
		NovaSolicitacao instacia = new montaCenario();
		instacia.solicitar();		
	}
	
	@Test(expected = IllegalStateException.class)
	public void testaAprovar(){
		NovaSolicitacao instacia = new NovaSolicitacao();
		instacia.aprovar();		
	}
	
	@Test(expected = IllegalStateException.class)
	public void testaRecusar(){
		NovaSolicitacao instacia = new NovaSolicitacao();
		instacia.recusar();		
	}
	
	@Test(expected = IllegalStateException.class)
	public void testaRetornar(){
		NovaSolicitacao instacia = new NovaSolicitacao();
		
		instacia.retornar("motivo");		
	}
	
	@Test
	public void testarEstadoInicial(){
		Solicitacao s = new Solicitacao();
		NovaSolicitacao novaSolicitacao = new NovaSolicitacao();
		
		assertEquals(novaSolicitacao,);
		
	}
	
	
	
	private NovaSolicitacao montaCenario(){
		Funcionario f = new Funcionario();
		f.setNome("Joao");
		
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setFuncionario(f);
		
		//cria func
		//seta
		//cria solcitacao
		//instacia olicitacao
		//retorna a instacia da solicitacao
		
	}

}
