package introduction;

import java.lang.reflect.Member;

class MyClass {
	String memberName;
	static int memberAge;
//	{
//	name = "Dev";
//	}
	
	public MyClass(String name){
		memberName = name;
//		memberAge = age;
		System.out.println("member name is: " + memberName);
		System.out.println("age is: " + memberAge);
	}
}

public class Practice {
public static void main(String[] args){
	MyClass mc = new MyClass("Dev");
	MyClass.memberAge = 21;
	System.out.println(MyClass.memberAge);
}
}