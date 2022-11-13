package useinheritance;

import java.time.LocalDate;

/*Inheritance in java (IS-A relationship) is referred to the ability where 
	child objects inherit or acquire all the properties and behaviors from parent object. 
	In object oriented programming, inheritance is used to promote the code re-usability.
	*/

	/*Let’s say we have Employee class. Employee class has all common attributes and methods which all employees
	must have within organization. There can be other specialized employees as well e.g. Manager. 
	Managers are regular employees of organization but, additionally, they have few more  over other employees
	e.g. they have bonus.
	*/

	/*To inherit all non-private members from Employee class (in this case getter and setter and other methods), 
	Manager extends Employee is used
	Clearly, Manager class is able to use members of Employee class. This very behavior is called inheritance. */

	//creating Manager class by Extending Employee class to inherit
class Manager extends Employee {
	
 
	/*
	 * Now consider if we do not use inheritance. Then we would have defined name,
	 * salary, year,month and day in both classes. It would have caused code duplication
	 * which always create problems in code maintenance.
	 */
	
    private double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		/*
		 * Constructors of super class can be called via super keyword.
		 *  There are only two rules:
		 * 
		 * super() call must be made from child class constructor. 
		 * super() call must be first statement inside constructor.
		 */
		
//		super(name, salary, year, month, day) here we are calling Employee class constructor
		//This must be first statement inside constructor
		super(name, salary, year, month, day);
        //Other code after calling super class constructor
		bonus = 0;
	}
     
	@Override
	public double getSalary() {
		// no direct access to private variables of superclass
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
 

	public void setBonus(double b) {
		bonus = b;
	}
	
	/*
	 * Let’s summarize what we learned about java inheritance:
	 * 
	 * Inheritance is also known IS-A relationship. It provides child class the
	 * ability to inherit non-private members of parent class. In java, inheritance
	 * is achieved via extends keyword. From Java 8 onward, you can use interfaces
	 * with default methods to achieve multiple inheritance. Member fields are
	 * accessed from reference type class. Member methods are accessed from actual
	 * instance types.
	 */


 }
