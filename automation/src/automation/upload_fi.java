package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class upload_fi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
	ChromeOptions co = new ChromeOptions ();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver (co);
	driver.get("https://demo.guru99.com/test/upload/");
  driver.manage().window().maximize();
   WebElement cf= driver.findElement(By.id("uploadfile_0"));
     cf.sendKeys("C:/Users/USER/Documents/rtm.xlsx");
     driver.findElement(By.id("terms")).click();
     driver.findElement(By.id("submitbutton")).click();
     
	

}
}