package tr.obs.dao;

import java.sql.Statement;
import java.util.List;

import tr.obs.core.BaseDAO;
import tr.obs.core.DBConnection;
import tr.obs.model.Student;

public class StudentDAO extends DBConnection implements BaseDAO<Student> 
{

	@Override
	public boolean createT(Student t) {

		try {
			
			String sql="INSERT INTO public.tbl_student( "
	+" name, surname,id_number) "
	+" VALUES ('"+t.getName()+"','"+t.getSurname()+"',"+t.getIdNumber()+") ";
			
			
			connectDB();
			
			Statement stmt=conn.createStatement();
			
			stmt.executeQuery(sql);
			
			
			
			disConnect();
			
			return true;
			
			
		} catch (Exception e) {
		
			return false;
			// TODO: handle exception
		}
		
	}

	@Override
	public boolean deleteT(Student t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> getListAllT() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
