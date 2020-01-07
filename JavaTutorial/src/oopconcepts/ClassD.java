package oopconcepts;

public class ClassD implements InterfaceDemo1{

	public static void main(String[] args) {
		System.out.println(sal);
//		ClassD.someStaticMethod();

	}
	public void myMethod(){
		someDefaultMethod();

	}
	@Override
	public void methodID1(){
		System.out.println("methodID1 implemented in ClassD");
	}

}
