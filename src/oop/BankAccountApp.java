package oop;

public class BankAccountApp {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount();
		// acc1.name = "Banji Gabriel";
		acc1.setName("Bankole Drille");
		System.out.println(acc1.getName());
		acc1.setSsn("816965067");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "0049736611";
		acc1.balance = 12000;
		acc1.setRate();
		acc1.increaseRate();
		
		// Polymorphism: through Overriding
		System.out.println(acc1.toString());
		
			
		acc1.deposit(2000);
		acc1.deposit(1000);
		acc1.deposit(2000);
		acc1.withdraw(5000);
			
		BankAccount acc2 = new BankAccount("Checking Account");
		
		// Polymorphism: through Overloading
		BankAccount acc3 = new BankAccount("Savings Account", 40000);
		acc3.checkBalance();
		
		CDAccount cd1 = new CDAccount();
		// cd1.name = "Faisat Osuolale";
		cd1.accountNumber = "0719334418";
		cd1.balance = 10000;
		cd1.interestRate = "4.5";
		System.out.println(cd1.toString());
		cd1.compount();
		
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
	}
}