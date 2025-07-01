package pages;

import org.openqa.selenium.By;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;

import utils.ExcelReader;




public class PdFfileUploadPage {
	WebDriver driver;
	
	
	
	By PdffileUplioderlocator = By.xpath("//div[@class='flex flex-col items-center space-y-2']");
	By drapandDroplocator = By.xpath("//p[text()='Drag & drop or click to upload']");
	By uploadProcessBtn = By.xpath("//button[text()='Upload & Process']");
	By cancelbtnlocator = By.xpath("//button[text()='Cancel']");
	By continuetoonboardinglocator = By.xpath("//button[text()='Continue to Onboarding']");
	
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
	
	public boolean isuploadbtnEnabled() {
		return driver.findElement(uploadProcessBtn).isEnabled();
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
}
