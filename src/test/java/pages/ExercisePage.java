package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
public class ExercisePage {
    WebDriver driver;
    Actions action;
    JavascriptExecutor js;
    By homeLocator = By.xpath("//button[text()='Home']");
    By exerciseLocator = By.xpath("//span[text()='Exercise']");
    By viewFullScheduleLocator = By.xpath("//button[text()='View Full Schedule']");
    By warmUpLocator = By.xpath("//button[text()='Warm Up']");
    By workOutLocator = By.xpath("//button[text()='Main Workout']");
    By coolDownLocator = By.xpath("//button[text()='Cool Down']");
    
    //button[text()='Warm Up']/ancestor::div[2]/following-sibling::div//div/h3

    public ExercisePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickExerciseOption() {
				driver.findElement(exerciseLocator).click();
	}
	public int validateViewFullSchedule() {
       int y,x=0;
        WebElement viewFullScheduleEle= driver.findElement(viewFullScheduleLocator);		
		Point location = viewFullScheduleEle.getLocation();
		x = location.getX();
		y = location.getY();
		return x;
		//commonMethods.rgbToHex(viewFullScheduleEle.getCssValue("color"));
	}
    public void clickViewFullScheduleButton() {
    	driver.findElement(viewFullScheduleLocator).click();
       /* WebElement viewFullScheduleEle= driver.findElement(viewFullScheduleLocator);		
    	action = new Actions(driver);
    	action.moveToElement(viewFullScheduleEle).click().perform();
    	js = (JavascriptExecutor)driver;
    	js.executeScript("argument[0].click()", viewFullScheduleEle);*/
    }
    public boolean isTabVisible(String tab) {
    	By dynamicLocator = By.xpath("//button[text()='"+tab+"']");
    	WebElement tabEle = driver.findElement(dynamicLocator);
    	return tabEle.isDisplayed();
    }
    public int checkForExerciseName(String option) {
    	By headerLocator = By.xpath("//button[text()='"+option+"']/../../following-sibling::div//div/h3");
    	List<WebElement> headerList = driver.findElements(headerLocator);
    	return headerList.size();
    	//System.out.println("count: "+ headerList.size());   	
    }
    
}
/*
 * 



Scenario: Verify Exercise description is displayed under "Warm Up" tab for premium user homePage
Then Description is shown below the Exercise name under "Warm Up" for premium user homePage

Scenario: Verify Exercise description is displayed under "Main Workout" tab for premium user homePage
Then Description is shown below the Exercise name under "Main Workout" for premium user homePage

Scenario: Verify Exercise description is displayed under "Cool Down" tab for premium user homePage
Then Description is shown below the Exercise name under "Cool Down" for premium user homePage

 */ 
