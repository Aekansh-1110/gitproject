package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Afterbefore {
	@BeforeClass
	public void bclass ()
	{System.out.println("I am before class method");}
	@AfterMethod
	public void aclass () {
		System.out.println("I am after class ");}
	
	@BeforeMethod
	public void beforemethod ()
	{System.out.println("I am beforemethod method");}
	@AfterMethod
	public void aftermethod () {
		System.out.println("I am aftermethod ");
	}
  @Test
  public void a() {System.out.println("I am a method");}
  @Test
  public void b() {
	  System.out.println("I am b metohd");
  }
  @Test
  public void c() {
	  System.out.println("I am c metohd");
  
}
  @Test
  public void d() {
	  System.out.println("I am d metohd");}

  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
}
