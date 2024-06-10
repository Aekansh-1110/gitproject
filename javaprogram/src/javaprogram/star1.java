package javaprogram;

public class star1 {

	public static void main(String[] args) {
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		
		//outer loop for rows  
		for(int i=1;i<=6;i++) //7
			//0 1 2 3 4 5
		{   
		//inner loop for columns  
			for(int j=1;j<=i;j++)  //j=1 2 3 4 5 6
			{   
				//prints stars   
				System.out.print("* ");   
			}   
		  //throws the cursor in a new line after printing each line  
		 System.out.println();   
		}

}
}


	


