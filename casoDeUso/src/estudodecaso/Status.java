package estudodecaso;

public interface Status {
	public void solicitar();
	public void aprovar();
	public void recusar();
	public String retornar(String mot);
}
