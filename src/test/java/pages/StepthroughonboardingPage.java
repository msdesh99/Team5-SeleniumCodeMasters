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
	By agelocator = By.xpath("//button[span[normalize-space(.)='22 years']]");
	By heightlocator = By.xpath("//button[span[normalize-space(.)='120 cm']]");
	By weightlocator = By.xpath("//button[span[normalize-space(.)='50 kg']]");
	By dieteryPreflocator = By.xpath("//div[@class='space-y-2']/following::button[2]");
	By cusionlocator = By.xpath("(//div[@class='space-y-2']/following::button[2])");

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
		By freeuserbtnlocator = By.xpath("//button[text()='Continue Free']");
		By premiumuserlocator = By.xpath("//button[text()='Upgrade to Premium']");
		By enterCreditcarddetails = By.xpath("//input[@aria-label='Credit or debit card number']");
	    By entercardexpirtdate = By.xpath("//input[@placeholder='MM / YY']");
	    By entercvclocator =By.xpath("//input[@data-elements-stable-field-name='cardCvc']");
	    By premumbunlocator = By.xpath("//button[normalize-space(.)='Pay $9.99 USD']");
	    By continuetohomelocator = By.xpath("//button[text()='Go to Homepage']");
	    
			
			
	public StepthroughonboardingPage(WebDriver driver) {
		this.driver = driver;	
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       
	}
		
	public String verifyUserIsOnOnboardingPage() {
	    return driver.getCurrentUrl();
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
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(checkboxselect)).click();
	}
	public void clickcontinuetostepbtn() {
		CommonMethods.scrollToElementAndClick(driver, continuebtn, 3);
	
}
	public void clickmedicationCheckbox() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(checkboxselect1));
	    driver.findElement(checkboxselect1).click();
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(freeorpremiumpagelocator));
	    return element.isDisplayed();
	}
	public void clickoncontinue() {
		driver.findElement(step12continuelocator).click();
	}
	public void clickfreeUser() {
		driver.findElement(freeuserbtnlocator).click();
	}
	public void clickpremiumuser() {
		driver.findElement(premiumuserlocator).click();
	}
	public String validatefrreuserurl() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.urlContains("https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/free")); 

	    return driver.getCurrentUrl();
	}
	public void enterCreditCardDetails(String cardNumber, String expiryDate, String cvc) {
	  
	    driver.findElement(enterCreditcarddetails).sendKeys(cardNumber);

	    driver.findElement(entercardexpirtdate).sendKeys(expiryDate);
	    
	    driver.findElement(entercvclocator).sendKeys(cvc);
	}
	public void clickpremiumupoage() {
		driver.findElement(premumbunlocator).click();
	}
	public void clickpremiumhomepage() {
		driver.findElement(continuetohomelocator).click();
	}
	public String verifyUserIsOnpremiumpage() {
	    return driver.getCurrentUrl();
	}
}


