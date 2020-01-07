package oopconcepts;

public class MethodsDemo {
	static String a = "Hey, there!!!";
	public int salary;

	public static void main(String[] args) {
		System.out.println(a);
	}
	
//	public static void methodOne(int a){
//		System.out.println("hi");
//	}
//
	private int methodTwo(){
		salary = 100;
		return salary;
	}
	
	private void methodThree(int a){
		salary = a;
	}
	
	public int getMethodTwo(){
		return methodTwo();
	}
	
	public void setMethodThree(int a){
		if(a <=0) System.out.println("Not allowed");
		else {
			methodThree(a);
			System.out.println("Salary changed to: " + salary);
		}
	
	}
}
//
// class Test {
//	
//}
