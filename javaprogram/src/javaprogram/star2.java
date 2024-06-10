package javaprogram;

public class star2 {

	public static void main(String[] args) {
		//outer loop for rows  
				for(int i=1;i<=6;i++) //7
				    {
					//Space 
					    for(int j=5;j>=i;j--)//j=
					    {
						   System.out.print("  ");
						   
					    }
					    //*
					    for(int k=1;k<=i;k++) {//k=1 2 3 4 5 6
						System.out.print("* ");
						
					    } 
					  System.out.println();
				    }

	}

}
