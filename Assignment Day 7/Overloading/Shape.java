package com.manasa.demo;

public class Shape {
	public void area(int length,int breadth) {
		int area=length*breadth;
		System.out.println("Area of Rectangle : "+area);
	}
	
	public void area(int side) {
		int area=side*side;
		System.out.println("Area of Square : "+area);
	}
	
	public void periemeter(int side) {
		int periemeter=4*side;
		System.out.println("Periemeter of Square : "+periemeter);
	}
	public void periemeter(int length,int breadth) {
		int periemeter=2*(length+breadth);
		System.out.println("Periemeter of rectangle : "+periemeter);
	}
	
	
	
}
