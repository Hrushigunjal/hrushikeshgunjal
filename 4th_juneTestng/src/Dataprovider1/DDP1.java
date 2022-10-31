package Dataprovider1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDP1 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test(dataProvider = "LoginTestdata")
	public void LoginTest(String Username,String Password) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		    driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//URL
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//Username path
			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
			//password path
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
			//Click
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),\"Paul Collings\")]")).isDisplayed());			
	
	        Thread.sleep(3000);
	        
	        driver.quit();
	        
	}
	@DataProvider(name ="LoginTestdata")
	public Object[][] logindata() {
		
		
		Object [] [] data =new Object[4][2];
		//Corrrect username & correct password
		
		data[0][0]  = "Admin";
		data[0][1]  = "admin123";
		
		//CorrectUsername & incorrect password
		
		data[1][0]  = "Admin";
		data[1][1]  = "admin1";
		
		//Incorrectusername & correct password
		
		data[2][0]  = "Admin11";
		data[2][1]  = "admin123";
		
		//IncorrcectUn & ICP
		
		data[3][0]  = "Admi2";
		data[3][1]  = "admin323";
		
		return data;
	}

}
