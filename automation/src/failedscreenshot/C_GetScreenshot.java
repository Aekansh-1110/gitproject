package failedscreenshot;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;

	public class C_GetScreenshot extends A_maintest  {

	  public static String capture(String screenshotName) throws IOException  {
	    File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File d = new File("D:/Screenshot files/pqr.bmp");
	    
	    FileUtils.copyFile(s,d);
	    
	    return screenshotName;
	    
	  }
	  
	

	}

