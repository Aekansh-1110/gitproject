package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co =new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		//driver.get("https://www.google.com/");
	//	driver.get("https://demoqa.com/buttons ");
		//driver.get("https://www.facebook.com/");
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	//driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		//WebElement a =driver.findElement(By.linkText("Gmail"));
// WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
WebElement s = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));
		
		WebElement d = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(s, d).build().perform();
		
		
		

		
		//driver.findElement(By.tagName("select")).click()
		//driver.findElement(By.name("email")).sendKeys("8329080292");
	//Thread.sleep(1000);
		//Actions ac = new Actions (driver);
		//ac.moveToElement(a).build().perform();
		//ac.click(a).build().perform();
		
		//ac.doubleClick(doubleClick).build().perform();
		//for (int i=1;i<=4;i++) {
		
			//ac.sendKeys(Keys.ARROW_DOWN).build().perform();
			//Thread.sleep(1000);
		//ac.sendKeys(Keys.ENTER).build().perform();
			//}
		//ac.sendKeys(Keys.TAB).build().perform();

		// driver.findElement(By.name("pass")).sendKeys("Sandip@123");

		

		
		
			
}}
