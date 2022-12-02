package quizes;

/*In object-oriented programming, a singleton class is a class that can have only one object (an 
 * instance of the class) at a time. After the first time, if we try to instantiate the Singleton class, the
 * new variable also points to the first instance created. So whatever modifications we do to any
 * variable inside the class through any instance, affects the variable of the single instance created
 * and is visible if we access that variable through any variable of that class type defined. */

/*Remember the key points while defining class as a singleton class that is while designing a singleton class: 
 *      Make a constructor private.
 *      Write a static method that has the return type object of this singleton class. 
 *      Here, the concept of Lazy initialization is used to write this static method.
 *      for more visit   https://www.geeksforgeeks.org/singleton-class-java/
*/
public class Singlton {
	
	private static Singlton singlton=new Singlton();
	
	
	/*
	 * A private constructor in Java is used in restricting object creation. It is a
	 * special instance constructor used in static member-only classes. If a
	 * constructor is declared as private, then its objects are only accessible from
	 * within the declared class. You cannot access its objects from outside the
	 * constructor class.
	 * 
	 */
	/*
	 * A private constructor is a special instance constructor. It is generally used
	 * in classes that contain static members only. If a class has one or more
	 * private constructors and no public constructors, other classes (except nested
	 * classes) cannot create instances of this class.
	 */	
	private Singlton() {
		// TODO Auto-generated constructor stub
	}
	 @SuppressWarnings("unused")
	private static Singlton getSingletonInstance() {
		// TODO Auto-generated method stub
		 return singlton;

	}

}
