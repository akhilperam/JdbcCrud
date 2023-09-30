package in.ineuron.service;

import in.ineuron.daofactory.StudentDaofactory;
import in.ineuron.dto.Student;
import in.ineuron.persistence.IStudentDao;

public class StudentServiceImpl  implements IStudentService

{
	private IStudentDao stdDao;
	
	@Override
	public String addStudent(String sname, Integer sage, String saddress) {
			stdDao = StudentDaofactory.getStudentdao();
			return stdDao.addStudent(sname, sage, saddress);
			}

	@Override
	public Student searchStudent(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
