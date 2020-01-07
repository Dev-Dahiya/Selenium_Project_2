package samepackage;

public class SamePackage1 {
	public int publicField = 5;
	private int privateField = 10;
	protected int protectedField = 15;
	int packagePrivateField = 20;
	
	public void publicMethod(){
		System.out.println("Running public method");
	}
	
	private void privateMethod(){
		System.out.println("Running private method");
	}
	
	protected void protectedMethod(){
		System.out.println("Running protected method");
	}
	
	void packagePrivateMethod() {
		System.out.println("Running package-private method");
	}

}
