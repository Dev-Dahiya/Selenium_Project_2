package oopconcepts;

import java.util.Arrays;

public class Car {
	private String color;
	private String make;
	private String model;
	private int year;
	int speed;
	int gear;
	
	public Car() {
		this(15, 2);
//		this.speed = 0;
//		this.gear = 0;
		System.out.println("Executing parameterless constructor");
	}
	
	public Car(int speed, int gear){
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing constructor with parameters");
	}

	public void increaseSpeed(){
		System.out.println("Increasing the speed");
	}
	public String getMake() {
		return make;
	}
	
	public void setMake(String make){
		this.make = make;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}


