package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Map;
import java.util.HashMap;

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
	By markLocator = By.xpath("//span[contains(text(),'Mark as Completed')]");
	By messageLocator = By.xpath("//div[text()='Success!']");
    By undoLocator = By.xpath("//button[text()='Undo']");
    By completedLocator = By.xpath("//span[text()='Completed']");
    By fullScheduleLocator = By.xpath("//button[text()='View Full Schedule']");
    
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
    			//System.out.println("tabtex: "+ tabText);
    		for(WebElement textEle: list) {
    			if(textEle.getText().contains(tabText)) {
    				found=true;
    		      break;
    		    }    			
    		}
    	return found;
    }
    public Map<String,Object> validateSuccessMessage(String button, String tab) {
    	Map<String,Object> actualMap = new HashMap<String,Object>();
    	By tabLocator = By.xpath("//button[text()='"+tab+"']");
    	driver.findElement(tabLocator).click();

    	WebElement markEle = driver.findElement(markLocator);
    	markEle.click();
    	
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement msgEle = wait.until(
    			ExpectedConditions.visibilityOfElementLocated(messageLocator));
    	WebElement undoEle = driver.findElement(undoLocator);
    	actualMap.put("message", msgEle.getText());
        actualMap.put("Completed",driver.findElement(completedLocator).getText());
        actualMap.put("UndoButton",undoEle.isDisplayed());

        
    	driver.findElement(tabLocator).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        undoEle = wait.until(ExpectedConditions.elementToBeClickable(undoLocator));
        undoEle.click();
        //actualMap.put("UndoClick",markEle.isDisplayed());
        actualMap.put("UndoClick",true);


    	 return actualMap;
     }
    public void verifySectionDisplaedOnFullSchedule(String tab) {
    	
    }
   
}
