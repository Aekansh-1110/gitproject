package automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co =  new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new  ChromeDriver(co);
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File d = new File("D:/resources folder/File/screenshot.bmp");
	   FileUtils.copyFile(s, d);
	   
		
	   

	}

}
