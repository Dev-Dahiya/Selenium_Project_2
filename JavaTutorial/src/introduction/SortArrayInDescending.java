package introduction;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInDescending {
	public static void main(String[] args) {
		int[] intArray1 = {10, 9, 12, 6};
		Arrays.sort(intArray1);
		
		int[] intArrays2 = new int[4];
		
		for(int i=intArray1.length-1, j=0; i>=0 && j<intArray1.length; i--, j++){
			intArrays2[i] = intArray1[j];
			
		}
		System.out.println(Arrays.toString(intArrays2));
		
		// Below code shows how to sort an array of objects in descending order
		Integer intOne = new Integer(10);
		Integer intTwo = new Integer(20);
		Integer[] myArray = {intOne, intTwo};
		System.out.println(Arrays.toString(myArray));
		Arrays.sort(myArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(myArray));
	}

}
