package TestNg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class report {
    WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void Module1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
			    driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get("https://kite.zerodha.com/");	
				
				Thread.sleep(3000);
				
				driver.quit();
	}
	@Test
    public void Module2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
			    driver =new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get("https://kite.zerodha.com/");	
				
				Thread.sleep(3000);
				
				driver.quit();
	}
	@Test
    public void Module3() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
			 driver =new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get("https://kite.zerodha.com/");	
				
				Thread.sleep(3000);
				
				driver.quit();
	}

}
