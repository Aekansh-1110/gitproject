package automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomDemo1 {
	
	  @FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")  
	   private WebElement SEARCH;
		
		public PomDemo1(WebDriver driver)
		{
		    PageFactory.initElements(driver,this) ;
		}
		
		
		public void search() {
			
			SEARCH.sendKeys("Selenium");
			SEARCH.sendKeys(Keys.ENTER);
			
		}
		public void sbutton() {
			
		
		
				
			}
			

	                                                 }
		

	


