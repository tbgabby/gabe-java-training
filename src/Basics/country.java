package Basics;
public class country {
	public static void main(String[] args) {
		 String[] country = {"Kenya", "Nigeria", "Canada", "USA"};
		 	System.out.println("COUNTRY: " + country[1]);
		 System.out.println("**********");
		 String[] state = new String[4];
		 state[0] = "Ontario";
		 state[1] = "Texas";
		 state[2] = "Lagos";
		 state[3] = "Nairobi";
		 	System.out.println("STATE: " + state[2]);
		 System.out.println("**********");
		 String[] city = new String[4];
		 city[0] = "Mombasa";
		 city[1] = "Ikeja";
		 city[2] = "Toronto";
		 city[3] = "Houston";
		 
//		 int i = 0;
//		 do {
//			 System.out.println(city[i]);
//			 i++;
//		 } while (i < 4);
		 
		for (int i = 0; i < 4; i++) {
			if (city[i].equalsIgnoreCase("Ikeja")) {
				System.out.println("CITY: " + city[i]);
			}
		}
	}
}