package oopconcepts;

public class MethodOverloading {
	static int sal;
//	int age;
//	int year;

	public static void main(String[] args) {
//		myMethod(10, 20);
//		myMethod(int secondInt = 100, int firstInt = 200);
//		myMethod(firstInt=100, secondInt=200);
//		devMethod(sal=10);
//		myMethod(10, "Dev");
		myMethod("Raj", 50);

	}
	
	public static void myMethod(int sal, String name){
		System.out.println("Salary: " + sal + "  " + "name: " + name);
	}
	
	public static void myMethod(String name, int sal){
		myMethod(20, "Yash");
		System.out.println("Salary: " + sal + "  " + "name: " + name);
	}
	
//	@KeywordArgs("sal=5, age=40")
//	public static void myMethod1(Object ...args){
//		
//	}
	
//	@KeywordArgs("sal=5, age=40, year")
//	public MethodOverloading(Object ...args){
//		
//	}
	
	public static void devMethod(int sal){
		
	}
	
	public void methodOverLoading(int cost, String name){
		System.out.println("This is first overload");
	}
	public int methodOverLoading(String name, int cost ){
		System.out.println("This is first overload");
		return 0;
	}
}
