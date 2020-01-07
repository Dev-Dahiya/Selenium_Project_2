package oopconcepts;

public interface InterfaceDemoB {
	int val = 11;
	
	void abstractMethod();
	
	static void staticMethod(){
		System.out.println("Static method from B");
	}
	
	default void defaultMethod(){
		System.out.println("Default method from B");
	}

}
