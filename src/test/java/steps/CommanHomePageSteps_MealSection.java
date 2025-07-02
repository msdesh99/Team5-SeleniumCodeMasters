package steps;

import java.util.Arrays;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommanHomePage;
import pages.CommanHomePage_MealSection;
import utils.SoftAssertUtils;
import utils.TestContext;

public class CommanHomePageSteps_MealSection {

	TestContext testContext;
	WebDriver driver;
	CommanHomePage_MealSection  commanHomepage_MealSection;
	SoftAssertUtils softAssertUtils;

	public CommanHomePageSteps_MealSection (TestContext testContext) {
		this.testContext = testContext;
		this.driver = this.testContext.base.getDriver();
		this.commanHomepage_MealSection = this.testContext.pageObjectManager.getCommanHomePage_MealSection();
		this.softAssertUtils = this.testContext.get("SoftAssertUtils", SoftAssertUtils.class);

	}

	@When("User clicks on the {string} section for free user")
	public void user_clicks_on_the_section_for_free_user(String string) {
		
		commanHomepage_MealSection.clickMealSection(string);
	    
	}


	@Then("Breakfast details become visible for free user")
	public void breakfast_details_become_visible_for_free_user() {
		
		boolean brkfast=commanHomepage_MealSection.isBrkfastMealDetailVisible();
		Assert.assertTrue(brkfast,"Assertion for presence of brekfast is failed");
	   
	}

	@Then("Lunch details become visible for free user")
	public void lunch_details_become_visible_for_free_user() {
		
		boolean Lunch=commanHomepage_MealSection.isLunchMealDetailVisible();
		Assert.assertTrue(Lunch,"Assertion for presence of lunch is failed");
	  
	}

	@Then("Dinner details become visible for free user")
	public void Dinner_details_become_visible_for_free_user(){
	
	boolean Dinner=commanHomepage_MealSection.isDinnerMealDetailVisible();
	Assert.assertTrue(Dinner,"Assertion for presence of Dinner is failed");
	}

	@Then("Snacks details become visible for free user")
	public void snacks_details_become_visible_for_free_user() {
		boolean Snack=commanHomepage_MealSection.isSnackMealDetailVisible();
		Assert.assertTrue(Snack,"Assertion for presence of snacks is failed");
	}


	@Then("User should see dish title for free user")
	public void user_should_see_dish_title_for_free_user() {
		boolean dishtitle=commanHomepage_MealSection.isdishtitleVisible();
		Assert.assertTrue(dishtitle,"Assertion for presence of dishtitle is failed");
	}

	@Then("User should see description for the dish	for free user")
	public void user_should_see_description_for_the_dish_for_free_user() {
		
		boolean dishdescription=commanHomepage_MealSection.isdishdescriptionVisible();
		Assert.assertTrue(dishdescription,"Assertion for presence of dishinfo is failed");
	}
	
	@Then("User should see the pre-meal item name for free user")
	public void user_should_see_the_pre_meal_item_name() {
		
		boolean premealitem=commanHomepage_MealSection.ispremealitemVisible();
		Assert.assertTrue(premealitem,"Assertion for presence of premeal is failed");
	  
	}
	
	@Then("User should see the pre-meal calorie value for free user")
	public void user_should_see_the_pre_meal_calorie_value_for_free_user() {
		
		boolean calorie=commanHomepage_MealSection.iscalorieVisible();
		Assert.assertTrue(calorie,"Assertion for presence of Calorie is failed");
	}
	
	@Then("User should see {string} based time in pre-meal for free user")
	public void user_should_see_based_time_in_pre_meal_for_free_user(String string) {
		
		boolean time=commanHomepage_MealSection.istimeVisible();
		Assert.assertTrue(time,"Assertion for presence of Time is failed");
	}

	@When("User clicks view full schedule button after reaching exercise section for free user")
	public void user_clicks_view_full_schedule_button_after_reaching_exercise_section_for_free_user() {
		
		commanHomepage_MealSection.clickViewFullPlanSection();
		
		
	}

	@Then("User should redirected to subscription page for free user")
	public void user_should_redirected_to_subscription_page_for_free_user() {
		
		boolean subscriptionpage = commanHomepage_MealSection.subscriptionpageSection();  
		Assert.assertTrue(subscriptionpage,"Assertion for presence of subscriptionpage is failed");
	}
	
	@Then("User should see green color for Carbs for free user")
	public void user_should_see_green_color_for_carbs_for_free_user() {
		
		boolean greencolor = commanHomepage_MealSection.isgreencolorVisible();  
		Assert.assertTrue(greencolor,"Assertion for presence of greencolor is failed");
	}
	
	@Then("User should see purple color for Fat for free user")
	public void user_should_see_purple_color_for_fat_for_free_user() {
		
		boolean purplecolor = commanHomepage_MealSection.ispurplecolorVisible();  
		Assert.assertTrue(purplecolor,"Assertion for presence of purple color is failed");
	}

	@Then("User should see pink color for Protein for free user")
	public void user_should_see_pink_color_for_protein_for_free_user() {
		
		boolean pinkcolor = commanHomepage_MealSection.ispinkcolorVisible();  
		Assert.assertTrue(pinkcolor,"Assertion for presence of pink color is failed");
	}
	
	@Then("It should display the unit as {string} for free user for free user")
	public void it_should_display_the_unit_as_for_free_user_for_free_user(String string) {
	   
		boolean gram = commanHomepage_MealSection.isgramVisible();  
		Assert.assertTrue(gram,"Assertion for presence of gram color is failed");
	}
	

	
}
