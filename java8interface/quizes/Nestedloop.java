package quizes;

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
	System.out.println(reverse("Kebede Abebe"));

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
	
	
	
	public static String reverse(String input) {
		// TODO Auto-generated method stub
//		input="kebede"
//		edebek expected result
		char[] in = input.toCharArray();
//		in=['k','e','b','e','d','e']
		int begin=0;
		int end=in.length-1;
		char temp;
		while (end>begin) {
			
			temp=in[begin];             
			in[begin]=in[end];          
			in[end]=temp;               
			end--;                      
			begin++;
//			['e','e','b','e','d','k']  first iteration
//			['e','d','b','e','e','k']  second iteration
//			['e','d','e','b','e','k']  third iteration
//			return


		}
		return new String(in);

	}

}
