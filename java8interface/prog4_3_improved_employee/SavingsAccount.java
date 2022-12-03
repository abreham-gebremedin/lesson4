package prog4_3_improved_employee;

public class SavingsAccount extends Account {

	public SavingsAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}
	
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
		}
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (0.25/100)*baseBalance;
		return baseBalance + interest;
		}


}
