package Basics;
	public class Strings {
		public static void main(String[] args) {
			String bookTitle = "Babylon is here again";
			String wordChoice = "here";
				if (bookTitle.contains(wordChoice));
			System.out.println("The book contains the word: " + wordChoice);
			String browser = "Mozilla";
				if(browser.equalsIgnoreCase("Mozilla")) {
			System.out.println("My browser is Mozilla.");
		}
			String firstName = "John";
			String lastName = "Bosco";
			String ssn = "234786945";
			System.out.println("There are " + ssn.length() + "digits as SSN");
			System.out.print(firstName.substring(0, 1));
			System.out.print(lastName.substring(0, 1));
			System.out.println(ssn.substring(5));
}}