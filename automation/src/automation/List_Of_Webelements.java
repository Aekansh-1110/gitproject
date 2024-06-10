package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class List_Of_Webelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	  List <WebElement>l = driver.findElements(By.tagName("a"));
	     System.out.println(l.size());
	     for(int i=0;i<l.size();i++) {
	    	String txt= l.get(i).getText();
	    	System.out.println(txt);
	    	 
	    	 
	    	 
	     }
	}}


