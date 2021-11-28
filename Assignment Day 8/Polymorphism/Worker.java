package com.worker;

public abstract class Worker {
		String name;
	    float salaryrate;
	    Worker(String n,float r)
	    {
	        name = n;
	        salaryrate = r;
	    }
	    abstract float comPay();
}
	 
