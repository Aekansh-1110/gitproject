package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		//driver.get("https://www.google.com/");
      driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("email" )).sendKeys("9822185472");
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.className("gb_H")).click();
		//driver.findElement(By.partialLinkText("G")).click();
		//driver.findElement(By.name("email")).sendKeys("Ashwini munde");
		driver.findElement(By.cssSelector("input[type='text']")).click();
		//relative locators to left, to right, above ,below
	}

}
