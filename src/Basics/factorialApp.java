package Basics;
public class factorialApp {
	public static void main(String[] args) {
		// 1! = 1 * 1
		// 2! = 2 * 1
		// 3! = 3 * 2 * 1
		// 4! = 4 * 3 * 2 * 1
		
		System.out.println(fact(4));
	}
	
	public static int fact(int n) {
		int i, fact = 1;
		int num = 6; {
		for(i = 1; i <= 4; i++) {
			fact = fact * i;
		} System.out.println("Factorial of " + num + " = " + fact);
			} return fact;
	}
}