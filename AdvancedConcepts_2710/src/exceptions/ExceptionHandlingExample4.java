package exceptions;

class MultiCatch{
	public static void multipleCatch() {
		int arr[]= {10,20,30,40};
		int num1 = 50;
		int num2 = 10;
		
		try {
			try {
				System.out.println(num1/num2);
				System.out.println("4th Element of array is : " +arr[3]);
				System.out.println("5th Element of array is : " +arr[4]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
				int num = Integer.parseInt("30");
				System.out.println(num);
			}catch(NumberFormatException e) {
				System.out.println(e);
				
			}
		System.out.println("Remaining code after exception");
	}
}
public class ExceptionHandlingExample4 {
	
	public static void main(String[] args) {
		MultiCatch.multipleCatch();  //5
		
}
}
