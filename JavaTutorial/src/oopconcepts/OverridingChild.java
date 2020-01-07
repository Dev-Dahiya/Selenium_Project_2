package oopconcepts;

public class OverridingChild extends OverridingParent {

	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		int sp = oc.increaseSpeed(10);
		System.out.println(sp);
		
//		oc.mm();

	}
	@Override
	public int increaseSpeed(int speed){
		System.out.println("Child speed: " + speed);
		return speed;
		
	}
	
//	public final void mm(){
//		increaseSpeed(12);
//	}
	
	

}
