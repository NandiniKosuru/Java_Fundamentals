package exceptions;


class TwoArithmetic{
	public static void division(int num1,int num2) {
		int num3 = 0;
		try {
		num3 = num1/num2;
		}
		catch(ArithmeticException ex){
			System.out.println("Exception Occured");
			System.out.println("Exception : " +ex.getMessage());
		}
		finally {
			System.out.println(num3);
		}
		System.out.println("Remaining code here");
	}
}
public class ExceptionHandlingExample2 {
	public static void main(String[] args) {
		ArithmeticDivision.division(100,20);  //5
		ArithmeticDivision.division(0,20);   //0
		ArithmeticDivision.division(100,0);  //exception
		
	}

}
