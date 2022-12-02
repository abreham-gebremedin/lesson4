package prog4_1_department;

import java.util.Date;

class Secretary extends DeptEmployee{

	private double overtimeHours;

	public Secretary(String name, double salary, Date hireDate, double overtimeHours) {
		super(name, salary, hireDate);
		this.overtimeHours = overtimeHours;
	}

	public double computeSalary(){
		return salary + (12 * overtimeHours) ;
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public String toString() {
		return "Secretary [name=" + name + ", salary=" + salary + ", hireDate="
				+ hireDate + ", overtimeHours=" + overtimeHours + "]";
	}

}