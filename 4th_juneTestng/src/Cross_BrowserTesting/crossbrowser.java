package Cross_BrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Parameters("Browsername")
	@Test
	public void LoginTest(String Browsername) throws InterruptedException {
		
		//Step - 1
		if(Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
	    driver =new ChromeDriver();
		}
		    
		else if(Browsername.equals("FireFox")) {
		    System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\installer\\geckodriver.exe");    
            driver = new FirefoxDriver();
			
		}
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
     	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);
		
		String Exp_name = "Paul Collings";
	    String Actual_name=driver.findElement(By.xpath("//p[contains(text(),'Paul Collings')]")).getText();
		
		if(Actual_name.equals(Exp_name)) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
			
	    driver.quit();
	}
}
