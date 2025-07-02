package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomeNavigation {

	WebDriver driver;
	public HomeNavigation(WebDriver driver) {
		this.driver = driver;
	}

	By starttodaylocator = By.xpath("//button[contains(., 'Start Today')]");
	By continueemaillocator =By.xpath("//button[text()='Continue with email']");
	//By Loginbuttonlocator = By.xpath("//button[text()='Login']");
	By Loginbuttonlocator =By.xpath("//header//button[normalize-space(text())='Login']");
	By checkyourrisklocator =By.xpath("//button[contains(., 'Check Your Risk')]");
	By welcomebacklocator = By.xpath("//h1[contains(text(), 'Welcome back')]");
	By chkyourrisklocator = By.xpath("//h2[text()='Diabetes Risk Analyzer']");

	public void  click_starttodaylocator() {
	WebElement startele = driver.findElement(starttodaylocator);
	startele.click();

	}
	public boolean continueemaillocator_isvisible() {

	return driver.findElement(continueemaillocator).isDisplayed();
	}

	public boolean loginlbutton_visible() {

	WebElement loginbtnele = driver.findElement(Loginbuttonlocator);
	 return loginbtnele.isDisplayed();
	}

	public void loginapp() {
	driver.findElement(Loginbuttonlocator);
	}
	public int validatLoginbuttonOnTopRight() {
	int x = 0,y=0;

	System.out.println("Validating Login Name.....");
	WebElement loginappEle = driver.findElement(Loginbuttonlocator);
	if(loginappEle.isDisplayed()) {

	Point location = loginappEle.getLocation();
	x = location.getY();
	y = location.getX();


	}
	else System.out.println("Login Name is not displayed");
	return x;

	}
	public void loginbutton_click() throws InterruptedException {
	Thread.sleep(2000);
	//driver.findElement(Loginbuttonlocator).click();
	WebElement loginButton = driver.findElement(By.xpath("//header//button[normalize-space(text())='Login']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);


	}

	public String welcomeback_visible() {
	WebElement welcomebckele=driver.findElement(welcomebacklocator);
	return welcomebckele.getText();
	}

	public void checkyourriskbutton_click() {
	driver.findElement(checkyourrisklocator).click();

	}

	public boolean chkyourrisk_visible() {
	WebElement chkyourriskele=driver.findElement(checkyourrisklocator);
	return chkyourriskele.isDisplayed();
	}


	}

	
	

