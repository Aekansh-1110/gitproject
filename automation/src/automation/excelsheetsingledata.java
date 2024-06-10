package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class excelsheetsingledata {

	public static void main(String[] args) throws EncryptedDocumentException,IOException {
	FileInputStream excel =new FileInputStream("D:/resources folder/Excelsheet/Book1.xlsx");
	Sheet a = WorkbookFactory.create(excel).getSheet("Sheet1");

     String s = a.getRow(1).getCell(1).getStringCellValue();
     
      System.out.println(s);
	}}
		

