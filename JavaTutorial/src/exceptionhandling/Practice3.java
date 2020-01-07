package exceptionhandling;

import java.io.IOException;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void method1() throws IOException{
		throw new IOException(); 
	}
	public void method2() throws IOException{
		method1();
	}
	
	public void method3(){
		throw new ArithmeticException();
	}
	public void method4(){
		method3();
	}

}
