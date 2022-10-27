package exceptions;

class MultiCatchThree{
	public static void multipleCatch1(int num1,int num2) {
		int res = 0;
		try {
			res = num1/num2;
			}
		catch(ArithmeticException|IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				}
		catch(Exception e) {                // Note: We can't kept Exception  as first because it is the super class of all exception
			                                // it should always keep it at last
				System.out.println(e.getMessage());
				}
		finally {
			System.out.println(res);
		}
		System.out.println("Remaining code after exception");
	}
}
public class ExceptionHandlingExample6 {
	
	public static void main(String[] args) {
		MultiCatchThree.multipleCatch1(20, 0);  //5
		
}
}
