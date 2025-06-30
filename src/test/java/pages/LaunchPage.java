package pages;
import java.util.Map;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LaunchPage {
	By passwordLocator = By.name("password");
	WebDriver driver;
	
	public LaunchPage(WebDriver driver) {
		this.driver = driver;		
	}
	public Map<String,Object> validateAppNameOnTopLeft() {
		int x,y=0;
		Map<String,Object> map = new HashMap<String,Object>();
		
		System.out.println("Validating App Name.....");
			WebElement appNameEle = driver.findElement(By.xpath("//div[contains(text(),'SweetBalance')]"));
		if(appNameEle.isDisplayed()) {
			map.put("ElementFound", true);
			Point location = appNameEle.getLocation();
			x = location.getX();
			y = location.getY();
			map.put("location",40);
			System.out.println("location of App Name is "+ location);			
		}
		else System.out.println("App Name is not displayed");
		return map;
	
	}
}
