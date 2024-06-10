package app;

import atm.ATM;
import bankaccount.BankAccount;

public class ATMApp {

	public static void main(String [] args) {
		BankAccount account = new BankAccount();
		ATM atm = new ATM(account);
		atm.start();
	}
	
}
