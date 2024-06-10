	package automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class datadriven {
	 
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","D:/resources folder/chromedriver-win32/chromedriver-win32/chromedriver.exe");
	ChromeOptions co = new ChromeOptions ();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver (co);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	FileInputStream excel =new FileInputStream("D:/resources folder/Excelsheet/Book1.xlsx");
	Sheet a = WorkbookFactory.create(excel).getSheet("Sheet1");
	  long b=(long) a.getRow(0).getCell(0).getNumericCellValue();
	      String s=a.getRow(0).getCell(1).getStringCellValue();
	Thread.sleep(1000);
   driver.findElement(By.name("email")).sendKeys(""+b);
   driver.findElement(By.name("pass")).sendKeys(""+s);
   Thread.sleep(1000);
    driver.findElement(By.name("login")).click() ;
	
	
	
	
	
	
	}}