package pages;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

	By allelementslocators=By.xpath("//section | //header | //footer | //nav | //main");
	By bodylocator = By.tagName("body");
	By navigationlocator=By.tagName("header");
	By headerlocator =By.tagName("header");
	By headertextlocator =By.tagName("h1");
	
	public String getPageTitle() {
	       return driver.getTitle();
	   }
	   public boolean isTitle_Contains(String keyword) {
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

         for (WebElement link : alllinks) {
             if (!hasLabel(link)) {
                 System.out.println("Unlabeled link found: " + link.getAttribute("href"));
                 return false;
             }
         }
         return true;
}
	private boolean hasbutton(WebElement button) {
		 String text = button.getText().trim();
		    String ariaLabel = button.getAttribute("aria-label");
		return false;
	}
	private boolean hasLabel(WebElement element) {
	    String text = element.getText().trim();
	    String ariaLabel = element.getAttribute("aria-label");

	    return !text.isEmpty() || (ariaLabel != null && !ariaLabel.trim().isEmpty());
}
	public boolean allTextPresent() {
	    List<WebElement> images = driver.findElements(By.tagName("img"));

	    for (WebElement image : images) {
	        String allText = image.getAttribute("alt");

	        if (allText == null || allText.trim().isEmpty()) {
	            System.out.println("Images are  missing and all text: " + image.getAttribute("src"));
	            return false;
	        }
	    }
	
	    return true;
	}
	    public boolean fontis_Readable() {
	    	
	     WebElement body=driver.findElement(bodylocator);
	    	String fontsize = body.getCssValue("font-size");
	    	String color =body.getCssValue("color");
	    	String backgroundColor = body.getCssValue("backgroung color");
	    	int fontsizereadable=Integer.parseInt(fontsize.replace("px",""));
	    	return true;
	    			//fontsize  !color.equals(backgroundColor);
	    }
	
	public boolean design() {
		return fontis_Readable();
	}
	public boolean accessother() {
		WebElement navigatonbar = driver.findElement(navigationlocator);
		Actions actions = new Actions(driver); // scrolling the page like mouse action
		actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		return navigatonbar.isDisplayed();
	}
	public boolean isHeader_Visible() {
       WebElement headerEle =driver.findElement(headerlocator);
        return headerEle.isDisplayed();
    }

    public String getMain_HeadingText() {
    	WebElement mainheadertextEle = driver.findElement(headertextlocator);
    	
        return mainheadertextEle.getText();
    }
	
}
