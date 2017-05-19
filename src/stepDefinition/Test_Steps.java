package stepDefinition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
WebDriver driver=null;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	System.setProperty("webdriver.gecko.driver", "/Users/Adilmarjana2011/Desktop/Selenium folders/Systems/geckodriver");
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("http://store.demoqa.com");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}

	@And("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String UserName, String Password) throws Throwable {
	driver.findElement(By.xpath(".//*[@id='log']")).sendKeys(UserName);
	driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys(Password);
	driver.findElement(By.xpath(".//*[@id='login']")).sendKeys(Keys.ENTER);
		
	}
	
	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfylly(){
	System.out.println("The site is successfully logged in");
	}
	
	@When("^User Logout from the Application$")
	public void user_Logout_from_the_Application() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	}

	@Then("^Message displayed Logout Successfully$")
	public void Message_displayed_Logout_Successfylly(){
	System.out.println("The site is successfully logged out");
	}
	

}


