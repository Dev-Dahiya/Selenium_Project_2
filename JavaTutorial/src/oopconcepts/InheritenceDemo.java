package oopconcepts;

public class InheritenceDemo {

	public static void main(String[] args) {
		Cars car = new Cars(10);
		car.increaseSpeed();
//		car.decreaseSpeed();
//		System.out.println(car.speed);
		
		BMW bmw = new BMW(10);
//		bmw.increaseSpeed();
//		bmw.decreaseSpeed();
		System.out.println(bmw.speed);
		bmw.changeSpeed();
		System.out.println(bmw.speed);
		System.out.println(car.speed);
		bmw.headsUpDisplay();
//		car.headsUpDisplay();

	}

}
