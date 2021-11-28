package com.manasa.demo;

import java.util.Scanner;

public class MyArrayClass {
		public static void main(String[] args) {
			int arr[];
			int average=0;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Total No of elements : ");
			int total=scanner.nextInt();
			arr=new int[total];
			int sum=0;
			for(int index=0;index<total;index++) {
				System.out.println("Enter element : ");
				arr[index]=scanner.nextInt();
			}
			
			for(int element:arr) {
				System.out.println(element);
			}
			for(int index=0;index<total;index++) {
				sum=sum+arr[index];
			}
			System.out.println("Sum of array elements are : "+sum);
			for(int index=0;index<total;index++) {
				average=sum/total;
			}
			System.out.println("Average of array elements are : "+average);
			

		}

	}
