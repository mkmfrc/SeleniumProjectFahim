package smarttech.nyc.testNGChallenges;

import org.testng.annotations.Test;

public class EnableTrueFalse {
	@Test(enabled= false)
	public void getBeforeClass1() {
		System.out.println("Run BeforeClass1");
	}
	@Test(enabled= true)
	public void getBeforeClass2() {
		System.out.println("Run BeforeClass2");
	}
	@Test(enabled= true)
	public void getBeforeClass3() {
		System.out.println("Run BeforeClass3");
	}
}
