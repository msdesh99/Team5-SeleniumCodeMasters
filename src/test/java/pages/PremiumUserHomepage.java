package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import utils.LoggerLoad;

public class PremiumUserHomepage {

	WebDriver driver;
	Actions actions;
	By navBarItems = By.xpath("//div[@class='flex space-x-8']/button");
	By challengeYourselfButton = By.xpath("//button[contains(text(),'Challenge Yourself')]");
	By genderImage = By.xpath("//img[@alt='Female character illustration']");
	By emojiImage = By.cssSelector("span.absolute.-top-5.-right-5");
	By moodLabel = By.xpath("//div[contains(text(),'Mood')]");
	By logButton = By.xpath("//button[text()='Log']");
	By weeklyPlanButton = By.xpath("//button[text()='Weekly Plan']");
	By recordNewdata = By.xpath("//h2[text()='Record New Data']");
	By countOfButton = By.xpath("//h2[text()='Record New Data']/../div/button");
	By bloodGlucoseButton = By.xpath("//span[text()='Blood Glucose']");
	By physicalActivityButton = By.xpath("//span[text()='Physical Activity']");
	By foodInTakeButton = By.xpath("//span[text()='Food Intake']");
	By MedicationButton = By.xpath("//span[text()='Medication']");
	By bloodGlucoseIcon = By.cssSelector("div.grid button");
	By hometab = By.xpath("//button[text()='Home']");
	By mealPlanButt = By.xpath("//span[text()='Meal Plan']");
	By preMeal = By.xpath("//h3[text()='Pre-Meal']");
	By mealcontainer = By.xpath("//div[@class='space-y-4']/div/button");
	By noneDis = By.xpath("//div[text()='None']");
	By Zero = By.xpath("//span[text()='0']");
	By mainmealTitle = By.xpath("//h3[text()='Main Meal']");
	By mainMealIndicator = By.xpath("//h3[text()='Main Meal']//..//span");
	By mainmealDescription = By.xpath("//h3[text()='Main Meal']/../div/div");
	By UtensilImg = By.xpath("//span[text()='🍽️']");
	By time = By.xpath("//div[@class='flex items-center text-sm text-gray-500 mt-1 space-x-4']/span");
	By Breakfast = By.xpath("//button[text()='Breakfast']");
	By lunch = By.xpath("//button[text()='Lunch']");
	By dinner = By.xpath("//button[text()='Dinner']");
	By snack = By.xpath("//button[text()='Snacks']");
	By caloriesValue = By.xpath("//div[@class='flex items-center text-sm text-gray-500 mt-1 space-x-4']/span[last()]");
    By calorieText = By.xpath("//span[text()='calories']");
	By completed = By.xpath("//button[normalize-space(text())='✅ Completed']");
	By partiallyCompleted = By.xpath("//button[normalize-space(text())='⚠️ Partially Completed']");
	By notCompleted = By.xpath("//button[normalize-space(text())='❌ Not Completed']");
	By nutritionInsightscCard = By.xpath(
			"//div[@class='border text-card-foreground bg-white/90 backdrop-blur-lg rounded-2xl p-6 shadow-xl mt-8']");
	By nutriInsight = By.xpath(".//h3[normalize-space()='Nutrition Insights']");
	By calorieTitle = By.xpath("//h3[text()='Calories']");
	By totalMealCalorie = By.xpath("//p[@class='text-sm text-gray-500']");
	By dialogboxchallenge=By.xpath("//div[@role='dialog']");
	By chooseYourChallengeTitle=By.xpath("//h2[text()=\"Choose Your Challenge\"]");
	By selectyourbestText=By.xpath("//p[text()=\"Select a program that best fits your health goals\"]");
	By tenDayChallengebutton=By.xpath("//button[.//span[text()='10-Day Challenge']]");
	By fourWeekProgramButton=By.xpath("//button[.//span[text()='4-Week Program']]");
	By displayTendayText=By.xpath("//button[contains(., '10-Day Challenge') and contains(., 'Postprandial')]");
	By displayFourWeekText=By.xpath("//button[contains(., '4-Week Program') and contains(., 'Reduction ')]");
	
	
	public PremiumUserHomepage(WebDriver driver) {
		this.driver = driver;
		this.actions = new Actions(driver);
	}

	public List<String> VerifyNavBar() {
		List<WebElement> navigatebarItems = driver.findElements(navBarItems);
		List<String> navItems = new ArrayList<>();
		for (WebElement item : navigatebarItems) {
			navItems.add(item.getText());
		}
		return navItems;

	}

