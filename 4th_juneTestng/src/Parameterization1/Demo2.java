package Parameterization1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	@Parameters({"URL"})
	public void setup(String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		  driver = new ChromeDriver();
			
		 driver.get(URL);
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
	}
	@Test
	@Parameters({"Username","Password"})
	public void logintest1(String Username,String Password) throws InterruptedException {
		
		WebElement User1=driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		Thread.sleep(2000);
		User1.clear();
		Thread.sleep(2000);
		User1.sendKeys(Username);
		
		WebElement Pass=driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		Thread.sleep(2000);
		Pass.clear();
		Thread.sleep(2000);
		Pass.sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String ExpTitle="Dashboard / nopCommerce administration";
		String ActTitle=driver.getTitle();
		
		if(ExpTitle.equals(ActTitle))
			System.out.println("passed");
		else
			System.out.println("failed");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
