package oopconcepts;

class A {
	int x = 10;
	
	void m1(){
		System.out.println("Method from class A");
	}
}

class B extends A {
//	int x = 20;
	void m1(){
		System.out.println("Method from class B");
	}
}

public class RuntimePolymorphism {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		a1.m1();
		a2.m1();

	}
}
