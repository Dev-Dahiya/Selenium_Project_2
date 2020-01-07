package oopconcepts;

public class ThisDemo1 {
	public static void main(String[] args) {
		Student s1 = new Student(111, "Ankit", 5000f);
		Student s2 = new Student(112, "Sumit", 6000f);
//		s1.displayInfo();
//		s2.displayInfo();
		s1.displayInfo2();
	}

}

class Student {
	int rollNo;
	String name;
	float fee;
	
	public Student(int rollNo, String name, float fee){
		this.rollNo = rollNo;
		this.name = name;
		this.fee = fee;
	}
	
	public void displayInfo() {
		System.out.println(rollNo + " " + name + " " + fee);
	}
	public void displayInfo2(){
		this.displayInfo();
	}
}
