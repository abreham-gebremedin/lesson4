package prog4_6_equals.prog4_6_equals_case2;

 
import java.util.GregorianCalendar;

public class Person {
	public String name;
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
 
	
} 