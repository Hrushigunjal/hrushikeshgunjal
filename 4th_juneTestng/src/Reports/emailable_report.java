package Reports;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailable_report {
	@Test
	public void googleTitle() {
		
		System.out.println("@Test -- Google Title test");
		Reporter.log("Running testcases 1");
	}
	@Test
	public void SearchTest() {
		Reporter.log("Running testcases 1");
		System.out.println("@Test -- Searfch Text");
		
	}
}
