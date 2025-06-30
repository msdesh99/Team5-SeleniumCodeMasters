package steps;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pages.PremiumUserHomepage;
import utils.LoggerLoad;
import utils.SoftAssertUtils;
import utils.TestContext;

public class PremiumUserHomepage_SD {

	TestContext testContext;
	WebDriver driver;
	PremiumUserHomepage premiumuserhomepage;
	SoftAssertUtils softAssertUtils;

	public PremiumUserHomepage_SD(TestContext testContext) {
		this.testContext = testContext;
		this.driver = this.testContext.base.getDriver();
		this.premiumuserhomepage = this.testContext.pageObjectManager.getPremiumUserHomepage();
		this.softAssertUtils = this.testContext.get("SoftAssertUtils", SoftAssertUtils.class);

	}
	
	@Then("User should see the navigation bar displaying items in the order: Home,Logbook,Dashboard,Education")
	public void user_should_see_the_navigation_bar_displaying_items_in_the_order_home_logbook_dashboard_education() {
		 List<String> expectedOrder = Arrays.asList("Home", "Logbook", "Dashboard", "Education");
		 List<String> actualOrder=premiumuserhomepage.VerifyNavBar();
		 softAssertUtils.assertEquals(expectedOrder, actualOrder, "expected order is not found");
		
	}
	
	@Then("User should see flashing challenge yourself button")
	public void user_should_see_flashing_challenge_yourself_button() {
		String classAttribute=premiumuserhomepage.getChallengeButtonclass();
		boolean actual=classAttribute.contains("animate-pulse");
		boolean expected=true;
		Assert.assertEquals(actual,expected);
	}

	@Then("Flashes in {int}.2s")
	public void flashes_in_2s(Integer int1) {
	    String animationDuration=premiumuserhomepage.getChallengeButtonCssValues();
	    String expected="0.2s";
	    Assert.assertEquals(animationDuration,expected);
	}

	@Then("User should see a  {string} button")
	public void user_should_see_a_button(String expectedText) {
		WebElement button = premiumuserhomepage.getChallengeButton();
		String actualText = button.getText().trim();
	    LoggerLoad.info("Actual button text: [" + actualText + "]");
	    LoggerLoad.info("Expected text: [" + expectedText + "]");
	    Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase().trim()));
	}

	@Then("User should see a gender-specific image based on the gender selected during the onboarding process")
	public void user_should_see_a_gender_specific_image_based_on_the_gender_selected_during_the_onboarding_process() {
	    WebElement genderimage=premiumuserhomepage.getGenderImageDisplayed();
	    Assert.assertTrue(genderimage.isDisplayed());
	 	
	}
	@Then("User should see an emoji displayed on the top-right corner of the gender image")
	public void user_should_see_an_emoji_displayed_on_the_top_right_corner_of_the_gender_image() {
	    WebElement emoji=premiumuserhomepage.getEmojiDisplayed();
	    Assert.assertTrue(emoji.isDisplayed());
	}

	@Then("User should see label {string} below the gender image")
	public void user_should_see_label_below_the_gender_image(String expected) {
		WebElement mood=premiumuserhomepage.getMoodLabel();
		Assert.assertTrue(mood.isDisplayed());
		String moodlabel=premiumuserhomepage.getMoodLabel().getText();
	    Assert.assertTrue(moodlabel.contains(expected));
	}

	@Then("User should see log button under gender image")
	public void user_should_see_log_button_under_gender_image() {
		WebElement logButton=premiumuserhomepage.getLogButton();
		Assert.assertTrue(logButton.isDisplayed());
		
	}

	@Then("User should see mood text based on the emoji")
	public void user_should_see_mood_text_based_on_the_emoji() {
		WebElement emojiesDisplayed=premiumuserhomepage.getEmojiesAccordingly();
		Assert.assertTrue(emojiesDisplayed.isDisplayed());
	}

	@Then("User should see Week plan button")
	public void user_should_see_week_plan_button() {
		WebElement weeklyPlanButtonDisplayed=premiumuserhomepage.weeklyPlanButton();
		Assert.assertTrue(weeklyPlanButtonDisplayed.isDisplayed());
	}

	@Then("User should see \"Record New Data\"text")
	public void user_should_see_record_new_data_text() {
		WebElement recordNewdataTxt=premiumuserhomepage.recordNewData();
		Assert.assertTrue(recordNewdataTxt.isDisplayed());
	}



	
}
