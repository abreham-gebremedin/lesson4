package useinheritance;

public class Main {
	
	public static void main(String[] args) {
        Employee employee = new Employee("Miki", 20000, 2005, 05, 1);     //Actual object is Employee Type
        System.out.println(employee.getName());
//        we are creating  Employee manager object with manager class
//        this called in java down casting
//        we just define the manager object with Employee class and 
//        instantiated it with a manager class b/c manager class is sub class of an Employee class
        Employee manager = new Manager("D.r Tibebe", 30000, 2000, 06, 18); //Actual object is Manager Type
        System.out.println(manager.getName());
         
        Manager mgr = new Manager("D.r Martha", 30000, 20000, 12, 26);       //Actual object is Manager Type
        System.out.println(mgr.hashCode());
       
    }
	

}
