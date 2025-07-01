package steps;
import utils.TestContext;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pages.ExerciseFullPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PremiumUserExerciseFullPageSteps {
       TestContext testContext;
       ExerciseFullPage exerciseFullPage;
       WebDriver driver;
        public PremiumUserExerciseFullPageSteps(TestContext testContext) {
        	this.testContext = testContext;
        	this.exerciseFullPage = this.testContext.pageObjectManager.getExerciseFullPage();
        	this.driver = this.testContext.base.getDriver();
        }
        @When("User is on Exercise and clicks {string} option for premium user exercise fullPage")
        public void user_is_on_exercise_and_clicks_option_for_premium_user_exercise_full_page(String string) throws Exception{
        	exerciseFullPage.verifyFullScheduleClick();
        	try {
        		Assert.assertTrue(driver.getCurrentUrl().contains("exercise-schedule"), 
        		"Assertion for redirecting to the exercise schedule is failed");
        	}catch(AssertionError ae) {
        		throw new Exception(ae.getMessage());
        	}	
        }
        @Then("User should see title {string} for premium user exercise fullPage")
        public void user_should_see_title_for_premium_user_exercise_full_page(String title) throws Exception{
        	boolean isTitleDisplayed = exerciseFullPage.verifyTitle(title);
            try {	
            	Assert.assertTrue(isTitleDisplayed,"Assertion for title display on full exercise schedule is failed");
            }catch(AssertionError ae) {
        		throw new Exception(ae.getMessage());
        	}
        }
        @Then("User should see {string} button on the page for premium user exercise fullPage")
        public void user_should_see_button_on_the_page_for_premium_user_exercise_full_page(String button) throws Exception {
          try {
        	Assert.assertTrue(exerciseFullPage.verifyBackToHomeButton(button),
        		 "Assertion for Title Display for Premium user Exercise Full Schedule is failed");
          }catch(AssertionError ae) {
      		throw new Exception(ae.getMessage());
      	}
        }
        @Then("{string} section should be visible for premium user exercise fullPage")
        public void section_should_be_visible_for_premium_user_exercise_full_page(String tab) throws Exception {
        	try {
        		Assert.assertTrue(exerciseFullPage.verifySectionIsVisible(tab),
        			"Assertion for "+tab+" visible is failed");
        	}catch(AssertionError ae) {
        		throw new Exception(ae.getMessage());
        	}
        }
        @Then("Exercise name is displayed under {string} tab for premium user exercise fullPage")
        public void exercise_name_is_displayed_under_tab_for_premium_user_exercise_full_page(String tab) throws Exception{
        	try {
        		Assert.assertTrue(exerciseFullPage.verifyExerciseName(tab),
        		"Assertion for Exercise Name displayed under "+tab+" is failed");
        	}catch(AssertionError ae) {
        		throw new Exception(ae.getMessage());
        	}	
        }
        @Then("Description is shown below the Exercise name under {string} for premium user exercise fullPage")
        public void description_is_shown_below_the_exercise_name_under_for_premium_user_exercise_full_page(String tab) throws Exception{
        	try {
        		Assert.assertTrue(exerciseFullPage.verifyExerciseDesc(tab),
        		"Assertion for Exercise Description displayed under "+tab+" is failed");
        	}catch(AssertionError ae) {
        		throw new Exception(ae.getMessage());
        	}	
        }
        @Then("{string} is displayed under {string} tab for premium user exercise fullPage")
        public void is_displayed_under_tab_for_premium_user_exercise_full_page(String option, String tab) throws Exception{
        	 Boolean result = exerciseFullPage.verifyFooterText(option,tab);
        	 try {
        		 Assert.assertTrue(result,"Assertion for "+option+" for "+tab+" is failed");
        	 }catch(AssertionError ae) {
        		 throw new Exception(ae.getMessage());
        	 }	 
        }
        @Then("total {string} should equal the sum of all individual calories for premium user exercise fullPage")
        public void total_should_equal_the_sum_of_all_individual_calories_for_premium_user_exercise_full_page(String category) throws Exception{
        	int[] value = exerciseFullPage.verifyTotalExerciseCount(category);
        	try {
        		Assert.assertEquals(value[0],value[1],
        			"Assertion for sum of "+category+" with total "+category+" is failed");
        	}catch(AssertionError ae) {
        		throw new Exception(ae.getMessage());
        	}	

        }
 
}
