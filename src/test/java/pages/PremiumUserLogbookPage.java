package pages;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PremiumUserLogbookPage {
    WebDriver driver;
    By navigationLocator = By.xpath("//button[text()='Logbook']");
    By sectionLocator = By.xpath("//div//h2");
    
    Map<String,Object> actualMap = new HashMap<String,Object>(); 
    
	public PremiumUserLogbookPage(WebDriver driver) {
		 this.driver = driver;
	}
	
	public void navigateToLogbookPage() {
		driver.findElement(navigationLocator).click();
	}
	
	public Map<String,Object> validateSectionPresence(String section) {
		   List<WebElement> sectionList = driver.findElements(sectionLocator);
		   for(WebElement sectionEle: sectionList) {
			   if(sectionEle.getText().contains(section)) {
				   actualMap.put("presence",true);
				   actualMap.put("title", sectionEle.getText());
				   break;
			   }
		   }
		   return actualMap;
	}
	public boolean verifyColorCode(String tab, String color) {
		By tabLocator = By.xpath("//div[text()='"+tab+"']");
		WebElement ele = driver.findElement(tabLocator);	
		return ele.getAttribute("class").contains(color);
	}
	
}
