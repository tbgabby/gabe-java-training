package Basics;
	public class demo2 {
		public static void main(String[] args) {
			String name = "Gabriel";
			String phone = "07038662402";
			String email = "idkraqinz@gmail.com";
			walk(name);
			System.out.println(name + " is eating");
		System.out.println("*****************************");
			String name2 = "Elizabeth";
			String phone2 = "07062641698";
			String email2 = "jfkraqinz@gmail.com";
			System.out.println(name2 + " is walking");
			eat(name2);
		System.out.println("*****************************");
}
			static void walk(String name) {
				System.out.println(name + " is walking");
			}
			static void eat(String name2) {
				System.out.println(name2 + " is eating");
			}
}