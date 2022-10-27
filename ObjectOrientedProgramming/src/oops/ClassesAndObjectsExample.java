package oops;
import java.util.Scanner;

class Student{
	
	//Data Members (Attributes)
	Scanner sc = new Scanner(System.in);
	
	int studentId;
	String studentName;
	int studentAge;
	
	//Member Functions(Behaviours)
	
	public void acceptDetails() {
		System.out.println("Enter Student Id : ");
		this.studentId = sc.nextInt();
		System.out.println("Enter Student Name : ");
		this.studentName = sc.next();
		System.out.println("Enter Student Age : ");
		this.studentAge = sc.nextInt();
		
	}
	
	public void displayDetails() {
		System.out.println("Student Id is : " +this.studentId);
		System.out.println("Student Name is : " +this.studentName);
		System.out.println("Student Age is : " +this.studentAge);
	}
	
	
}
public class ClassesAndObjectsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Student s1 = new Student();
		s.acceptDetails();
		s.displayDetails();
		s1.acceptDetails();
		s1.displayDetails();
		
		

	}

}
