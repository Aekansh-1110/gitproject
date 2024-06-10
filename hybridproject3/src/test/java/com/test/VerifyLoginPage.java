package com.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pom.HomePage;
import com.utility.Base;
import com.utility.ExcelDataProvider;

public class VerifyLoginPage extends Base{
	@Test
	public void verifyLoginePage() throws IOException {

		HomePage hp = new HomePage(driver);
		
		//ExcelDataProvider edp = new ExcelDataProvider();
		//edp.getData();
   //String user = edp.getStringData("Sheet1", 0, 0);
		WebElement w =driver.findElement(By.xpath("//input[@type='text']"));
				w.sendKeys("ashwinimunde4793@gmail.com");
		//String pass = edp.getStringData("Sheet1", 1, 0);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aekansh@1110");
//		hp.password();
		hp.login();
		 
		
	}
}


