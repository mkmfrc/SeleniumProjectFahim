package smarttech.nyc.testNGChallenges;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority= 1)
	public void getBeforeClass1() {
		System.out.println("Run BeforeClass");
	}
	@Test(priority= 0)
	public void getBeforeClass2() {
		System.out.println("Run BeforeClass2");
	}
	@Test(priority= 2)
	public void getBeforeClass3() {
		System.out.println("Run BeforeClass3");
	}
}
