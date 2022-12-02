package prog4_1_department;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static GregorianCalendar cal = new GregorianCalendar();

	public static void main(String[] args) {

		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = new Professor("Beza", 50000, extractDate(03,12,2003), 2019);
		department[1] = new Professor("Michael", 65000, extractDate(07,25,2010), 10);
		department[2] = new Professor("Tibebe", 80000,extractDate(11,02,2000), 10);
		department[3] = new Secretary("Abreham", 50000, extractDate(07,02,2018), 200);
		department[4] = new Secretary("Martha", 100000, extractDate(05,22,1999), 200);

		for (DeptEmployee deptEmployee : department) {
			System.out.println(deptEmployee.toString());
		}

		Scanner input = new Scanner(System.in);

		System.out.println("Do you wish to see the sum of all salaries in the department ? Y/N");

		String yesno = input.next();

		if(yesno.equalsIgnoreCase("y")){
			System.out.printf("Sum of all salaries in the department : %.2f",getSumOfEmployeesSalaries(department));
		}

	}

	public static double getSumOfEmployeesSalaries(DeptEmployee[] department) {

		double total = 0;
		for (DeptEmployee deptEmployee : department) {
			total = total + deptEmployee.salary;
		}
		return total;
	}

	public static Date extractDate(int month, int day, int year) {
		cal.set(year, month, day);
		return cal.getTime();
	}

}