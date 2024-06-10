package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class download {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","D:/Latest Software/ChromeDriver122/chromedriver-win32/chromedriver.exe");
	        
	       ChromeOptions co = new ChromeOptions();
	          
	       co.addArguments("--remote-allow-origins=*");
	         WebDriver  driver = new ChromeDriver (co) ;
driver.get("https://chromedriver.storage.googleapis.com/index.html?path=93.0.4577.63/");
         
	         driver.manage().window().maximize();
	         
	    WebElement txt = driver.findElement(By.xpath("//a[@href='/93.0.4577.63/chromedriver_win32.zip']"));
	         
	         txt.click();
	       

}
}