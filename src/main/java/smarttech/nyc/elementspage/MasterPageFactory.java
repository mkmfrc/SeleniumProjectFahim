package smarttech.nyc.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smarttech.nyc.basepage.ParentClass;
import smarttech.nyc.generic.CommonUtil;


public class MasterPageFactory extends ParentClass{

				// Initialization PageFactory
				// We have to create a constructor
				// PageFactory class is coming from Selenium
				// all initElements after the dot.
				// this is a java reserved keyword. this refers current class properties
	
	public MasterPageFactory() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@name='email'])[1]")
	@CacheLookup
	private WebElement enterEmail;
	public WebElement getEnterEmail() {
		return enterEmail;
	}
	
	@FindBy(xpath = "//input[@type='password']")
	@CacheLookup
	private WebElement enterPassword;
	public WebElement getEnterPassword() {
		return enterPassword;
	}
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	@CacheLookup
	private WebElement clickLoginButton;
	public WebElement getClickLoginButton() {
		return clickLoginButton;
	}

	public void getLogIn(String userName, String pw) {
		getEnterEmail().sendKeys(userName);
		getEnterPassword().sendKeys(pw);
		CommonUtil.actionClick(getClickLoginButton());
		//getClickLoginButton().click();
	}	
	
	@FindBy(xpath = "//*[text()=' Home']")
	@CacheLookup
	private WebElement valHomePage;
	public WebElement getValHomePage() {
		return valHomePage;
	}
		
	@FindBy(xpath = "//*[text() =' Products']")
	@CacheLookup
	private WebElement clickProdMod;
	public WebElement getClickProdMod() {
		return clickProdMod;
	}
	
}