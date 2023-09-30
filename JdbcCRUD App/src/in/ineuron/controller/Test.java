package in.ineuron.controller;
import java.util.Scanner;

import in.ineuron.service.IStudentService;
import in.ineuron.servicefactory.StudentServiceFactory;

public class Test {

	public static void main(String[] args) {
		
		IStudentService st = StudentServiceFactory.getStudentService();
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter the rationcard name :: ");
		String sname = scanner.next();

		System.out.print("Enter the rationperson age :: ");
		int sage = scanner.nextInt();

		System.out.print("Enter the ration addres :: ");
		String saddress = scanner.next();

		String msg = st.addStudent(sname, sage, saddress);
		if(msg.equalsIgnoreCase("Success"))
		{
			System.out.println("Record inserted Successfuly");	
		}else
		{
			System.out.println("Record FAil");
		}
		
		scanner.close();
	}

}
