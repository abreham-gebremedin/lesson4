package assignment3_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStringList {

    private String[] myStringList;
    private int size;

    public MyStringList() {
        size = 0;
        myStringList = new String[2];
    }

    public void add(String s) {
        if(size >= myStringList.length)
            resize();
        myStringList[size] = s;
        size++;
    }

    public String get(int i){
        return myStringList[i];
    }

    public boolean find(String s){
        for(String currentString : myStringList){
            if(currentString.equals(s))
                return true;
        }
        return false;
    }

    public boolean remove(String s){
        boolean result = find(s);
        if (result){
            System.out.println("removing....");
            size--;
            for(int index = 0; index <= myStringList.length; index++){
                if(myStringList[index].equals(s)){
                    myStringList[index] = null;
                    break;
                }
            }
        }
        return result;
    }

    /**
     *
     */
    @Override
    public String toString() {
    	
    	 List<String> list = new ArrayList<String>();

    	    for(String s : myStringList) {
    	       if(s != null && s.length() > 0) {
    	          list.add(s);
    	       }
    	    }

    	    myStringList = list.toArray(new String[list.size()]);
         

        return "MyStringList{" +
                "myStringList=" + Arrays.toString(myStringList) +
                '}';
    }

    public int size(){
        return size;
    }

    
    
	/*
	 * The java.lang.System.arraycopy() method copies a source array from a specific
	 * beginning position to the destination array from the mentioned position. No.
	 * of arguments to be copied are decided by an argument. The components at
	 * source_Position to source_Position + length – 1 are copied to destination
	 * array from destination_Position to destination_Position + length – 1 Class
	 * Declaration
	 */private void resize(){
        System.out.println("Resizing...");
        int newSize = size+2;
        String[] myStringListCopied = new String[newSize];
        System.arraycopy(myStringList,0, myStringListCopied, 0, size());
        myStringList = myStringListCopied;
    }
}
