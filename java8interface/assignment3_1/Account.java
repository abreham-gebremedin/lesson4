package assignment3_1;

class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	public AccountType acctType;
	private Employee employee;
	
	
	public Account() {
		// TODO Auto-generated constructor stub
		this.balance=DEFAULT_BALANCE;
	}
	
	public Account(Employee emp, AccountType acctType, double balance){
		employee = emp;
		this.acctType =acctType;
		this.balance = balance;
	}
	Account(Employee emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);
	}
	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}
	public void makeDeposit(double deposit) {
		//implement
		this.balance=this.balance+deposit;
				
	}
	
	
	//updates the balance field and returns true, unless 
	//withdrawal amount is too large; in that case, 
	//it does not modify the balance field, and returns false
//	public boolean makeWithdrawal(double amount)
	public boolean makeWithdrawal(double amount) {
		//implement
		if(this.balance>amount)
		{
			this.balance-=amount;
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
}
