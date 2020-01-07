package exceptionhandling;

import java.io.IOException;

public class CustomExceptionsDemo {

	public static void main(String[] args) {
//		int i;
//		char ch;
//		
//		System.out.println("enter integer: ");
//		
//		ch = (char)System.in.read();
//		System.out.println("your input is: " + ch);
		throw new MyException("Hello");
//		throw new ArithmeticException();

	}
	
	
	}

class MyException extends RuntimeException{
	public MyException (String s) {
		super(s);
	}

}
