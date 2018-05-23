package repository;

public interface IRepository {

	IRepository add(Object instance);
	
	IRepository remove(Object instance);
	
	<T> void get(Class<T> instance);
	
	void persistAll();
	
	
}
