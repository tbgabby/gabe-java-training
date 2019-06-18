package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		
		 BankAccount acc1 = new BankAccount("478236785", 1000);
		 BankAccount acc2 = new BankAccount("875439801", 2000);
		 BankAccount acc3 = new BankAccount("543897124", 2500);
	
		 acc1.payBill(400);
		 acc1.payBill(300);
		 acc1.makeDeposit(1000);
		 acc1.accrue();
		 System.out.println(acc1.toString());		
		 
		 acc1.setName("John Bosco");
		 System.out.println(acc1.getName());
	}
}

	class BankAccount implements IInterest {
		// Properties of a BankAccount
		private static int iD = 1000;		// Internal ID
		private String accountNumber;		// iD + random 2-digit number + first 2 digits of SSN
		private String name;
		private String SSN;		
		private static String routingNumber = "777000457";
		private double balance;
		
		// Using Constructors
		public BankAccount (String SSN, double initDeposit) {
			this.SSN = SSN;
			iD++;
			setAccountNumber();
			balance = initDeposit;
	}
		private void setAccountNumber() {
			int random = (int) (Math.random() * 100);
			accountNumber = iD + "" + random + SSN.substring(0, 1);
			System.out.println("Your account number: " + accountNumber);
			
	}
		// if we want 'Our' name, to be set; We use Setters & Getters
		public void setName(String name) {
			this.name = "Mr. " + name;
		}
		public String getName() {
			return name; 
		}
		public void payBill(int amount) {
			balance = balance - amount;
			System.out.println("Paying bill: " + amount);
			showBalance();
		}
		public void makeDeposit(int amount) {
			balance = balance + amount;
			System.out.println("Making deposit: " + amount);
			showBalance();
		}
		public void showBalance() {
			System.out.println("Balance: " + balance);
		}
		
		@Override
		public void accrue() {
			balance = balance * (1 + rate*100);
		showBalance();
		}
		
		@Override
		public String toString() {
			return "[Name: " + name + " ]\n[Account Number: " + accountNumber + " ]\n" + "[Routing#: " + routingNumber + " ]\n" + "[Balance: " + balance + "]";
		}
}