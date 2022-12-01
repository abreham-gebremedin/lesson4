package arraySearch;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import prog2_4.Prog4;

class ArraySearchTest {

 
	@SuppressWarnings("deprecation")
	@Test
	public void isTheFiristElement() {
		ArraySearch as=new ArraySearch();
		int arr[] = {2, 3, 5, 4, 5, 3, 10};
		assertEquals(0,as.search(arr, 2) );
		System.out.println("It is the firist index"+as.search(arr, 2));
		
		
		
	} 

	
	@SuppressWarnings("deprecation")
	@Test
	public void isTheLastElement() {
		ArraySearch as=new ArraySearch();
		int arr[] = {2, 3, 5, 4, 5, 3, 10};
		assertEquals(arr.length-1, as.search(arr, 10));
		assertEquals(0,as.search(arr, 2) );
		System.out.println("It is the last index"+as.search(arr, 10));
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void middleElement() {
		ArraySearch as=new ArraySearch();
		int arr[] = {2, 3, 5, 4, 5, 3, 10};
 		assertTrue(as.search(arr, 5)!=-1&&as.search(arr, 5)!=0&&as.search(arr, 5)!=arr.length);
 		System.out.println("The target is somewhere in the middle. "+as.search(arr, 5));
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void notInTheArray() {
		ArraySearch as=new ArraySearch();
		int arr[] = {2, 3, 5, 4, 5, 3, 10};
 		assertTrue(as.search(arr, 20)==-1);
 		System.out.println("The target element is not in the array");
		
	}
 
}
