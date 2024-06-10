package javaprogram;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		 System.out.print("enter the number::");
		 Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int t=0;
		for (int i=2;i<n;i++) {
			if (n%i==0)
			t=t+1;}
		if (t==0) 
		  {System.out.println("number is prime");
		   
		}
		else {System.out.println("numbe is not prime");
		}
		
		
		

	}

}
