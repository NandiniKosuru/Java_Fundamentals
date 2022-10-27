package oops;

import java.util.Scanner;

class Ass{
	private int admno;
	private String sname;
	private float eng,math,science,total;
	static String clgName,courseName;

	
	Scanner s = new Scanner(System.in);
	
	static {
		clgName="JNTU";
		courseName="CSE";
	}
	
	private float cTotal() {
		this.total=this.eng+this.math+this.science;
		return this.total;
		
	}
	public void takeData() {
		System.out.print("Enter the Admin no: ");
		this.admno=s.nextInt();
		System.out.print("Enter the Student Name: ");
		this.sname=s.next();
		System.out.print("Enter the English Marks: ");
		this.eng=s.nextFloat();
		System.out.print("Enter the Maths Marks: ");
		this.math=s.nextFloat();
		System.out.print("Enter the Science Marks: ");
		this.science=s.nextFloat();
		this.cTotal();
	}
	public void showData() {
		System.out.println("Admin no is: " +this.admno);
		System.out.println("Student Name is : " +this.sname);
		System.out.println("Enter your clg name: "+Ass.clgName);
		System.out.println("Enter your Course Name : "+Ass.courseName);
		System.out.println("Student English Marks : "+this.eng);
		System.out.println("Student Math Marks is: "+this.math);
		System.out.println("Student Science Marks is: "+this.science);
		System.out.println("Total Marks of Student : "+this.cTotal());
	}
}
public class Assessment {

	public static void main(String[] args) {
		Ass obj[] = new Ass[5];
		for(int i=0;i<obj.length;i++) {
			obj[i]=new Ass();
			obj[i].takeData();
			System.out.println();
		}
		for(int j=0;j<obj.length;j++) {
			obj[j].showData();
			System.out.println();
		}
		

	}

}
