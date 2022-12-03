package prog4_3_improved_employee;

public class CheckingAccount extends Account {
	
	
	public CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	public AccountType getAcctType() {
		return AccountType.CHECKING;
		}


}
