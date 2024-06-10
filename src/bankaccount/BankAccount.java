package bankaccount;

public class BankAccount implements ATMInterface {
	private  double balance;
	
	
	 public BankAccount() {
		 this.balance = 100;
		 }
	 

	@Override
	public void makeDeposit(double deposit) {
		if(deposit <= 0) {
			System.out.println("Deposit of "+deposit+" can't be completed!");
		}
		
		balance += deposit;
		
		System.out.println("You Deposited "+ deposit);
		System.out.println();
		System.out.println("Your cuurent Balance is "+ balance);
	}

	@Override
	public void makewithdraw(double amount) {
		
		if(balance <= 0 || amount > balance) {
			System.out.println("Insufficient balance");
			System.out.println("Your current Balance is "+ balance);
		}else {
	  balance -= amount;
	  System.out.print("You have Withdrawn "+ amount);
	  System.out.print("Your current Balance is "+ balance);
		}
	}

	@Override
	public double checkbalance() {
		
		return balance;
	}


	@Override
	public void exit() {
		System.out.println("DEAR CUSTOMER");
		System.out.println("THANK YOU FOR TRUSTING OUR SERVICES");
		System.out.println("*************************************");
		System.exit(0);
	}

}
