package steps;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpage;
import utils.ExcelReader;
import utils.SoftAssertUtils;
import utils.TestContext;


public class Loginsteps {
	
	TestContext testContext;
	WebDriver driver;
	Loginpage loginpage;
	SoftAssertUtils softAssertUtils;
	public Loginsteps(TestContext testContext) {
		this.testContext = testContext;
		this.driver = this.testContext.base.getDriver();
		this.loginpage = this.testContext.pageObjectManager.getLoginpage();
		
	}
	@Given("User click on login button of Launch Page")
	public void user_click_on_login_button_of_launch_page() {
		loginpage.clickonloginbtn();
			    
	}

	@When("User enters userid {string} and password {string}")
	public void user_enters_userid_and_password(String string, String string2) {
		loginpage.enterEmailid(string);
		loginpage.clickSubmitbtn();
		loginpage.enterPassword(string2);
		loginpage.clicksigninBtn();	   
	}

	@Then("User should redirected to Homepage")
	public void user_should_redirected_to_homepage() {
//		Assert.assertEquals(true, null)
	   
	}
	@Given("User is on SweetBalance homepage for UI verfication")
	public void user_is_on_sweet_balance_homepage_for_ui_verfication() {
	
	    
	}

	@When("User clicks on {string} link for UI verfication")
	public void user_clicks_on_link_for_ui_verfication(String string) {
		loginpage.clickonloginbtn();
	}

	@Then("User should see {string} heading on Login Page")
	public void user_should_see_heading_on_Login_Page(String string) {
		Assert.assertTrue(
		        loginpage.logoonHomepage(),
		        "Heading is not displayed!"
		    );
		}

	@Then("User should see {string} subheading on LoginPage")
	public void user_should_see_subheading_on_login_page(String string) {
		Assert.assertTrue(
		        loginpage.subHeaderonLogo(),
		        "Subheading is not displayed!"
		    );
		}

	@Then("User should see close button at the right corner on Login Page")
	public void user_should_see_close_button_at_the_right_corner_on_login_page() {
		Assert.assertTrue(
		        loginpage.closeButton(),
		        "Close button is not displayed!"
		    );
		}

	@Then("User should see an input field to enter email on Login page")
	public void user_should_see_an_input_field_to_enter_email_on_login_page() {
		Assert.assertTrue(
		        loginpage.emailField(),
		        "Email input field is not displayed!"
		    );
		}
	@Then("User should see text {string} in email field placeholder on Login Page")
	public void user_should_see_text_in_email_field_placeholder_on_login_page(String string) {
		
		String actualPlaceholder = loginpage.getEmailFieldPlaceholder();
	    Assert.assertEquals(
	        actualPlaceholder,
	        string,
	        "Email field placeholder text is incorrect!"
	    );
	}

	@Then("User should see a {string} button on Loginpage")
	public void user_should_see_a_button_on_loginpage(String string) {
		Assert.assertTrue(
		        loginpage.continueEmailDisplayed());
		      
		}

	@Then("User should see {string} button to be enabled on Login Page")
	public void user_should_see_button_to_be_enabled_on_login_page(String string) {
		Assert.assertTrue(
		        loginpage.continueBtnEnabled());		       
		}

	@Then(": User should see an {string} separator on Login Page ofSweet")
	public void user_should_see_an_separator_on_login_page_ofSweet(String string) {
		Assert.assertTrue(
		        loginpage.orsepratotDisplyed());		        
		}


