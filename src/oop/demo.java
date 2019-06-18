package oop;

	public class demo {
		
		public static void main(String[] args) {
			
			String name = "John";
			String phone = "07038662402";
			String email = "jfkraqinz@gmail.com";
			System.out.println(name + " is walking");
			System.out.println(name + " is eating");
			
			String name2 = "Harriet";
			String phone2 = "+14367890987";
			String email2 = "idkraqinz@gmail.com";
			walk(name2);
			System.out.println(name2 + " is eating");
	}
		
			static void walk(String name) {
				System.out.println(name + " is walking");
				}
			static void eat(String name) {
				System.out.println(name + " is eating");
				}
}