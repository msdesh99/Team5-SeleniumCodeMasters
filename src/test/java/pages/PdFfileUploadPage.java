package pages;

import java.time.Duration;

import org.openqa.selenium.By;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.CommonMethods;
import utils.ExcelReader;


public class PdFfileUploadPage {
	WebDriver driver;
	 		
	By PdffileUplioderlocator = By.xpath("//div[@class='flex flex-col items-center space-y-2']");
	By drapandDroplocator = By.xpath("//p[text()='Drag & drop or click to upload']");
	By uploadProcessBtn = By.xpath("//button[text()='Upload & Process']");
	By cancelbtnlocator = By.xpath("//button[text()='Cancel']");
	By continuetoonboardinglocator = By.xpath("//button[text()='Continue to Onboarding']");
	By reportAnaylysHedaer = By.xpath("//h2[text()='Report Analysis Results']");
	By uploadsucessfuleMsg = By .xpath("//li[@role='status']/div/div[1]");
	By  bloodtestelementlocator = By.xpath("//h3[text()='Blood Test Results']");
	By completetestLocator = By.xpath("//h3[text()='Complete Blood Count']");
	By medicalConditionsLocator = By.xpath("//h3[text()='Medical Conditions']");
	By abnormalValuesLocator = By.xpath("//h3[text()='Abnormal Values']");
	By recommentions = By.xpath("//h3[text()='Recommendations']");
	
	public PdFfileUploadPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void user_hovers_over_upload_box() {
		WebElement uploadBox = driver.findElement(drapandDroplocator);
	    
	    Actions actions = new Actions(driver);
	    actions.moveToElement(uploadBox).perform();
	}
	
	public boolean upload_box_should_show_drag_drop_interaction() {
	    WebElement uploadBox = driver.findElement(By.xpath("//div[contains(@class, 'cursor-pointer') and contains(@class, 'border-dashed')]"));
	    
	    if(uploadBox.isDisplayed())  
	    return true;
	    else
	    	return false;
	      
	  
	}
	
	public boolean isUploadBtnEnabled() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement uploadButton = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(uploadProcessBtn));
	    return uploadButton.isEnabled();
	}
	public void uploadnonPDffile() {
	WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
	uploadInput.sendKeys("/Users/parikshit/git/Team5-SeleniumCodeMasters/src/test/resources/feature/Testdata/Logindata.xlsx");
	}
	public boolean errrorMsgdiaplyed() {
	WebElement errorMsg = driver.findElement(
		    By.xpath("//*[contains(text(),'Invalid file format')]"));
		    if(errorMsg.isDisplayed())  
			    return true;
			    else
			    	return false;
		
	
}
	public void uploafile10MBnPDffile() {
		WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
		uploadInput.sendKeys("/Users/parikshit/git/Team5-SeleniumCodeMasters/src/test/resources/feature/Testdata/SQL.pdf");
		}
	public void uploafile1validnPDffile() {
		WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
		uploadInput.sendKeys("/Users/parikshit/git/Team5-SeleniumCodeMasters/src/test/resources/feature/Testdata/Maha test result 2.pdf");
		}
	public void clickoncancelbtn() {
		driver.findElement(cancelbtnlocator).click();
	}
	public void clickonuploadBtn() {
		driver.findElement(uploadProcessBtn).click();
	}
	public boolean waitForReportAnalysisPage() {
       
        By reportAnalysisHeader = By.xpath("//h2[text()='Report Analysis Results']");

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(reportAnalysisHeader));
            return header.isDisplayed();
        } catch (org.openqa.selenium.TimeoutException e) {
            return false;
        }
                  
	}

	public boolean iscontinueOnboardingBtndisplayed() {
		CommonMethods.scrollToElement(driver, continuetoonboardinglocator);
		return driver.findElement(continuetoonboardinglocator).isDisplayed();
	}
	
	

	public String getuploadsucessfuleText() {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement header2 = wait.until(ExpectedConditions.visibilityOfElementLocated(uploadsucessfuleMsg));
		
		return header2.getText();
		} catch (org.openqa.selenium.TimeoutException e) {
			return null;
	}
		
	}

}



