package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class All_xpath_locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		driver.get("https://www.google.com/");
     // driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//xpath by attribute
	//WebElement w =driver.findElement(By.xpath("//input[@type='text']"));
		  	//  w.click();
		   //text
		   // WebElement w =driver.findElement(By.xpath("//a[text()='Gmail']"));
		   // w.click();
		   //contains
		   //driver.findElement(By.xpath("//a[contains(text(),'Gm')]")).click();
		   // index
//	driver.findElement(By.xpath("//a[@class='gb_H'][1]")).click();
		//absolute xpath
		//driver.findElement(By.xpath("/html/body/header/div[2]/div[3]/div[1]/div/div[1]/a")).click();
		//relative xpath
		driver.findElement(By.xpath("//body//div[4]//a")).click();
		
	}

}
