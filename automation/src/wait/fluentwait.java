
package wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		 driver.get("http://enricheprosoftware.com/");    
		 driver.manage().window().maximize() ;
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

		             .withTimeout(Duration.ofSeconds(30))

		             .pollingEvery(Duration.ofSeconds(2))

		             .ignoring(NoSuchElementException.class);
		    
		    driver.findElement(By.linkText("About")).click();
		    
		    Thread.sleep(3000);
		    
		    JavascriptExecutor j = (JavascriptExecutor)driver;
		    
		    j.executeScript("window.scrollBy(0,400)");
		    
		    Thread.sleep(3000);
		    
		   //  w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Contact")));
		     
		    WebElement ab1 = wait.until(new Function<WebDriver, WebElement>() {

		         public WebElement apply(WebDriver driver) {

		           return driver.findElement(By.linkText("Contact"));

		         }

		       });
		    driver.findElement(By.linkText("Contact")).click();
		     
		    
		    }

}
	    
	   