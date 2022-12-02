package nestedloop;

import java.util.Arrays;

public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * To get the left-justified column, you need a percentage symbol, a minus
		 * symbol, the number of characters, and then the letter "s" (lowercase). So
		 * ''%-15s'' means fifteen characters left-justified.
		 * 
		 * To get a right-justified column the same sequence of characters are used,
		 * except for the minus sign.
		 * 
		 * To get a newline %n is used. Note that the characters are surrounded with
		 * double quotes.
		 * 
		 * After a comma, you type the text that you want formatting. The first comma in
		 * the code above separates the format specification from the text being
		 * formatted.
		 * 
		 * Here's some tables of the various options.
		 */		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%-3s", "*");
			}
			System.out.println();
		}
		
	System.out.println();
	
	
	System.out.println(Arrays.toString(twoSum(new int[] {3,2,4},6)));

	}
	
	
	public static int[] twoSum(int[]arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]==target-arr[i]) {
					return new int[] {i,j};
				}
				
			}
			
		}
		return null;
		
	}

}
