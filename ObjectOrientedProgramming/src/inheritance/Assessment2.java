package inheritance;

import java.util.Scanner;

class Car{
	int speed;
	double regularPrice;
	String color;
	
	Scanner sc = new Scanner(System.in);
	public double getSalePrice() {
		System.out.print("Enter Regular Sale Price : ");
		this.regularPrice =sc.nextDouble();
		return regularPrice;
	}
	
}

class Truck extends Car{
	int weight;
	public double getSalePrice() {
		super.getSalePrice();
		System.out.println("Enter the weigt of the truck");
		this.weight=sc.nextInt();
		if(this.weight>2000) {
			System.out.println("You will get 10% discount");
		    this.regularPrice=this.regularPrice*(10/100);}
		else {
			System.out.println("You will get 20% discount");
		    this.regularPrice=this.regularPrice*(10/100);}
		return this.regularPrice;
			
	}
}
class Ford extends Car{
	int year;
	int manufacturerDiscount;
	public double getSalePrice() {
		super.getSalePrice();
		System.out.println("Enter the year of Manufacturing");
		this.year=sc.nextInt();
		System.out.println("Enter the manufacturer Discount");
		this.regularPrice=super.getSalePrice()-manufacturerDiscount;
		return regularPrice;
	}
}
public class Assessment2 {

	public static void main(String[] args) {
		Car f = new Car();
		f.getSalePrice();
	}

}
