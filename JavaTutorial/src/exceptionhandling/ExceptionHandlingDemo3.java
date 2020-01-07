package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo3 {
	public void excepHand(){
		int choice = 0;
		Scanner input = new Scanner(System.in);
		
		int[] numbers = {10, 11, 12, 13, 14, 15};
		System.out.println("Enter the index of array: ");
		
		try{
			choice = input.nextInt();
//			if(choice==0) {
//				throw new ArrayIndexOutOfBoundsException();
//			}
			System.out.printf("numbers[%d] = %d%n", choice, numbers[choice]);
			input.close();
		}
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Error: index is invalid...");
//		}
//		catch(InputMismatchException e){
//			System.out.println("Error: you did not enter an integer.");
//		}
//		catch(InputMismatchException | ArrayIndexOutOfBoundsException | NullPointerException e){
//			System.out.println("Error: you did not enter an integer.");
//			System.out.printf(e.getMessage());
//		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
}
}
