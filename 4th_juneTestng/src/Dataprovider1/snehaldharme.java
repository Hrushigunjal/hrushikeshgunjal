package Dataprovider1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class snehaldharme {
	
	WebDriver driver;
	@Test(dataProvider = "LoginTestData")
	public void LoginTest(String Username, String Password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		WebElement Username1 = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		Username1.sendKeys(Username);
		
		WebElement password1= driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password1.sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),\"Paul Collings\")]")).isDisplayed());
		
	Thread.sleep(2000);
	driver.quit();
	}	
	
	@DataProvider(name = "LoginTestData")
	 public Object[][] logindata() {
		
		Object[] [] data = new Object[4][2];
		
		//correct Username and Correct Password
		
		
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		//Wrong Username and Correct Password
		
		data[1][0] = "Admi";
		data[1][1] = "Admin123";
		
	//Correct Username and Wrong Password
		data[2][0] = "Admin";
		data[2][1] = "Admin12";
		
		
	//Wrong Username and Wrong password
		data[3][0] = "Adm";
		data[3][1] = "Admin23";
		
		return data;
		
	
		
		
		
		
		
		
	}


}
