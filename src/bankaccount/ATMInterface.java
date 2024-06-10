package bankaccount;

public interface ATMInterface {

	void makeDeposit(double deposit);
	void makewithdraw(double amount);
	double checkbalance();
	void exit();
}
