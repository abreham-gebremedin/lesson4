package prog2_6;

import java.util.Arrays;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringdata= {"horse", "dog", "cat", "horse","dog"};
		System.out.println(Arrays.toString(Prog6.removeDups(stringdata)));

	}
	// Remove duplicates
	public static String[] removeDups(String[] source) {

		String[] result = new String[source.length];
		int arrayLenght = source.length;

		for (int index = 0; index < arrayLenght; index++) {

			for (int subIndex = 0; subIndex < arrayLenght; subIndex++) {
				// System.out.printf("%s - %s - %s \n", source[index], index, result[subIndex]);

				if (!exitsElementAt(source[index], result)) {
					result[index] = source[index];
				}

			}

		}

		return removeNulls(result);
	}
	
	// verify if there are repeat elements in the array
		public static boolean exitsElementAt(String element, String[] source) {

			for (int i = 0; i < source.length; i++) {

				if (element.equals(source[i])) {

					return true; // if there is repeated element return true
				}

			}

			return false;
		}
		
		// Count elements in the array
		public static int countElments(String[] source) {

			int numberElements = 0;

			for (String element : source) {

				if (element != null) {

					numberElements++;

				}

			}

			return numberElements;

		} 
		// Remove nulls
		public static String[] removeNulls(String[] result) {

			String[] resultWithoutNulls = new String[countElments(result)];
			int index = 0;

			for (String element : result) {

				if (element != null) {

					resultWithoutNulls[index] = element;
					index++;
				}

			}

			return resultWithoutNulls;

		}

}
