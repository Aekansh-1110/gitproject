package javaprogram;

public class star4 {

	public static void main(String[] args) {
		//outer loop for rows  
				for(int i=1;i<=6;i++) //7
				    {
					//Space
					 for(int j=2;j<=i;j++)//j=2 3 4 5 6
					    {
						   System.out.print("  ");// _ _
						   
					    }
					    //*
					  for(int k=6;k>=i;k--) {//k=6   
							System.out.print("* ");
							
							
						    } 
					
					   
					  
					  System.out.println();
				    }

	}

}
