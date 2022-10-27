package inheritance;

import java.util.Scanner;

class Stu{
	private int id;
	private String name;
	private String course;
	private static String schoolName;
	
	static {Stu.schoolName="Z P Girls H S";}
	
	Scanner s = new Scanner(System.in);
	
	public void acceptDetails() {
		System.out.print("Enter Student Id: ");
		this.id=s.nextInt();
		System.out.print("Enter Student Name : ");
		this.name = s.next();
		System.out.print("Enter Student Course : ");
		this.course = s.next();
	}
	public void displayDetails() {
		System.out.println("Student Basic Information");
		System.out.println();
		System.out.println("Student id is : " + this.id);
		System.out.println("Student name is : " +this.name);
		System.out.println("Student course is : " +this.course);
		System.out.println("Student School Name : " +Stu.schoolName);
	}
	
}
class Marks extends Stu{
	protected float objectiveMarks;
	protected float subjectiveMarks;
	
	public void acceptDetails1() {
		System.out.print("Enter Student Objective Marks: ");
		this.objectiveMarks=s.nextFloat();
		System.out.print("Enter Student Subjective Marks : ");
		this.subjectiveMarks = s.nextFloat();
	}
	public void displayDetails1() {
		super.displayDetails();
		System.out.println("Marks Scored");
		System.out.println("Student Objective Marks : " + this.objectiveMarks);
		System.out.println("Student Subjective Marks : " +this.subjectiveMarks);
	}
	
}

class Sports extends Marks{
	protected float score;
	public void acceptDetails2() {
		System.out.print("Enter Sports Score: ");
		this.score=s.nextFloat();
	}
	public void displayDetails2() {
		super.displayDetails();
		System.out.println("Student Sport score : " +this.score);
	}
}

class Result extends Sports{
	float totalMarks,averageMarks;
	public void calculateResult() {
	this.totalMarks = this.subjectiveMarks+this.objectiveMarks+this.score;
	this.averageMarks = this.totalMarks/3;
	System.out.println("Total Marks : "+this.totalMarks);
	System.out.println("Average Marks : " +this.averageMarks);
	if(this.averageMarks>=75 && this.objectiveMarks>=70 && this.score>=70) {
		System.out.println("Congratulations! You are shortlisted ");
	}
	else {
		System.out.println("Sorry You are not Shortlisted");
	}
	}
}
public class Student {

	public static void main(String[] args) {
		Result m = new Result();
		m.acceptDetails();
		m.acceptDetails1();
		m.acceptDetails2();
		System.out.println();
		m.displayDetails();
		m.displayDetails1();
		m.displayDetails2();

	}

}
