package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int num, deno;
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("Enter Numerator: ");
			num = input.nextInt();
			
			System.out.println("Enter Denominator: ");
			deno = input.nextInt();
			System.out.println("The result is: " + num/deno);
			input.close();
		}
		catch (ArithmeticException e){
			System.out.println("Zero not allowed in denominator. U get below error");
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Only digits are allowed. U get below error");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		catch (NullPointerException e) {
//			System.out.println(e);
//		}
		
//		finally{
//			System.out.println("This is finally block");
//		}
		
//		System.out.println("After finally block");

	}

}
