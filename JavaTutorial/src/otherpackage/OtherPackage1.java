package otherpackage;

import samepackage.SamePackage1;

public class OtherPackage1 {
	public void MyMethod(){
		SamePackage1 sp1 = new SamePackage1();
//		System.out.println(sp1.packagePrivateField);
//		sp1.packagePrivateMethod();
//		System.out.println(sp1.protectedField);
//		sp1.protectedMethod();
	}

}

class C extends SamePackage1 {
	public void myMethod(){
//		System.out.println(packagePrivateField);
//		packagePrivateMethod();
		System.out.println(publicField);
		publicMethod();
		System.out.println(protectedField);
		protectedMethod();
		
	}
	
}
