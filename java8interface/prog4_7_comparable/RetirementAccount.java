package prog4_7_comparable;

public class RetirementAccount extends Account {

	public RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
		}
}
