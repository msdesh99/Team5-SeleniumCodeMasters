package steps;
import utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import configs.BrowserConfig;
import pages.LaunchPage;
import utils.SoftAssertUtils;
public class LaunchPageSteps {
	TestContext testContext;
	WebDriver driver;
	LaunchPage launchPage;
	SoftAssertUtils softAssertUtils;
	public LaunchPageSteps(TestContext testContext) {
		this.testContext = testContext;
		this.driver = this.testContext.base.getDriver();
		this.launchPage = this.testContext.pageObjectManager.getLaunchPage();		
		
	}
	//========= launchpage.feature
	@Given("User launches the browser")
	public void user_launches_the_browser() {	
		System.out.println("baseUrl: "+this.testContext.base.getConfigs().getBaseUrl());
		System.out.println("This is Given url: "+ driver.getClass()+" "+BrowserConfig.getBrowserType());		
	}
	@When("User enters the SweetBalance url")
	public void user_enters_the_sweet_balance_url() {
		try {
			Assert.assertEquals(driver.getCurrentUrl(),this.testContext.base.getConfigs().getBaseUrl(),"LaunchUrl Assertion failed");
		}catch(AssertionError ae) {
			System.err.println(ae.getMessage());
		}
	}
	@Then("User should see app name on the top left")
	public void user_should_see_app_name_on_the_top_left() {
		System.out.println("User logged in : "+ driver.getCurrentUrl());
		Map<String,Object> map = launchPage.validateAppNameOnTopLeft();
		softAssertUtils = testContext.get("SoftAssertUtils", SoftAssertUtils.class);
		softAssertUtils.assertTrue((Boolean)map.get("ElementFound"),"Assertion for presence of App Name Element is failed");
		softAssertUtils.assertTrue((int)map.get("location")<=20,"App Name appears at the top left corner assertion is failed");
		try {
			softAssertUtils.assertAll();
		}catch(AssertionError ae) {
			System.err.println(ae.getMessage());
		}	
	}
	@Then("User should see text {string}")
	public void user_should_see_text(String policyText) {
		System.out.println("Policy: "+policyText);
	}
	//============== launchpage2.feature
	@When("User checks the heading")
	public void user_checks_the_heading() {
		System.out.println("This is Given url: "+ driver.getClass()+" "+BrowserConfig.getBrowserType());
		try {
			Assert.assertTrue(driver.getClass().toString().contains(BrowserConfig.getBrowserType()),"browserType Assertion failed");
		}catch(AssertionError ae) {
			System.out.println(ae.getMessage());
		}
	}
	@Then("User should see the heading {string}")
	public void user_should_see_the_heading(String string) {
		
	}
	@When("User checks {string} input button")
	public void user_checks_input_button(String string) {
		
	}
	@Then("User should see a {string} input button is visible")
	public void user_should_see_a_input_button_is_visible(String string) {
		
	}
	
	

	
}
