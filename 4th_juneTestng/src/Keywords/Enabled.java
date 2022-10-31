package Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled {
	
    WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
	}
		@Test(enabled = true)  //2
		public void ZiteloginpageTitle() {		
			 String Title =driver.getTitle();
			 System.out.println(Title);
		}
		@Test(enabled = false)  //5
		public void kitelogoTest() {
			
			boolean b=driver.findElement(By.xpath("//a[@class=\"logo kite-logo\"]")).isDisplayed();
		    System.out.println(b);
		}
		@Test(enabled = true)  //8
		public void Forgetuserlink() {
			
			boolean b=driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID or password?')]")).isDisplayed();
			System.out.println(b);
		}
		@AfterMethod   //3  6  9
		public void Teardown() {		
			driver.quit();
		}
	

}
