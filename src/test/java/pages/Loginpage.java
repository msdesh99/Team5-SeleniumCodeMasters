package pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Loginpage {

	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;		
	}
	
	
	public void clickonloginbtn() {
		WebElement LoginBtn = driver.findElement(By.xpath("//button[text()=' Login']"));
		LoginBtn.click();
	}
	
	public void enterEmailid(String emailid) {
		WebElement Placeholder1 = driver.findElement(By.xpath("//input[@placeholder='Enter email']"));
		
		Placeholder1.sendKeys(emailid);
		
	}
	
public void enterPassword(String password) {
	WebElement Placeholder2 = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		
		Placeholder2.sendKeys(password);
				

}
public void clickSubmitbtn() {
	WebElement SubmitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	SubmitBtn.click();
}
public void clicksigninBtn() {
	WebElement SignBtn = driver.findElement(By.xpath("//button[text()='Sign in']"));
	SignBtn.click();
	
}


}
