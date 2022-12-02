package prog4_1_department;

import java.util.Date;

class Professor extends DeptEmployee{

	private int numberOfPublications;

	public Professor(String name, double salary, Date hireDate, int numberOfPublications) {
		super(name, salary, hireDate);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", salary=" + salary + ", hireDate="
				+ hireDate + ", numberOfPublications=" + numberOfPublications
				+ "]";
	}

}