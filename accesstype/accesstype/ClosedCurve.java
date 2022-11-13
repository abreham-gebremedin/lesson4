package  accesstype;

/*Abstraction is hiding the details and implementation of the code. 
Encapsulation is hiding the data and controlling the visibility of the code.*/
abstract public class ClosedCurve {
	abstract double computeArea();
	
	public void sayHello() {
		System.out.println("Hello");
	}

}
