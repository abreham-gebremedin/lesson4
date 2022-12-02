package assignment3_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStringList {

    private String[] strArray;
    private int size;

    public MyStringList() {
        size = 0;
        strArray = new String[2];
    }

    /**
     * @param s
     * public void add(String s)
     * adds s to the end of the underlying array
     */
    public void add(String s) {
        if(size >= strArray.length)
        {
        	resize();
        
        }
        strArray[size] = s;
        size++;
    }

    /**
     * public String get(int i) 
     * retrieves the String at the ith position in the underlying arra
     * @param i
     * @return myStringList[i]
     */
    public String get(int i){
        return strArray[i];
    }

    /**
     * public boolean find(String s)
     * returns true if String s is found in the array, false otherwise
     * @param s
     * @return True or false
     */
    public boolean find(String s){
        for(String currentString : strArray){
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
    public boolean remove(String s){
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
    	
    	 List<String> list = new ArrayList<String>();

    	    for(String s : strArray) {
    	       if(s != null && s.length() > 0) {
    	          list.add(s);
    	       }
    	    }

    	    strArray = list.toArray(new String[list.size()]);
         

        return "MyStringList{" +
                "myStringList=" + Arrays.toString(strArray) +
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
        String[] myStringListCopied = new String[newSize];
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
}
