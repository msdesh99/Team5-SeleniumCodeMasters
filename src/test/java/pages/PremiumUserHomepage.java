package pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.LoggerLoad;

public class PremiumUserHomepage {

	WebDriver driver;
	By navBarItems = By.xpath("//div[@class='flex space-x-8']/button");
	By challengeYourselfButton = By.xpath("//button[contains(text(),'Challenge Yourself')]");
	By genderImage = By.xpath("//img[@alt='Female character illustration']");
	By emojiImage= By.cssSelector("span.absolute.-top-5.-right-5");
	By moodLabel=By.xpath("//div[contains(text(),'Mood')]");
	By logButton=By.xpath("//button[text()='Log']");
	By weeklyPlanButton=By.xpath("//button[text()='Weekly Plan']");
	By recordNewdata=By.xpath("//h2[text()='Record New Data']");
	
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
		WebElement Challengebutton = driver.findElement(challengeYourselfButton);
		return Challengebutton;
	}

	public String getChallengeButtonclass() {
		WebElement Challengebutton = driver.findElement(challengeYourselfButton);
		return Challengebutton.getAttribute("class");
	}

	public String getChallengeButtonCssValues() {
		WebElement Challengebutton = driver.findElement(challengeYourselfButton);
		return Challengebutton.getCssValue("animation-duration");

	}

	public WebElement getGenderImageDisplayed() {

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

	}
	public WebElement getEmojiDisplayed() {
		WebElement emojiElement = driver.findElement(emojiImage);		
		return emojiElement;
	}
	public WebElement getMoodLabel() {
		WebElement label = driver.findElement(moodLabel);		
		return label;
	}
	public WebElement getLogButton() {
		WebElement logButt = driver.findElement(logButton);		
		return logButt;
	}
	public WebElement getEmojiesAccordingly() {
		WebElement emojiesdisplayed=getEmojiDisplayed();
		String emoji=emojiesdisplayed.getText();
		LoggerLoad.info("emoji displayed-- " + emoji);	
		WebElement moodLabel =getMoodLabel() ;
		String moodtext=moodLabel.getText();
		LoggerLoad.info("mood label-- " + moodtext);
		return emojiesdisplayed;
	}
	
	public WebElement weeklyPlanButton() {
		WebElement WeeklyplanButton = driver.findElement(weeklyPlanButton);		
		return WeeklyplanButton;
	}
	public WebElement recordNewData() {
		WebElement recordNewdataText = driver.findElement(recordNewdata);		
		return recordNewdataText;
	}


}
