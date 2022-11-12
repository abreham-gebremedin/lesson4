package useinheritance;

import java.time.LocalDate;

/*
Creating A super class Employee which is extended or inherited by Manager class
*/class Employee {
	//instance fields
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		hireDay = LocalDate.of(aYear, aMonth, aDay);
	}

	// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	
	
	/** Make equals final to prevent unwanted overriding. 
	 */
	@Override
	public final boolean equals(Object ob) {
		// if  the object references is null return false
		if (ob == null) return false;
	    // it checks if the argument is of the 
        // type Employee by comparing the classes 
        // of the passed argument and this object.
        // if(!(obj instance of Employee)) return false;
		if (!(ob instanceof Employee)) return false;
        // type casting of the argument. 
		Employee e = (Employee) ob;
	    // comparing the state of argument with 
        // the state of 'this' Object.
		return (e.name.equals(name) && e.salary==salary && e.hireDay.equals(hireDay));	
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Employee copy = (Employee)super.clone();
		//no need to clone LocalDate
		return copy;
	}
	
	/** Override hashCode whenever you override equals -- see lesson 11 */
	@Override
	public final int hashCode() {
		int result = 17;
		long salaryHashLong = Double.doubleToLongBits(salary);
		int salaryHash = (int) (salaryHashLong ^ (salaryHashLong >>> 32));
		result = 31 * result + name.hashCode();
		result = 31 * result + salaryHash;
		result = 31 * result + hireDay.hashCode();
		return result;
	}
	


	
}
