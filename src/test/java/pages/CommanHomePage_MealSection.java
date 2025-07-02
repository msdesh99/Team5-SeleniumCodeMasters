package pages;
import java.time.Duration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommanHomePage_MealSection {

	
	private WebDriver driver;

	public CommanHomePage_MealSection(WebDriver driver) {
		this.driver = driver;		
	}
	
	private By MealSection=By.xpath("//div[@class='flex rounded-full bg-gray-100/60 p-1 mb-6']");
	private By MealSectionB= By.xpath("//button[normalize-space(text())='Breakfast']");
	private By MealSectionL= By.xpath("//button[normalize-space(text())='Lunch']");
	private By MealSectionD= By.xpath("//button[normalize-space(text())='Dinner']");
	private By MealSectionS= By.xpath("//button[normalize-space(text())='Snacks']");
	private By DishTitle = By.xpath("//h3[contains(@class,'text-lg font-semibold')]");
	private By DishInfo =By.xpath("//h3[contains(@class,'text-lg font-semibold')]");
	private By Premeal=By.xpath("//h4[contains(@class,'text-gray-900 font-medium')]");
	private By Calorie =By.xpath("//div[@class='flex items-center text-gray-600 text-sm mt-1']/span[3]");
	private By Time = By.xpath("//div[@class='flex items-center text-gray-600 text-sm mt-1']/span[1]");
	private By ViewFullPlan =By.xpath("//button[contains(text(), 'View Full Plan')]");
	private By HeadingofPage=By.xpath("//h1[text()='Free vs. Premium Account Features']");
	private By Greencolor=By.xpath("//div[contains(@class, 'bg-green-500')]");
	private By Purplecolor=By.xpath("//div[contains(@class, 'bg-purple-500')]");
	private By PinkColor=By.xpath("//div[contains(@class, 'bg-pink-500')]");
	private By gram= By.xpath("//div[@class='text-xs text-gray-600 mt-1']");
	
	
	
	
	
	public void clickMealSection(String mealName) {
	        
	        WebElement mealSection = driver.findElement(MealSection);
	        mealSection.click();
	    }



	public boolean isBrkfastMealDetailVisible() {
		WebElement Status = driver.findElement(MealSectionB);
    	return Status.isDisplayed();
	}


	public boolean isLunchMealDetailVisible() {
		WebElement Status = driver.findElement(MealSectionL);
    	return Status.isDisplayed();
	}


	public boolean isDinnerMealDetailVisible() {
		WebElement Status = driver.findElement(MealSectionD);
    	return Status.isDisplayed();
	}


	public boolean isSnackMealDetailVisible() {
		WebElement Status = driver.findElement(MealSectionS);
    	return Status.isDisplayed();
	}

	public boolean isdishtitleVisible() {
		WebElement Status = driver.findElement(DishInfo);
    	return Status.isDisplayed();
		
	}


	public boolean isdishdescriptionVisible() {
		WebElement Status = driver.findElement(DishTitle);
    	return Status.isDisplayed();
	}

	public boolean ispremealitemVisible() {
		WebElement Status = driver.findElement(Premeal);
    	return Status.isDisplayed();
		
	}

	public boolean iscalorieVisible() {
		WebElement Status = driver.findElement(Calorie);
    	return Status.isDisplayed();
	}


	public boolean istimeVisible() {
		WebElement Status = driver.findElement(Time);
    	return Status.isDisplayed();
	}


	public void clickViewFullPlanSection() {
		WebElement Status = driver.findElement(ViewFullPlan);
    	 Status.click();
    	
	}
		public boolean subscriptionpageSection() {
		
		WebElement Status = driver.findElement(HeadingofPage);
    	return Status.isDisplayed();
	}

		
	public boolean isgreencolorVisible() {
		
		return driver.findElement(Greencolor).isDisplayed();
	}


	public boolean ispurplecolorVisible() {
		return driver.findElement(Purplecolor).isDisplayed();
	}



	public boolean ispinkcolorVisible() {
		return driver.findElement(PinkColor).isDisplayed();
	}


	public boolean isgramVisible() {
	    List<WebElement> elements = driver.findElements(gram);
	    
	    for (WebElement el : elements) {
	        if (el.isDisplayed() && el.getText().contains("g")) {
	            return true;
	        }
	    }
	    return false;
	}

}
	
	

	
	
	
	
	
	

