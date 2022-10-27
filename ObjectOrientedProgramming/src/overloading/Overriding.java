package overloading;

class Person{
	String name;
	String city;
	
	public Person(String name,String city) {
		this.name=name;
		this.city=city;
	}
	public void showData() {
		System.out.println("Name " +name);
		System.out.println("City : " +city);
	}
}

	class Employee extends Person{
		String designation;
		float salary;
		public Employee(String name,String city,String designation,float salary) {
			super(name,city);
			this.designation=designation;
			this.salary=salary;
		}
		@Override
		public void showData() {
			super.showData();
			System.out.println("Designationn is: "+this.designation);
			System.out.println("Salary : " +this.salary);
		}
	}	
	class Student extends Person{
		String course;
		int fee;
		public Student(String name,String city,String course,int fee) {
			super(name, city);
			this.course=course;
			this.fee= fee;
		}
		@Override
		public void showData() {
			super.showData();
			System.out.println("Course : "+this.course);
			System.out.println("clg : "+this.fee);
		}
	}

public class Overriding {

	public static void main(String[] args) {
		Student em = new Student("Nandini", "Vizag", "CSE", 10000);
		em.showData();

	}

}
