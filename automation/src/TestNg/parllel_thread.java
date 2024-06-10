package TestNg;

import org.testng.annotations.Test;

public class parllel_thread {
  @Test
  public void a() { 
	 long i= Thread.currentThread().getId();
	  System.out.println("Test case 1 is succesful"+"Thread id:"+i);
  }
  @Test
  public void b() {
	  long i= Thread.currentThread().getId();
	  System.out.println("Test case 2 is succesful"+"Thread id:"+i);
	 
  }
  @Test
  public void c() {
	  long i= Thread.currentThread().getId();
	  System.out.println("Test case 3 is succesful"+"Thread id:"+i);
  
}
  @Test
  public void d() {
	  long i= Thread.currentThread().getId();
	  System.out.println("Test case 4 is succesful"+"Thread id:"+i);}
}

