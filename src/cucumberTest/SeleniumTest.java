package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/Adilmarjana2011/Desktop/Selenium folders/Systems/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(5000L, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.xpath(".//*[@id='log']")).sendKeys("abidur92");
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Fahad0358#");
		driver.findElement(By.xpath(".//*[@id='login']")).sendKeys(Keys.ENTER);
		System.out.println("The website is successfully login");
		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
		System.out.println("The website is successfully logout");

		
	}

}
