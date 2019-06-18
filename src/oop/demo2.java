package oop;
	class Person {
		String name = "John";
		String phone = "07038662402";
		String email = "idkraqinz@gmail.com";
		
		void walk() {
			System.out.println(name + " is walking");	
		}
		void eat() {
			System.out.println(name + " is eating");
		}
		void sleep() {
			System.out.println(name + " is sleeping");
		}
}
	public class demo2 {
		public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "John";
		person1.phone = "07038662402";
		person1.email = "idkraqinz@gmail.com";
		person1.walk();
		person1.eat();
		person1.sleep();
	}
}
