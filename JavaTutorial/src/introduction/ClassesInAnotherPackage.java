package introduction;
import oopconcepts.ModifierDemo;

public class ClassesInAnotherPackage {

}
class MyClassc extends ModifierDemo {
	public void printMessages(){
		System.out.println(publicNum);
		System.out.println(protectedNum);
//		System.out.println(packagePrivateNum);
//		System.out.println(privateNum);
	}

}

class MyClassD {
	public void printMessages(){
		ModifierDemo md = new ModifierDemo();
		System.out.println(md.publicNum);
//		System.out.println(md.protectedNum);
//		System.out.println(md.packagePrivateNum);
//		System.out.println(md.privateNum);
	}
}
