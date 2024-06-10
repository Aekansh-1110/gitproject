package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class window_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		driver.get("https://demo.guru99.com/popup.php ");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		//Thread.sleep(2000);
		
		Set<String> s= driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		
		it.next();
		String w2nd = it.next();
	
	driver.switchTo().window(w2nd);
	
		Thread.sleep(2000);
	
	    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("btnLogin")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Click Here")).click();
	


}
}