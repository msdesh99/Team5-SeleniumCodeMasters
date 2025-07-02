package steps;
import org.openqa.selenium.WebDriver;



import configs.BrowserConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pages.Homepagenavigation;
//import pages.LaunchPage;
import pages.NonFunctionalPage;
//import pages.Nonfucntional;
import utils.SoftAssertUtils;
import utils.TestContext;
import org.testng.Assert;


public class NonFunctionalSteps {
	TestContext testContext;
	WebDriver driver;
	NonFunctionalPage nonfunctionalObj;
	SoftAssertUtils softAssertUtils;
	public NonFunctionalSteps(TestContext testContext) {
	this.testContext = testContext;
	this.driver = this.testContext.base.getDriver();
	this.nonfunctionalObj = this.testContext.pageObjectManager.getNonFunctionalPage();
	

}/*

}
	long loadTime;
	

	@Given("User is in browser")
	public void user_is_in_browser() {
	//driver = ChromeDriver();
	}

	@When("User enters the SweetBalance URL")
	public void user_enters_the_sweet_balance_url() {
		 long startTime = System.currentTimeMillis();
	        driver.get("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/FirstPage"); // Replace with actual URL
	        long endTime = System.currentTimeMillis();
	        loadTime = endTime - startTime;
	}

	@Then("Page should be fully loaded within three seconds")
	public void page_should_be_fully_loaded_within_three_seconds() {
	System.out.println("Page Load Time: " + loadTime + " ms");
    Assert.assertTrue(loadTime <= 3000, "Page did not load within 3 seconds!");
    
	}
	@Then("All elements are readable and accessible without horizontal scrolling")
	public void all_elements_are_readable_and_accessible_without_horizontal_scrolling() {
	    

	}

*/


	}
