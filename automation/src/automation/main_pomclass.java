package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class main_pomclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 
		 Thread.sleep(3000);
		 PomDemo1  pom = new PomDemo1(driver);
			pom.search();
			
			pom.sbutton();
			Thread.sleep(3000);
			driver.navigate().back();
			
			Thread.sleep(3000);
			PomDemo2  pom1 = new PomDemo2(driver);
			pom1.gmail();
			
		}

	}

