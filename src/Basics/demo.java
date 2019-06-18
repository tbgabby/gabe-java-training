package Basics;
	class Person {
		String name = "Gabriel";
		String email = "igabrieloyebanji@gmail.com";
		String phone = "07038662402";
		void work()
	{ System.out.println(name + " is working."); }
		void study()
	{ System.out.println(name + " is studying."); }
}
	public class demo {
		public static void main(String[] args) {
		// define person1 attributes
		Person person = new Person();
		person.name = "Gabriel";
		person.email = "igabrieloyebanji@gmail.com";
		person.phone = "07038662402";
		person.work();
		person.study();
}}