package prog2_5;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			String word =in.nextLine();	
Prog5 rp=new Prog5();
System.out.println(rp.getReverse(word));
		}
	}
	
	 
	
	
	//Method to reverse a word using StringBuilder and StringBuffer
	
	//StringBuilder: can append characters and Strings without significant cost. No thread safe
	//StringBuffer: StringBuffer is synchronized( which means it is thread safe)
	public String getReverse(String word) {
		
		int wordLenght = word.length();
		
		StringBuilder finalWord = new StringBuilder();
		
		for(int i=wordLenght-1; i>=0; i--) {
			
			finalWord.append(word.charAt(i));
			
		}
		
		//Convert the StringBuilder to a String at the end.
		String finalWordAsString = finalWord.toString();
		
		//System.out.println(finalWordAsString);
		
		return finalWordAsString;
	}

}
