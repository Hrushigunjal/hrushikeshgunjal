package Parallaltesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test2 {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void Module1() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\installer\\geckodriver.exe");
		
			    driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get("https://kite.zerodha.com/");	
				
				Thread.sleep(3000);
				
				driver.quit();
	}
	@Test
    public void Module2() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\installer\\geckodriver.exe");
		
	    driver = new FirefoxDriver();
		
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get("https://kite.zerodha.com/");	
				
				Thread.sleep(3000);
				
				driver.quit();
	}
	@Test
    public void Module3() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\installer\\geckodriver.exe");
		
	    driver = new FirefoxDriver();
		
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get("https://kite.zerodha.com/");	
				
				Thread.sleep(3000);
				
				driver.quit();
	}

}
