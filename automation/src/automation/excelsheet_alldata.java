package automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class excelsheet_alldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream excel =new FileInputStream("D:/resources folder/Excelsheet/Book1.xlsx");	
       Sheet a =WorkbookFactory.create(excel).getSheet("sheet1");
       
         int rowno= a.getPhysicalNumberOfRows();
          for(int i=0;i<rowno;i++) 
          {
         int cellno=a.getRow(i).getPhysicalNumberOfCells();
          for(int j=0;j<cellno;j++) 
          {
        	String ss=a.getRow(i).getCell(j).getStringCellValue();
        	  
        	System.out.print(" "+ss);
          }
          System.out.println();
        	 
         }
	}

}
