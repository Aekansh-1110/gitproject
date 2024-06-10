package javaprogram;

import java.util.Scanner;

class practicep {

	public static void main(String[] args) {
		int n=153;
		int t=n;
		int l=0;
		while(t!=0) {
			t=t/10;
			l=l+1;
			
		}
		int t1=n;
		int rem=0;
		int arm=0;
		while(t1!=0) {
			int mul=1;
			rem=t1%10;
			for(int i=0;i<l;i++) {
				
				mul=mul*rem;}
			
			arm=arm+mul;
			t1=t1/10;
			}
			
		
	 
	 if (arm==n) {
		 System.out.println("A.number");
	 }else {
		 System.out.println("not A number");
	 }
		 
		 
	}}