package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class select_checkbox_radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//if we want to avoid multiple steps of clicking locator use following method;
		// List<WebElement>l=  driver.findElements(By.xpath("//input[@type='checkbox']"));//find common locator in all checkbox code
		  //  System.out.println(l.size());
		  //  for(int i=0;i<l.size();i++) {
		   // 	l.get(i).click();
		//for clciking radiobutton nd checkhbox button both find similar code in all code
		List<WebElement>l=  driver.findElements(By.name("webform"));
		
		 System.out.println(l.size());
		    for(int i=0;i<l.size();i++) {
		   	l.get(i).click();
		    }

	}

}
