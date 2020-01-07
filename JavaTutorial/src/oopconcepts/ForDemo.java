package oopconcepts;

import java.util.Arrays;

public class ForDemo {

	public static void main(String[] args) {
		
//		for(int i=0; i<10; i++){
//			System.out.println(i);
//		}
		
//		int i=10;
//		System.out.println("Value of i is: " + i+1);
		
		int[] number = {10, 20, 30};
//		System.out.println(number.length);
		
		for(int a : number){
			for(int i=0; i<number.length; i++){
				number[i] = a;
				for(int b : number){
					System.out.println(b);
				}
			}
			
			
		}
		


	}

}
