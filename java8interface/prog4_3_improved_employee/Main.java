package prog4_3_improved_employee;

import java.util.Scanner;

public class Main {
	String exitanswer2;

	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		double balance;
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		emps[0].createNewSavings(25000);
		emps[0].createNewRetirement(9800);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(11455);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(98700);

		String answer;
		String exitanswer="";

		do {


			System.out.println("A. See a report of all accounts.");
			System.out.println("B. Make a deposit.\r\n"+ "");
			System.out.println("C. Make a withdrawal.\r\n");
			System.out.println("Make a selection (A/B/C):\r\n");
			Scanner sc = new Scanner(System.in);
			String answer1 = sc.next();
			switch (answer1) {
			case "A": {
				//display info to console
				for (int i = 0; i < emps.length; i++) {
					String info = getFormattedAccountInfo(i);
					System.out.println("===============================================");
					System.out.println(info);
					System.out.println("===============================================");


				}
				break;

			}
			case "B": {
				do {
					for (int i = 0; i < emps.length; i++) {
						System.out.println("Press "+i+" for " + emps[i].getName());
					}

					int c=sc.nextInt();

					switch (c) {
					case 0:
						do {
							
							System.out.println("0. checking");
							System.out.println("1. savings");
							System.out.println("2. retirement");
							System.out.println("Select an account: (type a number)"); 
 

							int c2=sc.nextInt();

							switch (c2) {
							case 1:
								System.out.println("Deposit amount: ");
								balance=sc.nextDouble();
								emps[0].createNewChecking(balance);
								System.out.println(balance+" has been deposited in the"); 
								System.out.println("Checking account of"+ emps[0].getName()); 

								break;
							case 2:
								System.out.println("Deposit amount: ");
								balance=sc.nextDouble();
								emps[0].createNewSavings(balance);
								System.out.println(balance+" has been deposited in the"); 
								System.out.println("Saving account of"+ emps[0].getName()); 
								break;
							case 3:
								System.out.println("Deposit amount: ");
								balance=sc.nextDouble();
								emps[0].createNewRetirement(balance);
								System.out.println(balance+" has been deposited in the"); 
								System.out.println("Retirement account of"+ emps[0].getName()); 
								break;

							default:
								System.out.println("No Account created");
								break;
							}
		                 System.out.println("Press Y or y to exit");
		 				   exitanswer2 = sc.next();
						} while (exitanswer.equalsIgnoreCase("Y"));

						break;
					case 1:
 						do {
							
							System.out.println("1. checking");
							System.out.println("2. savings");
							System.out.println("3. retirement");
							System.out.println("Select an account: (type a number)"); 
							Scanner sc1=new Scanner(System.in);
 
						int c3=sc1.nextInt();

						switch (c3) {
						case 1:
							System.out.println("Deposit amount: ");
							balance=sc.nextDouble();
							emps[0].createNewChecking(balance);
							System.out.println(balance+" has been deposited in the"); 
							System.out.println("Checking account of"+ emps[1].getName()); 

							break;
						case 2:
							System.out.println("Deposit amount: ");
							balance=sc.nextDouble();
							emps[0].createNewSavings(balance);
							System.out.println(balance+" has been deposited in the"); 
							System.out.println("Saving account of"+ emps[1].getName()); 
							break;
						case 3:
							System.out.println("Deposit amount: ");
							balance=sc.nextDouble();
							emps[0].createNewRetirement(balance);
							System.out.println(balance+" has been deposited in the"); 
							System.out.println("Retirement account of"+ emps[1].getName()); 
							break;

						default:
							System.out.println("No Account created");
							break;
						}
	                 System.out.println("Press Y or y to exit");
	 				   exitanswer2 = sc.next();
					} while (exitanswer.equalsIgnoreCase("Y"));
						break;
					case 2:
 						do {
							
							System.out.println("0. checking");
							System.out.println("1. savings");
							System.out.println("2. retirement");
							System.out.println("Select an account: (type a number)"); 
 
						int c3=sc.nextInt();

						switch (c3) {
						case 1:
							System.out.println("Deposit amount: ");
							balance=sc.nextDouble();
							emps[0].createNewChecking(balance);
							System.out.println(balance+" has been deposited in the"); 
							System.out.println("Cheking account of"+ emps[2].getName()); 

							break;
						case 2:
							System.out.println("Deposit amount: ");
							balance=sc.nextDouble();
							emps[0].createNewSavings(balance);
							System.out.println(balance+" has been deposited in the"); 
							System.out.println("saving account of"+ emps[2].getName()); 
							break;
						case 3:
							System.out.println("Deposit amount: ");
							balance=sc.nextDouble();
							emps[0].createNewRetirement(balance);
							System.out.println(balance+" has been deposited in the"); 
							System.out.println("Retirement account of"+ emps[2].getName()); 
							break;

						default:
							System.out.println("No Account created");
							break;
						}
	                 System.out.println("Press Y or y to continueB");
	 				   exitanswer2 = sc.next();
					} while (exitanswer.equalsIgnoreCase("Y"));

						break;

					default:
						break;
					}
                 System.out.println("Press Y or y to exit");
 				   exitanswer = sc.next();
				} while (exitanswer.equalsIgnoreCase("Y"));
			}
			case "C": {
				System.out.println("Make a withdrawal.\r\n"
						+ "");
				break;
			}
			default:
				System.out.println("Have a nice day");
				break;
 			}

			System.out.print("do you want to continue? (y/n) ");
			 answer = sc.next();
		} while (answer.equalsIgnoreCase("y"));



	}
	String getFormattedAccountInfo(int i) {
		//implement

		return emps[i].getFormattedAcctInfo();
	}
}
