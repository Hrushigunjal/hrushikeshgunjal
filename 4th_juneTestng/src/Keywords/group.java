package Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class group {
	WebDriver driver;
	@BeforeMethod   //1  4  7
	public void Setup() {
//Question - How will u execute TCs in sequence manner  -- Using priority keyword		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
	}
	
	@Test(priority = 1,groups = "Titlepage")  //2
	public void ZiteloginpageTitle() {		
		 String Title =driver.getTitle();
		 System.out.println(Title);
	}
	@Test(priority = 2,groups = "Titlepage")  //5
	public void kitelogoTest() {
		
		boolean b=driver.findElement(By.xpath("//a[@class=\"logo kite-logo\"]")).isDisplayed();
	    System.out.println(b);
	}
	@Test(priority = 3,groups = "TitleLink")  //8
	public void Forgetuserlink() {
		
		String b=driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID or password?')]")).getText();
		System.out.println(b);
	}
	
	@Test(priority = 4,groups = "TitleLink")
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(priority = 5,groups = "TestTitle")
	public void Test2() {
		System.out.println("Test2");
	}
	@Test(priority = 6,groups = "TestTitle")
	public void Test3() {
		System.out.println("Test3");
	}
	@AfterMethod   //3  6  9
	public void Teardown() {		
		driver.quit();
	}
	
}
