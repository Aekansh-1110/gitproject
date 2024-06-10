package javaprogram;

import java.util.Scanner;

public class removeduplicate {

	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner sc = new Scanner(System.in);
		String w=sc.nextLine();
		String nw=" ";
		System.out.println("original string is: "+ w);
		
		for(int i=0;i<w.length();i++) {
			char ch=w.charAt(i);
			if(ch!=' ') {
				nw=nw+ch;
				w=w.replace(ch, ' ');
			}
		}
		System.out.println("new String is="+nw);
	}}

		

