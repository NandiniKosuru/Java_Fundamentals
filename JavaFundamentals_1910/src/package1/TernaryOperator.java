package package1;


public class TernaryOperator {

	public static void main(String[] args) {
		// First way using if else..
		int num = 40;
		if(num%5==0)
			System.out.println("Divisible by 5");
		else
			System.out.println("Not divisible");
		
		//Using ternary operator
		
		String result = (num%5==0)?"Divisible":"not divisible";
		System.out.println(result);

	}

}
