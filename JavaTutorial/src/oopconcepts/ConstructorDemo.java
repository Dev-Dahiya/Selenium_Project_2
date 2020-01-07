package oopconcepts;

public class ConstructorDemo {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		Car c2 = new Car(10, 1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
		
	}

}
