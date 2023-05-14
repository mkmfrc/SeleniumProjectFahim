package smarttech.nyc.testNGChallenges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {

	WebDriver driver;
	@Test
	public void smokeTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 	
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("smokeTest");
	}
	@Test
	public void sanityTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 	
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("sanityTest");
	}
	@Test
	public void regressionTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 	
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("regressionTest");
	}
	@Test
	public void functionalTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 	
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("functionalTest");
	}
	
	
}
