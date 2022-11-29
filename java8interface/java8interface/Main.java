package java8interface;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		Item item1 = new Item(15.00, .07, "Bread");
		Item item2 = new Item(11.25, .07, "Nuts");
		Item item3 = new Item(13.10, .07, "Oranges");
		Item item4 = new Item(25.00, .07, "Tea");
		Item item5 = new Item(17.60, .07, "Tofu");
		
		/*
		 * List in Java provides the facility to maintain the ordered collection. It
		 * contains the index-based methods to insert, update, delete and search the
		 * elements. It can have the duplicate elements also. We can also store the null
		 * elements in the list. The List interface is found in the java.util package
		 * and inherits the Collection interface. It is a factory of ListIterator
		 * interface. Through the ListIterator, we can iterate the list in forward and
		 * backward directions. The implementation classes of List interface are
		 * ArrayList, LinkedList, Stack and Vector. The ArrayList and LinkedList are
		 * widely used in Java programming. The Vector class is deprecated since Java 5.
		 */
//		example
		/*
		 * //Creating a List of type String using ArrayList 
		 * List<String> list=new  ArrayList<String>();
		 * 
		 * //Creating a List of type Integer using ArrayList 
		 * List<Integer> list=new ArrayList<Integer>();
		 * 
		 * //Creating a List of type Book using ArrayList 
		 * List<Book> list=new ArrayList<Book>();
		 * 
		 * //Creating a List of type String using LinkedList 
		 * List<String> list=new LinkedList<String>();
		 */
	    
		List<Item> itemsForOrdinaryCart = new ArrayList<>();
		itemsForOrdinaryCart.add(item1);
		itemsForOrdinaryCart.add(item2);
		itemsForOrdinaryCart.add(item3);
		
		List<Item> itemsForGoldCart = new ArrayList<>();
		itemsForGoldCart.add(item4);
		itemsForGoldCart.add(item5);
		
		ShoppingCart ordinaryCart 
		   = new ShoppingCartOrdinary("Joe Ordinary", itemsForOrdinaryCart,
		      LocalDate.of(2017, 8, 2));
		
		//Gold members get a fixed discount
		ShoppingCart goldCart 
		   = new ShoppingCartGoldMember("Jim Special", itemsForGoldCart,
		      LocalDate.of(2017, 8, 2), .05);  
		System.out.println(ordinaryCart.printReceipt());
		System.out.println(goldCart.printReceipt());
	}

}


/*

  Open Declaration   java.util.List<Item>


An ordered collection (also known as a sequence). The user of this interface has precise control over where in the list
 each element isinserted. The user can access elements by their integer index (position inthe list), and search for
  elements in the list.

Unlike sets, lists typically allow duplicate elements. More formally,lists typically allow pairs of elements e1 and e2
such that e1.equals(e2), and they typically allow multiplenull elements if they allow null elements at all. 
It is not inconceivablethat someone might wish to implement a list that prohibits duplicates, 
bythrowing runtime exceptions when the user attempts to insert them, but weexpect this usage to be rare.

The List interface places additional stipulations, beyond thosespecified in the Collection interface, 
on the contracts of the iterator, add, remove, equals, and hashCode methods. Declarations 
for other inherited methods arealso included here for convenience.

The List interface provides four methods for positional (indexed)access to list elements.
 Lists (like Java arrays) are zero based. Note that these operations may execute in time proportional 
 to the index valuefor some implementations (the LinkedList class, forexample). 
 Thus, iterating over the elements in a list is typicallypreferable to indexing through it if 
 the caller does not know theimplementation.

The List interface provides a special iterator, called a ListIterator, that allows element insertion and replacement,
 and bidirectional access in addition to the normal operations that the Iterator interface provides.
  A method is provided to obtain alist iterator that starts at a specified position in the list.

The List interface provides two methods to search for a specifiedobject.
 From a performance standpoint, these methods should be used withcaution.
  In many implementations they will perform costly linearsearches.

The List interface provides two methods to efficiently insert andremove multiple elements
 at an arbitrary point in the list.

Note: While it is permissible for lists to contain themselves as elements,extreme caution is advised: 
the equals and hashCodemethods are no longer well defined on such a list. 

Some list implementations have restrictions on the elements thatthey may contain. 
For example, some implementations prohibit null elements,and some have restrictions on the types of their elements.
Attempting toadd an ineligible element throws an unchecked exception, typically NullPointerException 
or ClassCastException. Attemptingto query the presence of an ineligible element may throw an exception,
or it may simply return false; some implementations will exhibit the formerbehavior and some will exhibit
 the latter. More generally, attempting anoperation on an ineligible element whose completion 
 would not result inthe insertion of an ineligible element into the list may throw anexception 
 or it may succeed, at the option of the implementation.Such exceptions are marked as "optional" 
 in the specification for thisinterface. 

Unmodifiable Lists

The List.of and List.copyOf static factory methods provide a convenient way to create unmodifiable lists. The Listinstances created by these methods have the following characteristics: 
•They are unmodifiable. Elements cannot be added, removed, or replaced. Calling any mutator method on the Listwill always cause UnsupportedOperationException to be thrown.However, if the contained elements are themselves mutable,this may cause the List's contents to appear to change. 
•They disallow null elements. Attempts to create them with null elements result in NullPointerException. 
•They are serializable if all elements are serializable. 
•The order of elements in the list is the same as the order of theprovided arguments,
 or of the elements in the provided array. 
•The lists and their subList views implement the RandomAccess interface. 
•They are value-based.Programmers should treat instances that are equalas interchangeable and 
should not use them for synchronization, orunpredictable behavior may occur. For example,
 in a future release,synchronization may fail. Callers should make no assumptions about the identity
  of the returned instances. Factories are free tocreate new instances or reuse existing ones. 
•They are serialized as specified on the Serialized Formpage. 

This interface is a member of the Java Collections Framework.
Type Parameters:<E> the type of elements in this listSince:1.2Author:Josh BlochNeal 
Gafter See Also:
CollectionSet
ArrayList
LinkedList
VectorArrays
 

*/

