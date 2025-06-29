package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpage;
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
	   
	}



}
