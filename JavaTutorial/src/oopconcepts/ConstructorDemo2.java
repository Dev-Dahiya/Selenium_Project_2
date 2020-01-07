package oopconcepts;

public class ConstructorDemo2 {

	public static void main(String[] args) {
//		ConstructorDemo1 cd = new ConstructorDemo1();
		ClassX x = new ClassX(10);
		x.methodCD1();
		
	}

}

class ClassX extends ConstructorDemo1 {
	public ClassX(int a){
		super(a);
		System.out.println("child constructor");
	}
	
//	@Override
	public static void methodCD1(){
//		super.methodCD1();
		ConstructorDemo1.methodCD1();
//		System.out.println(super.sal);
		System.out.println("Method from CD2");
	}
}
