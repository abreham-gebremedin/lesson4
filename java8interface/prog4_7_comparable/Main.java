package prog4_7_comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


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
		emps[0].createNewChecking(90000);
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
			System.out.println("D. Read Account.\r\n");
			System.out.println("Make a selection (A/B/C/D):\r\n");
	        HashMap<String, String> dataMap = new HashMap<String, String>();
			for (int i = 0; i < emps.length; i++) {


				// method to add the key,value pair in hashmap
				
				String s=String. valueOf(emps[i].comparingEmployees());
				dataMap.put(emps[i].getName(),s);

			}
			
			System.out.println("HashMap before sorting, random order ");
	        Set<Entry<String, String>> entries = dataMap.entrySet();
	       
	        for(Entry<String, String> entry : entries){
	            System.out.println(entry.getKey() + " ==> " + entry.getValue());
	        }
	        
	        // Now let's sort HashMap by keys first 
	        // all you need to do is create a TreeMap with mappings of HashMap
	        // TreeMap keeps all entries in sorted order
	        TreeMap<String, String> sorted = new TreeMap<>(dataMap);
	        Set<Entry<String, String>> mappings = sorted.entrySet();
	        
	        System.out.println("HashMap after sorting by keys in ascending order ");
 
	        for(Entry<String, String> mapping : mappings){
	            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
	        }
	        
	       
  
 
			// Now let's sort the HashMap by values
	        // there is no direct way to sort HashMap by values but you
	        // can do this by writing your own comparator, which takes
	        // Map.Entry object and arrange them in order increasing 
	        // or decreasing by values.
	        
	        Comparator<Entry<String, String>> valueComparator 
	               = new Comparator<Entry<String,String>>() {
	            
	            @Override
	            public int compare(Entry<String, String> e1, Entry<String, String> e2) {
	                String v1 = e1.getValue();
	                String v2 = e2.getValue();
	                return v1.compareTo(v2);
	            }
	        };
	        
	        // Sort method needs a List, so let's first convert Set to List in Java
	        List<Entry<String, String>> listOfEntries 
	                  = new ArrayList<Entry<String, String>>(entries);
	        
	        // sorting HashMap by values using comparator
	        Collections.sort(listOfEntries, valueComparator);
	        
	        LinkedHashMap<String, String> sortedByValue 
	                    = new LinkedHashMap<String, String>(listOfEntries.size());
	        
	        // copying entries from List to Map
	        for(Entry<String, String> entry : listOfEntries){
	            sortedByValue.put(entry.getKey(), entry.getValue());
	        }
	        
	        
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

							System.out.println("1. checking");
							System.out.println("2. savings");
							System.out.println("3. retirement");
							System.out.println("Select an account: (type a number)"); 


							int c2=sc.nextInt();

							switch (c2) {
							case 1:
								System.out.println("Deposit amount: ");
								balance=sc.nextDouble();		
								emps[0].deposit(0,balance );
								System.out.println(balance+" has been deposited in the Checking Account"); 
								String info = getFormattedAccountInfo(0);


								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");

								break;
							case 2:
								System.out.println("Deposit amount: ");
								balance=sc.nextDouble();
								emps[0].deposit(1,balance );
								System.out.println(balance+" has been deposited in the Saving Account"); 
								info = getFormattedAccountInfo(0);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");

								break;
							case 3:
								System.out.println("Deposit amount: ");
								balance=sc.nextDouble();
								emps[0].deposit(2,balance );
								System.out.println(balance+" has been deposited in the Retirement  Account"); 

								info = getFormattedAccountInfo(0);
								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");
								break;

							default:
								System.out.println("No Account created");
								break;
							}
							System.out.println("Press Y or y to exit");
							exitanswer = sc.next();
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
								emps[1].deposit(0,balance );
								System.out.println(balance+" has been deposited in the Checking Account"); 
								String info = getFormattedAccountInfo(1);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");

								break;
							case 2:
								System.out.println("Deposit amount: ");
								balance=sc.nextDouble();
								emps[1].deposit(1,balance );
								System.out.println(balance+" has been deposited in the Saving Account"); 
								info = getFormattedAccountInfo(1);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");
								break;
							case 3:
								System.out.println("Deposit amount: ");
								balance=sc.nextDouble();
								emps[1].deposit(2,balance );
								System.out.println(balance+" has been deposited in the Retirement  Account"); 
								info = getFormattedAccountInfo(1);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");
								break;

							default:
								System.out.println("No Account created");
								break;
							}
							System.out.println("Press Y or y to exit");
							exitanswer = sc.next();
						} while (exitanswer.equalsIgnoreCase("Y"));
						break;
					case 2:
						do {

							System.out.println("1. checking");
							System.out.println("2. savings");
							System.out.println("3. retirement");
							System.out.println("Select an account: (type a number)"); 

							int c3=sc.nextInt();

							switch (c3) {
							case 1:
								System.out.println("Deposit amount: ");
								balance=sc.nextDouble();
								emps[2].deposit(0,balance );
								System.out.println(balance+" has been deposited in the Checking Account"); 
								String info = getFormattedAccountInfo(2);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");

								break;
							case 2:
								System.out.println("Deposit amount: ");
								balance=sc.nextDouble();
								emps[2].deposit(1,balance );
								System.out.println(balance+" has been deposited in the Saving Account"); 
								info = getFormattedAccountInfo(2);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");
								break;
							case 3:
								System.out.println("Deposit amount: ");
								balance=sc.nextDouble();
								emps[2].deposit(2,balance );
								System.out.println(balance+" has been deposited in the Retirement  Account"); 
								info = getFormattedAccountInfo(2);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");
								break;

							default:
								System.out.println("No Account created");
								break;
							}

						} while (exitanswer.equalsIgnoreCase("Y"));

						break;

					default:
						break;
					}
					System.out.println("Press Y or y to exit");
					exitanswer = sc.next();
				} while (exitanswer.equalsIgnoreCase("Y"));
				break;
			}
			case "C": {
				do {
					System.out.println("Withdrawal window");
					for (int i = 0; i < emps.length; i++) {
						System.out.println("Press "+i+" for " + emps[i].getName());
					}

					int c=sc.nextInt();

					switch (c) {
					case 0:
						do {

							System.out.println("1. checking");
							System.out.println("2. savings");
							System.out.println("3. retirement");
							System.out.println("Select an account: (type a number)"); 


							int c2=sc.nextInt();

							switch (c2) {
							case 1:
								System.out.println("Withdraw amount: ");
								balance=sc.nextDouble();
								emps[0].withdraw(0,balance );
								System.out.println(balance+" has been Withdrawed in the Checking Account"); 
								String info = getFormattedAccountInfo(0);


								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");

								break;
							case 2:
								System.out.println("Withdraw amount: ");
								balance=sc.nextDouble();
								emps[0].withdraw(1,balance );
								System.out.println(balance+" has been Withdrawed in the Saving Account"); 
								info = getFormattedAccountInfo(0);


								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");

								break;
							case 3:
								System.out.println("Withdraw amount:");
								balance=sc.nextDouble();
								emps[0].withdraw(2,balance );
								System.out.println(balance+" has been Withdrawed in the Retirement  Account"); 
								info = getFormattedAccountInfo(0);


								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");
								break;

							default:
								System.out.println("No Account created");
								break;
							}
							System.out.println("Press Y or y to exit");
							exitanswer = sc.next();
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
								System.out.println("Withdraw amount: ");
								balance=sc.nextDouble();
								emps[1].withdraw(0,balance );
								System.out.println(balance+" has been Withdrawed in the Checking Account"); 
								String info = getFormattedAccountInfo(1);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");

								break;
							case 2:
								System.out.println("Withdraw amount: ");
								balance=sc.nextDouble();
								emps[1].withdraw(1,balance );
								System.out.println(balance+" has been Withdrawed in the Saving Account"); 
								info = getFormattedAccountInfo(1);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");
								break;
							case 3:
								System.out.println("Withdraw amount: ");
								balance=sc.nextDouble();
								emps[1].withdraw(2,balance );
								System.out.println(balance+" has been Withdrawed in the Retirement  Account"); 
								info = getFormattedAccountInfo(1);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");
								break;

							default:
								System.out.println("No Account created");
								break;
							}
							System.out.println("Press Y or y to exit");
							exitanswer = sc.next();
						} while (exitanswer.equalsIgnoreCase("Y"));
						break;
					case 2:
						do {

							System.out.println("1. checking");
							System.out.println("2. savings");
							System.out.println("3. retirement");
							System.out.println("Select an account: (type a number)"); 

							int c3=sc.nextInt();

							switch (c3) {
							case 1:
								System.out.println("Withdraw amount: ");
								balance=sc.nextDouble();
								emps[2].withdraw(0,balance );
								System.out.println(balance+" has been Withdrawed in the Checking Account"); 
								String info = getFormattedAccountInfo(2);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");

								break;
							case 2:
								System.out.println("Withdraw amount: ");
								balance=sc.nextDouble();
								emps[2].withdraw(1,balance );
								System.out.println(balance+" has been Withdrawed in the Saving Account"); 
								info = getFormattedAccountInfo(2);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");
								break;
							case 3:
								System.out.println("Withdraw amount: ");
								balance=sc.nextDouble();
								emps[2].withdraw(2,balance );
								System.out.println(balance+" has been Withdrawed in the Retirement  Account"); 
								info = getFormattedAccountInfo(2);

								System.out.println("===============================================");
								System.out.println(info);
								System.out.println("===============================================");
								break;

							default:
								System.out.println("No Account created");
								break;
							}

						} while (exitanswer.equalsIgnoreCase("Y"));

						break;

					default:
						break;
					}
					System.out.println("Press Y or y to exit");
					exitanswer = sc.next();
				} while (exitanswer.equalsIgnoreCase("Y"));
				break;
			}
			case "D":{

				do {
					System.out.println("read Account window");
					for (int i = 0; i < emps.length; i++) {
						System.out.println("Press "+i+" for " + emps[i].getName());
					}

					int c=sc.nextInt();

					switch (c) {
					case 0:
						do {

							System.out.println("1. checking");
							System.out.println("2. savings");
							System.out.println("3. retirement");
							System.out.println("Select an account: (type a number)"); 


							int c2=sc.nextInt();

							switch (c2) {
							case 1:

								System.out.println("Your Balance "+emps[0].readAccount(0));  

								break;
							case 2:
								System.out.println("Your Balance "+emps[0].readAccount(1));  

								break;
							case 3:

								System.out.println("Your Balance "+emps[0].readAccount(2));  
								break;

							default:
								System.out.println("No Account ");
								break;
							}
							System.out.println("Press Y or y to exit");
							exitanswer = sc.next();
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

								System.out.println("Your Balance "+emps[1].readAccount(0));  
								break;
							case 2: 
								System.out.println("Your Balance "+emps[1].readAccount(1));  
								break;
							case 3:


								System.out.println("Your Balance "+emps[1].readAccount(2));  
								break;

							default:
								System.out.println("No Account created");
								break;
							}
							System.out.println("Press Y or y to exit");
							exitanswer = sc.next();
						} while (exitanswer.equalsIgnoreCase("Y"));
						break;
					case 2:
						do {

							System.out.println("1. checking");
							System.out.println("2. savings");
							System.out.println("3. retirement");
							System.out.println("Select an account: (type a number)"); 

							int c3=sc.nextInt();

							switch (c3) {
							case 1:


								System.out.println("Your Balance "+emps[2].readAccount(0));  

								break;
							case 2:


								System.out.println("Your Balance "+emps[2].readAccount(1));  
								break;
							case 3:

								System.out.println("Your Balance "+emps[2].readAccount(2));  
								break;

							default:
								System.out.println("No Account created");
								break;
							}

						} while (exitanswer.equalsIgnoreCase("Y"));

						break;

					default:
						break;
					}
					System.out.println("Press Y or y to exit");
					exitanswer = sc.next();
				} while (exitanswer.equalsIgnoreCase("Y"));
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
