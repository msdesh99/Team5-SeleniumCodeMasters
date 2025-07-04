package pages;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NonFunctionalPage {

	WebDriver driver;

	public NonFunctionalPage(WebDriver driver) {
	this.driver = driver;
	}
//	By Loginbuttnlocator = By.xpath("//button[text()=' Login']");
//	By headinglocator = By.xpath("//section[contains(., 'Smart Diabetes Tracking Powered by AI')]");
//	By starttodaybttnlocator = By.xpath("//button[contains(@class, 'inline-flex') and contains(@class, 'rounded-md') and contains(@class, 'bg-white') and contains(@class, 'text-primary')]");
//	By healthcardlocator = By.xpath("//div[contains(., 'Health Tracking')]");
//	By nutritioncardlocator =By.xpath("//div[contains(., 'Nutrition & Exercise')]");
//	By smartinsightcardlocator =By.xpath("//div[contains(., 'Smart Insights')]");
//	By checkrisklocator =By.xpath("//button[contains(text(), 'Check Your Risk')]");
	By allelementslocators=By.xpath("//button[text()=' Login'],//section[contains(., 'Smart Diabetes Tracking Powered by AI')],//button[contains(@class, 'inline-flex') and contains(@class, 'rounded-md') and contains(@class, 'bg-white') and contains(@class, 'text-primary')],//div[contains(., 'Health Tracking')]");
	public String getPageTitle() {
	       return driver.getTitle();
	   }
	   public boolean isTitleContains(String keyword) {
	       return driver.getTitle().contains(keyword);
	}
     public boolean allelements_visible() {
    	 Dimension windowsize=driver.manage().window().getSize();
    	 int windowwidth = windowsize.getWidth();
    	 
    	 List<WebElement> allelements =driver.findElements(allelementslocators);
    	   for (WebElement allelement : allelements) {
    		   int elementRightSide=allelement.getLocation().getX()+allelement.getSize().getWidth();
    		   if  (elementRightSide > windowwidth) {
    			   System.out.println("Element exceeds location: " + allelement.getText());
    	            return false;
    		   }
    	   }
    	 return true;  
     }
     public boolean allElements_Labeled() {
         List<WebElement> allbuttons = driver.findElements(By.tagName("button"));
         List<WebElement> alllinks = driver.findElements(By.tagName("a"));

         for (WebElement button : allbuttons) {
             if (!hasbutton(button)) { 
                 System.out.println("Unable to found button");
                 return false;
             }
         }

         for (WebElement element : alllinks) {
             if (element.getText().trim().isEmpty() &&
                 (element.getAttribute("aria-label") == null || element.getAttribute("aria-label").trim().isEmpty())) {
                 System.out.println("Unlabeled link found: " + element.getAttribute("href"));
                 return false;
             }
         }

         return true;
	
}
	private boolean hasbutton(WebElement button) {
		
		return false;
	}
}
