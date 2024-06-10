package TestNg;

import org.testng.annotations.Test;

public class sanity {
	@Test(groups= {"sanity"})
	  public void a() {
		  System.out.println("I am a method");
	  }
	  @Test(groups= {"regression"})
	  public void b() {
		  System.out.println("I am b metohd");
	  }
	  @Test(groups= {"sanity"})
	  public void c() {
		  System.out.println("I am c metohd");
	  
	}
	  @Test(groups= {"regression"})
	  public void d() {
		  System.out.println("I am d metohd");}

	 
	}
