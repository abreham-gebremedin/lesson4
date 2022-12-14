package prog4_6_equals.prog4_6_equals_case2;


import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String n, GregorianCalendar dob, double s) {
		super(n, dob);
		this.salary = s;
	} 
	public double getSalary() {
		return salary;
	} 
	@SuppressWarnings("unlikely-arg-type")
	public boolean equals(Object apersonWithJob, Object apersonWithJob2) {
		// TODO Auto-generated method stub
		if(apersonWithJob == null) return false;
		if(!(apersonWithJob instanceof PersonWithJob)) return false;
		PersonWithJob p= (PersonWithJob) apersonWithJob;
		PersonWithJob p2 = (PersonWithJob) apersonWithJob2;
		return p.equals(p2.name) && p.dateOfBirth.equals(p2.dateOfBirth)&&p.salary==p2.salary;
	}

} 