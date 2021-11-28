package com.shape3d.demo;

public abstract class Shape3d {
	double edge,radius,height;
	void Shape(double r,double h){
		this.radius=radius;
		this.height=height;
	}
	
	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	void Shape(double e){
		this.edge=edge;
	}
	abstract void calculateVolume();
	abstract void calculateSurfaceArea();
	
}
