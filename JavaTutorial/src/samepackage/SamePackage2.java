package samepackage;

public class SamePackage2 {
	
	public void myMethod(){
		SamePackage1 sp1 = new SamePackage1();
		System.out.println(sp1.packagePrivateField);
		sp1.packagePrivateMethod();
		System.out.println(sp1.protectedField);
		sp1.protectedMethod();
	}

}

class B extends SamePackage1 {
	public void myMethod(){
		System.out.println(packagePrivateField);
		packagePrivateMethod();
		System.out.println(publicField);
		publicMethod();
		System.out.println(protectedField);
		protectedMethod();
	}
}
