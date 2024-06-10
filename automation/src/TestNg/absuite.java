package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class absuite {
	@BeforeSuite
	public void bclass ()
	{System.out.println("I am before suite  method");}
	@AfterSuite
	public void aclass () {
		System.out.println("I am after  suite class ");}
	

public void ac() {
	System.out.println("I am ac method ");}}