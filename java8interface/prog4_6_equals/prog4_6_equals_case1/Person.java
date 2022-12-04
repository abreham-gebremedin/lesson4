package prog4_6_equals.prog4_6_equals_case1;

import java.util.GregorianCalendar;

public class Person {
	protected String name;
	protected GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	} 
	public String getName() {
		return name;
	} 
	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	} 
	
	@Override
	public boolean equals(Object aperson) {
		// TODO Auto-generated method stub
		 if(aperson == null) return false;
		    if(!(aperson instanceof Person)) return false;
		    Person p = (Person) aperson;
		    return this.name.equals(p.name);
	}
} 