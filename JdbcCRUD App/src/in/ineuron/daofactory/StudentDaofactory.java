package in.ineuron.daofactory;

import in.ineuron.persistence.IStudentDao;
import in.ineuron.persistence.StudentDaoImpl;

public class StudentDaofactory {
	
	
		
		private StudentDaofactory() {}
		
		private static IStudentDao studentdao = null;
		
		public static IStudentDao  getStudentdao()
		{
			if(studentdao == null)
			{
				studentdao = new StudentDaoImpl();
			}
			return studentdao;
			
		}

	}

