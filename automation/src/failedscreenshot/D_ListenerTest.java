package failedscreenshot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class D_ListenerTest implements ITestListener{

  
  public void onTestFailure(ITestResult result) {
    try {
      C_GetScreenshot.capture(result.getName());
      System.out.println(result.getName());
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  
}