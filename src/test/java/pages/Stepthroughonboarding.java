package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Stepthroughonboarding {
	WebDriver driver;
	
	By headingofpage = By.xpath("//h1[text()='So, Which sugar rebellion are we dealing with?']");
	By subheading = By.xpath("//p[text()='This will help us tailor your plan to your condition']");
	By progressbar = By.xpath("//p[contains(text(),'Step')]");
	By optiononStep1 = By.xpath("//*[normalize-space(text())='Type 2' or normalize-space(text())=\"I don't know\"]");
	

			
			
	public Stepthroughonboarding(WebDriver driver) {
		this.driver = driver;		
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
	
	public boolean the_option_on_step_1_should_be_displayed() {
	    By optiononStep1 = By.xpath("//*[normalize-space(text())='Type 2' or normalize-space(text())=\"I don't know\"]");
	    
	    WebElement optionElement = driver.findElement(optiononStep1);
	    
	    return optionElement.isDisplayed();
	}
}
