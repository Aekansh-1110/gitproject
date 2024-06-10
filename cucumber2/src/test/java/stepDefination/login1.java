package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom1.pom1;
import pom1.pom2;

public class login1 {
	pom1 p1;
	pom2 p2;
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	

	@When("user is enter (.*) and (.*)$")
	public void user_is_enter_student_and_password123(String username ,String password) {
	 
	    driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
		  }


	

	@And("click on login button")
	public void click_on_login_button() {
	  p1 = new pom1(driver);
		p1.submit();
		
	}

	@Then("user is navigate to the homepage")
	public void user_is_navigate_to_the_homepage() {
		p2 = new pom2(driver);
		p2.home();
	}

		
	}




