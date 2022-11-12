package useinheritance;

public class Main {
	
	public static void main(String[] args) {
        Employee employee = new Employee("Miki", 20000, 2005, 05, 1);     //Actual object is Employee Type
        System.out.println(employee.getName());
         
//        we are creating  Employee manager object with manager class
//        this called in java down casting
        Employee manager = new Manager("D.r Tibebe", 30000, 2000, 06, 18); //Actual object is Manager Type
        System.out.println(manager.hashCode());
         
        Manager mgr = new Manager("D.r Martha", 30000, 20000, 12, 26);       //Actual object is Manager Type
        System.out.println(mgr.hashCode());
    }
	

}
