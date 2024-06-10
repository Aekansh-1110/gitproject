package javaprogram;

import java.util.Scanner;

public class arrayascending {

	public static void main(String[] args) {
		System.out.print("Enter the size of array:");
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		 int temp=0;
		 //enter size of array
		 System.out.print("enter " + n + " of array elemnts");
		  
		 //enter all array elements 
		 int a[]=new int[n];
		 for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();}
		 
		 //print all array elements
		 System.out.print("all array elements are:");
		 for(int i=0;i<n;i++) {
			 System.out.print(" "+a[i]);}
		 
		 //arrange in ascending array
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
				 if (a[i]>a[j]) {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;}}}
		 
		// print array in ascending order
		 System.out.print("\nArray in ascending order:");
		 for(int i=0;i<n;i++) {
			 System.out.print(" "+a[i]);
		 }
				 }}
			 
		 
		 
			 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		