package com.manasa.demo;

import java.util.Scanner;

public class ArraySelectionSort {
	public static void main(String[] args) {
		int arr[];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Total No of elements : ");
		int total=scanner.nextInt();
		arr=new int[total];
		for(int index=0;index<total;index++) {
			System.out.println("Enter element : ");
			arr[index]=scanner.nextInt();
		}
		System.out.println("Enter Total No of elements before sorting: ");
		for(int element:arr) {
			System.out.println(element);
		}
		for(int index=0;index<total;index++) {
        {  
            int i = index;  
            for (int j = index + 1; j <total; j++){  
                if (arr[j] < arr[i]){  
                    i = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[i];   
            arr[i] = arr[index];  
            arr[index] = smallerNumber;  
        }  
    }  
		System.out.println("Enter Total No of elements after selection sorting: ");
		for(int element:arr) {
			System.out.println(element);
		}
	}
}
