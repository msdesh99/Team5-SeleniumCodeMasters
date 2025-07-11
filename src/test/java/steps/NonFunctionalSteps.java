package steps;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
}
	long loadTime;

	@Given("User is in browser")
	public void user_is_in_browser() {
	//driver = ChromeDriver();
	}
	
	
	@When("User enters the SweetBalance URL")
	public void user_enters_the_sweet_balance_url() {
		 long startTime = System.currentTimeMillis();
	        driver.get("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/FirstPage"); 
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
		driver.manage().window().setSize(new Dimension(375,812)); //resize the screen for window or iphone without this browser stays in desktop
		 boolean layoutIsResponds = nonfunctionalObj.allelements_visible();
		 Assert.assertTrue(layoutIsResponds,"Some elements are not visible");
		
	}

	@Then("All major sections are accessible with appropriate labels and alt texts")
	public void all_major_sections_are_accessible_with_appropriate_labels_and_alt_texts() {
		 boolean labelsPresent = nonfunctionalObj.allElements_Labeled();
	        boolean altTextsPresent = nonfunctionalObj.allTextPresent();
	        Assert.assertTrue(labelsPresent, "Some labels are missing");
	        Assert.assertTrue(altTextsPresent, "Some images are missing and alt text.");

	}
	@Then("User finds the design visually appealing and readable")
	public void user_finds_the_design_visually_appealing_and_readable() {
	   boolean designview = nonfunctionalObj.design();
	   Assert.assertTrue(designview,"The website is not visible or readable");
	}
	@Then("User can access other sections without scrolling up")
	public void user_can_access_other_sections_without_scrolling_up() {
	    boolean navi = nonfunctionalObj.accessother();
	    Assert.assertTrue(navi,"navigation bar is not scrolling");
	}

	@Then("User has a consistent experience across browsers")
	public void user_has_a_consistent_experience_across_browsers() {
		   
	}



	}
