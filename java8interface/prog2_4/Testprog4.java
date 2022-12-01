package prog2_4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Testprog4 {


	//TDD
	//Step 1: We need to extract only the ids, for the firt step we want just the first one.
	//Step 2: Create the methdos and classes to do that code run
	//Step 3: refactor the code, now we will to do from all Data.record
	
	
	@Test
	public void testGetOneProductId() {
		
		Prog4 p4 = new Prog4();
		
		//Test 1 -> just one product 
		//System.out.println(p4.getOneProductId("231A,Light Bulb,123,Wilco,1.75:"));
		assertEquals("231A", p4.getOneProductId("231A,Light Bulb,123,Wilco,1.75:"));
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetProducts() {
		
		//Test 2 -> Convert a string in a list of arrays
		
		Prog4 p4 = new Prog4();
		
		String[]  result = {"231A,Light Bulb,123,Wilco,1.75",
							"113D,Hairbrush,19,Aamco,3.75",
							"521W,Shampoo,24,Acme,6.95"};
		
		for (int i=0; i<result.length; i++) {
			System.out.println(Arrays.toString(p4.getProductIds(result[i])));
			
		}		
		assertEquals(Arrays.toString(result), Arrays.toString(p4.getProducts("231A,Light Bulb,123,Wilco,1.75:"+
							 "113D,Hairbrush,19,Aamco,3.75:"+
							 "521W,Shampoo,24,Acme,6.95:")));
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetProductIds() {
		
		//Test 3 -> get products ids from 2 products
		Prog4 p4 = new Prog4();
		
		//Arrays.stream(result).forEach((x)-> System.out.println(x));
		
		String[] result = {"231A", "113D"}; 
		assertEquals(Arrays.toString(result), Arrays.toString(p4.getProductIds("231A,Light Bulb,123,Wilco,1.75:"+
											    "113D,Hairbrush,19,Aamco,3.75:")));
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetProductsIds2() {
		
		//Test 4 -> Testing big amount of data
		Prog4 p4 = new Prog4();
		
		String[] result = {"231A", "113D", "521W", "440Q", "009G", "336C", "523E", "888A",
				   "176A", "176B", "176C", "500D", "135B", "211Q", "932V", "678Q",
				   "239A", "975B", "870K", "231S", "562M", "777X", "933W", "215A"};
		
		assertEquals(Arrays.toString(result), Arrays.toString(p4.getProductIds(Data.records)));
		
	}

}