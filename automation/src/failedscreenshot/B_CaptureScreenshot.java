package failedscreenshot;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class B_CaptureScreenshot extends A_maintest  {

  @Test
  public void captureScreenshot() throws InterruptedException {

	  System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver (co);
	 
      
    driver.get("https://www.facebook.com/");
    
    driver.manage().window().maximize();
    
    Thread.sleep(2000);
       
    String title =driver.getTitle();
      //Facebook – log in or sign up
     Assert.assertEquals("Facebook – log in or sign up1", title);
      
     Thread.sleep(6000);
       
     driver.close();
  }

}