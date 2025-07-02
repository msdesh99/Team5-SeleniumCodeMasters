package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ExerciseFullPage {
	   WebDriver driver;
	   By viewFullScheduleLocator = By.xpath("//button[text()='View Full Schedule']");
	   By titleLocator= By.xpath("//h1[contains(text(),'Exercise Schedule')]");

	   public ExerciseFullPage(WebDriver driver) {
    	   this.driver = driver;
       }
       
       public void verifyFullScheduleClick() {
    	   driver.findElement(viewFullScheduleLocator).click();
       }
       public boolean verifyTitle(String tab) {
    	   //By titleLocator = By.xpath("//h1[text()='"+tab+"']");
    	   return driver.findElement(titleLocator).isDisplayed();
       }
       public boolean verifyBackToHomeButton(String button) {
    	   By backToHomeLocator = By.xpath("//button[text()='"+button+"']");
    	   return driver.findElement(backToHomeLocator).isDisplayed();
       }
       public boolean verifySectionIsVisible(String tab) {
    	   By tabLocator = By.xpath("//h2[text()='"+tab+"']");
    	   return driver.findElement(tabLocator).isDisplayed();
       }
       public boolean verifyExerciseName(String tab) {
    	   By exerciseNameLocator = 
    			By.xpath("//h2[text()='"+tab+"']/..//../following-sibling::div/h3");
    	   return driver.findElement(exerciseNameLocator).isDisplayed();
       }
       public boolean verifyExerciseDesc(String tab) {
    	   By exerciseDescLocator = 
    			By.xpath("//h2[text()='"+tab+"']/..//../following-sibling::div/p");
    	     return driver.findElement(exerciseDescLocator).isDisplayed();
       }
       public boolean verifyFooterText(String option,String tab) {
    	   By footerLocator = 
    			By.xpath("//h2[text()='"+tab+"']/..//../following-sibling::div/span");
    	   List<WebElement> spanList = driver.findElements(footerLocator);
    	   boolean isFooterVerified =false;
    	      for(WebElement spanEle: spanList) {
    	    	  if(spanEle.getText().contains(option)) {
    	    		  isFooterVerified = true;
    	    		  break;
    	    	  }
    	      }
    	  return isFooterVerified;   
       }
       public int[] verifyTotalExerciseCount(String category) {
    	   int result[] = new int[2];
    	   By categoryLocator = By.xpath("//span[contains(text(),'"+category+"')]");
    	   List<WebElement> countList = driver.findElements(categoryLocator);

    	   int actual=0, expected=0;
    	   for(WebElement ele: countList) {
    		   String eleText = ele.getText().trim();
    		   if(!eleText.startsWith("Total Duration: ") && 
    				   !eleText.startsWith("Total Calories:")) {
    			   actual = actual + Integer.parseInt(ele.getText().split(" ")[1]);   		
    		   }
    		   else {
    			   expected = Integer.parseInt(ele.getText().split(" ")[2]);
    		   }
    	   }
    	   result[0] = actual;
    	   result[1]=expected;
		   return result;		   
       }
}
