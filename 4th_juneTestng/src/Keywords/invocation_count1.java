package Keywords;

import org.testng.annotations.Test;

public class invocation_count1 {

	@Test(invocationCount=20)
	public void Addition() {
		
		int a=10;
		int b=20;
		int c = a+b;
		System.out.println("Sum = :"+c);
	}
}
