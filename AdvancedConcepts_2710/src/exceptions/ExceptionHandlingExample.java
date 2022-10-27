package exceptions;


class ArithmeticDivision{
	public static void division(int num1,int num2) {
		try {
		int num3 = num1/num2;
		System.out.println(num3);}
		catch(Exception ex){
			System.out.println("Exception Occured");
			System.out.println("Exception : " +ex.getMessage());
		}
	}
}
public class ExceptionHandlingExample {
	public static void main(String[] args) {
		ArithmeticDivision.division(100,20);  //5
		ArithmeticDivision.division(0,20);   //0
		ArithmeticDivision.division(100,0);  //exception
		
	}

}
