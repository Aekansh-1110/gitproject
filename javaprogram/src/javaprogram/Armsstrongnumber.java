package javaprogram;

import java.util.Scanner;

public class Armsstrongnumber {

	public static void main(String[] args) {
		 System.out.print("enter the number::");
		 Scanner sc = new Scanner (System.in);
		 int n =sc.nextInt();
		 int a []= new int [n];
		 int i,length=0;
		 
		 int t=n;
		 while (t!=0) {
			 t=t/10;
			 length=length+1;
			 
			
			  }
		 int t1=n;
		 int rem;
		 int arm=0;
		 while (t1!=0) {
			 int mul=1;
			 rem=t1%10;
			 for (i=0;i<length;i++) {
			 mul=mul*rem;}
		 
		 arm=arm+mul;
		 t1=t1/10;}
		 
		 if (arm==n) {
			 System.out.println("A.number");
		 }else {
			 System.out.println("not A number");
		 }
			 
			 
		
		
	}}