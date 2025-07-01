package steps;

import java.util.HashMap;
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
		        loginpage.isdisplayedenterpassword(),
		        "Email input field is not displayed!"
		    );
		}
	@Then("User should see text {string} in email field placeholder on Login Page")
	public void user_should_see_text_in_email_field_placeholder_on_login_page(String string) {
		Assert.assertTrue(
		loginpage.isdisplayedenterpassword(),
        "Email input field is not displayed!"
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
        String email = emailList.get(3); 
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
		 String email = emailList.get(3);
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
		 String email = emailList.get(3);
		 loginpage.enterEmailid(email);
			loginpage.clickSubmitbtn();
		 List<String>passwordlist= loginpage.getpassword();      
		 String password1 = passwordlist.get(3);
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
        String email = emailList.get(4);         
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
    String email = emailList.get(4);         
    loginpage.enterEmailid(email);
	loginpage.clickSubmitbtn();
}

@Then("{string} input field should be displayed on Login Page")
public void input_field_should_be_displayed_on_login_page(String string) {
	Assert.assertTrue(loginpage.isfullnameElementsDisplayed());
    
}
@Then("{string} input field should be displayed on Login Page usernamefield")
public void input_field_should_be_displayed_on_login_page_usernamefield(String string) {
	Assert.assertTrue(loginpage.isusernameElementsDisplayed());
}
@Then("{string} input field should be displayed on Login Page passwordfield")
public void input_field_should_be_displayed_on_login_page_passwordfield(String string) {
	Assert.assertTrue(loginpage.ispasswordElementsDisplayed());
}


@Then("Terms & Conditions checkbox should be displayed on Login Page")
public void terms_conditions_checkbox_should_be_displayed_on_login_page() throws TimeoutException {
	Assert.assertTrue(loginpage.iscreatedElementsDisplayed());
}

@Then("{string} button should be disabled on Login Page")
public void button_should_be_disabled_on_login_page(String string) {
	Assert.assertTrue(loginpage.iscreateaccountDisaabled());
    
}
//-----------------------create New account---------------//

@Given("User clicks continue with email button after entering a valid new email for new account user")
public void user_clicks_continue_with_email_button_after_entering_a_valid_new_email_for_new_account_user() {
	loginpage.clickonloginbtn();
}
@Given("User is on complete profile form page for new account user")
public void user_is_on_complete_profile_form_page_for_new_account_user() {
	
    
}
@When("User checks the Terms & conditions box after filling all fields for new account user")
public void user_checks_the_terms_conditions_box_after_filling_all_fields_for_new_account_user() {
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(5); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(5));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(5));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(5));
    loginpage.enterPasswordname(singleRow.get("Password"));  
    loginpage.checkTermscondition();

    
}
@Then("{string} button should be enabled for new account user")
public void button_should_be_enabled_for_new_account_user(String string) {
	loginpage.isbuttonenabled();
}

@When("User clicks create account button after filling valid data in all fields for new account user on login Page")
public void user_clicks_create_account_button_after_filling_valid_data_in_all_fields_for_new_account_user_on_login_page() throws InterruptedException {
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(5); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(5));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(5));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(5));
    loginpage.enterPasswordname(singleRow.get("Password"));  
    loginpage.checkTermscondition();
    loginpage.waitUntilCreateAccountButtonEnabled(); 
    loginpage.clickoncreateNewAcc();
    Thread.sleep(5);
}

@Then("User should be redirected to upload blood report for new account user")
public void user_should_be_redirected_to_upload_blood_report_for_new_account_user() {
	Assert.assertTrue(loginpage.isBloodreportPageDisplayed());
}



@When("User clicks create account button after filling invalid data for new account user")
public void user_clicks_create_account_button_after_filling_invalid_data_for_new_account_user() {
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(8); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(8));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(8));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(8));
    loginpage.enterPasswordname(singleRow.get("Password"));  
    loginpage.checkTermscondition();
    
    loginpage.clickoncreateNewAcc();
   
}
@Then("User should see error message for new account user")
public void user_should_see_error_message_for_new_account_user() {
	Assert.assertTrue(loginpage.errorMsgdisplyed());
}
@When("User clicks create account button after filling valid data in all fields for new account user on login Page1")
public void user_clicks_create_account_button_after_filling_valid_data_in_all_fields_for_new_account_user_on_login_Page1() {
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(6); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(6));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(6));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(6));
    loginpage.enterPasswordname(singleRow.get("Password"));  
    loginpage.checkTermscondition();
    loginpage.waitUntilCreateAccountButtonEnabled(); 
    loginpage.clickoncreateNewAcc();
   
}
@Then("User should see Step Through Onboarding button or new account user")
public void user_should_see_Step_Through_Onboarding_button_or_new_account_user() {
	Assert.assertTrue(loginpage.isstepthroughonboardingPageDisplayed());
}
@When("User clicks create account button after filling valid data in all fields for new account user on login Page of blood report modal")
public void user_clicks_create_account_button_after_filling_valid_data_in_all_fields_for_new_account_user_on_login_page_of_blood_report_modal() {
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(7); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(7));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(7));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(7));
    loginpage.enterPasswordname(singleRow.get("Password"));  
    loginpage.checkTermscondition();
    loginpage.waitUntilCreateAccountButtonEnabled(); 
    loginpage.clickoncreateNewAcc();
    loginpage.clickonPdfbtn();
}


@Then("User should see Upload Blood Report modal for new account user")
public void user_should_see_upload_blood_report_modal_for_new_account_user() {
	Assert.assertTrue(
			loginpage.isDispalyedModel(),
		    "PDF Upload Modal is not displayed!"
		);}


}



