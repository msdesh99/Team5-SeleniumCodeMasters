package steps;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PremiumUserLogbookPage;
import utils.SoftAssertUtils;
import utils.TestContext;

public class PremiumUserLogbookPageSteps {
    TestContext testContext;
    PremiumUserLogbookPage premiumUserLogbookPage;
    WebDriver driver;
   // Map<String,Object> resultMap;
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
}
