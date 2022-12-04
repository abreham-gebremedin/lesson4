package prog4_7_comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountList {

	private Account[] strArray;
	private int size;

	public AccountList() {
		size = 0;
		strArray = new Account[2];
	}

	/**
	 * @param s
	 * public void add(String s)
	 * adds s to the end of the underlying array
	 */
	public void add(Account s) {
		if(size >= strArray.length)
		{
			resize();

		}
		strArray[size] = s;
		size++;
		
	}

	/**
	 * public Account get(int i) 
	 * retrieves the String at the ith position in the underlying arra
	 * @param i
	 * @return myStringList[i]
	 * 
	 */
	
	public Account[] getStrArray() {
		return strArray;
	}
	public Account get(int i){
		return strArray[i];
	}

	/**
	 * public boolean find(String s)
	 * returns true if String s is found in the array, false otherwise
	 * @param s
	 * @return True or false
	 */
	public boolean find(Account s){
		for(Account currentString : strArray){
			if(currentString.equals(s))
				return true;
		}
		return false;
	}

	/**
	 * public boolean remove(String s)
	 * - removes first occurrence of String s if it is found in the underlying array
	 * if found, returns true; if not found returns fals
	 * @param s
	 * @return
	 */
	public boolean remove(Account s){
		boolean result = find(s);
		if (result){
			System.out.println("removing....");
			size--;
			for(int index = 0; index <= strArray.length; index++){
				if(strArray[index].equals(s)){
					strArray[index] = null;
					break;
				}
			}
		}
		return result;
	}


	/**
	 * public String toString()
	 * - returns a String representation of the underlying array here is a typical output:
	 *          [Bob, Steve, Susan, Mark, Dave]
	 */
	@Override
	public String toString() {

		List<Account> list = new ArrayList<Account>();

		for(Account s : strArray) {
			if(s != null) {
				list.add(s);
			}
		}

		strArray = list.toArray(new Account[list.size()]);


		return "AccountList{" +
		"My Accounts=" + Arrays.toString(strArray) +
		'}';
	}

	/**
	 * public int size() 
	 * - returns the next open position in the underlying array – this is precisely the 
	 * number of Strings that have been added minus the number of String that have been removed
	 * @return
	 */
	public int size(){
		return size;
	}


	/**
	 * private void resize()
	 * In your class, the resize() method must be called whenever addition of another String to 
	 * the underlying array goes beyond the current length of the array. The resize method 
	 * should use System.arraycopy to create a new String array having twice the size of the 
	 * current String array, and should copy the old array into the first part of the new array.
	 * You should have an instance variable size in your class that is incremented or 
	 * decremented as Strings are added or removed
	 **/
	private void resize(){
		System.out.println("Resizing...");
		int newSize = size*2;
		Account[] myStringListCopied = new Account[newSize];
		System.arraycopy(strArray,0, myStringListCopied, 0, size());
		strArray = myStringListCopied;


		/*
		 * The java.lang.System.arraycopy() method copies a source array from a specific
		 * beginning position to the destination array from the mentioned position. No.
		 * of arguments to be copied are decided by an argument. The components at
		 * source_Position to source_Position + length – 1 are copied to destination
		 * array from destination_Position to destination_Position + length – 1 Class
		 * Declaration
		 */
	}
 
	
    double getMax(Account[] strArray2) {
    	 List<Account> list = new ArrayList<Account>();

    	    for(Account s : strArray2) {
    	       if(s!= null ) {
    	          list.add(s);
    	       }
    	    }

    	    strArray2 = list.toArray(new Account[list.size()]);
       double max; 
        int i;
        /*If there is only one element then return it as min and max both*/
        if (strArray2.length == 1) {
            max = strArray2[0].balance;
            return max;
        }
        /* If there are more than one elements, then initialize min
    and max*/
        if (strArray2[0].balance > strArray2[1].balance) {
            max = strArray2[0].balance;
            
        } else {
            max = strArray2[1].balance;
         }
        for (i = 2; i < strArray2.length; i++) {
            if (strArray2[i].balance > max) {
                max = strArray2[i].balance;
            }  
        }
        return max;
    }


}
