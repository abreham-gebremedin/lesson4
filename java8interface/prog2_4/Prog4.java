package prog2_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class Prog4 {
	public static void main(String[] args) {
 
		
	}
	
	public   String[] getProducts (String r1){
		
		String[] tempProducts = r1.split(":", 0);
		
		return tempProducts;
		
	}
	
	//return the id of a product
	public   String getOneProductId(String tempProducts) {
		
		String[] product = tempProducts.split(",");
		
		return product[0];
		
	}
	
	//recibe a string of all products, convert them to an array and select of each
	// one the id and put them on array.
	public   String[]  getProductIds(String products) {	
		
		String[] productsArray = getProducts(products);
		
		String[] result = new String[productsArray.length];
		
		for(int i = 0 ; i < productsArray.length; i++) {
			
			result[i] = getOneProductId(productsArray[i]);
			
		}

		
		//String r = Arrays.toString(result);
		
		return result;
		
	}
}
