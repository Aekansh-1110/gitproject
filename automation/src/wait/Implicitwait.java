package wait;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Implicitwait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 String eTitle = "Demo Guru99 Page";
		 driver.get("http://demo.guru99.com/test/guru99home/" );    
		 driver.manage().window().maximize() ;
		    
		    String aTitle = driver.getTitle();
		    if (aTitle.equals(eTitle))
		    {
		    System.out.println( "Test Passed") ;
		    }
		    else {
		    System.out.println( "Test Failed" );
		    }
		    WebElement ab = driver.findElement(By.className("dropdown-toggle"));
		    ab.click();
		    
		    
		    //close browser
		    //driver.close();

		    
		

	}

}
