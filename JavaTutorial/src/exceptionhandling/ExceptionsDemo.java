package exceptionhandling;

import java.sql.SQLException;

public class ExceptionsDemo {

	public static void main(String[] args) {
		Account acc = new Account();
		try {
			acc.withraw(100);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block");
		}
		
		

	}

}
