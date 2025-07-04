package steps;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PremiumUserLogbookPage;
import utils.LoggerLoad;
import utils.TestContext;
import java.util.Map;
import utils.SoftAssertUtils;

public class PremiumUserLogbookDailyNutritionSteps {
      TestContext testContext;
      PremiumUserLogbookPage premiumUserLogbookPage;
      Map<String,Object> actualMap;
      SoftAssertUtils softAssertUtils;
	  public PremiumUserLogbookDailyNutritionSteps(TestContext testContext) {
		    this.testContext = testContext;
		    this.premiumUserLogbookPage= this.testContext.pageObjectManager.getPremiumUserLogbookPage();
		    this.softAssertUtils = this.testContext.get("SoftAssertUtils",SoftAssertUtils.class);
	  }
      @When("User logs in and navigates to {string} option with no meal logged for premium user logbook page")
  	  public void user_logs_in_and_navigates_to_option_with_no_meal_logged_for_premium_user_logbook_page(String string) {
  		  premiumUserLogbookPage.navigateToLogbookPage();
    	  LoggerLoad.info("Premium User hasn't logged any meals from home page and now is on the logbook Page");
  	  }
	  @Then("User should see no bars in Daily Nutrition breakdown section for premium user logbook page")
	  public void user_should_see_no_bars_in_daily_nutrition_breakdown_section_for_premium_user_logbook_page(){
			Assert.assertTrue(premiumUserLogbookPage.verifyBarsWhenMealNotLogged(),
					"Assertion for no bars are displayed under Daily Nutrition breakdown when User doesn't logged meal on home page is failed");			
	  }
	  @Then("User should see no pie-chart in Daily Nutrition breakdown section for premium user logbook page")
	  public void user_should_see_no_pie_chart_in_daily_nutrition_breakdown_section_for_premium_user_logbook_page(){
		  Assert.assertTrue(premiumUserLogbookPage.verifyPieChartWhenMealsNotLogged(),
		   "Assertion for No display pie-chart when Premium User not Logged Meals in home page is failed");		  			  		  
	  }
      @Then("User should see the {string} card  displayed {string} for premium user logbook page")
      public void user_should_see_the_card_displayed_for_premium_user_logbook_page(String card, String value) {
    	  // premiumUserLogbookPage.verifyCardValuesWhenNoLoggedMeals(card);
    	  Assert.assertEquals(premiumUserLogbookPage.verifyCardValuesWhenNoLoggedMeals(card), value,
    		"Assertion for "+card+" card values displays when user hasn't logged Meals in home page is failed");	  
      }
      @Then("User should see exactly {string} statistic cards displayed horizontally for premium user logbook page")
      public void user_should_see_exactly_statistic_cards_displayed_horizontally_for_premium_user_logbook_page(String count) throws Exception {
    	  Map<String,Object> actual = premiumUserLogbookPage.verifyStatisticCardsPresenceAndAlignmentForPhysicalActivity();
          softAssertUtils.assertEquals(actual.get("Count"), Integer.parseInt(count),
        	"Assertion for count of statistic Cards displayed in Physical Activity section is failed");
          softAssertUtils.assertTrue((Boolean)actual.get("IsHorizontal"),
              	"Assertion for statistic Cards displayed horizontally in Physical Activity section is failed");
          try {
        	  softAssertUtils.assertAll();
          }catch(AssertionError ae) {
        	  throw new Exception(ae.getMessage());
          }
      }
      @Then("User should the text in {string} for {string} in Physical Activity on premium user logbook page")
      public void user_should_the_text_in_for_in_physical_activity_on_premium_user_logbook_page(String color, String card) {
    	  String actual  = premiumUserLogbookPage.verifyStatisticCardTextColorForPhysicalActivity(card);
    	  Assert.assertTrue(actual.toString().contains(color)," Assertion for color Text of "+card+" in Physical Activity for Premium User Logbook got failed");

      }
}
