package steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PremiumUserLogbookPage;
import utils.LoggerLoad;
import utils.SoftAssertUtils;
import utils.TestContext;
import io.cucumber.java.en.Given;
public class PremiumUserLogbookPageSteps {
    TestContext testContext;
    PremiumUserLogbookPage premiumUserLogbookPage;
    WebDriver driver;
    SoftAssertUtils softAssertUtils;
    
	public PremiumUserLogbookPageSteps(TestContext testContext) {
		this.testContext = testContext;
		this.premiumUserLogbookPage = this.testContext.pageObjectManager.getPremiumUserLogbookPage();
		this.driver = this.testContext.base.getDriver();
		this.softAssertUtils = this.testContext.get("SoftAssertUtils",SoftAssertUtils.class);
	}
	@When("User logs in and navigates to {string} option for premium user logbook page")
	public void user_logs_in_and_navigates_to_option_for_premium_user_logbook_page(String navigationMenu) throws Exception {
		premiumUserLogbookPage.navigateToLogbookPage();
		try {
			Assert.assertTrue(driver.getCurrentUrl().contains(navigationMenu.toLowerCase()),
					"Assertion for redirecting to the premium user logbook page after navigation is failed");
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
		}
	}
	@Then("User should see {string} for premium user logbook page")
	public void user_should_see_for_premium_user_logbook_page(String section) throws Exception {
            Map<String,Object>resultMap = premiumUserLogbookPage.validateSectionPresence(section);
			softAssertUtils.assertTrue((Boolean)resultMap.get("presence"),"Assertion for presence of "+section+" section is failed");
			softAssertUtils.assertEquals(resultMap.get("title"), section,
					"Assertionf for Title validation for section "+section+" is failed");
		try {
			    softAssertUtils.assertAll();
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
		}		
	}
	@Then("User should see {string} for {string} for premium user logbook page")
	public void user_should_see_for_for_premium_user_logbook_page(String color, String tab) throws Exception {
		  boolean result = premiumUserLogbookPage.verifyColorCode(tab,color);
		  try {
			  Assert.assertTrue(result,"Assertion for validating color code for "+tab+" is failed");
		  }catch(AssertionError ae) {
			  throw new Exception(ae.getMessage());
		  }		
	}
	@Then("User should see the range for {string} be {string} for premium user logbook page")
	public void user_should_see_the_range_for_be_for_premium_user_logbook_page(String tab, String range) {
		String actual = premiumUserLogbookPage.verifyDisplayOfBloodSugarRange(tab);
			Assert.assertEquals(actual, range,
					"Assertion for display of blood sugar range" +range+" under "+tab+ " is failed");		
	}
	@Then("User should see the X-axis display the last {string} days ending today for {string} for premium user logbook page")
	public void user_should_see_the_x_axis_display_the_last_days_ending_today_for_for_premium_user_logbook_page(String days, String tab) throws Exception {
		List<Boolean> result = premiumUserLogbookPage.verifyDaysDisplaysOnXaxis(tab);
		   Boolean actualResult = result.stream().allMatch(i->i);
		softAssertUtils.assertTrue(actualResult,
				"Assertion for display days of last seven days for "+tab+" is failed");
		softAssertUtils.assertTrue(result.size()==7,
				"Assertion for number of days displays on the X axis for "+tab+" is failed");
		try {
			softAssertUtils.assertAll();
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
		}
	}
	@Then("User should see Y-axis minimum value {string} and maximum value  {string} in {string} for premium user logbook page")
	public void user_should_see_y_axis_minimum_value_and_maximum_value_in_for_premium_user_logbook_page(String min, String max, String tab) {
		List<Boolean> result = premiumUserLogbookPage.verifyDisplaysMinAndMaxOnYaxis(min,max,tab);
		   Boolean actualResult = result.stream().allMatch(i->i);
		    Assert.assertTrue(actualResult,
				"Assertion for display minimum and Maximum value on Y axis for "+tab+" is failed");
	}
	@Then("User should see Icon  on the left side of {string} title for premium user logbook page")
	public void user_should_see_icon_on_the_left_side_of_title_for_premium_user_logbook_page(String tab){
		Assert.assertTrue(premiumUserLogbookPage.verifyIcon(tab),
				"Assertion for icon display at the left side of the title "+tab+" is failed");					
	}
	@Then("User should see the section {string} for premium user logbook page")
	public void user_should_see_the_section_for_premium_user_logbook_page(String section){
		Assert.assertTrue(premiumUserLogbookPage.verifyMealsSubSections(section),
				"Assertion for displaying subsection "+section+ " in  in Meal & Nutrition section is failed");
	}
	@Then("User should see {string} text colour {string} for premium user logbook page")
	public void user_should_see_text_colour_for_premium_user_logbook_page(String tab, String color){
		   boolean result = premiumUserLogbookPage.verifyColorOfTextInNutrition(tab,color);
		Assert.assertTrue(result,"Assertion for Text colour of "+tab+" is failed");
	}
	@Then("User should see y-axis  clearly labeled with the text {string} in {string}")
	public void user_should_see_y_axis_clearly_labeled_with_the_text_in(String label, String section) {
		  Assert.assertTrue(premiumUserLogbookPage.verifyYAxisLabelForPysicalActivity(label,section),
				  "Assertion for displaying Label "+label+ " in "+ section + " section is failed");
	}
	@Then("User should see no bars in the chart when Physical Activity not logged in home page for premium user logbook page")
	public void user_should_see_no_bars_in_the_chart_when_physical_activity_not_logged_in_home_page_for_premium_user_logbook_page() {
		System.out.println(premiumUserLogbookPage.verifyChartWhenPhysicalActivityNotLogged());
		  Assert.assertFalse(premiumUserLogbookPage.verifyChartWhenPhysicalActivityNotLogged(),
				  " Assertion for no bars displayed in the chart when Physical Activity not logged in home page for premium user logbook page is failed");
	}

	@When("User clicks {string} from logbook page for premium user logbook page")
	public void user_clicks_from_logbook_page_for_premium_user_logbook_page(String string) {
		premiumUserLogbookPage.gotoHomePage();
	}

	@Then("User clicks Physical Activity from Add Data section and adds the Physical activity details for premium user logbook page")
	public void user_clicks_physical_activity_from_add_data_section_and_adds_the_physical_activity_details_for_premium_user_logbook_page() {
        premiumUserLogbookPage.addPhysicalActivityLog();
	}
	@Then("User clicks logbook page for premium user logbook page")
	public void user_clicks_logbook_page_for_premium_user_logbook_page() {
		premiumUserLogbookPage.gotoLogbookPage();
	}
	@Then("User should see bars  in the chart when Physical Activity {string} log in Physical Activity for premium user logbook page")
	public void user_should_see_bars_in_the_chart_when_physical_activity_log_in_physical_activity_for_premium_user_logbook_page(String string) {
		  Assert.assertTrue(premiumUserLogbookPage.verifyChartWhenPhysicalActivityNotLogged(),
				  " Assertion for no bars displayed in the chart when Physical Activity not logged in home page for premium user logbook page is failed");

	}

}
