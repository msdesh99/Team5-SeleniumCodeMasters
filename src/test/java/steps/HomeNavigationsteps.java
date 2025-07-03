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
/*	@Given("User is on SweetBalance homepage")
	public void user_is_on_sweet_balance_homepage() {
	   
	}*/

	@When("User click the {string} button")
	public void user_click_the_button(String string) {
		homepageObj.click_starttodaylocator();
	}

	@Then("User should be redirected to the login1 page")
	public void user_should_be_redirected_to_the_login1_page() {
		 String currentUrl = (homepageObj).getCurrentUrl();
	        System.out.println("Go to url: " + currentUrl);
	        Assert.assertEquals(currentUrl.contains("Continue with email"), currentUrl.contains("Its not to login1 page!"));
	}
	@When("User look at the top right corner")
	public void user_look_at_the_top_right_corner() {
	    
	}

	@Then("User  should see a link labeled {string}")
	public void user_should_see_a_link_labeled(String string) {
	    boolean isLoginEle = homepageObj.loginlbutton_visible();
	    Assert.assertTrue(isLoginEle,"Login button is visible and also label");
	}
	@When("User click on the {string} link")
	public void user_click_on_the_link(String string) {
		homepageObj.loginbutton_click();
	}
	
	@Then("User should be redirected to the homenavigation page")
	public void user_should_be_redirected_to_the_homenavigation_page() {
		 String	currentUrl=homepageObj.getCurrentUrl();
		Assert.assertEquals(currentUrl.contains("Welcome Back"),currentUrl.contains("User is unable to see Welcome Back text"));
	}
	@When("User click on {string} button")
	public void user_click_on_button(String string) {
		homepageObj.checkyourriskbutton_click();
	}
	@Then("User should be redirected to the assessment modal dialog")
	public void user_should_be_redirected_to_the_assessment_modal_dialog() {
	boolean diabetesriskEle =  homepageObj.checkyourriskbutton_click();
		Assert.assertTrue(diabetesriskEle, "Diabetes Risk Analyzer");
	}
	
	}


