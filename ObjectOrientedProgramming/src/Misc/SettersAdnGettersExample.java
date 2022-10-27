package Misc;

class Student{
	private String name;
	private int age;
	private String course;
	private static String schoolName;
	
	static {
		Student.schoolName = "ABC School";
	}
	//setter
	public static String getSchoolName() {
		return schoolName;
	}
	public void setName(String name) {
		this.name=name;
	}
	//Getter
	public String getName() {
		return this.name;
	}
	
	public void setAge1(int age) {
		if(this.age>=10) {
			this.age=age;}
		else {
			System.out.println("You can't get enrollment for this course");}
	}
	//Getter
	public int getAge1() {
		return this.age;
	}
	
	public void setCourse(String course) {
		this.course=course;
	}
	//Getter
	public String getCourse() {
		return this.course;
	}
	
}
public class SettersAdnGettersExample {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Nandini");
		s.setAge1(12);
		s.setCourse("Java");
		System.out.println("Student Name is: " +s.getName());
		System.out.println("Student Age is: "+s.getAge1());
		System.out.println("Student Course : "+s.getCourse());
		System.out.println("Student School Name : "+Student.getSchoolName());
	}

}
