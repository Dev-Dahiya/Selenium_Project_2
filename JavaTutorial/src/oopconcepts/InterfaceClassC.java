package oopconcepts;

public class InterfaceClassC implements InterfaceDemoA, InterfaceDemoB {

	public static void main(String[] args) {
		InterfaceClassC c = new InterfaceClassC();
		c.defaultMethod();
		c.abstractMethod();
//		System.out.println(c.val);

	}

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
//		InterfaceDemoB.super.defaultMethod();
		System.out.println("test");
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}

	
	

}
