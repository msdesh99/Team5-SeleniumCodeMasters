package steps;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.PremiumUserHomepage;
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
		 softAssertUtils.assertEquals(expectedOrder, actualOrder, "Expected Order is not found");
		
	}
	
}
