package Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class harred_assert1 {
	@Test
	public void DemoTest() {
		
		//Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		System.out.println("Good evening");
		
//		Assert.assertEquals("Welcome", "Welcome"); //true condition
//		
//		System.out.println("Hello");
//		
//		Assert.assertEquals("Selenium", "Seleni");	 //false
//		
//		System.out.println("Successfully Passed DemoTest1");
//		System.out.println();
	}
	
	@Test
	public void DemoTest1() {
		
		Assert.assertTrue(false);
		
		System.out.println("Hello");
		Assert.assertEquals("Java", "Java");
		System.out.println("Successfully Passed");
	}
	
}
