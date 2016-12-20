package cucumber_test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService; 

public class SeleniumTest {

	public static void main(String[] args) {
		
		//Launch Browser
		
	    System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,"//home//sudeepa//workspace//Cumcumber_SAF//Browser Drivers//geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.adactin.com/HotelApp/index.php");
        
        //Enter UserName and Password. And click on Login button
        
        driver.findElement(By.id("username")).sendKeys("Samphi123");
        driver.findElement(By.id("password")).sendKeys("Open123!");
        driver.findElement(By.id("login")).click();
        
        //Print Success Message
        
        System.out.println("/n Login Successful/n");
       
       
	}

}
