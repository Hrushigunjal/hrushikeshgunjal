package TestNg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KiteWithTestNg {
	@Test
	public void m1() {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");			
			WebDriver driver = new ChromeDriver();			
			driver.get("https://kite.zerodha.com/");
	}	
	@Test
	public void m2() {	
		   System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");			
			WebDriver driver = new ChromeDriver();					
			driver.get("https://kite.zerodha.com/");
	}

}
