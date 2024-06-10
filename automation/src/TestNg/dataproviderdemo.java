package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemo {
    @DataProvider(name="TestData")
    public String[][] getData1(){
      String[][] data = new String[1][2];//1-row,2-column
      
      data[0][0]="user1";
      data[0][1]="password1";
      
  return data;
  }
    @Test(dataProvider="TestData")
    public void login(String username,String password) 
    {
      

    
    System.out.println("Username is : " +username);//user1
    System.out.println("Password is : " +password);//password1
    

    }
}
