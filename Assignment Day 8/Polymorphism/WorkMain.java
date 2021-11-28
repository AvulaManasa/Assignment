package com.worker;
import java.util.Scanner;
public class WorkMain {
		    public static void main(String args[])
		    {
		        String name;
		        float salaryRate;
		        int time;
		        Scanner sc= new Scanner(System.in);
		        System.out.print("Enter Daily Worker name: ");
		        name = sc.nextLine();
		        System.out.print("Enter salaryrate per day: ");
		        salaryRate = sc.nextFloat();
		        System.out.print("Enter number of hours: ");
		        time = sc.nextInt();
		        DailyWorker dw = new DailyWorker(name,salaryRate,time) {
		        	
		        };
		        System.out.println("Salary: "+dw.comPay()+"\n\n");
		 
		        sc.nextLine();
		        System.out.print("Enter Salaried Worker name: ");
		        name = sc.nextLine();
		        System.out.print("Enter salaryRate per week: ");
		        salaryRate = sc.nextFloat();
		        System.out.print("Enter number of hours: ");
		        time = sc.nextInt();
		        SalariedWorker sw = new SalariedWorker(name,salaryRate,time) {
		        	
		        };
		        System.out.println("Salary: "+sw.comPay());
		        
		    }
}