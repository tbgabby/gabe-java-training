package Basics;

	public class Lab1 {
		
		public static void main(String[] args) {
			System.out.println(sum(6));
		}
		
		// to do debug for this;
		public static int sum(int n) {
			int sum = 0;
			for (int i = 1; i <= n; i++) {
			System.out.print(sum + " + " + i);
				sum = sum + i;
			System.out.println(" = " + sum);
			} return sum;
		}
	}