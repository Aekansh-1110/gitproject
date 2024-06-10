package javaprogram;

import java.util.Scanner;

public class useractorial {

	public static void main(String[] args) {
		System.out.print("enter the number::");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int a=n;
		int fact=1;
		for( int i=1;i<=n;i++) {
			fact=fact*i;		}
		System.out.print("factrial of " + n + " is " + fact);
		

	}

}
