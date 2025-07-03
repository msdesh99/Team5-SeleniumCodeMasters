package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import utils.CommonMethods;

public class StepthroughonboardingPage {
	WebDriver driver;
    WebDriverWait wait;

	
	By stepthroughLocator = By.xpath("//button[text()='Step Through Onboarding']");
	By headingofpage = By.xpath("//h1[text()='So, Which sugar rebellion are we dealing with?']");
	By subheading = By.xpath("//p[text()='This will help us tailor your plan to your condition']");
	By progressbar = By.xpath("//p[contains(text(),'Step')]");
	By optiononStep1 = By.xpath("//*[normalize-space(text())='Type 2' or normalize-space(text())=\"I don't know\"]");
	By genderlocator = By.xpath("//div[@class='space-y-2']//button[1]");
	By agelocator = By.xpath("//span[text()='years'][1]");
	By heightlocator = By.xpath("//span[text()='120']");
	By weightlocator = By.xpath("//span[text()='55']");
	By dieteryPreflocator = By.xpath("//div[@class='space-y-2']/following::button[2]");
		By cusionlocator=	By.xpath("(//div[@class='space-y-2']/following::button[2]");
		By Allerieslocator = By.xpath("//div[@class='space-y-2']/following::button[1]");
		By alleriescheckboxlocator = By.xpath("//div[@class='space-y-4']/following::button[1]");
		By checkboxselect =By.xpath("//button[@id='dairy']");
		By continuebtn = By.xpath("//span[text()='Continue']");
		By medicalcondition =By.xpath("//div[@class='space-y-4']/following::button[1]");
		By checkboxselect1 =By.xpath("//button[@id='high-blood-pressure']");
		By exerciselocator = By.xpath("//div[@class='space-y-2']/following::button[2]");
		By h1baclocator = By.xpath("//input[@type='number']");
		By step12continuelocator = By.xpath("//button[text()='Continue']");
		By freeorpremiumpagelocator = By.xpath("//h1[text()='Free vs. Premium Account Features']");
	
			
			
	public StepthroughonboardingPage(WebDriver driver) {
		this.driver = driver;	
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       
	}
		
	public void verifyUserIsOnOnboardingPage() {
	    String currentUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/onboarding";
	    
//	    //Assert.assertEquals(
//	        currentUrl,
//	        expectedUrl,
//	        "User is not redirected to the onboarding page!"
//	    );
	}
	public boolean headingofStepboardisdisplayed() {
		return driver.findElement(headingofpage).isDisplayed();
	}
	public boolean subheadingofStepboardisdisplayed() {
		return driver.findElement(subheading).isDisplayed();
	}
	public boolean progressbarofStepboardisdisplayed() {
		return driver.findElement(progressbar).isDisplayed();
	}
	
	public void clickonStepthroughOnboarding() {
	driver.findElement(stepthroughLocator).click();
	}
	
	public boolean the_option_on_step_1_should_be_displayed() {
	    By optiononStep1 = By.xpath("//*[normalize-space(text())='Type 2' or normalize-space(text())=\"I don't know\"]");
	    
	    WebElement optionElement = driver.findElement(optiononStep1);
	    
	    return optionElement.isDisplayed();
	}
	public void clickOptionByText(By optionsLocator, String optionText) {
	    List<WebElement> options = driver.findElements(optionsLocator);
	    for (WebElement option : options) {
	        if (option.getText().trim().equalsIgnoreCase(optionText)) {
	            option.click();
	            return;  
	        }
	    }
	    throw new NoSuchElementException("Option with text '" + optionText + "' not found.");
	}
	public void clickOptionOnStep1() {
	    List<WebElement> options = driver.findElements(optiononStep1);
	    if (options.size() > 0) {
	        options.get(0).click();  
	    } else {
	        throw new NoSuchElementException("No option found matching 'Type 2' or 'I don't know'");
	    }
	}
	public void selectgender() {
		WebElement element = driver.findElement(genderlocator);
	    element.click();
	}
	public void selectOption() {
	    WebElement element = driver.findElement(agelocator);
	    element.click();
	}
	public void selectOption1() {
	    WebElement element = driver.findElement(heightlocator);
	    
	    element.click();
	}
	public void selectOption2() {
	    WebElement element = driver.findElement(weightlocator);
	    
	    element.click();
	}
	public void clickOneDietaryPrefOption() {
	    List<WebElement> options = driver.findElements(dieteryPreflocator);
	    if (!options.isEmpty()) {
	        options.get(0).click();  
	    } else {
	        throw new NoSuchElementException("No dietary preference options found.");
	    }
	
}
	public void clickOnecusionOption() {
	    List<WebElement> options = driver.findElements(cusionlocator);
	    if (!options.isEmpty()) {
	        options.get(0).click();  
	    } else {
	        throw new NoSuchElementException("No cusion preference options found.");
	    }
}
	public void clickAllergiesOption() {
	   driver.findElement(Allerieslocator).click();
	 
	}
	public void clickDairyCheckbox() {
	    driver.findElement(By.xpath("checkboxselect")).click();
	}
	public void clickcontinuetostepbtn() {
		CommonMethods.scrollToElementAndClick(driver, continuebtn, 3);
	
}
	public void clickmedicationCheckbox() {
	    driver.findElement(By.xpath("checkboxselect1")).click();
	}
	
	public void selectFirstExerciseOption() {
	    WebElement exerciseButton = driver.findElement(exerciselocator);
	    exerciseButton.click();
	}
	public void enterH1bacValue(String value) {
	    WebElement inputField = driver.findElement(h1baclocator);
	             
	    inputField.sendKeys(value);
	}
	public boolean isDisplayedSubscriptionPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(freeorpremiumpagelocator));
	    return element.isDisplayed();
	}
	public void clickoncontinue() {
		driver.findElement(step12continuelocator).click();
	}
}


