package com.vehicle;
public class Truck extends Vehicle {
	public Truck(String color,int noofwheels,String model) {
		super(color,noofwheels,model);
	}
	public void showDetails() {
		System.out.println("The vehicle is truck and truck is "+getColor()+"in color.");
		System.out.println("The vehicle is truck and truck has "+getNoofwheels()+" wheels.");
		System.out.println("The vehicle is truck and truck is "+getModel()+" model.");
	}
	public Truck(String color,int noofwheels,String model,String name,String cityName) {
		super(color,noofwheels,model,name,cityName);
}
}