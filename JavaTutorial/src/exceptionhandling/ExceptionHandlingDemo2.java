package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		int[] numbers = {10, 11, 12, 13, 14, 15};
//		System.out.println("Enter the index of array: ");
//		
//		try{
//			int choice = input.nextInt();
//			System.out.printf("numbers[%d] = %d%n", choice, numbers[choice]);
//		}
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Error: index is invalid.");
//		}
//		catch(InputMismatchException e){
//			System.out.println("Error: you did not enter an integer.");
//		}
//		catch(Exception e){
//			System.out.printf(e.getMessage());
//		}
		
		ExceptionHandlingDemo3 eh = new ExceptionHandlingDemo3();
		eh.excepHand();

	}

}
