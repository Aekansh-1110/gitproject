package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestions {
	  public static WebDriver driver;

  public static void main(String[] args) throws InterruptedException {

	  System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		    driver.findElement(By.name("q")).sendKeys("realme");
		    
		    Thread.sleep(2000);
		    
		    List<WebElement> as = driver.findElements(By.tagName("li"));
		    
		    System.out.println(as.size());//10
		    
		    for(int i=0;i<as.size();i++) {//0 1 2 ----9
		      
		      String txt = as.get(i).getText();
		      System.out.println(txt);
		    }
		    
		    Thread.sleep(2000);
		    
		    Actions act = new Actions(driver);
		    
		    for(int i=1;i<=5;i++) {
		    act.sendKeys(Keys.ARROW_DOWN).build().perform();
		    Thread.sleep(1000);
		    }
		    
		    act.sendKeys(Keys.ENTER).build().perform();

		  }

		
	}


