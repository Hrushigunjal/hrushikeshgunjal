package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	//Precondition annotation  -- Starts with @Before
	
		 /* @BeforeSuite - 1st preference
		  * @BeforeTest - 2nd Pre
		  * BeforeClass -  3rd Pre
		  * 
		  * @BeforeMethod
		  * @Test
		  * @After Method
		  * 
		  * @BeforeMethod
		  * @Test
		  * @AfterMethod
		  * 
		  * @BeforeMethod
		  * @Test
		  * @AfterMEthod
		  * 
		  * @AfterClass
		  * @AfterTest
		  */

		//In real time project we don't need all these annotations
		//we use only @BeforeClass @Beforemethod @AfterClass @Aftermethod @Test
		@BeforeSuite         //1
		  public void SetUp() {
			System.out.println("@BeforeSuite ---Setup system property for chrome");
		 }
		@BeforeTest          //2
		   public void launcBrowser() {
			   System.out.println(" @BeforeTest --- LaunchBrowser");
		   }	
	    @BeforeClass         //3
		  public void URL() {		  
			  System.out.println("@BeforeClass -- Enter URL");
		  }
		
		@BeforeMethod  //4   //7   //10
		  public void Login() {
			  System.out.println("@BeforeMethod --- Logint oto application");
		  }
		 
		   // TestClass - Starts with @Test
		@Test  //5
		   public void GoogleTitle() {
			   System.out.println(" @Test---- Google Title");
		   }
		 @Test   //8
		   public void GoogleLogo() {
			   System.out.println(" @Test -- Google logo");		   
		   }
		 @Test  //11
		   public void Demo() {
			   System.out.println("Demo test");
		   }
		   
		  // PostCondtion - starts with @after
		  @AfterMethod    //6  //9 //12
		  public void Logout() {
			  System.out.println("@AfterMethod -- Logout from applicaton");
		  }
		  
		  @AfterClass   //13
		  public void closebrowser() {
			  System.out.println("  @AfterClass Close browser");
		  }
		  
		  @AfterTest  //14
		  public void deletecookies() {		  
			  System.out.println("  @AfterTest --Delete cookies");
		  }
		  
		  @AfterSuite  //15
		  public void DD() {
			  System.out.println(" @AfterSuite ---Demp");
		  }


}
