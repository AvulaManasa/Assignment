package com.vehicle;

public class Car extends Vehicle{
	public Car(String color,int noofwheels,String model) {
		super(color,noofwheels,model);
	}
	public void showDetails() {
		System.out.println("The vehicle is car and car is "+getColor()+"in color.");
		System.out.println("The vehicle is car and car has "+getNoofwheels()+" wheels.");
		System.out.println("The vehicle is car and car is "+getModel()+" model.");
	}
	public Car(String color,int noofwheels,String model,String name,String cityName) {
			super(color,noofwheels,model,name,cityName);
	}
}
