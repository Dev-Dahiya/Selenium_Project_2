package oopconcepts;

public interface InterfaceDemoA {
	int val = 10;
	
	void abstractMethod();
	
	static void staticMethod(){
		System.out.println("Static method from A");
	}
	
	default void defaultMethod(){
		System.out.println("Default method from A");
	}

}
