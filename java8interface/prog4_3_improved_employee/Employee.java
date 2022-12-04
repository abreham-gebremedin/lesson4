package prog4_3_improved_employee;

 import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private AccountList accounts;
	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		
//		 * update, using  
		GregorianCalendar cal = 
				new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
		accounts= new AccountList();
		 
	}

	public void createNewChecking(double startAmount) {
		// implement
		Account acct = new CheckingAccount(this,startAmount);
		
		//accounts is the name of the AccountList variable
		accounts.add(acct);


	}

	public void createNewSavings(double startAmount) {
		// implement
		Account acct = new SavingsAccount(this,startAmount);
		//accounts is the name of the AccountList variable
		accounts.add(acct);
 	}

	public void createNewRetirement(double startAmount) {
		// implement		
		Account acct = new RetirementAccount(this,startAmount);
		//accounts is the name of the AccountList variable
		
		accounts.add(acct);
		
  
	}
	
	public AccountList getAccounts() {
		
		return accounts;
	}

	public String getFormattedAcctInfo() {
		// implement
		String formattedAccountInfo = String.format("%nACCOUNT INFO FOR %s: %n", name);
		AccountList al=getAccounts();
		formattedAccountInfo += al;

 

		 

		return formattedAccountInfo;
	}

	public void deposit(int accountIndex, double amt) {
		// implement
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);

	}

	public boolean withdraw (int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		selected.makeWithdrawal(amt);

		return false;
	}

	public String getName() {
		return name;
	}

	public Date getHireDate() {
		return hireDate;
	}

 

}