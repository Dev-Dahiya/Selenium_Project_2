package oopconcepts;

public class Cars {
	public int speed;
	
	public Cars(int startSpeed){
		speed = startSpeed;
	}
	
	public void increaseSpeed(){
		speed++;
		System.out.println("Increasing speed of Cars");
	}
	
	public void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing speed of Cars");
	}

}
