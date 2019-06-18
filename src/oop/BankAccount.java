package oop;

	public class BankAccount implements IRate {
		// Instance variables
		private String name;
		String accountNumber;
		private String ssn;
		String accountType;
		static final String routingNumber = "23401";
		double initDeposit;
		double balance;
		
		// Methods
		BankAccount() {
			System.out.println("NEW ACCOUNT CREATED!");
		}
		BankAccount(String accountType) {
			System.out.println("AccountType: " + accountType);
		}
		// Overloading: calling the same method name for differrent arguement
		// initDeposit, acountType, Msg are all instant local variables
		BankAccount(String accountType, double initDeposit) {
			System.out.println("ACCOUNT TYPE: " + accountType);
			System.out.println("Initial deposit of: $" + initDeposit);
			String Msg;
			if (initDeposit < 1000) {
				Msg = "ERROR: Minimum deposit must be at least $1000";
			} else {
				Msg = "Thank you for your initial deposit of: $" + initDeposit;
			} System.out.println(Msg);
			 balance = initDeposit;
		}
		void deposit(double amount) {
			balance = balance + amount;
			showActivity("DEPOSIT");
		}
		void withdraw(double amount) {
			balance = balance - amount;
			showActivity("WITHDRAWAL");
		}
		void checkBalance() {
			System.out.println("BALANCE: " + balance);
		}
		void getStatus() {
			
		}
		 // Interface Methods
		public void setRate() {
			System.out.println("SETTING RATE");
		}
		public void increaseRate() {
			System.out.println("INCREASING RATE");
		}
		// SETTERS / GETTERS
		
		// Encapsulating: String name;
		public void setName(String name) {
			this.name = "Mr. " + name;
		}
		public String getName() {
			return name;
		}
		
		// Encapsulating: String ssn;
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		public String getSsn() {
			return ssn;
		}
		
		private void showActivity (String activity) {
			System.out.println("YOUR RECENT TRANSACTION: " + activity);
			System.out.println("NEW BALANCE: $" + balance);
		}
		@Override
		public String toString() {
			return "[ NAME: " + name + ". ACCOUNT#: " + accountNumber + ". BALANCE: $" + balance + " ]";
	}
}