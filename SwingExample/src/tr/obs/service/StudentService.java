package tr.obs.service;

import tr.obs.core.BaseDAO;
import tr.obs.core.BaseModel;
import tr.obs.dao.StudentDAO;
import tr.obs.model.Student;


public class StudentService 
{
	
	private BaseDAO<Student> baseDAO;
	
	private Student baseModel;
	
	public StudentService()
	{
		
		baseDAO=new StudentDAO();
		baseModel=new Student();
	}
	
	
	public void create()
	{
		baseDAO.createT(baseModel);
	}

	
	public BaseDAO<Student> getBaseDAO() {
		return baseDAO;
	}


	public void setBaseDAO(BaseDAO<Student> baseDAO) {
		this.baseDAO = baseDAO;
	}




	public BaseModel getBaseModel() {
		return baseModel;
	}

	public void setBaseModel(Student baseModel) {
		this.baseModel = baseModel;
	}
	
	
	
	
	
	

}
