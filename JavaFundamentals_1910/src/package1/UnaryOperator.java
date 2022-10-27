package package1;

public class UnaryOperator {

	public static void main(String[] args) {
		// we use increment or decrement operators for unary
		//increment
		int num=100,result = 0;
		
	   //pre increment and assign
		
		result = ++num;
		System.out.println(num);
		System.out.println(result);
		
		//post increment and assign
		
		result = num++;
		System.out.println(num);
		System.out.println(result);
		
		//pre decrement and assign
		result = --num;
		System.out.println(num);
		System.out.println(result);
		
		//post drecrement and assign
		result = num--;
		System.out.println(num);
		System.out.println(result);

	}

}
