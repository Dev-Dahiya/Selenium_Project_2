package oopconcepts;

public class ClassB {
	public static void main(String[] args) {
		ClassA c1 = new ClassA();
		System.out.println(ClassA.bal);
		ClassA.methodClassA();
		System.out.println(c1.bal);
		c1.methodClassA();
	}

}
