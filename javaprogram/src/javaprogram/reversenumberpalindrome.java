package javaprogram;

import java.util.Scanner;

public class reversenumberpalindrome {

	public static void main(String[] args) {
		 System.out.print("enter the number::");
		 Scanner sc = new Scanner (System.in);
		 int n =sc.nextInt();
		 int a =n;
		int rev=0,rem;
		while(a!=0) {
	    rem=a%10;
		rev=rev*10+rem;
		a=a/10;}
		{System.out.println("the reverse no is::"+rev);}
		
		if(n==rev)
		{System.out.println("palindrome");}
		else {System.out.println("not palindrome");
	}}}
		

	


