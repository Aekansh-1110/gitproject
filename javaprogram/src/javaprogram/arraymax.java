package javaprogram;

import java.util.Scanner;

public class arraymax {

	public static void main(String[] args) {
		// int a []= {10,20,30,40};
		   //int max =a[0];
		// for(int i=0;i<a.length;i++) {
			// if(a[i]>max) {
				// max=a[i];
		System.out.println("Enter the array size:");
		Scanner sc =new Scanner(System.in);
		 int n= sc.nextInt();
		 int a []= new int [n];
		 
		 System.out.println("all array element are ");
		 for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
			 System.out.println(" "+a[i]);}
			 
			 int max =a[0];
			 for(int i=0;i<n;i++) {
				 if(a[i]>max) {
					 max=a[i];
				 }
			 
		 }
	System.out.println("maximum array is "+max);
			
		}
		

		
		
		
				 
	}

