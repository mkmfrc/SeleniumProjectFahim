package smarttech.nyc.stepdefinitions;

import org.testng.Assert;
import io.cucumber.java.en.*;
import smarttech.nyc.basepage.ParentClass;
import smarttech.nyc.elementspage.MasterPageFactory;
import smarttech.nyc.generic.CommonUtil;



public class FunctionalStepDef extends ParentClass {
	
	MasterPageFactory mpf;
	
	@Given("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
		
		mpf = new MasterPageFactory();
		mpf.getLogIn(prop.getProperty("UserName"), prop.getProperty("Password"));;

		String exp = "Home" ; //BA requirements
		String act = mpf.getValHomePage().getText();
		Assert.assertEquals(exp, act);
		System.out.println("Visibility of text : " + act);
	}
	
	@When("Users Able To Click On Products Module")
	public void users_able_to_click_on_products_module() {
		
		CommonUtil.actionClick(mpf.getClickProdMod());
	    
	}
	@Then("Users Able To Verify {string} Text Are Available On The Screen")
	public void users_able_to_verify_text_are_available_on_the_screen(String string) {
	   
	    
	}
	@When("Users Able To Check All the Products Prices Are Displayed And Print In Console")
	public void users_able_to_check_all_the_products_prices_are_displayed_and_print_in_console() {
	   
	    
	}
	@Then("Users Able To Select {string} From Display And Verify The Price")
	public void users_able_to_select_from_display_and_verify_the_price(String string) {
	   
	    
	}
	@When("Users Able To Click On Add To Cart Button")
	public void users_able_to_click_on_add_to_cart_button() {
	   
	    
	}
	@Then("Users Able To Verify {string} And Click On View Cart")
	public void users_able_to_verify_and_click_on_view_cart(String string) {
	   
	    
	}
	@Then("Verify The Same Price As I See Before Click On Add To Cart")
	public void verify_the_same_price_as_i_see_before_click_on_add_to_cart() {
	   
	    
	}
	@When("User able to click on the proceed to checkout button")
	public void user_able_to_click_on_the_proceed_to_checkout_button() {
	   
	    
	}
	@When("User Able To Add Comment About My Order")
	public void user_able_to_add_comment_about_my_order() {
	   
	    
	}
	@When("User Able To Click On Place Order")
	public void user_able_to_click_on_place_order() {
	   
	    
	}
	@Then("User able to verify Payment Page")
	public void user_able_to_verify_payment_page() {
	   
	    
	}
	@Then("Enter payment details Name on Card, Card Number, CVC, Expiration date")
	public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
	   
	    
	}
	@Then("Click pay and Confirm Order button")
	public void click_pay_and_confirm_order_button() {
	   
	    
	}
	@Then("Verify success message {string}")
	public void verify_success_message(String string) {
	   
	    
	}
	@When("User able to Click on Download Invoice button and verify invoice is downloaded successfully.")
	public void user_able_to_click_on_download_invoice_button_and_verify_invoice_is_downloaded_successfully() {
	   
	    
	}
	@When("Click on Continue button")
	public void click_on_continue_button() {
	   
	    
	}
	@When("Click On Logout Button")
	public void click_on_logout_button() {
	   
	    
	}
	@Then("Verify The Text {string}")
	public void verify_the_text(String string) {
	   
	    
	}
}
