	package pages;



import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ExcelReader;
public class Loginpage {

	WebDriver driver;
	
	By LoginBtnlocator = By.xpath("//button[text()=' Login']");
	By Placeholder1locator =By.xpath("//input[@placeholder='Enter email']");
	By Placeholder2locator = By.xpath("//input[@placeholder='Enter your password']");
	By passwordfieldlocator = By.xpath("//input[@name= 'password']");
	By SubmitBtnlocatorlocator = By.xpath("//button[@type='submit']");
	By continueBtnEnabledlocator = By.xpath("//button[@type='submit']");
	By SignBtnlocator = By.xpath("//button[normalize-space(text())='Sign in']");
	By logoHomelocator = By.xpath("//h1[text()='Welcome back']");
	By subHeaderlocator = By.xpath("//p[text()='Sign in to your account or create a new one']");
	By closebtnlocator = By.xpath("//button[contains(@class, 'right-4') and contains(@class, 'top-4')]");
	By emailFieldlocator = By.xpath("//input[@id=':r0:-form-item']");
	By OrSepratorlocator = By.xpath("//span[text()='OR']");
	By Conditonstatlocator = By .xpath("//p[text()='By continuing you agree to our T&Cs and Privacy Policy']");
	By errorMsglocator = By.xpath("//p[text()='Please enter a valid email address']");
	By validEmaillocator = By.xpath("//input[@value='Team05@gmail.com']");
	By forgorpasswordlocator = By.xpath("//button[text()='Forgot password?']");
	By homepagelocator = By.xpath("//button[text()='Home']");
	By completeProfilescreen = By.xpath("//h2[text()='Complete your profile']");
	By fullNameLocator = By.id(":r7:-form-item");
	By userNameLocator = By.id(":r8:-form-item");
	By passwordlocator = By.xpath("//input[@name= 'password']");
	By creteAccForm =By.xpath("//button[@type='submit']");
	By checkboxlocator = By.id("terms");
	By uploadBloodReportlocator = By.xpath("//button[text()='Upload Blood Report']");
    By stepthroughLocator = By.xpath("//button[text()='Step Through Onboarding']");
    By pdfUploadModallocator = By.xpath("//h1[text()='Just a quick upload, and we’ll handle the rest!']");
    By createaccountBtn = By.xpath("//button[text()='Create Account']");
	public Loginpage(WebDriver driver) {
		this.driver = driver;		
	}	
	
	
	
	public void clickonloginbtn() {		
		driver.findElement(LoginBtnlocator).click();
	}
	public void clickoncreateNewAcc() {		
		driver.findElement(createaccountBtn).click();
	}
	
	public void enterEmailid(String emailid) {				
		driver.findElement(Placeholder1locator).sendKeys(emailid);		
	}
	public void enterFullname(String fullname) {
		driver.findElement(fullNameLocator).sendKeys(fullname);
	}
	public void enterUsername(String username) {
		driver.findElement(userNameLocator).sendKeys(username);
	}
	public void enterPasswordname(String password) {
		driver.findElement(passwordlocator).sendKeys(password);
	}
	
public void enterPassword(String password) {		
	driver.findElement(Placeholder2locator).sendKeys(password);				

}
public void clickSubmitbtn() {
	driver.findElement(SubmitBtnlocatorlocator).click();
	
}
public boolean continueBtnEnabled() {
	return driver.findElement(continueBtnEnabledlocator).isEnabled();
	
}
public boolean continueEmailDisplayed() {
	return driver.findElement(continueBtnEnabledlocator).isDisplayed();

}
public void clicksigninBtn() {
	driver.findElement(SignBtnlocator).click();
	
}
public boolean logoonHomepage() {
    return driver.findElement(logoHomelocator).isDisplayed();
}
public boolean subHeaderonLogo() {
    
	return  driver.findElement(subHeaderlocator).isDisplayed();    
    
}
public boolean closeButton() {
	return driver.findElement(closebtnlocator).isDisplayed();
			
}
public boolean isdisplayedenterpassword() {
	return driver.findElement(Placeholder1locator).isDisplayed();
}

public boolean emailField() {
	return driver.findElement(emailFieldlocator).isDisplayed();
}
	public String getEmailFieldPlaceholder() {
	    return driver.findElement(By.id("emailFieldlocator")).getAttribute("placeholder");
	}
			

public boolean orsepratotDisplyed() {
	return driver.findElement(OrSepratorlocator).isDisplayed();
	
}
public boolean conditionIsDisplyed() {
	return driver.findElement(Conditonstatlocator).isDisplayed();
	
}
public boolean passfieldisdiaplyed() {
	return driver.findElement(passwordfieldlocator).isDisplayed();	
}
public boolean errorMsgdisplyed() {
	return driver.findElement(errorMsglocator).isDisplayed();
}

public boolean signInbtn() {
	return driver.findElement(SignBtnlocator).isDisplayed();
}
public boolean validEmaidIdisDisplyed() {
	return driver.findElement(validEmaillocator).isDisplayed();
}
public boolean forgorPasswordlink() {
	return driver.findElement(forgorpasswordlocator).isDisplayed();
}
public boolean homePageDisplyed() {
	return driver.findElement(homepagelocator).isDisplayed();
}
public boolean completeFormisdisplayed() {
	return driver.findElement(completeProfilescreen).isDisplayed();
}
public List<String> getEmailId(){
	
	ExcelReader reader = new ExcelReader("src/test/resources/feature/Testdata/Logindata.xlsx", "LoginData");
    List<String> emailList = reader.getColumnDataByName("Emailid");
	return emailList;
}
public List<String> getpassword(){
	
	ExcelReader reader = new ExcelReader("src/test/resources/feature/Testdata/Logindata.xlsx", "LoginData");

    List<String> passwordlist = reader.getColumnDataByName("password");
	return passwordlist;
}
public boolean isfullnameElementsDisplayed() {
    return driver.findElement(fullNameLocator).isDisplayed();
}
public boolean isusernameElementsDisplayed() {
    return driver.findElement(userNameLocator).isDisplayed();
}
public boolean ispasswordElementsDisplayed() {
    return driver.findElement(passwordlocator).isDisplayed();
    
}

public boolean iscreatedElementsDisplayed() {
  return driver.findElement(checkboxlocator).isDisplayed();
}
public boolean isbuttonenabled() {
	return driver.findElement(checkboxlocator).isEnabled();
}
public void checkTermscondition(){
	driver.findElement(checkboxlocator).click();
}
public boolean iscreateaccountDisaabled() {
    return driver.findElement(creteAccForm).isDisplayed();
}
    public void clickonPdfbtn() {
    	driver.findElement(uploadBloodReportlocator).click();
    }

public Map<String, List<String>> getCreateFormData() {
	ExcelReader reader = new ExcelReader("src/test/resources/feature/Testdata/Logindata.xlsx", "Newacct");


    
    Map<String, List<String>> data = new HashMap<>();
    
    data.put("FullName", reader.getColumnDataByName("FullName"));
    data.put("Username", reader.getColumnDataByName("Username"));
    data.put("Password", reader.getColumnDataByName("Password"));
    
    return data;
}
public boolean isBloodreportPageDisplayed() {
	return driver.findElement(uploadBloodReportlocator).isDisplayed();
}
public boolean isstepthroughonboardingPageDisplayed() {
	return driver.findElement(stepthroughLocator).isDisplayed();
}
public boolean isDispalyedModel() {
	return driver.findElement(pdfUploadModallocator).isDisplayed();
}
public void waitUntilCreateAccountButtonEnabled() {
    new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Account']")));
}

}