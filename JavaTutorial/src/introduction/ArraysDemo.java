package introduction;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] intArray1;
		intArray1 = new int[10];
		
		int[] intArray2 = new int[5];
		
		intArray1[0] = 100;
		intArray1[1] = 90;
		System.out.println("Element at 0 index: " + intArray1[0]);
		System.out.println("Element at 1 index: " + intArray1[1]);
		
		String[] stringArray1 = {"ab", "aa", "ac"};
		
		System.out.println(stringArray1.length);
		System.out.println(stringArray1.equals(intArray1));
		String[] stringArray4 = stringArray1.clone();
		
		for(int i=0; i<stringArray4.length; i++){
			System.out.println(stringArray4[i]);
		}
		
		System.out.println(intArray1.toString());
//		Arrays.fill(intArray1, 22);
		System.out.println(Arrays.toString(intArray1));
		Arrays.sort(stringArray4);
		
		for(int i=0; i<stringArray4.length; i++){
			System.out.println(stringArray4[i]);
		}
		
		System.out.println(Arrays.equals(stringArray1, stringArray4));
		String[] stringArray3 = Arrays.copyOf(stringArray4, 5);

		for(int i=0; i<stringArray3.length; i++){
			System.out.println(stringArray3[i]);
		}
		
		String[] stringArray5 = new String[4];
		Arrays.fill(stringArray5, "hi");
		System.out.println(Arrays.toString(stringArray5));
		
		String[] strArr1 = {"dev", "kr", "dahiya"};
		
		String[] strArr2 = new String[6];
		
		System.arraycopy(strArr1, 1, strArr2, 3, 2);
		System.out.println("********************");

		for(int i=0; i<strArr2.length; i++){
			System.out.println(strArr2[i]);
		}

	}

}
