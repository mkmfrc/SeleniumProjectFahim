package smarttech.nyc.testNGChallenges;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCases {

	@Test
	public void getTestOne(){
		Assert.assertTrue(true);
		System.out.println("getTestOne");
	}
	@Test
	public void getTestTwo(){
		Assert.assertTrue(true);
		System.out.println("getTestTwo");
	}
	@Test
	public void getTestThree(){
		Assert.assertTrue(true);
		System.out.println("getTestThree");
	}
	@Test
	public void getTestFour(){
		Assert.assertTrue(true);
		System.out.println("getTestFour");
	}
	@Test
	public void getTestFive(){
		Assert.assertTrue(true);
		System.out.println("getTestFive");
	}
}
