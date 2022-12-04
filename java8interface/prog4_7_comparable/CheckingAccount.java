package prog4_7_comparable;

public class CheckingAccount extends Account {
	
	
	public CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	public AccountType getAcctType() {
		return AccountType.CHECKING;
		}


}
