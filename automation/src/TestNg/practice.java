package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class practice {
	 public static WebDriver driver;
 @BeforeSuite
  public void setUp() throws InterruptedException
  {   
    System.setProperty("webdriver.chrome.driver", "D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
    ChromeOptions co = new ChromeOptions();
    co.addArguments("--remote-allow-origins=*");
    driver=new ChromeDriver(co);
      Thread.sleep(2000);
  driver.get("https://practice.expandtesting.com/inputs");
      System.out.println("The app setup process is completed");
}
 @Test
 public void login () {
	 driver.findElement(By.id("input-number")).sendKeys("1");
	 driver.findElement(By.id("input-text")).sendKeys("input text");
	 driver.findElement(By.id("input-password")).sendKeys("Ashwini@1234");
	 driver.findElement(By.id("input-date")).sendKeys("18-08-1997");
	 driver.findElement(By.id("btn-display-inputs")).click();
	 System.out.println("the login process completed");
	 
	 
 }
}
