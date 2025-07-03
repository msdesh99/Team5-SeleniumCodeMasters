package steps;
import utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import configs.BrowserConfig;

import pages.Launchgpage1;
import utils.SoftAssertUtils;

public class LaunchpageSteps {
	
	TestContext testContext;
	WebDriver driver;
	Launchgpage1 launchPageobj;
	SoftAssertUtils softAssertUtils;
	public LaunchpageSteps(TestContext testContext) {
	this.testContext = testContext;
	this.driver = this.testContext.base.getDriver();
	this.launchPageobj = this.testContext.pageObjectManager.getLaunchpage1();


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
	public void user_should_see_app_name_on_the_top_left() throws Exception {
	     int eleLocation = launchPageobj.validateAppNameOnTopLeft();
	try {
		Assert.assertTrue(eleLocation<=20,"App Name appears at the top left corner assertion is failed");
	}catch(AssertionError ae) {

	throw new Exception(ae.getMessage());
	}
	}

	@Then("User should see text {string}")
	public void user_should_see_text(String policyText) {
	 boolean isPolicyEle=launchPageobj.tagline_locator();
	   Assert.assertTrue(isPolicyEle,"Our Terms of Service and Privacy Policy have recently been updated");
	}

	@Then("User should see the heading {string}")
	public void user_should_see_the_heading(String headingText) {
	boolean isSmartEle=launchPageobj.smart_diabetes_track();
	   Assert.assertTrue(isSmartEle,"Smart Diabetes Tracking Powered by AI");
	}

	@Then("User should see a {string} input button")
	public void user_should_see_a_input_button(String starttoday) {
	boolean isStartEle=launchPageobj.start_today_locator();
	   Assert.assertTrue(isStartEle,"Start today button is visible");

	}
	@Then("User should see the text {string}")
	public void user_should_see_the_text(String comprehensive) {
	boolean isComprehensiveEle=launchPageobj.comprehensive_locator();
	Assert.assertTrue(isComprehensiveEle,"Comprehensive Diabetes Management Tools is visible");

	}
	@Then("User should see a card1 with title {string}")
	public void user_should_see_a_card1_with_title(String healthtracking) {
	boolean isHealthtrackcardEle=launchPageobj.healthcardtitle_locator();
	Assert.assertTrue(isHealthtrackcardEle,"Health Tracking title  is visible");
	}
	@Then("User should see a card2 with title {string}")
	public void user_should_see_a_card2_with_title(String nutrition) {
	boolean isNutritionEle=launchPageobj.nutritiontitle_locator();
	Assert.assertTrue(isNutritionEle,"Nutrition & Exercise title  is visible");
	}
	@Then("User should see a card3 with title {string}")
	public void user_should_see_a_card3_with_title(String smart) {
	boolean isSmartinsightcardEle=launchPageobj.smartinsights_locator();
	Assert.assertTrue(isSmartinsightcardEle,"Smart insight title  is visible");
	}
	@Then("User should see the text as {string}")
	public void user_should_see_the_text_as(String monitor) {
	boolean isMonitorglucoseEle=launchPageobj.healthmonitor_locator();
	Assert.assertTrue(isMonitorglucoseEle,"Monitor glucose levels, medication, and vital statistics, Easy logging of daily readings,Visualize trends over time,Set personalized targets");
	}
	@Then("User should see the text2 as {string}")
	public void user_should_see_the_text2_as(String balancediet) {
	   boolean isBalanceDietEle=launchPageobj.balancediet_locator();
	   System.out.println("Balance diet "  + isBalanceDietEle);
	   Assert.assertTrue(isBalanceDietEle,"Balance diet and physical activity for optimal control,Carb counting tools,Customized exercise plans,Meal suggestions based on readings");
	}
	@Then("User should see the text3 as  {string}")
	public void user_should_see_the_text3_as(String getpersonalized) {
	  boolean isGetpersonalizedEle =launchPageobj.getpersonalized_locator();
	  Assert.assertTrue(isGetpersonalizedEle,"Get personalized guidance based on your data, Pattern detection algorithms,Early warning notifications,Actionable recommendations" );
	}
	@Then("User should see heart icon")
	public void user_should_see_heart_icon() {
	   boolean isHearticinEle=launchPageobj.hearticon_visible();
	   Assert.assertTrue(isHearticinEle,"Heart icon is displayed");
	}
	@Then("User should see activity inside square icon")
	public void user_should_see_activity_inside_square_icon() {
	boolean isSquareEle =launchPageobj.squareicon_isvisible();
	Assert.assertTrue(isSquareEle,"Square icon is displayed");

	}
	@Then("User should see clock icon")
	public void user_should_see_clock_icon() {
	boolean isClockEle =launchPageobj.clockicon_isvisible();
	Assert.assertTrue(isClockEle,"Clock icon is displayed");
	}
	@Then("User should see a testimonial from user {string}")
	public void user_should_see_a_testimonial_from_user(String jamestestimonial) {
	   boolean isJamesTestimonialEle = launchPageobj.jamestestimonial_visisble();
	   Assert.assertTrue(isJamesTestimonialEle, "Testimonial from user '" + jamestestimonial + "' is not visible");
	}
	@Then("User should see a testimonial from user2 {string}")
	public void user_should_see_a_testimonial_from_user2(String mariatestimonial) {
	boolean isMariaTestimonialEle=launchPageobj.mariatestimonial_visible(mariatestimonial);
	Assert.assertTrue(isMariaTestimonialEle,"Testimonial from user '" + mariatestimonial + "' is not visible");
	}

	@Then("User should see a testimonial from user3 {string}")
	public void user_should_see_a_testimonial_from_user3(String roberttestimonial) {
	boolean isRobertTestimonialEle=launchPageobj.roberttestimonial_visible(roberttestimonial);
	Assert.assertTrue(isRobertTestimonialEle,"Testimonial from user '" + roberttestimonial + "' is not visible");	   
	}

	@Then("User should see {string} text is visible above testimonial section")
	public void user_should_see_text_is_visible_above_testimonial_section(String jointext) {
	boolean isJoinCommunityTextEle=launchPageobj.joincommunitytext_isVisibe();
	Assert.assertTrue(isJoinCommunityTextEle,"Join our community of successful members");
	}
	@Then("User should see five yellow stars above {string} text")
	public void user_should_see_five_yellow_stars_above_text(String expectedText) {
	boolean starsVisible = launchPageobj.FiveStars_Visible();
	Assert.assertTrue(starsVisible,"Expected 5 yellow stars above the text but did not find them");
	   
	}
	@Then("User should see five stars under user1 {string}")
	public void user_should_see_five_stars_under_user1(String user1) {
	 int actualStars =launchPageobj.jamesfivestars_Visible();

	 Assert.assertEquals(actualStars,5,"Assertion for displaying 5 Stars under user1 "+ user1+ " is failed");

	 //Assert.assertEquals(expectedStars, actualStars);
	}
	@Then("User should see five stars under user2 {string}")
	public void user_should_see_five_stars_under_user2(String user2) {
	int actualStars1 =launchPageobj.mariafivestars_Visible();

	 assertEquals(5, actualStars1,"Assertion for displaying 5 Stars under user2 "+ user2+ " is failed");

	// Assert.assertEquals(expectedStars, actualStars1);

	}
	@Then("User should see five stars under user3 {string}")
	public void user_should_see_stars_under_user3(String user3) {
	int actualStars1 =launchPageobj.robertfivestars_Visible();
	assertEquals(5, actualStars1,"Assertion for displaying 5 Stars under user3 "+ user3 +" is failed");

	//Assert.assertEquals(expectedStars, actualStars1);

	}
	@Then("User should see a section with heading {string}")
	public void user_should_see_a_section_with_heading(String heading) {
	boolean isHeadingEle=launchPageobj.heading_visible();
	Assert.assertTrue(isHeadingEle,"Take control of your diabetes today '" + heading + "' is not visible");
	   
	}
	@Then("User should see a button labeled {string}")
	public void user_should_see_a_button_labeled(String risk) {
	boolean isCheckyourriskEle=launchPageobj.checkyourriskbutton_visible();
	Assert.assertTrue(isCheckyourriskEle,"Check Your Risk '" + risk + "' is not visible");
	}

	}




