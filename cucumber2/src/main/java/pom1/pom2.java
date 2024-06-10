package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 {

@FindBy(xpath="//a[text()='Home']")
private WebElement HOME;

public pom2(WebDriver driver)
{
PageFactory.initElements(driver,this) ;
}

public void home() {

if(HOME.isDisplayed()) {
System.out.println("Test case is Pass");
}
else {
System.out.println("Test case is Fail");
}
}
}



