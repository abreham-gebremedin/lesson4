package prog4_7_comparable;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Main {
	String exitanswer2;

	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	

	Main(){
 		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		emps[0].createNewChecking(90000);
		emps[0].createNewSavings(25000);
		emps[0].createNewRetirement(9800);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(11455);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(98700);
 
 
	        HashMap<String, String> dataMap = new HashMap<String, String>();
			for (int i = 0; i < emps.length; i++) {


				// method to add the key,value pair in hashmap
				
				String s=String. valueOf(emps[i].comparingEmployees());
				dataMap.put(emps[i].getName(),s);

			}
			
 	        Set<Entry<String, String>> entries = dataMap.entrySet();
	        
	        
	        // Now let's sort HashMap by keys first 
	        // all you need to do is create a TreeMap with mappings of HashMap
	        // TreeMap keeps all entries in sorted order
	        TreeMap<String, String> sorted = new TreeMap<>(dataMap);
	        Set<Entry<String, String>> mappings = sorted.entrySet();
	        
	        System.out.println(" after sorting in descending order ");
             String ss="";
	        for(Entry<String, String> mapping : mappings){
	        	 String ss2=" ";
	        	 ss2+=mapping.getKey() + " : " + mapping.getValue();
	        	ss=ss2+ss;
 	        }  
 	        System.out.println(ss);
	        
   
 
			// Now let's sort the HashMap by values
	        // there is no direct way to sort HashMap by values but you
	        // can do this by writing your own comparator, which takes
	        // Map.Entry object and arrange them in order increasing 
	        // or decreasing by values.
	        
	        Comparator<Entry<String, String>> valueComparator 
	               = new Comparator<Entry<String,String>>() {
	            
	            @Override
	            public int compare(Entry<String, String> e1, Entry<String, String> e2) {
	                String v1 = e1.getValue();
	                String v2 = e2.getValue();
	                return v1.compareTo(v2);
	            }
	        };
	        
	        // Sort method needs a List, so let's first convert Set to List in Java
	        List<Entry<String, String>> listOfEntries 
	                  = new ArrayList<Entry<String, String>>(entries);
	        
	        // sorting HashMap by values using comparator
	        Collections.sort(listOfEntries, valueComparator);
	        
	        LinkedHashMap<String, String> sortedByValue 
	                    = new LinkedHashMap<String, String>(listOfEntries.size());
	        
	        // copying entries from List to Map
	        for(Entry<String, String> entry : listOfEntries){
	            sortedByValue.put(entry.getKey(), entry.getValue());
	        }
	        
	        
			 
	}
	String getFormattedAccountInfo(int i) {
		//implement

		return emps[i].getFormattedAcctInfo();
	}



}
