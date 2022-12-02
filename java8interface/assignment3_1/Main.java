package assignment3_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * It creates a new Employee object employee (you can invent your own name,
		 * hireday, salary, etc., to be used in the constructor)
		 */
		Employee employee=new Employee("Abebe", "Kebede", 500000.0, 2018, 06, 18);
		/*
		 * Then it creates a checking account, savings account and retirement account
		 * for employee, each with a starting balance of $300.
		 */
		 Account checkingAccount=new Account(employee, AccountType.CHECKING, 300.0);
		 Account savingsAccount=new Account(employee, AccountType.SAVINGS, 300.0);
		 Account retirementAccount=new Account(employee, AccountType.RETIREMENT, 300.0);
		 
		 
			/*
			 * Then it prints to the console the account data for each of these accounts
			 * (making use of the toString() method that has been provided in Account
			 */
         System.out.println(checkingAccount.toString());
         System.out.println(savingsAccount.toString());
         System.out.println(retirementAccount.toString());


 
	}

}
