package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	WebDriver driver;

	public CommonMethods(WebDriver driver) {
		this.driver = driver;		
	}

	public void rgbToHex(String rgbColorValue) {
		   String rgb = rgbColorValue.replace("rgb('","").replace(")'", "");
		   System.out.println(rgb);
		
	}
	public static void scrollToElementAndClick(WebDriver driver, By locator, long durationInSeconds) {
        try {
            WebElement webElement = waitForElementClickability(driver, locator, durationInSeconds);
            if (webElement != null) {
                Actions action = new Actions(driver);
                action.moveToElement(webElement).click().perform();
                System.out.println("Successfully clicked on the element: " + locator.toString());
            } else {
                System.out.println("scrollToElementAndClick: Element not clickable → " + locator.toString());
            }
        } catch (Exception e) {
            System.out.println("scrollToElementAndClick Exception for element "
                    + locator.toString() + ": " + e.getMessage());
        }
    }

	public static WebElement waitForElementClickability(WebDriver driver, By locator, long durationInSeconds) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
	        return wait.until(ExpectedConditions.elementToBeClickable(locator));
	    } catch (Exception e) {
	        System.out.println("waitForElementClickability: Element not clickable → "
	                + locator.toString() + ". Exception: " + e.getMessage());
	        return null;
	    }
	}
	
    
public static void scrollToElement(WebDriver driver, By locator) {
    try {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println("Scrolled to element: " + locator.toString());
    } catch (Exception e) {
        System.out.println("scrollToElement Exception for element "
                + locator.toString() + ": " + e.getMessage());
    }
    
}
public static void scrollToElement1(WebDriver driver, WebElement element) {
    try {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println("Scrolled to element: " + element.getText());
    } catch (Exception e) {
        System.out.println("scrollToElement Exception for element "
                + element.toString() + ": " + e.getMessage());
    }
}
}






