package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		driver.get("http://demo.guru99.com/test/delete_customer.php ");
		driver.manage().window().maximize();
		Thread.sleep(1000);//thread is used to suspend program.
		driver.findElement(By.name("cusid")).sendKeys("1234");
	
		Thread.sleep(1000);
      driver.findElement(By.name("submit")).click();
     Thread.sleep(1000);
      driver.switchTo().alert().accept();
      // for dismis alert use dismis()
		//Thread.sleep(1000);
	 String  alt =driver.switchTo().alert().getText();
		    System.out.println(alt);
		 

	}

}
