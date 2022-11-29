 

public class TestProg6 {
	
	//TDD
	//Step 1: Think think what we need mmmm.
	//Prog6 class with an array of String with arguments
	// method to return an array without duplicates words
	
	String[] arrrayOfStrings = {"horse", "dog", "cat", "horse","dog"};
	String[] arrrayOfStrings1 = {"horse", "dog", "cat"};
	String[] arrrayOfStrings2 = {"horse", "horse"};
	
	//Step 2: Create the code to make this run:
	// Create Prog6 class
	//		  method removeDups, exitsElementAt, countElments
	
	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveDups() {
		
		//Test case#1 : Example of the lab two repeated elements
		String[] source1 = {"horse", "dog", "cat", "horse","dog"};	
		String[] result1 = {"horse","dog","cat"};
		
		assertEquals(result1, Prog6.removeDups(source1));
	}
	
	 
	
}