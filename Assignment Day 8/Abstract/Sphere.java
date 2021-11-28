package com.shape3d.demo;

public abstract class Sphere extends Shape3d{
	public void calculateVolume(){
		System.out.println ("Volume of sphere is : "+1.33*3.14*getRadius()*getRadius()*getRadius());
	}
	public void calculateSurfaceArea(){
		System.out.println ("SurfaceArea of sphere is : "+4*3.14*getRadius()*getRadius());
	}
}


