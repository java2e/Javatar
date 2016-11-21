package tr.obs.core;

import tr.obs.model.Student;
import tr.obs.service.StudentService;

public class Test {

	public static void main(String[] args) {



		Student model=new Student();
		
		model.setIdNumber(1235);
		
		model.setName("JAVA");
		
		model.setSurname("TAR");
		
		StudentService service=new StudentService();
		
		
		service.setBaseModel(model);
		
		service.create();
		
		
		

	}

}
