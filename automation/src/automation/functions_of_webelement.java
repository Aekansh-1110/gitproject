package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class functions_of_webelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		//driver.get("https://www.google.com/");
     // driver.get("https://www.facebook.com/");
		//WebElement w=driver.findElement(By.tagName("a"));
		
		//String s=w.getText();
		//System.out.println(s);
		
		//boolean S= w.isEnabled();
		//System.out.println(S);
		
	//boolean M=w.isDisplayed();
//	System.out.println(M);
		//is selected
		Thread.sleep(1000);
	driver.get("https://artoftesting.com/samplesiteforselenium");
		 WebElement w=driver.findElement(By.className("Automation"));
		     w.click();
		   boolean b=w.isSelected();
		   System.out.println(b);
		
		
		  
		
		
	
		
		
	}

}
