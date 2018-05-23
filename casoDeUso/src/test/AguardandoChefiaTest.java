package test;

import model.AguardandoChefia;

import org.junit.Test;

public class AguardandoChefiaTest {
	
	@Test(expected = IllegalStateException.class)
	public void testaSolicitar(){
		AguardandoChefia instacia = new AguardandoChefia();
		instacia.solicitar();		
	}
	
	@Test(expected = IllegalStateException.class)
	public void testaAprovar(){
		AguardandoChefia instacia = new AguardandoChefia();
		instacia.aprovar();		
	}
	
	@Test(expected = IllegalStateException.class)
	public void testaRecusar(){
		AguardandoChefia instacia = new AguardandoChefia();
		instacia.recusar();		
	}
	
	@Test(expected = IllegalStateException.class)
	public void testaRetornar(){
		AguardandoChefia instacia = new AguardandoChefia();
		instacia.retornar("motivo");		
	}

}
