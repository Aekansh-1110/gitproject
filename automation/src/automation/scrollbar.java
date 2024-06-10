package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrollbar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
	       ChromeOptions co = new ChromeOptions();
	        co.addArguments("--remote-allow-origins=*");
	        WebDriver driver  = new ChromeDriver(co);
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	       // Thread.sleep(1000);
	       JavascriptExecutor j = (JavascriptExecutor)driver;
	       Thread.sleep(1000);
	      // j.executeScript("window.scrollBy(0,1000)");
	     //  Thread.sleep(1000);
	      // j.executeScript("window.scrollBy(0,-500)");
	    
	   j.executeScript("window.scrollBy(1000,0)");
   
}
}