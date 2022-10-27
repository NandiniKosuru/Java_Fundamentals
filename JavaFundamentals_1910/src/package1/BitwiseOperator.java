package package1;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bitwise Operators
		int num=12,num2=25;
		int res;
		res = num|num2;
		System.out.println(res);
		
		//12 - 0 0 0 0 1 1 0 0
		//25 - 0 0 0 1 1 0 0 1
		res= num&num2;
		System.out.println(res);
		
		res= num^num2;
		System.out.println(res);
		
		res= ~num2;
		System.out.println(res);
		
		
		
		

	}

}