	public WebElement getChallengeButton() {
		try {
			WebElement Challengebutton = driver.findElement(challengeYourselfButton);
			return Challengebutton;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public String getChallengeButtonclass() {
		try {
			WebElement Challengebutton = driver.findElement(challengeYourselfButton);
			return Challengebutton.getAttribute("class");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public String getChallengeButtonCssValues() {
		try {
			WebElement Challengebutton = driver.findElement(challengeYourselfButton);
			return Challengebutton.getCssValue("animation-duration");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public WebElement getGenderImageDisplayed() {

		try {
			WebElement GenderImg = driver.findElement(genderImage);
			if (GenderImg.isDisplayed()) {
				String text = GenderImg.getAttribute("alt").toLowerCase();
				System.out.println(text);
				if (text.equals("male character illustration")) {
					LoggerLoad.info("Image indicates Male User");
				} else if (text.equals("female character illustration")) {
					LoggerLoad.info("Image indicates Female User");
				} else {
					LoggerLoad.info("cannot determine");
				}
				return GenderImg;
			} else {
				throw new RuntimeException("image is not present");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public WebElement getEmojiDisplayed() {
		try {
			WebElement emojiElement = driver.findElement(emojiImage);
			return emojiElement;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public WebElement getMoodLabel() {
		try {
			WebElement label = driver.findElement(moodLabel);
			return label;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public WebElement getLogButton() {
		try {
			WebElement logButt = driver.findElement(logButton);
			return logButt;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public WebElement getEmojiesAccordingly() {
		WebElement emojiesdisplayed = getEmojiDisplayed();
		String emoji = emojiesdisplayed.getText();
		LoggerLoad.info("emoji displayed-- " + emoji);
		WebElement moodLabel = getMoodLabel();
		String moodtext = moodLabel.getText();
		LoggerLoad.info("mood label-- " + moodtext);
		return emojiesdisplayed;
	}

	public WebElement weeklyPlanButton() {
		try {
			return driver.findElement(weeklyPlanButton);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public WebElement recordNewData() {
		try {
			WebElement recordNewdataText = driver.findElement(recordNewdata);
			return recordNewdataText;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public List<WebElement> countOfbuttonPresent() {
		try {
			List<WebElement> countOfButt = driver.findElements(countOfButton);
			return countOfButt;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public WebElement bloodGlucoseButton() {
		try {
			WebElement bloodGlucose = driver.findElement(bloodGlucoseButton);
			return bloodGlucose;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public WebElement physicalActivityButton() {
		try {
			WebElement physicalActivity = driver.findElement(physicalActivityButton);
			return physicalActivity;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public WebElement foodInTakeButton() {
		try {
			WebElement foodIntake = driver.findElement(foodInTakeButton);
			return foodIntake;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public WebElement medicationButton() {
		try {
			WebElement medication = driver.findElement(MedicationButton);
			return medication;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public String getButtonText(String button) {

		switch (button) {
		case "Blood Glucose":
			return bloodGlucoseButton().getText();
		case "Physical Activity":
			return physicalActivityButton().getText();
		case "Food Intake":
			return foodInTakeButton().getText();
		case "Medication":
			return medicationButton().getText();
		default:
			throw new IllegalArgumentException("button is not present " + button);
		}

	}

	public List<WebElement> getIcon() {
		try {
			List<WebElement> button = driver.findElements(bloodGlucoseIcon);
			return button;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public WebElement HomeTab() {
		try {
			WebElement homeTab = driver.findElement(hometab);
			return homeTab;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public void clickmealPlanbutton() {
		try {
			WebElement mealPlanButton = driver.findElement(mealPlanButt);
			mealPlanButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public WebElement checkPreMealDisplayed() {
		try {
			WebElement preMealDis = driver.findElement(preMeal);
			return preMealDis;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public List<WebElement> checkPreMealFirst() {
		List<WebElement> mealpart = driver.findElements(mealcontainer);
		return mealpart;

	}

	public void clickSnack() {
		try {
			WebElement snackButton = driver.findElement(snack);
			snackButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public WebElement checkNoneDisplayed() {
		WebElement noneText = driver.findElement(noneDis);
		return noneText;

	}

	public WebElement checkZeroDisplayed() {
		try {
			WebElement zeroDis = driver.findElement(Zero);
			return zeroDis;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public WebElement checkMainMealTitleDisplayed() {
		try {
			WebElement mainMealTitle = driver.findElement(mainmealTitle);
			return mainMealTitle;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public WebElement checkMainMealDescriptionDisplayed() {
		try {
			WebElement mainMealTitle = driver.findElement(mainmealTitle);
			return mainMealTitle;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public WebElement checkUtensilImgDisplayed() {
		WebElement Utensil = driver.findElement(UtensilImg);
		return Utensil;

	}

	public void clickBreakfast() {
		try {
			WebElement breakfastButton = driver.findElement(Breakfast);
			breakfastButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickLunch() {
		try {
			WebElement LunchButton = driver.findElement(lunch);
			LunchButton.click();
			;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickDinner() {
		try {
			WebElement DinnerButton = driver.findElement(dinner);
			DinnerButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public WebElement checkCalorieValue() {
		WebElement calorieValueDis = driver.findElement(caloriesValue);
		return calorieValueDis;

	}

	public WebElement checkCalorieText() {
		WebElement calorieTextDis = driver.findElement(calorieText);
		return calorieTextDis;

	}

	public WebElement checkTime() {
		WebElement timeDis = driver.findElement(time);
		return timeDis;
	}

	public List<WebElement> checkIndicator() {
		List<WebElement> indicatorDis = driver.findElements(mainMealIndicator);
		return indicatorDis;
	}

	public WebElement checkCompletedText() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(completed));

	}

	public WebElement checkPartiallyCompletedText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(partiallyCompleted));

	}

	public WebElement checkNotCompletedText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(notCompleted));

	}

	public String getButton(String button) throws InterruptedException {

		switch (button) {
		case "✅ Completed":
			return checkCompletedText().getText();
		case "⚠️ Partially Completed":
			return checkPartiallyCompletedText().getText();
		case "❌ Not Completed":
			return checkNotCompletedText().getText();
		default:
			throw new IllegalArgumentException("button is not present " + button);
		}

	}

	public void clickCompletedButton() {
		WebElement completedButton = driver.findElement(completed);
		actions.moveToElement(completedButton).click().perform();
		
	}

	public void clickPartiallyCompletedButton() {
		WebElement partiallycompletedButton = driver.findElement(partiallyCompleted);
		actions.moveToElement(partiallycompletedButton).click().perform();
		
	}

	public void clickNotCompletedButton() {
		WebElement notcompletedButton = driver.findElement(notCompleted);
		actions.moveToElement(notcompletedButton).click().perform();
	}

	public void getCompleteTaskButton(String button) throws InterruptedException {

		switch (button) {
		case "✅ Completed":
			clickCompletedButton();
			break;
		case "⚠️ Partially Completed":
			clickPartiallyCompletedButton();
			break;
		case "❌ Not Completed":
			clickNotCompletedButton();
			break;
		default:
			throw new IllegalArgumentException("button is not present " + button);
		}

	}

	public boolean nutrientInsightCardIsPresent() {
		List<WebElement> NutrientCard = driver.findElements(nutritionInsightscCard);
		for (WebElement nutri : NutrientCard) {
			List<WebElement> nutricard = nutri.findElements(nutriInsight);
			if (nutricard.isEmpty()) {
				return false;
			}
		}
		return true;
	}

	public WebElement checkNutrientInsight() {
		WebElement NutriInsight = driver.findElement(nutriInsight);
		return NutriInsight;
	}

	public WebElement checkCalorieTitle() {
		WebElement titleCalorie = driver.findElement(calorieTitle);
		return titleCalorie;
	}

	public WebElement getTotalMealcalorie() {
		WebElement totalcalorie = driver.findElement(totalMealCalorie);
		return totalcalorie;
	}
	
	public void clickChallengeYourselfButton() {
		WebElement partiallycompletedButton = driver.findElement(challengeYourselfButton);
		actions.moveToElement(partiallycompletedButton).click().perform();
		
	}
	public WebElement getdialogboxChallengeYourself() {
		WebElement dialogboxChallengeYourself = driver.findElement(dialogboxchallenge);
		return dialogboxChallengeYourself;
	}
	public WebElement getChooseYourChallenge() {
		WebElement ChooseYourChallenge = driver.findElement(chooseYourChallengeTitle);
		return ChooseYourChallenge;
	}
	public WebElement getSelectYourBestText() {
		WebElement selectYourBestText = driver.findElement(selectyourbestText);
		return selectYourBestText;
	}
	public WebElement getTenDaychallengeButton() {
		WebElement tenDayChallengebuttonDis = driver.findElement(tenDayChallengebutton);
		return tenDayChallengebuttonDis;
	}
	public WebElement getFourWeekChallengeButton() {
		WebElement fourWeekProgramButtonDis = driver.findElement(fourWeekProgramButton);
		return fourWeekProgramButtonDis;
	}
	public WebElement getFourWeekChallenge() {
		WebElement fourWeekProgramText = driver.findElement(displayFourWeekText);
		return fourWeekProgramText;
	}
	public WebElement getTenDaychallengeText() {
		WebElement tenDayChallengeText = driver.findElement(displayTendayText);
		return tenDayChallengeText;
	}
	

}
