package oopconcepts;

public class BMW extends Cars {
	
	public BMW(int startSpeed){
		super(startSpeed);
	}
	
//	public static void main(String[] args) {
//		increaseSpeed();
//		decreaseSpeed();
//		System.out.println(speed);
//	}
	
//	public void callingMethods(){
//		increaseSpeed();
//		decreaseSpeed();
//		System.out.println(speed);
//	}
	
@Override
public void increaseSpeed(){
	super.increaseSpeed();
}

public void changeSpeed(){
	speed = 200;
}

public void headsUpDisplay(){
	System.out.println("BMW specific functionality");
}

}
