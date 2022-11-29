package arrayList;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {

	/*
	 * Java ArrayList Vs Array
	 * 
	 * In Java, we need to declare the size of an array before we can use it. Once
	 * the size of an array is declared, it's hard to change it.
	 * 
	 * To handle this issue, we can use the ArrayList class. It allows us to create
	 * resizable arrays.
	 * 
	 * Unlike arrays, array lists can automatically adjust their capacity when we add
	 * or remove elements from them. Hence, array lists are also known as dynamic
	 * arrays. Creating an ArrayList
	 * 
	 * Before using ArrayList, we need to import the java.util.ArrayList package
	 * first. Here is how we can create array lists in Java:
	 */

	  public static void main(String[] args){

	    // create ArrayList
		  List<String> languages = new ArrayList<String>();
		  
		  String[] stringArray2 = new String[10];   //Declarartion by specifying the size  
		  stringArray2[0]="Abebe";
		  stringArray2[1]="Kebede";
		  System.out.println(stringArray2[1]);
		  stringArray2[1]="Ermias";
		/*
		 * Basic Operations on ArrayList
		 * 
		 * The ArrayList class provides various methods to perform different operations
		 * on arraylists. We will look at some commonly used arraylist operations in
		 * this tutorial:
		 * 
		 * Add elements
		 * Access elements
		 * Change elements
		 * Remove elements
		 */
	    
	    // Add elements to ArrayList
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("Swift");
	    System.out.println("ArrayList: " + languages);
	    
	    // get the element from the arraylist
	    String str = languages.get(1);
	    System.out.println("Element at index 1: " + str);
	    
	    // change the element of the array list
	    languages.set(2, "JavaScript");
	    System.out.println("Modified ArrayList: " + languages);
	    
	    // remove element from index 2
	    String removestr = languages.remove(2);
	    System.out.println("Removed Element: " + str);
	    System.out.println("Updated ArrayList: " + languages);
	    
	  }

}
