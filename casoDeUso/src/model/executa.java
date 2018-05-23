package model;

public class executa {
	
		public static void main(String[] args) {
			
			Solicitacao s = new Solicitacao();
			s.aprovar();
			System.out.println(s.getStatus());
		}

}
