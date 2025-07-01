package pages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CommanHomePage {


	private WebDriver driver;
	
	private By appName= By.xpath("//span[normalize-space(text())='SweetBalance']");
	
	private By userName = By.xpath("//span[normalize-space(text())='virginia']");
	
	private By logout = By.xpath("//button[normalize-space()='Logout']");
	
	private By navBarList = By.xpath("//nav//button[text()='Home' or text()='Dashboard' or text()='Education']");
	
	private By CurrentStatusLocator =By.xpath("//h3[text()='Current Status']");
	
	private By LastUpdateLocator =By.xpath("//div[text()='Last updated:']");
	
	private By LatestHbA1C =By.xpath("//div[text()='Latest HbA1C']");
	
	private By BMI =By.xpath("//div[text()='BMI']");
	
	private By AvgBloodSugar =By.xpath("//div[text()='Average Blood Sugar']");
	
	private By timestampText = By.xpath("//div[text()='Last updated:']");
	
	private By hba1cValue= By.xpath("//div[.//text()[normalize-space()='Latest HbA1C']]//span[contains(@class, 'text-3xl')]");
	
	private By BMIValue= By.xpath("//div[.//text()[normalize-space()='BMI']]//span[contains(@class, 'text-3xl')]");
	
	private By AvgBloodSuagrValue= By.xpath("//div[.//text()[normalize-space()='Average Blood Sugar']]//span[contains(@class, 'text-3xl')]");
	
	
	
	public CommanHomePage(WebDriver driver) {
		this.driver = driver;		
	}
	

	public int validateAppNameOnTopLeft() 
	{
		int x,y=0;
		
		
		System.out.println("Validating App Name.....");
		
		WebElement appNameElement = driver.findElement(appName);
		
		if(appNameElement.isDisplayed()) {
			
			Point location = appNameElement.getLocation();
			x = location.getX();
			y = location.getY();
			
			System.out.println("location of App Name is "+ location);			
		}
		else System.out.println("App Name is not displayed");
		return y ;
	}


	public int validateUserNameOnTopRight() 
	{
		int x,y=0;
		
		System.out.println("Validating User Name.....");
		
		
		WebElement userNameElement = driver.findElement(userName);
		if(userNameElement.isDisplayed()) {
			
			Point location = userNameElement.getLocation();
			x = location.getX();
			y = location.getY();
			
			System.out.println("location of User Name is "+ location);			
		}
		else System.out.println("App User is not displayed");
		return y;
	}
	
	public int validateUserNameOnTopRightLogout() 
	{
		int x,y=0;
		
		System.out.println("Validating Logout.....");
		
		
		WebElement logoutElement = driver.findElement(logout);
		if(logoutElement.isDisplayed()) {
			
			Point location = logoutElement.getLocation();
			x = location.getX();
			y = location.getY();
			
			System.out.println("location of Logout is "+ location);			
		}
		else System.out.println("Logout is not displayed");
		return y;
	}



	public List<String> VerifyNavBar() {
		
	List<WebElement> navigatebarList = driver.findElements(navBarList);
	List<String> navBarList = new ArrayList<>();
	for (WebElement item : navigatebarList) {
		navBarList.add(item.getText());
	}
	return navBarList;
	}
	
	
	public boolean isCurrentVisible(String tab) {
    	
    	WebElement Status = driver.findElement(CurrentStatusLocator);
    	return Status.isDisplayed();
    }


	public boolean islastUpadteVisible(String option) {
		
		WebElement Status = driver.findElement(LastUpdateLocator);
    	return Status.isDisplayed();
		
	}


	public boolean isHbA1cVisible(String string) {
		
		WebElement Status = driver.findElement(LatestHbA1C);
    	return Status.isDisplayed();
	}


	public boolean isBMIVisible(String string) {

		WebElement Status = driver.findElement(BMI);
    	return Status.isDisplayed();
	}


	public boolean isAvgBloodsugarVisible(String string) {
		
		WebElement Status = driver.findElement(AvgBloodSugar);
    	return Status.isDisplayed();
	}
	
	
	 public boolean isTimestampDisplayed(String string) {
	        WebElement timestamp = driver.findElement(timestampText);
	        return timestamp.isDisplayed();
	
	}

	 public boolean isHbA1CValueDisplayed() {
	        WebElement element = driver.findElement(hba1cValue);
	        return element.isDisplayed();
	    }

	    public String getHbA1CValue() {
	        return driver.findElement(hba1cValue).getText();
	}


		public boolean isBMIValueDisplayed() {
			 WebElement element = driver.findElement(BMIValue);
		        return element.isDisplayed();
		    }
		
		public String getBMIValue() {
	        return driver.findElement(BMIValue).getText();
	}

		   
		public boolean isAvgBloodSuagrValueDisplayed() {
			 WebElement element = driver.findElement(AvgBloodSuagrValue);
		        return element.isDisplayed();
		    }

		   
			public String getAvgBloodSuagrValue() {
				return driver.findElement(AvgBloodSuagrValue).getText();
			}
	 
	 
}





