package staticpackage;

public class StaticExampleClass {
	private String make;
	public static int instanceNum = 0;
	
	public StaticExampleClass(String make){
		this.make = make;
		instanceNum++;
	}
	
	public int getInstanceNum(){
		return instanceNum;
	}
	public static void xx(){
		System.out.println("Hi");
		StaticExampleClass s2 = new StaticExampleClass("bmw");
		s2.mm();
//		StaticExampleClass.mm();
//		System.out.println(make);
	}
	public void mm(){
		System.out.println(StaticExampleClass.instanceNum);
		xx();
	}
	
	public void zz(){
		mm();
		xx();
	}

}
