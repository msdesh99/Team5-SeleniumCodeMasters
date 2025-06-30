package steps;

import java.util.Arrays;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pages.CommanHomePage;
import utils.SoftAssertUtils;
import utils.TestContext;

public class CommanHomePageSteps {

	TestContext testContext;
	WebDriver driver;
	CommanHomePage  commanhomepage;
	SoftAssertUtils softAssertUtils;

	public CommanHomePageSteps (TestContext testContext) {
		this.testContext = testContext;
		this.driver = this.testContext.base.getDriver();
		this.commanhomepage = this.testContext.pageObjectManager.getCommanHomePage();
		this.softAssertUtils = this.testContext.get("SoftAssertUtils", SoftAssertUtils.class);

	}
	
		
	@Then("User should see SweetBalance text  on the left side of the free user page.")
	public void user_should_see_sweet_balance_text_on_the_left_side_of_the_free_user_page() throws Exception {
		
		
		
		int eleplaceleft=commanhomepage.validateAppNameOnTopLeft();
		
		try {
			Assert.assertTrue(eleplaceleft<=30,"App Name appears at the top left corner assertion is failed");
		} catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
			}
			
	}
	
	@Then("User should see name displayed at the top-right corner of the  free user home page.")
	public void user_should_see_name_displayed_at_the_top_right_corner_of_the_free_user_home_page() throws Exception {
	    
	
		try {
			int eleplaceright= commanhomepage.validateUserNameOnTopRight();
		
	
			Assert.assertTrue(eleplaceright <1000,"User name appears at the top left corner assertion is failed");
		} catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
			
	}
			
}
	
	
	@Then("User should see Logout link in the top-right corner of free user page")
	public void user_should_see_logout_link_in_the_top_right_corner_of_free_user_page() throws Exception {
	    
		try {
			int eleplacelogout= commanhomepage.validateUserNameOnTopRightLogout();
		
	
			Assert.assertTrue(eleplacelogout <1000,"Logout appears at the top left corner assertion is failed");
		} catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
			
	}
	
	}
	
	@Then("User should see the navigation bar displaying items in the order: Home,Dashboard,Education for free user")
	public void user_should_see_the_navigation_bar_displaying_items_in_the_order_home_dashboard_education_for_free_user() {
	    
		 List<String> expectedOrder = Arrays.asList("Home","Dashboard", "Education");
		 List<String> actualOrder=commanhomepage.VerifyNavBar();
		 softAssertUtils.assertEquals(expectedOrder, actualOrder, "expected order is not found");
	}
	
	
	@Then("User should see {string} section heading on the home page of free user")
	public void user_should_see_section_heading_on_the_home_page_of_free_user(String option) throws Exception {
		
		boolean CurrentStatus = commanhomepage.isCurrentVisible(option);
		try {
			Assert.assertTrue(CurrentStatus,"Assertion for presence of "+option+" is failed");
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
	}
	
	}
	
	@Then("User should see {string} label below Current Status.")
	public void user_should_see_label_below_current_status(String option) throws Exception {
		boolean Lastupadte = commanhomepage.islastUpadteVisible(option);
		try {
			Assert.assertTrue(Lastupadte,"Assertion for presence of "+option+" is failed");
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
	}	
		
	    }
	
	@Then("User should see {string} first label for free user")
	public void user_should_see_first_label_for_free_user(String string) throws Exception {
		boolean LatestHbA1C = commanhomepage.isHbA1cVisible(string);
		try {
			Assert.assertTrue(LatestHbA1C,"Assertion for presence of "+string+" is failed");
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
	}
	   
	}

	@Then("User should see {string} second label for free user")
	public void user_should_see_second_label_for_free_user(String string) throws Exception {
		
		boolean BMI = commanhomepage.isBMIVisible(string);
		try {
			Assert.assertTrue(BMI,"Assertion for presence of "+string+" is failed");
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
	}
	   
	
	}

	@Then("User should see {string} third label for free user")
	public void user_should_see_third_label_for_free_user(String string) throws Exception {
		
		boolean AverageBloodSugar = commanhomepage.isAvgBloodsugarVisible(string);
		try {
			Assert.assertTrue(AverageBloodSugar,"Assertion for presence of "+string+" is failed");
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
	}
		
	}
	
	

	@Then("User should see timestamp displayed next to the {string} label for free user")
	public void user_should_see_timestamp_displayed_next_to_the_label_for_free_user(String string) throws Exception {
		
		boolean TimeStramp = commanhomepage.isTimestampDisplayed(string);
		try {
			Assert.assertTrue(TimeStramp,"Assertion for presence of "+string+" is failed");
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
	}
		
		
	}
	}







