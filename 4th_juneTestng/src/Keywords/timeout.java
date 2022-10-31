package Keywords;

import org.testng.annotations.Test;

public class timeout {
	@Test(timeOut = 10000)
	public void infiniteloop() {
		
		for(;;) {
			
			System.out.println("hello");
		}
	}
}
