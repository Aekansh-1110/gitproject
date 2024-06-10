package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (co);
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
	 WebElement listbox = driver.findElement(By.id("continents"));
	 Select s = new Select(listbox);
	// s.selectByIndex(1);//index visible text value 
	   List <WebElement>l=s.getOptions()	;
           int n=  l.size();
           System.out.println(n);
           for(int i=0;i<n;i++) {
        	 String p = l.get(i).getText();
        	 System.out.println(p);}
           driver.close();
           
	}

}
