package atm;

import java.util.Scanner;

import bankaccount.BankAccount;

public class ATM {

	private BankAccount bank;
	
	public ATM(BankAccount bank) {
		this.bank = bank;
	}
	
	
	public void diplayMenu() {
		System.out.println();
		System.out.println("WELCOME TO JONATHAN ATM");
		System.out.println();
		System.out.println("1		DEPOSIT");
		System.out.println("2		WITHDRAW");
		System.out.println("3		CHECK-BALANCE");
		System.out.println("4		EXIT");
		System.out.println();
	}
	public void start() {
		try(Scanner scan = new Scanner(System.in);){
		
		
		while(true) {
			diplayMenu();
			
			System.out.print("ENTER OPTION  :  ");
			int option = scan.nextInt();
			
			System.out.println();
			switch(option) {
			case 1 :
				System.out.print("ENTER AMOUNT TO DEPOSIT		");
				double amount = scan.nextDouble();
				bank.makeDeposit(amount);
				System.out.println();
				break;
			case 2 :
				System.out.print("ENTER AMOUNT TO WITHDRAW		");
				double withdraw = scan.nextDouble();
				bank.makewithdraw(withdraw);
				System.out.println();
				break;
			case 3 :
				System.out.print("Your Balance is :  " + bank.checkbalance());
				System.out.println();
				break;
			case 4 :
				bank.exit();
				break;
			}//end switch
		}//end while loop
		
		}
	}//end start method
}
