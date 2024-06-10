package javaprogram;

import java.util.Scanner;

public class reversestringwithpalindrome {

	public static void main(String[] args) {
		 System.out.print("enter the number::");
		 Scanner sc = new Scanner (System.in);
		String n =sc.next();
		int a=n.length();
		System.out.println("string length="+a);
		String rev ="";
		for (int i=a-1;i>=0;i--) {
			rev=rev+n.charAt(i);}
		System.out.println("reverse string is::"+rev);
	
		
		{	if (n.equals(rev))
		{System.out.println("palindrome");}
		
		else {System.out.println("not palindrome");}
		
		

	}

}}
