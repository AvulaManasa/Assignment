package com.shape3d.demo;

public abstract class Cyclinder extends Shape3d{
	public void calculateVolume(){
		//return (3.14*getRadius()*getRadius()*getHeight());
		System.out.println("Volume of cyclinder is : "+3.14*getRadius()*getRadius()*getHeight());
	}
	public void calculateSurfaceArea(){
		System.out.println ("SurfaceArea of cyclinder is : "+2*3.14*getRadius()*getHeight()+2*3.14*getRadius()*getHeight());
	}

}
