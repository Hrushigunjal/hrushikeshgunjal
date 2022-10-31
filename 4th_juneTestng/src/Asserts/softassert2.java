package Asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert2 {
		WebDriver driver;
		     
		//Object of Class SoftAssert is created to use its methods
		SoftAssert softassert = new SoftAssert();
		SoftAssert softassert2 = new SoftAssert();
		     
		//current project workspace
		//String path = System.getProperty("user.dir"); 
		     
		@BeforeTest
		public void SetDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			     
		driver = new ChromeDriver();// Object is created - Chrome browser is opened
		driver.manage().window().maximize();
		}
		     
		//Soft Assertion example - with a failure test case example
		@Test
		public void verifyTitle() throws InterruptedException{
		driver.get("https://amazon.in");
		Thread.sleep(2000);
		String ActualTitle = driver.getTitle();
		System.out.println("Actual Title :"+ActualTitle);
		String ExpectedTitle = "cameras, books, watches, apparel, shoes and e-Gift, Cards. Free Shipping &amp; Cash on Delivery Available.";
		// String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";      
		//Soft assert applied to verify title
		softassert.assertEquals(ActualTitle, ExpectedTitle);
		 
		 
		//If failed, this line gets printed and execution is not halted
		System.out.println("Assertion 1 is executed");
		 
		softassert.assertAll();
		 
		}
		 
		//Soft Assertion example - with a positive flow test case example
		@Test
		public void verifyElement(){
		WebElement AmazonIcon = driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
		softassert2.assertEquals (true, AmazonIcon.isDisplayed());
		softassert2.assertAll();
		System.out.println("Icon is displayed");
		System.out.println("Assertion 2 is executed");
		 
		}
		     
		     
		@AfterTest
		public void closedriver(){
		driver.close();
		//Checks for failures if any and throws them at the end of execution 
		}
		     
		}

