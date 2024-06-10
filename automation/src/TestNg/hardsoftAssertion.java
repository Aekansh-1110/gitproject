package TestNg;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardsoftAssertion {
  

@Test
  public void f() {
	 // String expected_Title = "Google";
		//String actual_Title = "Google1";
		//System.out.println("Test case execution started");
  // Assert.assertEquals("Google", "Google1");
  //System.out.println("Test case exicution finished");
 // }}

//softAssertion
	
String expected_Title = "google";
String actual_Title = "google1";
System.out.println("Test case execution started");
SoftAssert a = new SoftAssert();
a.assertEquals("google", "google1");
System.out.println("Test case exicution finished");

}}