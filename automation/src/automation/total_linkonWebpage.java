package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class total_linkonWebpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		List<WebElement>abc = driver.findElements(By.tagName("a"));
		int num = abc.size();
		System.out.println(num);
		
		for(int i=0;i<num-1;i++) {
			String c = abc.get(i).getText();
		
			System.out.println(c);


	}

}}
