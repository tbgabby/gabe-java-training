package Basics;
public class salaryCalc{
	public static void main(String[] args) {
		
		String career = "Web designer";
		System.out.println("Career: " + career);
		
		int hoursPerWeek =  40;
		int weeksPerHour = 50;
		double rate = 43.75;
		
		double salary = hoursPerWeek * weeksPerHour * rate;
		
		System.out.println("My salary as a " + career + " at the rate of " + rate + "per hour, is $" + salary + " per year.");
	}
}