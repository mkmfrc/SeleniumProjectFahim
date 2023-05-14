package smarttech.nyc.testNGChallenges;

import org.testng.annotations.Test;

public class SameTCMultipleTime {

	@Test(invocationCount=10)
	public void getBeforeClass() {
		System.out.println("Run BeforeClass");
	
	}
	
}
