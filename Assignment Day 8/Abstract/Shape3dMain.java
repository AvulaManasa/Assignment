package com.shape3d.demo;

public class Shape3dMain  {

	public static void main(String[] args) {
		Cube c=new Cube() {	
		};
		c.setEdge(50);
		Cyclinder cy=new Cyclinder() {	
		};
		cy.setHeight(5);
		cy.setRadius(5);
		Sphere s=new Sphere() {	
		};
		s.setRadius(4);
		s.setHeight(3);
		c.calculateSurfaceArea();
		c.calculateVolume();
		cy.calculateSurfaceArea();
		cy.calculateVolume();
		s.calculateSurfaceArea();
		s.calculateVolume();
		

	}

}
