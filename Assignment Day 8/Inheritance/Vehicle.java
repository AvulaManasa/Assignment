package com.vehicle;
public class Vehicle {
	private int noofwheels;
	private String color,model,cityName,name;
	public Vehicle(String color,int noofwheels,String model,String name,String cityName) {
		this.color=color;
		this.model=model;
		this.noofwheels=noofwheels;
		this.name=name;
		this.cityName=cityName;
	}
	public Vehicle(String color,int noofwheels,String model) {
		this.color=color;
		this.model=model;
		this.noofwheels=noofwheels;
	}
	public int getNoofwheels() {
		return noofwheels;
	}
	public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	private String getName() {
		return name;
	}
	private String getCityName1() {
		return cityName;
	}
	public void Display() {
		System.out.println("The vehicle is"+getName()+" is "+getColor()+"in color.");
		System.out.println(" and "+getName()+ " has "+getNoofwheels()+" wheels.");
		System.out.println(" and "+getName()+" is "+getModel()+" model.");
	}
	public void DisplayCity() {
		System.out.println("The vehicle is"+getName()+" is "+getColor()+"in color.");
		System.out.println(" and "+getName()+ " has "+getNoofwheels()+" wheels.");
		System.out.println(" and "+getName()+" is "+getModel()+" model.");
		System.out.println(" and the city is in "+getCityName1());
		
	}
	
}