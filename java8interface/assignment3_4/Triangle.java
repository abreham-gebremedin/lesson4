package assignment3_4;

/*Immutable class in java means that once an object is created, we cannot change its content.
 *  In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable. 
 *  We can create our own immutable class as well. Prior to going ahead do go through characteristics of immutability 
 *  in order to have a good understanding while implementing the same. Following are the requirements: 
 *        1 The class must be declared as final so that child classes can’t be created.
 *        2 Data members in the class must be declared private so that direct access is not allowed.
 *        3 Data members in the class must be declared as final so that we can’t change the value of it after object creation.
 *        4 A parameterized constructor should initialize all the fields performing a deep copy so that data members 
 *         can’t be modified with an object reference.
 *        5 Deep Copy of objects should be performed in the getter methods to return a copy rather than returning
 *          the actual object reference)
 *          //6  Note that there should not be any setters*/
final public class Triangle {

	final private double base;
	final private double height;
	 
//   Constructor of immutable class
//	 Parameterized constructor
	public Triangle(double base,double height) {
		this.base = base;
		this.height = height;
	}

 

	 

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double computeArea() {
		return 0.5 * base * height;
	}


}