package arraySearch;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	public static int search(int arr[], int target)
    {
        for (int j = 0; j < arr.length; j++)
        {
            //What code goes here? task 1
             //System.out.println("sequentail:" +scounter);
            if (arr[j]==target){
                return j;
            }
        }
        return -1;
    }
	
 
}
