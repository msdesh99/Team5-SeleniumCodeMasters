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
    public String validateSuccessMessage(String button, String tab) {
    	By tabLocator = By.xpath("//button[text()='"+tab+"']");
    	driver.findElement(tabLocator).click();
    	By locator = By.xpath("//span[contains(text(),'Mark as Completed')]");
    	WebElement markEle = driver.findElement(locator);
    	markEle.click();
    	
    	By messageLocator = By.xpath("//div[text()='Success!']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	WebElement msgEle = wait.until(
    			ExpectedConditions.visibilityOfElementLocated(messageLocator));
    	System.out.println("mark button: "+ markEle.getText());
    	 return msgEle.getText();
     }
  /*
   Scenario: Verify "View Full Schedule" button is displayed on right for premium user homePage
Then "View Full Schedule" button is displayed on the right for premium user homePage

Scenario: Verify navigation to "Today's Exercise Schedule" page for premium user home#Page
When User clicks the "View Full Schedule" button for premium user homePage
Then User is redirected to "Today's Exercise Schedule" page for premium user homePage

Scenario Outline: Verify different tabs are displayed for premium user homePage
Then "<tab>" tab is visible for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Verify Exercise name is displayed under differnt tabs for premium user homePage
Then Exercise name is displayed under "<tab>" tab for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Verify Exercise description is displayed under different tabs for premium user homePage
Then Description is shown below the Exercise name under "<tab>" for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

   Scenario Outline: Duration is displayed under different tabs for premium user homePage
Then "Duration" is displayed under "<tab>" tab for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Calories is displayed under different tabs for premium user homePage
Then "Calories" is displayed under "<tab>" tab for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Intensity is displayed under different tabs for premium user homePage
Then "Intensity" is displayed under "<tab>" tab for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Mark as Completed is displayed under different tabs for premium user homePage
Then "Mark as Completed" is displayed under "<tab>" tab for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |
     
   */
  
}
