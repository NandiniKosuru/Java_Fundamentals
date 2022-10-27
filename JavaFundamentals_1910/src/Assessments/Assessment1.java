package Assessments;

import java.util.Scanner;

public class Assessment1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Selling Price: ");
		int sellingPrice = s.nextInt();
		System.out.println("Enter cost Price: ");
		int costPrice = s.nextInt();
		//using if.. else..
		if(sellingPrice>costPrice) 
			System.out.println("Profit");
		else if(sellingPrice<costPrice)
			System.out.println("Loss");
		else
			System.out.println("No Profit No Loss");
		
		//using ternary
		
		String res = (sellingPrice>costPrice)?"Profit":(sellingPrice<costPrice)?"Loss":"No Profit No Loss";
		System.out.println("Using TernaryOperator : "+ res);
		
	}
}
