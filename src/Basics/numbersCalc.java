package Basics;
public class numbersCalc {
	public static void main(String[] args) {
		// define the variables
		int numA = 20;
		int numB = 5;
		int product = numA * numB;
		System.out.println("The product of " + numA + " & " + numB + " = " + product);
		int sum = numA + numB;
		System.out.println("The sum of " + numA + " & " + numB + " = " + sum);
		
	}
		// sum of the Variables
		static void addNumbers(int numA, int numB) {
		int sum = numA + numB;
		
	}		
		// product of the variables 
		static int product(int numA, int numB) {
			int product = numA * numB;
			addNumbers(product+50, product);
		return product;
	}
}