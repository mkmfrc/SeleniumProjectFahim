package smarttech.nyc.testNGChallenges;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	WebDriver driver;

	@BeforeMethod
	@Parameters("BrowserRun")

	public void setUp(String browser) {
		
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();

		
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();

		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void TestSteps() {
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
		
		
//		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("tanvirpatwary16@gmail.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tester01");
//		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

	}

}
