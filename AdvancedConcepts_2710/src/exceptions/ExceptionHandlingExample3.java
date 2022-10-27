package exceptions;

class ArithTest{
	public static void division(int num1,int num2) {
		int num3 = 0;
		try {
		num3 = num1/num2;
		}
		finally {
			System.out.println(num3);
		}
		System.out.println("Remaining code here");
	}
}
public class ExceptionHandlingExample3 {
	
	public static void main(String[] args) {
		ArithTest.division(100,20);  //5
		ArithTest.division(0,20);   //0
		ArithTest.division(100,0);  //exception
		
}
}
