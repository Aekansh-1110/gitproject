package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);//we can use name linktext and index value
		//frame count always starts from top left corner of parent frame
        driver.findElement(By.partialLinkText("h5")).click();
        driver.switchTo().parentFrame();//default frame
        driver.switchTo().frame(1);
        driver.findElement(By.tagName("input")).click();
        
	}

}
