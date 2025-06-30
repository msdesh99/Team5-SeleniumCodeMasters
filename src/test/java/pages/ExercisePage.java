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
    By exerciseSpanLocator = By.xpath("//div[@class='space-y-4']//div");
    
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
    }
    public int checkForExerciseDescription(String option) {
    	By pTagLocator = By.xpath("//button[text()='"+option+"']/../../following-sibling::div//div//p");
    	List<WebElement> pTagList = driver.findElements(pTagLocator);
    	return pTagList.size();
    }
    public boolean checkForDuration(String tab, String tabText) {
    			By spanLocator = By.xpath(    			
    					"//div[@class='space-y-4']//div//button[text()='"+tab+"']/ancestor::div[3]//span");
    			List<WebElement> list = driver.findElements(spanLocator);
    			boolean found=false;
    			System.out.println("tabtex: "+ tabText);
    		for(WebElement textEle: list) {
    			if(textEle.getText().contains(tabText)) {
    				found=true;
    		      break;
    		    }    			
    		}
    	return found;
    }
  
  
}
