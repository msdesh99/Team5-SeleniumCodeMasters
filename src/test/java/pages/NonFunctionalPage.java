package pages;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class NonFunctionalPage {

	WebDriver driver;

	public NonFunctionalPage(WebDriver driver) {
	this.driver = driver;
	}
	    
	public String getPageTitle() {
	       return driver.getTitle();
	   }

//	   public boolean isTitleContains(String keyword) {
//	       return driver.getTitle().contains(keyword);
//	   
//	}

	
	
}
