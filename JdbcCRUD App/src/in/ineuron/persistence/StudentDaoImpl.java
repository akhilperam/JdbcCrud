package in.ineuron.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bin.com.jdbc.util.JdbcUtil;
import in.ineuron.dto.Student;


public class StudentDaoImpl implements IStudentDao {
	

	Connection connection = null;
	PreparedStatement pstmt = null;

	
	public String addStudent(String sname, Integer sage, String saddress) {

		String sqlInsertQuery = "insert into ration(`name`,`age`,`address`)values(?,?,?)";
		try {
			connection = JdbcUtil.getJdbcconection();

			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);

			if (pstmt != null) {

				pstmt.setString(1, sname);
				pstmt.setInt(2, sage);
				pstmt.setString(3, saddress);

				int rowAffected = pstmt.executeUpdate();
				if (rowAffected == 1) {
					return "success";
				}
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

		return "failure";
	}

	public Student searchStudent(Integer sid) {
		return null;
	}

	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
		return null;
	}

	public String deleteStudent(Integer sid) {
		return null;
	}

}
