package staticpackage;

public class Practice {
	private static int staticVariable = 10;
	private int nonStaticVariable = 5;
	
	public static void staticMethod(){
//		System.out.println(staticVariable);
//		System.out.println(nonStaticVariable);
		Practice p = new Practice();
		p.nonStaticMethod();
		System.out.println(p.nonStaticVariable);

//		Practice.nonStaticMethod();
	}
	public void nonStaticMethod(){
		System.out.println(staticVariable);
		System.out.println(nonStaticVariable);
//		staticMethod();
	}
	
	public void thisMethod(int staticVariable, int nonStaticVariable){
		this.staticVariable = staticVariable;
		this.nonStaticVariable = nonStaticVariable;
	}
	
	public static void thisMethod2(int staticVariable, int nonStaticVariable){
//		this.staticVariable = staticVariable;
//		this.nonStaticVariable = nonStaticVariable;
	}

}
