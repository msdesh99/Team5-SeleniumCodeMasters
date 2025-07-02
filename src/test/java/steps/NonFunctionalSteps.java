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
	@Given("User is in browser")
	public void user_is_in_browser() {
	driver = Chromedriver driver.getDriver();  
	}

	@When("User enters the SweetBalance URL")
	public void user_enters_the_sweet_balance_url() {
	startTime = System.currentTimeMillis();
	        driver.get("https://www.sweetbalance.com"); // Replace with actual URL
	        endTime = System.currentTimeMillis();
	    }
	}

	@Then("Page should be fully loaded within {int} seconds")
	public void page_should_be_fully_loaded_within_seconds(Integer int1) {
	long loadTime = endTime - startTime;
	       System.out.println("Page load time: " + loadTime + " ms");
	       assertTrue("Page did not load within 3 seconds", loadTime <= 3000);
	       driver.quit();
	}
*/

	}
