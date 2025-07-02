package steps;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PremiumUserHomepage;
import utils.LoggerLoad;
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
		List<String> actualOrder = premiumuserhomepage.VerifyNavBar();
		softAssertUtils.assertEquals(expectedOrder, actualOrder, "expected order is not found");

	}

	@Then("User should see flashing challenge yourself button")
	public void user_should_see_flashing_challenge_yourself_button() {
		String classAttribute = premiumuserhomepage.getChallengeButtonclass();
		boolean actual = classAttribute.contains("animate-pulse");
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	}

	@Then("Flashes in {int}.2s")
	public void flashes_in_2s(Integer int1) {
		String animationDuration = premiumuserhomepage.getChallengeButtonCssValues();
		String expected = "0.2s";
		Assert.assertEquals(animationDuration, expected);
	}

	@Then("User should see a  {string} button")
	public void user_should_see_a_button(String expectedText) {
		WebElement button = premiumuserhomepage.getChallengeButton();
		String actualText = button.getText().trim();
		LoggerLoad.info("Actual button text: [" + actualText + "]");
		LoggerLoad.info("Expected text: [" + expectedText + "]");
		Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase().trim()));
	}

	@Then("User should see a gender-specific image based on the gender selected during the onboarding process")
	public void user_should_see_a_gender_specific_image_based_on_the_gender_selected_during_the_onboarding_process() {
		WebElement genderimage = premiumuserhomepage.getGenderImageDisplayed();
		Assert.assertTrue(genderimage.isDisplayed());

	}

	@Then("User should see an emoji displayed on the top-right corner of the gender image")
	public void user_should_see_an_emoji_displayed_on_the_top_right_corner_of_the_gender_image() {
		WebElement emoji = premiumuserhomepage.getEmojiDisplayed();
		Assert.assertTrue(emoji.isDisplayed());
	}

	@Then("User should see label {string} below the gender image")
	public void user_should_see_label_below_the_gender_image(String expected) {
		WebElement mood = premiumuserhomepage.getMoodLabel();
		Assert.assertTrue(mood.isDisplayed());
		String moodlabel = premiumuserhomepage.getMoodLabel().getText();
		Assert.assertTrue(moodlabel.contains(expected));
	}

	@Then("User should see log button under gender image")
	public void user_should_see_log_button_under_gender_image() {
		WebElement logButton = premiumuserhomepage.getLogButton();
		Assert.assertTrue(logButton.isDisplayed());

	}

	@Then("User should see mood text based on the emoji")
	public void user_should_see_mood_text_based_on_the_emoji() {
		WebElement emojiesDisplayed = premiumuserhomepage.getEmojiesAccordingly();
		Assert.assertTrue(emojiesDisplayed.isDisplayed());
	}

	@Then("User should see Week plan button")
	public void user_should_see_week_plan_button() {
		WebElement weeklyPlanButtonDisplayed = premiumuserhomepage.weeklyPlanButton();
		Assert.assertTrue(weeklyPlanButtonDisplayed.isDisplayed());
	}

	@Then("User should see \"Record New Data\"text")
	public void user_should_see_record_new_data_text() {
		WebElement recordNewdataTxt = premiumuserhomepage.recordNewData();
		Assert.assertTrue(recordNewdataTxt.isDisplayed());
	}

	@Then("User should see {int} button options")
	public void user_should_see_button_options(Integer expectedCount) {
		List<WebElement> options = premiumuserhomepage.countOfbuttonPresent();
		int actualCount = options.size();
		System.out.println("Found buttons:");
		for (WebElement btn : options) {
			LoggerLoad.info(btn.getText());
		}
		Assert.assertEquals(actualCount, expectedCount);

	}

	@Then("User should see {string}")
	public void user_should_see(String expected) {
		String actualbuttonName = premiumuserhomepage.getButtonText(expected);
		Assert.assertEquals(actualbuttonName, expected);

	}

	@Then("Activity icon should be present in blood glucose")
	public void activity_icon_should_be_present_in_blood_glucose() {
		List<WebElement> bloodGlucoseIcon = premiumuserhomepage.getIcon();

		for (WebElement btn : bloodGlucoseIcon) {
			if (btn.getText().contains("Blood Glucose")) {
				WebElement icon = btn.findElement(By.tagName("svg"));
				Assert.assertTrue(icon.isDisplayed());
				break;
			}
		}
	}

	@Then("Running icon should be present in Physical activity")
	public void running_icon_should_be_present_in_physical_activity() {
		List<WebElement> bloodGlucoseIcon = premiumuserhomepage.getIcon();

		for (WebElement btn : bloodGlucoseIcon) {
			if (btn.getText().contains("Physical Activity")) {
				WebElement icon = btn.findElement(By.tagName("svg"));
				Assert.assertTrue(icon.isDisplayed());
				break;
			}
		}
	}

	@Then("Pizza icon should be present in food intake")
	public void pizza_icon_should_be_present_in_food_intake() {

		List<WebElement> bloodGlucoseIcon = premiumuserhomepage.getIcon();

		for (WebElement btn : bloodGlucoseIcon) {
			if (btn.getText().contains("Food Intake")) {
				WebElement icon = btn.findElement(By.tagName("svg"));
				Assert.assertTrue(icon.isDisplayed());
				break;
			}
		}
	}

	@Then("Pill icon should be present in medication")
	public void pill_icon_should_be_present_in_medication() {
		List<WebElement> bloodGlucoseIcon = premiumuserhomepage.getIcon();

		for (WebElement btn : bloodGlucoseIcon) {
			if (btn.getText().contains("Medication")) {
				WebElement icon = btn.findElement(By.tagName("svg"));
				Assert.assertTrue(icon.isDisplayed());
				break;
			}
		}
	}

	@Given("User is in home page")
	public void user_is_in_home_page() {
		WebElement homeTabDis = premiumuserhomepage.HomeTab();
		Assert.assertTrue(homeTabDis.isDisplayed());
	}

	@When("User clicks meal section")
	public void user_clicks_meal_section() {
		premiumuserhomepage.clickmealPlanbutton();
	}

	@Then("User should see {string} title")
	public void user_should_see_title(String expectedText) {
		WebElement preMealDis = premiumuserhomepage.checkPreMealDisplayed();
		String actualtext = preMealDis.getText().replace("⏰", "").trim();
		Assert.assertEquals(actualtext, expectedText);

	}

	@Then("User should see alarm clock icon")
	public void user_should_see_alarm_clock_icon() {
		WebElement preMealDis = premiumuserhomepage.checkPreMealDisplayed();
		Assert.assertTrue(preMealDis.isDisplayed());
	}

	@Then("User should see pre-meal in first place of  each meal section")
	public void user_should_see_pre_meal_in_first_place_of_each_meal_section() {
		WebElement preMealDis = premiumuserhomepage.checkPreMealDisplayed();
		Assert.assertTrue(preMealDis.isDisplayed());
	}

	@When("User clicks snack section")
	public void user_clicks_snack_section() throws InterruptedException {
		premiumuserhomepage.clickSnack();

	}

	@Then("User should see Pre-Meal entry displays as {string} by default")
	public void user_should_see_pre_meal_entry_displays_as_by_default(String expectedText) throws InterruptedException {
		Thread.sleep(2000);
		WebElement noneDis = premiumuserhomepage.checkNoneDisplayed();
		String actualtext = noneDis.getText();
		Assert.assertEquals(actualtext, expectedText);
	}

	@Then("User should see {int} calorie in pre-meal snack")
	public void user_should_see_calorie_in_pre_meal_snack(Integer expected) {
		WebElement ZeroDis = premiumuserhomepage.checkZeroDisplayed();
		String text = ZeroDis.getText();
		String[] part = text.split("");
		String number = part[0];
		System.out.println(number);
		int actual = Integer.parseInt(number);
		Assert.assertEquals(actual, expected);

	}

	@Then("User should see meal title for main-meal in snack")
	public void user_should_see_meal_title_for_main_meal_in_snack() {
		WebElement mealTitle = premiumuserhomepage.checkMainMealTitleDisplayed();
		Assert.assertTrue(mealTitle.isDisplayed());
	}

	@Then("User should see description for the dish in snack")
	public void user_should_see_description_for_the_dish_in_snack() {
		WebElement dishDesc = premiumuserhomepage.checkMainMealDescriptionDisplayed();
		Assert.assertTrue(dishDesc.isDisplayed());
	}

	@Then("User should see {string} as sub title")
	public void user_should_see_as_sub_title(String string) {
		WebElement mainMeal = premiumuserhomepage.checkMainMealTitleDisplayed();
		Assert.assertTrue(mainMeal.isDisplayed());
	}

	@Then("User should see utensil icon for each main-meal")
	public void user_should_see_utensil_icon_for_each_main_meal() {
		WebElement utensilIcon = premiumuserhomepage.checkUtensilImgDisplayed();
		Assert.assertTrue(utensilIcon.isDisplayed());
	}

	@Then("User should see  {string} based time in main-meal \\(eg : {int}:{int})")
	public void user_should_see_based_time_in_main_meal_eg(String format, Integer hour, Integer minute) {
		WebElement mainMealTime = premiumuserhomepage.checkTime();
		String timeText = mainMealTime.getText().trim();
		String[] part = timeText.split("[:\\s]");
		int actualHour = Integer.parseInt(part[0]);
		int actualMinute = Integer.parseInt(part[1]);
		System.out.println(actualHour);
		System.out.println(actualMinute);
		Assert.assertTrue(mainMealTime.isDisplayed());

	}

	@When("User clicks breakfast section")
	public void user_clicks_breakfast_section() {
		premiumuserhomepage.clickBreakfast();

	}

	@Then("User should see indicator {string} for breakfast main-meal")
	public void user_should_see_indicator_for_breakfast_main_meal(String expected) {

		WebElement mainMealTime = premiumuserhomepage.checkTime();
		String timeText = mainMealTime.getText().trim();
		String[] part = timeText.split("[:\\s]");
		String actual = part[2];
		System.out.println(actual);
		Assert.assertEquals(actual, expected);

	}

	@When("User clicks lunch section")
	public void user_clicks_lunch_section() {
		premiumuserhomepage.clickLunch();
	}

	@Then("User should see indicator {string} for lunch  main-meal")
	public void user_should_see_indicator_for_lunch_main_meal(String expected) {
		WebElement mainMealTime = premiumuserhomepage.checkTime();
		String timeText = mainMealTime.getText().trim();
		String[] part = timeText.split("[:\\s]");
		String actual = part[2];
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}

	@When("User clicks dinner section")
	public void user_clicks_dinner_section() {
		premiumuserhomepage.clickDinner();
	}

	@Then("UUser should see indicator {string} for dinner  main-meal")
	public void u_user_should_see_indicator_for_dinner_main_meal(String expected) {

		WebElement mainMealTime = premiumuserhomepage.checkTime();
		String timeText = mainMealTime.getText().trim();
		boolean formatmatch = timeText.matches("\\d{1,2}:\\d{2}\\s?(AM|PM)");
		Assert.assertTrue(formatmatch);
		String[] part = timeText.split("[:\\s]");
		String actual = part[2];
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}

	@Then("User should see indicator {string} for snack  main-meal")
	public void user_should_see_indicator_for_snack_main_meal(String expected) {
		WebElement mainMealTime = premiumuserhomepage.checkTime();
		String timeText = mainMealTime.getText().trim();
		boolean formatmatch = timeText.matches("\\d{1,2}:\\d{2}\\s?(AM|PM)");
		Assert.assertTrue(formatmatch);
		String[] part = timeText.split("[:\\s]");
		String actual = part[2];
		System.out.println(actual);
		Assert.assertEquals(actual, expected);

	}

	@Then("User should see {int}:{int} o'clock")
	public void user_should_see_o_clock(Integer hour, Integer minutes) {
		

	}

	@Then("User should see the main-meal calorie value")
	public void user_should_see_the_main_meal_calorie_value() {
		WebElement calorieValue = premiumuserhomepage.checkCalorieValue();
		Assert.assertTrue(calorieValue.isDisplayed());

	}

	@Then("User should see text {string} after the calorie value in main meal")
	public void user_should_see_text_after_the_calorie_value_in_main_meal(String expected) {
		WebElement calorieValue = premiumuserhomepage.checkCalorieText();
		String calorieText = calorieValue.getText().trim();
		System.out.println(calorieText);
		String[] part = calorieText.split(" ");
		String actual = part[1];
		Assert.assertEquals(actual, expected);
	}
	

}
