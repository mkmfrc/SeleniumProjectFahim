package smarttech.nyc.testNGChallenges;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BasicAnnotations {

	
	@BeforeSuite
	public void getBeforeSuite() {
		System.out.println("Run BeforeSuite");
	}
	@BeforeTest
	public void getBeforeTest() {
		System.out.println("Run BeforeTest");
	}
	
	@BeforeClass
	public void getBeforeClass() {
		System.out.println("Run BeforeClass");
	}
	@BeforeMethod
	public void getBeforeMethod() {
		System.out.println("Run BeforeMethod");
	}
	@Test
	public void getTest() {
		System.out.println("Run Test");
	}
	@AfterMethod
	public void getAfterMethod() {
		System.out.println("Run AfterMethod");
	}
	@AfterClass
	public void getAfterClass() {
		System.out.println("Run AfterClass");
	}
	@AfterTest
	public void getAfterTest() {
		System.out.println("Run AfterTest");
	}
	@AfterSuite
	public void getAfterSuite() {
		System.out.println("Run AfterSuite");
	}

	
}
