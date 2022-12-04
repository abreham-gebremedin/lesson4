package prog4_6_equals_case3;

import java.util.GregorianCalendar;

public class Person {
	private String name;
	private GregorianCalendar dateOfBirth;
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
} 