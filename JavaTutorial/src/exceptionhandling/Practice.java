package exceptionhandling;

import java.sql.SQLException;

public class Practice {

	public static void main(String[] args) {
		int[] myArray = {10, 20, 30};
		try{
			System.out.println(myArray[4]);
			System.out.println("Hello");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
