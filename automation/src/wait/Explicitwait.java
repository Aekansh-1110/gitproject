package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		 WebDriverWait wait;
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		
		    driver.get("https://www.google.co.in/" );
		    
		    driver.manage().window().maximize();
		    
		    WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		    
		    WebElement element = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(
		    "Gmail")));
		    
		    
		    element.click();
		  }

		  

		

	}





















