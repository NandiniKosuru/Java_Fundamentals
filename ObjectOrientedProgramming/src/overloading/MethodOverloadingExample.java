package overloading;

class Calculation{
	public void addition(int num1,int num2) {
		System.out.println("Sum is: "+(num1+num2));
	}
	
	public void addition(float num1,int num2) {
		System.out.println("Sum is: "+(num1+num2));
	}
	
	public void addition(int num1,int num2,int num3) {
		System.out.println("Sum is: "+(num1+num2+num3));
	}
	public void addition(float num1,int num2,int num3) {
		System.out.println("Sum is: "+(num1+num2+num3));
	}
	public void addition(int num1,float num2) {
		System.out.println("Sum is: "+(num1+num2));
	}
}

public class MethodOverloadingExample {
	
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.addition(100, 200, 300);
		cal.addition(21F, 200);
		cal.addition(100, 2000);
		cal.addition(123, 32F);
		cal.addition(32F, 200, 900);
	}
	
}
