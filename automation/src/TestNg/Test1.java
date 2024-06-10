package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
  
  @Test (groups= {"sanity"},priority=4)
  public void a() {
	  System.out.println("I am a method");
  }
  @Test(groups= {"sanity"},priority=1)
  public void b() {
	  System.out.println("I am b metohd");
  }
 // @Test(dependsOnMethods={"d"})
  @Test(alwaysRun=true)
  public void c() {
	  System.out.println("I am c metohd");
  
}
  @Test(priority=3)
  public void d() {
  Assert.assertEquals("abcd", "abc");
  System.out.println("I am d method");
  
  
  
  
  
  
  
  
  
  }}
