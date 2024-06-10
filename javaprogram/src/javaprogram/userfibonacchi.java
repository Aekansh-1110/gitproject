package javaprogram;

import java.util.Scanner;

public class userfibonacchi {

	public static void main(String[] args) {
	  int a=0,b=0,c=1;
	  System.out.print("enter the number::");
	 Scanner sc = new Scanner (System.in);
	 int n =sc.nextInt();
	 System.out.print("fibo series is::");
	 for(int i=0;i<n;i++) {
		 a=b;	
		 b=c;
		 c=a+b;
		 System.out.print(a+" ");
		 
		 



}}}
