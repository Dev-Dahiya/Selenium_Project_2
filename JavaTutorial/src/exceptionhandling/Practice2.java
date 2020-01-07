package exceptionhandling;

import java.sql.SQLException;

public class Practice2 {

	public static void main(String[] args)  {
//		throw new ArithmeticException();
//		throw new SQLException();
		
//		try{
//			System.out.println("Try Block");
//			try{
//				System.out.println("Nested Try");
//			}
//			catch(Exception e){
//				System.out.println("Nested catch");
//			}
//			finally{
//				System.out.println("Nested finally");
//			}
//		}
//
//		catch(Exception e){
//			System.out.println("Catch Block");
//		}
//		finally{
//			System.out.println("Finally Block");
//		}
		
		
//		System.out.println("Code after for...");
		try {
			mm();

		}
		catch (Exception e){
			System.out.println("exception occured...");
		}
	}
	
	public static void mm() throws SQLException {
		throw new SQLException();
	}

}
