package smarttech.nyc.testNGChallenges;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test
	public void getOpenBrowser() {
		System.out.println("getOpenBrowser");
	}
	
	@Test(dependsOnMethods = "getOpenBrowser")
	public void getLogin() {
		System.out.println("getLogin");
	}
	
	@Test(dependsOnMethods = "getLogin")
	public void getCloseBrowser() {
		System.out.println("getCloseBrowser");
	}
}
