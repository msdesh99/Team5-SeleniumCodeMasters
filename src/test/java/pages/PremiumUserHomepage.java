package pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.Assertion;

import utils.LoggerLoad;

public class PremiumUserHomepage {

	WebDriver driver;
	By navBarItems = By.xpath("//div[@class='flex space-x-8']/button");
	By challengeYourselfButton = By.xpath("//button[contains(text(),'Challenge Yourself')]");
	By genderImage = By.xpath("//img[@alt='Female character illustration']");
	By emojiImage = By.cssSelector("span.absolute.-top-5.-right-5");
	By moodLabel = By.xpath("//div[contains(text(),'Mood')]");
	By logButton = By.xpath("//button[text()='Log']");
	By weeklyPlanButton = By.xpath("//button[text()='Weekly Plan']");
	By recordNewdata = By.xpath("//h2[text()='Record New Data']");
	By countOfButton = By.xpath("//h2[text()='Record New Data']/../div/button");
	By bloodGlucoseButton=By.xpath("//span[text()='Blood Glucose']");
	By physicalActivityButton=By.xpath("//span[text()='Physical Activity']");
	By foodInTakeButton=By.xpath("//span[text()='Food Intake']");
	By MedicationButton=By.xpath("//span[text()='Medication']");
	
	

	public PremiumUserHomepage(WebDriver driver) {
		this.driver = driver;
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
			return bloodGlucoseButton().getText() ;
		case "Physical Activity":
			return physicalActivityButton().getText() ;
		case "Food Intake":
			return foodInTakeButton().getText() ;
		case "Medication":
			return medicationButton().getText() ;
		default:
            throw new IllegalArgumentException("button is not present "+button);
		}
		
	}
	

}
