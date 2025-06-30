package seqsteps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ExercisePage;

public class PremiumSteps {

	WebDriver driver;
	ExercisePage exercisePage;
    public PremiumSteps(WebDriver driver) {
    	this.driver = driver;
    }
	
	@When("User logs in and clicks {string} option from the side panel for premium user homePage")
	public void user_logs_in_and_clicks_option_from_the_side_panel_for_premium_user_home_page(String option){
		exercisePage.clickExerciseOption();	
	}
	@Then("{string} button is displayed on the right for premium user homePage")
	public void button_is_displayed_on_the_right_for_premium_user_home_page(String option) throws Exception{
		int location = exercisePage.validateViewFullSchedule();
		try {
			Assert.assertTrue(location>=400, "Assertion for View Full Schedule displayed at the right is failed");
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
		}
	}
	@When("User clicks the {string} button for premium user homePage")
	public void user_clicks_the_button_for_premium_user_home_page(String string){
		exercisePage.clickViewFullScheduleButton();		
	}
	@Then("User is redirected to {string} page for premium user homePage")
	public void user_is_redirected_to_page_for_premium_user_home_page(String string) throws Exception{
		try {
			Assert.assertTrue(driver.getCurrentUrl().contains("exercise-schedule"),
				"Assertion for Redirecting to the exercise Schedule Page is failed");
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());	
		}			
	}
}
