package oopconcepts;
	

 public interface InterfaceDemo1 {
	 int sal=100;
	 
	 void methodID1();
	 
	 static void someStaticMethod(){
		 System.out.println("static method from InterfaceDemo1");
	 }
	 
	 default void someDefaultMethod(){
		 System.out.println("default method from InterfaceDemo1");
	 }
}
