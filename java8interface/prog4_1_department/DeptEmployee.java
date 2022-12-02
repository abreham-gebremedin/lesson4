package prog4_1_department;

import java.util.Date;

class DeptEmployee{
	
	protected String name;
	protected double salary;
	protected Date hireDate;
	
	public DeptEmployee(String name, double salary, Date hireDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public double computeSalary(){
		return salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
}
