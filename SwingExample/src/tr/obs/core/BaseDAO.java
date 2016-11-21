package tr.obs.core;

import java.util.List;

public interface BaseDAO<T>
{
	
	public boolean createT(T t);
	
	public boolean deleteT(T t);
	
	public List<T> getListAllT();
	
	public T getByUsername(String username);
	

}
