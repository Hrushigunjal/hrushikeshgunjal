package Dataprovider1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDP2 {
	WebDriver driver;
	@BeforeClass
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 
		    driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);						
	}
	
	@Test(dataProvider = "loginData")
	 public void LoginTest(String User, String PWD,String EXP) throws InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		WebElement Username = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		Thread.sleep(2000);
		Username.clear();
		Thread.sleep(2000);
		Username.sendKeys(User);
		
		WebElement Password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		Thread.sleep(2000);
		Password.clear();
		Thread.sleep(2000);
        Password.sendKeys(PWD);
        
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);

		
		String Exp_Title = "Dashboard / nopCommerce administration";
		
	     String Act_Title = driver.getTitle();
	     
	     if(EXP.equals("Valid")) {
	    	 
	    	 if(Exp_Title.equals(Act_Title)) {
	    		 
	    		 driver.findElement(By.linkText("Logout")).click();
	    		 Assert.assertTrue(true);
	    	 }
	    	 else {
	    		 Assert.assertTrue(false);
	    	 }
	     }
	     else if(EXP.equals("Invalid")) {
	    	 if(Exp_Title.equals(Act_Title)) {
	    		 
	    		 driver.findElement(By.linkText("Logout")).click();
	    		 Assert.assertTrue(false);

	    	 }
	    	 else {
	    		 Assert.assertTrue(true);

	    	 }
	     }
		
	}	
	 @DataProvider(name ="loginData")
	public String[][] GetData() {
		
		String logindata[][]  = {	
			{"admin@yourstore.com","admin","Valid"},
			{"admin@yourstore.com","adm","InValid"},
			{"admin@yoursto.com","admin","Invalid"},
			{"admin@yoursto.com","adm","Invalid"}	
    };
		
		return logindata;
    }
	 
	@AfterClass
	public void Teardown() {		
		driver.quit();
	}

}
