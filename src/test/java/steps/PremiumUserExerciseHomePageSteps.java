package steps;
import utils.TestContext;
import pages.ExercisePage;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.testng.Assert.assertThrows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;

public class PremiumUserExerciseHomePageSteps {
	WebDriver driver;
	private final TestContext testContext;
	ExercisePage exercisePage;
	
	public PremiumUserExerciseHomePageSteps(TestContext testContext) {
		 this.testContext = testContext;		 
		 this.driver = this.testContext.base.getDriver();
		 this.exercisePage = this.testContext.pageObjectManager.getExercisePage();
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
	@Then("{string} tab is visible for premium user homePage")
	public void tab_is_visible_for_premium_user_home_page(String option) throws Exception {
		boolean tabVisible = exercisePage.isTabVisible(option);
		try {
			Assert.assertTrue(tabVisible,"Assertion for presence of "+option+" is failed");
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
		}	
	}
	@Then("Exercise name is displayed under {string} tab for premium user homePage")
	public void exercise_name_is_displayed_under_tab_for_premium_user_home_page(String tab) throws Exception {
		int count = exercisePage.checkForExerciseName(tab);
		try {
			Assert.assertTrue(count>0,"Assertion for ExerciseName displayed under "+tab+" is failed");		
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
		}
	}
	@Then("Description is shown below the Exercise name under {string} for premium user homePage")
	public void description_is_shown_below_the_exercise_name_under_for_premium_user_home_page(String tab) throws Exception {
		int count = exercisePage.checkForExerciseDescription(tab);
		try {
			Assert.assertTrue(count>0,"Assertion for Exercise Description displyed under "+tab+" is failed");	
		}catch(AssertionError ae) {
			throw new Exception(ae.getMessage());
		}	
	}
    @Then("{string} is displayed under {string} tab for premium user homePage")
    public void is_displayed_under_tab_for_premium_user_home_page(String tabText, String tab) throws Exception {
    	try {
    		Assert.assertTrue(exercisePage.checkForDuration(tab,tabText),
    			"Assertion for Duration under tab "+ tab+" is failed");
    	}catch(AssertionError ae) {
    		throw new Exception (ae.getMessage());
    	}
    }
    @When("User clicks the {string} button for {string} for premium user homePage")
    public void user_clicks_the_button_for_for_premium_user_home_page(String button, String tab){
    	String message = exercisePage.validateSuccessMessage(button,tab);
    	Assert.assertEquals(message,"Success!",
    		"Assertion for Success message after clicking Mark as Completed for tab "+tab+" is failed");
    }
    @Then("Success dialog is shown for premium user homePage")
    public void success_dialog_is_shown_for_premium_user_home_page() {
    	
    }
}
