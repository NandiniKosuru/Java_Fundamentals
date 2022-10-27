package sample;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int employeeId;
		String employeeName;
		float employeeSal;
		String employeeGender;
		System.out.println("Enter Employee Details : ");
		System.out.println("Enter Employee id : ");
		employeeId = sc.nextInt();
		System.out.println("Enter Employee Salary : ");
		employeeSal = sc.nextFloat();
		System.out.println("Enter Employee Name : ");
		employeeName = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Employee Gender : ");
		employeeGender = sc.nextLine();
		
		System.out.println("EmployeeId is: " +employeeId);
		System.out.println("EmployeeName is: " +employeeName);
		System.out.println("EmployeeSal is: " +employeeSal);
		System.out.println("EmployeeGender is: " +employeeGender);
		
		
		
		// TODO Auto-generated method stub

	}

}
