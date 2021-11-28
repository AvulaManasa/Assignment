package com.vehicle;

public class CityMain {

	public static void main(String[] args) {
		Truck truck = new Truck("Red",6,"T8","Truck","Banglore");
		truck.DisplayCity();
		Bus bus=new Bus("Blue",8,"B4","Bus","Hyderabad");
		bus.DisplayCity();
		Car car=new Car("Green",4,"C8","Car","Chennai");
		car.DisplayCity();

	}

}
