package prog4_3_improved_employee;

import java.time.LocalDate;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	private Employee employee;

	public Account(Employee emp, double balance) {
		this.employee = emp;
		this.balance = balance;
	}

	public Account(Employee emp, AccountType acctType) {
		this(emp, DEFAULT_BALANCE);
	}

	public String toString() {
		return  "\n Current bal: " + balance;
	}

 
	public double getBalance() {

		return balance;
	}

	public void makeDeposit(double deposit) {	
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {

		if(amount <= balance) {
			balance -= amount;
			return true;
		}else {
			System.out.println("Your Account Has Insufficent Balance");
			return false;
		}
	}
}