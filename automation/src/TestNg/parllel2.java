package TestNg;

import org.testng.annotations.Test;

public class parllel2 {
	
  @Test
  public void f() {
	  long i= Thread.currentThread().getId();
	  System.out.println("Test case 5 is succesful"+"Thread id:"+i);
  }
  @Test
  public void i() {
	  long i= Thread.currentThread().getId();
	  System.out.println("Test case 6 is succesful"+"Thread id:"+i);
  }
}
