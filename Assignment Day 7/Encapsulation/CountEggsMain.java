package com.manasa.demo;

public class CountEggsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfEggs eggs=new CountOfEggs();
		eggs.setCount(200);
		eggs.calculateGross();
		eggs.calculateDozen();
		eggs.calculateRemaining();
		eggs.calculateEggs();
	}

}