	@Then(": User should see {string} on login page")
	public void user_should_see_on_login_page(String string) {
		Assert.assertTrue(
		        loginpage.conditionIsDisplyed());
		       
		}
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		loginpage.clickonloginbtn();
	    
	}

	@When("Registered user clicks continue with email button after entering a valid existing email on Login Page")
	public void registered_user_clicks_continue_with_email_button_after_entering_a_valid_existing_email_on_login_page() {
		List<String>emailList= loginpage.getEmailId();
        String email = emailList.get(0); 
        loginpage.enterEmailid(email);
		loginpage.clickSubmitbtn();
    }
	    
	@Then("User should get password field on login Page")
	public void user_should_get_password_field_on_login_page() {		
		Assert.assertTrue(
		    loginpage.passfieldisdiaplyed());		    	
	}
	@When("User enters an invalid email on login Page")
	public void user_enters_an_invalid_email_on_login_page() {
		List<String>emailList= loginpage.getEmailId();      
        String email = emailList.get(1); 
        loginpage.enterEmailid(email);
		loginpage.clickSubmitbtn();
	}

	@Then("Email field should show validation error on login Page")
	public void email_field_should_show_validation_error_on_login_page() {
		Assert.assertTrue(
		    loginpage.errorMsgdisplyed());
		    
	}
	@When("Registered user clicks continue with email button after entering a valid email on login page")
	public void registered_user_clicks_continue_with_email_button_after_entering_a_valid_email_on_login_page() {
		List<String>emailList= loginpage.getEmailId();      
        String email = emailList.get(2); 
        loginpage.enterEmailid(email);
		loginpage.clickSubmitbtn();
	}

	@Then("User should see Sign in button on login Page")
	public void user_should_see_sign_in_button_on_login_page() {
		Assert.assertTrue(
		    loginpage.signInbtn());
		    
	}
	@Then("User should see a {string} button on Login page")
	public void user_should_see_a_button_on_login_page(String string) {
		Assert.assertTrue(loginpage.continueEmailDisplayed());
	}


	@When("User clicks continue with email button after entering a valid email on login Page")
	public void user_clicks_continue_with_email_button_after_entering_a_valid_email_on_login_page() {
		List<String>emailList= loginpage.getEmailId();      
        String email = emailList.get(3); 
        loginpage.enterEmailid(email);
		loginpage.clickSubmitbtn();
	}

	@Then("User should see email id in sub text on login Page")
	public void user_should_see_email_id_in_sub_text_on_login_page() {
		Assert.assertTrue(
		    loginpage.validEmaidIdisDisplyed());
		    
	}
	@When("Registered user clicks continue with email button after entering a valid email")
	public void registered_user_clicks_continue_with_email_button_after_entering_a_valid_email() {
		List<String>emailList= loginpage.getEmailId();      
        String email = emailList.get(5); 
        loginpage.enterEmailid(email);
		loginpage.clickSubmitbtn();
	}

	@Then("User should see {string} link on login Page")
	public void user_should_see_link_on_login_page(String string) {
		Assert.assertTrue(
		    loginpage.forgorPasswordlink());
		   
	}

	@When("Registered user clicks continue with email button after entering a valid email on login Page1")
	public void registered_user_clicks_continue_with_email_button_after_entering_a_valid_email_on_login_page1() {
		List<String>emailList= loginpage.getEmailId();      
		 String email = emailList.get(5);
		 loginpage.enterEmailid(email);
			loginpage.clickSubmitbtn();
	    
	}

	@Then("User should see text {string} as placeholder in password field on login Page")
	public void user_should_see_text_as_placeholder_in_password_field_on_login_page(String string) {
		Assert.assertTrue(
		    loginpage.passfieldisdiaplyed());
		    
	}

	@When("Registered user clicks sign in after entering password on login Page")
	public void registered_user_clicks_sign_in_after_entering_password_on_login_page() {
		List<String>emailList= loginpage.getEmailId();      
		 String email = emailList.get(5);
		 loginpage.enterEmailid(email);
			loginpage.clickSubmitbtn();
		 List<String>passwordlist= loginpage.getpassword();      
		 String password1 = passwordlist.get(5);
		 loginpage.enterPassword(password1);
			loginpage.clicksigninBtn();	  		 
		 
	}

	@Then("User should be navigated to home page on login Page")
	public void user_should_be_navigated_to_home_page_on_login_page() {
		Assert.assertTrue(
		    loginpage.homePageDisplyed());
		    
	}

	@When("Unregistered user clicks continue with email button after entering a valid new email on login Page")
	public void unregistered_user_clicks_continue_with_email_button_after_entering_a_valid_new_email_on_login_page() {
		List<String>emailList= loginpage.getEmailId();
        String email = emailList.get(6);         
        loginpage.enterEmailid(email);
		loginpage.clickSubmitbtn();
	}

	@Then("User should get {string} form on login Page")
	public void user_should_get_form_on_login_page(String string) {
		Assert.assertTrue(
		    loginpage.completeFormisdisplayed());
		   
	}
	
	    
	

//--------------------------------Complete form________________//
	
@When("User clicks continue with email button after entering a valid new email on Login Page")
public void user_clicks_continue_with_email_button_after_entering_a_valid_new_email_on_login_page() {
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(6);         
    loginpage.enterEmailid(email);
	loginpage.clickSubmitbtn();
}

@Then("{string} input field should be displayed on Login Page")
public void input_field_should_be_displayed_on_login_page(String string) {
	Assert.assertTrue(loginpage.isfullnameElementsDisplayed());
    
}

@Then("Terms & Conditions checkbox should be displayed on Login Page")
public void terms_conditions_checkbox_should_be_displayed_on_login_page() throws TimeoutException {
	Assert.assertTrue(loginpage.iscreatedElementsDisplayed());
}

@Then("{string} button should be disabled on Login Page")
public void button_should_be_disabled_on_login_page(String string) {
	Assert.assertTrue(loginpage.iscreateaccountDisaabled());
    
}
}



