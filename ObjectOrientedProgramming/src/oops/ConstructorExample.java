package oops;

class StudentExample1{
	int studentId1;
	String studentName1;
	int studentAge1;
	
	public StudentExample1() {
		this.studentId1=1000;
		this.studentName1="Nandini";
		this.studentAge1=21;
	}
	public StudentExample1(int sid,String sname,int sage) {
		this.studentId1=sid;
		this.studentName1=sname;
		this.studentAge1=sage;
		
	}
	
	//copy constructor
	
	public StudentExample1(StudentExample1 stObj) {
		this.studentId1=stObj.studentId1;
		this.studentName1=stObj.studentName1;
		this.studentAge1=stObj.studentAge1;
	}
	public void displayDetails1() {
		System.out.println("Student Id is : " +this.studentId1);
		System.out.println("Student Name is : " +this.studentName1);
		System.out.println("Student Age is : " +this.studentAge1);
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentExample1 s = new StudentExample1();
		s.displayDetails1();
		System.out.println("-------------------------------");
		StudentExample1 s2 = new StudentExample1(200,"Mine",23);
		s2.displayDetails1();
		System.out.println("-------------------------------");
		StudentExample1 s3 = new StudentExample1(s2);
		s3.displayDetails1();
		

	}

}

/*import java.util.Scanner;

class nStud{
	//data members (attributes)
			int studentId;
			String studentName;
			int studentAge;
			static String universityName;
			Scanner sc= new Scanner (System.in);
			
			static{
				System.out.println("I am a ststic method");
				// only static var are allowed in this static block 
				// only one static method can be there in one class
				universityName ="ABC uni";
			}
			//default constructor
			public nStud() {
				this.studentId = 0;
				this.studentName = "ni";
				this.studentAge = 5;
				nStud.universityName="ni";
			}
			
			//copy constructor
			public nStud(nStud stObj) {
				this.studentId = stObj.studentId;
				this.studentName = stObj.studentName;
				this.studentAge = stObj.studentAge;
				nStud.universityName=stObj.universityName;
			}
			public nStud(int a, String b, int c, String uni) {
				this.studentId = a;
				this.studentName = b;
				this.studentAge = c;
				nStud.universityName=uni;
			}
			//Member function 
			public void displayDetails() {
				System.out.println("Student id is"+this.studentId);
				System.out.println("Student name is"+ this.studentName);
				System.out.println("Student age is"+this.studentAge);
				System.out.println("Uni is"+nStud.universityName);
				System.out.println("---------------");
			}

}

public class q1 {

	public static void main(String[] args) {
		
		nStud stud = new nStud();
		stud.displayDetails();
		nStud stud2 = new nStud(2,"j",6, "uniii");
		stud2.displayDetails();
		nStud stud3 = new nStud(stud2);
		stud3.displayDetails();
	}
}
*/
