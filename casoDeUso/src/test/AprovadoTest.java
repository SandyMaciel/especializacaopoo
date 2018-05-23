package test;

import model.Aprovado;

import org.junit.Test;

public class AprovadoTest {
	
	@Test(expected = IllegalStateException.class)
	public void testaSolicitar(){
		Aprovado instacia = new Aprovado();
		instacia.solicitar();		
	}
	
	@Test(expected = IllegalStateException.class)
	public void testaAprovar(){
		Aprovado instacia = new Aprovado();
		instacia.aprovar();		
	
	
	}
	
	@Test(expected = IllegalStateException.class)
	public void testaRecusar(){
		Aprovado instacia = new Aprovado();
		instacia.recusar();		
	}
	
	@Test(expected = IllegalStateException.class)
	public void testaRetornar(){
		Aprovado instacia = new Aprovado();
		instacia.retornar("motivo");		
	}
	

}
