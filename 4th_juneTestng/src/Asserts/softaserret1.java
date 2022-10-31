package Asserts;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softaserret1 {
	
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void Demo1() {
	SoftAssert softassert = new SoftAssert();
	
	softassert.assertEquals("Welcome", "Wecome");    //True
	
	System.out.println("Executed Started1");
	
	softassert.assertEquals("Selenium", "Selenium");    //False
	
	System.out.println("Successfully passed DemoTest1");
	
	softassert.assertAll();
	
	// it will collect the result of all the assertion and in case of any assertion failed that time
	//it will marked the test as failed
	}
	
@Test
public void DemoTest2() {
	
softassert.assertEquals("Welcome", "Welcom");   //false

System.out.println("Executed Started");

softassert.assertTrue(false);   //failed

softassert.assertEquals(false, true);  //failed

softassert.assertEquals("Python", "Pytho");   //false

System.out.println("Successfully passed DemoTest 2");

softassert.assertAll();

}
}
