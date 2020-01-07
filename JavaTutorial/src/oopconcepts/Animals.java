package oopconcepts;

abstract public class Animals {
	
	public void runSpeed(){
		System.out.println("Runs at a speed");
	}
	
	abstract void diet();

}

//class A {
//	public void mee(){
//		Animals ani = new Animals();	
//		ani.runSpeed();
//	}
//	
//}


/*
 * An abstract method can only be public, protected or package-private
 * An abstract method can not be static
 * Static methods are inherited, but they can not be overridden in child classes
 * We can not create an object of abstract classes

 */
