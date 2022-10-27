package package1;

public class ShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Left shift << 2
		//0010  -->  after left shift --> 001000 its 8
		int num = 2;
		int res;
		res = num<<2;
		System.out.println(res);
		
		//Right shift 
		int num2 = 8;
		res = num2>>2;
		System.out.println(res);
	}

}
