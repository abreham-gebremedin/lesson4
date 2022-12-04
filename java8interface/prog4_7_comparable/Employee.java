package prog4_7_comparable;

 import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable {

	private AccountList accounts;
	private String name;
	private Date hireDate;
	private LocalDate lastAccountCheckedDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
//		 * update, using  
 		GregorianCalendar cal = 
				new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
		lastAccountCheckedDate=LocalDate.now();

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
		
		if (accountIndex==2) {
			double penality=0.02*selected.getBalance();
			selected.makeWithdrawal(accountIndex);
			System.out.println("retirement account, a 2%  "+penality+" penalty is applied to the balance");
		} 
		selected.makeWithdrawal(amt);

		return false;
	}
	
	public Account readAccount(int accountIndex) {
		Account selected = accounts.get(accountIndex);
		double interest=0.0;
		if (accountIndex==0) {
		      LocalDate currentDateMinus30Days = LocalDate.now().minusDays(30);
			 if (lastAccountCheckedDate.isBefore(currentDateMinus30Days)) {
				 interest=5;
					selected.makeDeposit(interest);
					System.out.println("Checking account, a   "+interest+" interest is applied to the balance");		  
				}
			 return selected;
		} else if (accountIndex==1) {

		      LocalDate currentDateMinus30Days = LocalDate.now().minusDays(30);
			 if (lastAccountCheckedDate.isBefore(currentDateMinus30Days)) {
				 interest=0.25*selected.getBalance();
					selected.makeDeposit(interest);
					System.out.println("Saving account, a   "+interest+" interest is applied to the balance");		  
				}
			 return selected;
		}else {
			
		}
 
		return accounts.get(2);	}
	
	

	public String getName() {
		return name;
	}

	public Date getHireDate() {
		return hireDate;
	}
	

	@Override
	public double comparingEmployees() {
		// TODO Auto-generated method stub
		
 		return this.accounts.getMax(this.accounts.getStrArray());
		
	}

 

}