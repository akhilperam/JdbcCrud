package bin.com.jdbc.util;

import java.sql.Connection;
import java.io.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class JdbcUtil  {
	private JdbcUtil() {}
	
	static {
		// Step1: loading and register the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}
	
	public static Connection getJdbcconection() throws SQLException, IOException{

	FileInputStream fis = new FileInputStream("src\\bin\\com\\jdbc\\util\\application.properties");
	Properties p = new Properties();
	p.load(fis);
//	String url=p.getProperty(url);
//	String username=p.getProperty(username);
//	String password= p.getProperty(password);
	Connection con =  DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
	return con;
	
	}
	
	
	
	public static void cleanup(Connection con,Statement st,ResultSet rs) throws SQLException
	{
		if(con!=null)
		{
			con.close();
		}
		if(st!=null)
		{
			st.close();
		}
		if(rs!=null)
			
			
			rs.close();
		}
		
	public static String ToString()
	{
		return ("id,firstname,lastname,salary") ;
		
	}
	}


