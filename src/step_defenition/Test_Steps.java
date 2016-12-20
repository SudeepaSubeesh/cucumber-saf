package step_defenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.runtime.PendingException;

public class Test_Steps {
	
	public static  WebDriver driver;
	// Setup - Launch the Geckodriver 
	@Before
	public static void setup(){
		System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,"//home//sudeepa//workspace//cucumber-saf//Browser Drivers//geckodriver.exe" );
		driver = new FirefoxDriver();
	}

	@Given("^User is on Login page$")
	public void User_is_on_Login_page(){
		
		//System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,"//home//sudeepa//workspace//Cumcumber_SAF//Browser Drivers//geckodriver.exe" );
		driver = new FirefoxDriver();
	    driver.get("http://www.adactin.com/HotelApp/index.php");
		//throw new PendingException();
	}		
	
	@When("^User enters Credentials and Login$")
	public void User_enters_Credentials_and_Login(){

        driver.findElement(By.id("username")).sendKeys("UserName");
        driver.findElement(By.id("password")).sendKeys("Password");
        driver.findElement(By.id("login")).click();
        //throw new PendingException();
	
	}
	
	@Then("^successful login message is displayed$")
	public void successful_login_message_is_displayed(){
		System.out.println("/n Login Successful/n");
		//throw new PendingException();
	}
	
}
