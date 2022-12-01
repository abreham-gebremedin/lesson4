package assignment3_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("Abebe", "Kebede", 500000.0, 2018, 06, 18);
//		 ,  and 
		 Account checkingAccount=new Account(employee, AccountType.CHECKING, 300.0);
		 Account savingsAccount=new Account(employee, AccountType.SAVINGS, 300.0);
		 Account retirementAccount=new Account(employee, AccountType.RETIREMENT, 300.0);
         System.out.println(checkingAccount.toString());
         System.out.println(savingsAccount.toString());
         System.out.println(retirementAccount.toString());


 
	}

}
