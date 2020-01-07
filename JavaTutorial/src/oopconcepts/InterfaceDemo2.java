package oopconcepts;

public interface InterfaceDemo2 extends InterfaceDemo1 {
	public default void mm(){
		methodID1();
	}
	void methodID2();
	public static void xx(){
//		someStaticMethod();
		System.out.println(sal);
	}
	public default void cc(){
		someDefaultMethod();

	}
}
