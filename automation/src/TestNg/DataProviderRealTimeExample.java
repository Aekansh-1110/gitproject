package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderRealTimeExample {

	  public WebDriver driver;
	    @BeforeMethod
	    public  void launchBrowser ()   {
	     
	    	System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
			ChromeOptions co = new ChromeOptions ();
			co.addArguments("--remote-allow-origins=*");
	      
	      driver=new ChromeDriver(co);
	      
	      driver.get("https://www.facebook.com/");
	      
	      driver.manage().window().maximize();
	      
	    }
	    @DataProvider(name="TestData" )
	    public String[][] getData1(){
	      String[][] data = new String[1][2];
	      
	      data[0][0]="ashwinimunde4793@gmail.com";
	      data[0][1]="Aekansh*1110";
	      

	      
	    return data;
	      
	    }
	    @Test(dataProvider="TestData")
	    public void login(String username,String password) throws InterruptedException 
	    {
	      
	      driver.findElement(By.xpath("//input[@id='email']")).clear();
	      driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	      driver.findElement(By.xpath("//input[@id='pass']")).clear();
	      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.name("login")).click();

	    //  driver.close();
	      
	   }

	}