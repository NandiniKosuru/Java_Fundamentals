package overloading;

class Overload{
	 void test() {
		System.out.println("No Parameters");
	}
	
	void test(int a, int b) {
		System.out.println("a and b " +a+" "+b);
	}
	
	void test(double a) {
		System.out.println("Inside test(double a)a:" +a);
	}
}

public class Overloaded {

	public static void main(String[] args) {
		Overload o = new Overload();
		o.test();
		o.test(5);
		o.test(10,20);
		o.test(23,56);

	}

}
