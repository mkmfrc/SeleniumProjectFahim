package smarttech.nyc.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import smarttech.nyc.basepage.ParentClass;

public class CommonUtil extends ParentClass {
	
	public static void actionClick(WebElement we) {
		Actions ac = new Actions(driver);
		ac.click(we).build().perform();
	}


}
