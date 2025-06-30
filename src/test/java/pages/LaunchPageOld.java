package pages;
import java.util.Map;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LaunchPageOld {
	By passwordLocator = By.name("password");
	By appNameLocator = By.xpath("//div[text()='SweetBalance']");
	WebDriver driver;	
	public LaunchPageOld(WebDriver driver) {
		this.driver = driver;		
	}
	public int validateAppNameOnTopLeft() {
		int x,y=0;		
		System.out.println("Validating App Name.....");
			WebElement appNameEle = driver.findElement(appNameLocator);
		if(appNameEle.isDisplayed()) {
			Point location = appNameEle.getLocation();
			x = location.getX();
			y = location.getY();
		}
		else System.out.println("App Name is not displayed");
		return y;	
	}
}
