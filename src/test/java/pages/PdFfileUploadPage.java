package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
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
	By BloodReportvaluesLocator = By.xpath(
		    "//h3[normalize-space()='Blood Test Results' or " +
		    "normalize-space()='Complete Blood Count' or " +
		    "normalize-space()='Medical Conditions' or " +
		    "normalize-space()='Abnormal Values' or " +
		    "normalize-space()='Recommendations']"
		);
	By heightLocator = By.xpath("//input[@placeholder='Enter height in cm (1-300)']");
	By weightLocator = By .xpath("//input[@placeholder='Enter weight in kg (1-500)']");
	By continuetostep2locator = By.xpath("//button[text()='Continue']");
	By pickintencityexerciselocator = By.xpath("//div[contains(@class,'cursor-pointer')]");
	By diterypreferencelocator = By.xpath("//div[contains(@class,'cursor-pointer') and .//span[contains(@class,'text-black')]]");
	By cusionoptionlocator = By.xpath("//div[contains(@class,'cursor-pointer') and .//span[contains(@class,'text-black')]]");
	By Alleriesoptionlocator = By.xpath("//div[contains(@class,'cursor-pointer') and .//span[contains(@class,'text-black')]]");
	By submitalasteps = By.xpath("//button[@type='submit']");
	public PdFfileUploadPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void clickallsubmitform() {
		driver.findElement(submitalasteps).click();
	}
	public void clicksteponepage() {
		driver.findElement(continuetostep2locator).click();
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
	
	public void clickcontinuetostep1page() {
		CommonMethods.scrollToElementAndClick(driver, continuetoonboardinglocator, 3);
//		driver.findElement(continuetoonboardinglocator).click();
	
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
	public boolean isbloodReportsectionDisplayed() {
        List<WebElement> headings = driver.findElements(BloodReportvaluesLocator);

        if (headings.isEmpty()) {
            return false;
        }

        for (WebElement heading : headings) {
        	CommonMethods.scrollToElement1(driver, heading);
            System.out.println("Found heading: " + heading.getText());
            if (!heading.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
	
	public void enterHeightAndWeight(int height, int weight) {
        Actions actions = new Actions(driver);

        WebElement heightInput = driver.findElement(heightLocator);
        actions.moveToElement(heightInput).click().pause(500)
               .sendKeys(String.valueOf(height))
               .perform();

        WebElement weightInput = driver.findElement(weightLocator);
        actions.moveToElement(weightInput).click().pause(500)
               .sendKeys(String.valueOf(weight))
               .perform();
    }
	
	public void enterHeightAndWeightUsingJS(int height, int weight) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    WebElement heightInput = driver.findElement(heightLocator);
	    WebElement weightInput = driver.findElement(weightLocator);

	   
	    js.executeScript("arguments[0].value = '';", heightInput);
	    js.executeScript("arguments[0].value = '';", weightInput);


	    js.executeScript("arguments[0].value = arguments[1];", heightInput, String.valueOf(height));
	    js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", heightInput);

	    js.executeScript("arguments[0].value = arguments[1];", weightInput, String.valueOf(weight));
	    js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", weightInput);
	}

	public void selectExerciseIntensity(String optionText) {
	    driver.findElement(By.xpath("//div[contains(@class,'cursor-pointer') and .//span[contains(.,'" + optionText + "')]]")).click();
	    System.out.println("Selected exercise intensity: " + optionText);

	}
	public void selectDietaryPreference(String preference) {
	    driver.findElement(
	        By.xpath("//div[contains(@class,'cursor-pointer') and .//span[contains(@class,'text-black') and contains(normalize-space(),'" + preference + "')]]")
	    ).click();
	    System.out.println("Selected dietary preference: " + preference);
	}

	
	public void selectCuisineOption(String cuisineName) {
	    List<WebElement> options = driver.findElements(cusionoptionlocator);

	    for (WebElement option : options) {
	        String text = option.getText().trim();
	        if (text.toLowerCase().contains(cuisineName.toLowerCase())) {
	            option.click();
	            System.out.println("Selected cuisine: " + text);
	            return;
	        }
	    }

	    throw new NoSuchElementException("Cuisine option not found: " + cuisineName);
	}
	public void selectAllergy(String allergyName) {
	    List<WebElement> options = driver.findElements(Alleriesoptionlocator);

	    for (WebElement option : options) {
	        String text = option.getText().trim();
	        if (text.toLowerCase().contains(allergyName.toLowerCase())) {
	            option.click();
	            System.out.println("Selected allergy option: " + text);
	            return;
	        }
	    }

	    throw new NoSuchElementException("Allergy option not found: " + allergyName);
	}


}



	



