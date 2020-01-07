package staticpackage;

public class StaticDemo {

	public static void main(String[] args) {
		StaticExampleClass s1 = new StaticExampleClass("bmw");
		System.out.println(s1.getInstanceNum());
		System.out.println(StaticExampleClass.instanceNum);
		s1.mm();
	}

}
