package oopconcepts;

public class ThisDemo2 {

	public static void main(String[] args) {
//		A a = new A();
		Student2 s1 = new Student2(111, "ankit", "java", 6000f);
		s1.display();

	}

}

//class A {
//	public A(){
//		this(10);
//		System.out.println("hello a");
//	}
//	public A(int x){
//		System.out.println(x);
//	}
//}

class Student2 {
	int rollNo;
	String name, course;
	float fee;
	
	public Student2(int rollNo, String name, String course){
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}
	
	public Student2(int rollNo, String name, String course, float fee){
		this(rollNo, name, course);
		this.fee = fee;
	}
	
	public void display(){
		System.out.println(rollNo + " " + name + " " + course + " " + fee);
	}
}