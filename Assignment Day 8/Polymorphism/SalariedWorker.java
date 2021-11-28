package com.worker;

public class SalariedWorker extends Worker {
	private int hours;
    SalariedWorker(String n,float r,int h)
    {
        super(n,r);
        hours = h;
    }
    public float comPay()
    {
        int weeks=hours/(24*7);
        return salaryrate*weeks;
    }
}
 
