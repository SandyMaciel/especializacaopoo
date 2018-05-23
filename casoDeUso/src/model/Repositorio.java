package model;

import repository.IRepository;

public class Repositorio implements IRepository{

	final static private IRepository repositorio = new Repositorio();
	
	private Repositorio() {
		// TODO Auto-generated constructor stub
	}
	
	static public IRepository getInstance(){
		return repositorio;
	}
	
	public IRepository add(Object instance) {
		// faz a persistencia 
		return this;
	}

	public IRepository remove(Object instance) {
		// faz a persistencia 
				return this;
	}

	public void persistAll() {
		throw new UnsupportedOperationException("Not supported yet");
	}

	public <T> void get(Class<T> instance) {
		// TODO Auto-generated method stub
		
	}

}
