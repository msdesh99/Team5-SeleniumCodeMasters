package steps;
import org.openqa.selenium.WebDriver;



import configs.BrowserConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeNavigation;
//import pages.Homepagenavigation;
//import pages.LaunchPage;
import utils.SoftAssertUtils;
import utils.TestContext;
import org.testng.Assert;


public class HomeNavigationsteps {
	
	TestContext testContext;
	WebDriver driver;
	HomeNavigation homepageObj;
	SoftAssertUtils softAssertUtils;
	public HomeNavigationsteps(TestContext testContext) {
	this.testContext = testContext;
	this.driver = this.testContext.base.getDriver();
	this.homepageObj = this.testContext.pageObjectManager.getHomeNavigation();

	}

	@Given("User is on SweetBalance homepage")
	public void user_is_on_sweet_balance_homepage() {
	System.out.println("baseUrl: "+this.testContext.base.getConfigs().getBaseUrl());
	System.out.println("This is Given url: "+ driver.getClass()+" "+BrowserConfig.getBrowserType());
	}

	@When("User click the {string} button")
	public void user_click_the_button(String string) {
		homepageObj.click_starttodaylocator();
	   
	}
	@Then("User should be redirected to the login1 page")
	public void user_should_be_redirected_to_the_home_page() {

	Assert.assertTrue(homepageObj.continueemaillocator_isvisible());
	    }



	@When("User look at the top right corner")
	public void user_look_at_the_top_right_corner() {
	   
	}
	@Then("User  should see a link labeled {string}")
	public void user_should_see_a_link_labeled(String string) {
	boolean isloginEle=homepageObj.loginlbutton_visible();
	System.out.println(isloginEle + "isloginEle");
	   Assert.assertTrue(isloginEle,"true");
	}

	@When("User click on the {string} link")
	public void user_click_on_the_link(String linkName) throws InterruptedException  {
	 
		homepageObj.loginbutton_click();
	}

	// @Then("User should be redirected to the homenavigation page")
	// public void user_should_be_redirected_to_the_homenavigation_page() {
	// String expectedtext = "Welcome Back";
	//
	// String actualtext =homepagenavigation.welcomeback_visible();
	// Assert.assertEquals("Redirection to home navigation page failed!", expectedtext, actualtext);
	//
	// }
	@When("User click on {string} button")
	public void user_click_on_button(String string) {
		homepageObj.checkyourriskbutton_click();
	}

	@Then("User should be redirected to the assessment modal dialog")
	public void user_should_be_redirected_to_the_assessment_modal_dialog() {
	boolean isChkyourriskEle=homepageObj.chkyourrisk_visible();
	   Assert.assertTrue(isChkyourriskEle,"Diabetes Risk Analyzer");
	}



	}


