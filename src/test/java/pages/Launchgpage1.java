package pages;
import java.util.Map;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Launchgpage1 {
	
	
	WebDriver driver;

	By appnamelocator = By.xpath("//div[contains(text(),'SweetBalance')]");
	By taglinelocator = By.xpath("//div[contains(text(),'Our Terms of Service and Privacy Policy have recently been updated')]");
	By smartdiabetestrack = By.xpath("//h1[contains(@class, 'font-bold') and contains(@class, 'text-3xl')]");
	By starttodaylocator = By.xpath("//button[contains(@class, 'inline-flex') and contains(@class, 'rounded-md') and contains(@class, 'bg-white') and contains(@class, 'text-primary')]");
	By comprehensivelocator = By.xpath("//h2[@class='text-3xl font-bold text-gray-900']");

	By healthcardtitlelocator = By.xpath("//h3[text()='Health Tracking']");
	By heartIconlocator = By.xpath("//div[contains(., 'Health Tracking')]//*[name()='svg' or name()='img' or self::i][1]");
	By healthmonitorlocator = By.xpath("//p[contains(text(), 'Monitor glucose levels')]");

	By nutritioncardtitlelocator = By.xpath("//h3[text()='Nutrition & Exercise']");
	By balancedietlocator = By.xpath("//p[text()='Balance diet and physical activity for optimal control']");
	By squareiconlocator =By.xpath("//div[contains(., 'Nutrition & Exercise')]//*[name()='svg' or name()='img' or self::i][1]");

	By smartinsightslocator = By.xpath("//h3[text()='Smart Insights']");
	By getpersonalizedlocator = By.xpath("//p[text()='Get personalized guidance based on your data']");
	By clockiconlocator =By.xpath("//div[contains(., 'Smart Insights')]//preceding::*[name()='svg' or name()='img' or self::i][1]");

	By jamestestimoniallocator= By.xpath("//div[contains(., 'James D.') and .//text()[contains(.,'My A1C improved from 7.8 to 6.2')]]");
	By mariatestimoniallocator=By.xpath("//div[contains(., 'Maria L.') and contains(., 'life-changing for managing my type 2 diabetes')]");
	By roberttestimoniallocator=By.xpath("//div[contains(., 'Robert T.') and contains(., 'predictive alerts have saved me')]");


  //By jamesfivestarlocator = By.xpath("//div[contains(., 'James D.')]/following-sibling::div//span[contains(@class, 'star') and contains(@class, 'filled')]");
	By jamesfivestarlocator = By.xpath("//div/p[text()='James D.']/../div/*[name()='svg']");
  //By mariafivestarlocator = By.xpath("//div[contains(., 'Maria L.')]/following-sibling::div[@class='flex']/svg[contains(@class, 'fill-yellow-400')]");
	By mariafivestarlocator = By.xpath("//div/p[text()='Maria L.']/../div/*[name()='svg']");
  //By robertfivestarslocator =By.xpath("//div[contains(., 'Robert T.')]/following-sibling::div[@class='flex']/svg[contains(@class, 'fill-yellow-400')]");
    By robertfivestarslocator = By.xpath("//div/p[text()='Robert T.']/../div/*[name()='svg']");
	
    By jointextlocator = By.xpath("//p[text()='Join our community of successful members']");
  //By fivestarlocator = By.xpath("//h2[contains(text(),'Join our community')]/preceding-sibling::div//*[name()='svg' and @fill='#FFD700']");
    By fivestarlocator = By.xpath("//p[starts-with(text(),'Join')]/../div/*[name()='svg']");
	
	By headinglocator=By.xpath("//h2[text()='Take control of your diabetes today']");
	By checkyourrisklocator = By.xpath("//button[contains(text(), 'Check Your Risk')]");

	public Launchgpage1(WebDriver driver) {
	this.driver = driver;
	}
	public void app_name() {
	driver.findElement(appnamelocator);
	}
	public int validateAppNameOnTopLeft() {
	int x,y=0;


	System.out.println("Validating App Name.....");
	WebElement appNameEle = driver.findElement(appnamelocator);
	if(appNameEle.isDisplayed()) {

	Point location = appNameEle.getLocation();
	x = location.getX();
	y = location.getY();


	}
	else System.out.println("App Name is not displayed");
	return y;
	}

	public boolean tagline_locator() {
	WebElement policyele =driver.findElement(taglinelocator);
	return policyele.isDisplayed();
	}

	public boolean smart_diabetes_track() {
	WebElement smartele=driver.findElement(smartdiabetestrack);
	return smartele.isDisplayed();
	}

	public boolean start_today_locator() {
	WebElement startele =driver.findElement(starttodaylocator);
	return startele.isDisplayed();
	}
	public boolean comprehensive_locator() {
	WebElement comprehenele=driver.findElement(comprehensivelocator);
	return comprehenele.isDisplayed();
	}
	public  boolean  healthcardtitle_locator() {
	WebElement healthcardele=driver.findElement(healthcardtitlelocator);
	return healthcardele.isDisplayed();
	}
	public boolean hearticon_visible() {
	WebElement hearticonele=driver.findElement(heartIconlocator);
	return hearticonele.isDisplayed();
	}

	public boolean nutritiontitle_locator() {
	WebElement nutritionele=driver.findElement(nutritioncardtitlelocator);
	return nutritionele.isDisplayed();
	}
	public boolean smartinsights_locator() {
	WebElement smartinsightele=driver.findElement(smartinsightslocator);
	return smartinsightele.isDisplayed();
	}
	public boolean healthmonitor_locator() {
	WebElement healthmonitorele = driver.findElement(healthmonitorlocator);
	return healthmonitorele.isDisplayed();
	}
	public boolean balancediet_locator() {
	WebElement balancedietele =driver.findElement(balancedietlocator);
	return balancedietele.isDisplayed();
	}
	public boolean getpersonalized_locator() {
	WebElement getpersonalizedele = driver.findElement(getpersonalizedlocator);
	return getpersonalizedele.isDisplayed();
	}
	public boolean squareicon_isvisible() {
	WebElement squareiconele=driver.findElement(heartIconlocator);
	return squareiconele.isDisplayed();
	}
	public boolean clockicon_isvisible() {
	WebElement clockiconele=driver.findElement(clockiconlocator);
	return clockiconele.isDisplayed();
	}
	public boolean jamestestimonial_visisble() {
	WebElement jamestestimonialele =driver.findElement(jamestestimoniallocator);
	           return jamestestimonialele.isDisplayed();
	       }

	public boolean mariatestimonial_visible(String username) {
	WebElement mariatestimonialele = driver.findElement(mariatestimoniallocator);
	            return mariatestimonialele.isDisplayed();
	        }
	public boolean roberttestimonial_visible(String username) {
	WebElement roberttestimonialele = driver.findElement(roberttestimoniallocator);
	            return roberttestimonialele.isDisplayed();
	}
	public boolean joincommunitytext_isVisibe() {
	WebElement joincommunityele = driver.findElement(jointextlocator);
	return joincommunityele.isDisplayed();
	}
	public boolean FiveStars_Visible() {
	       List<WebElement> stars = driver.findElements(fivestarlocator);
	       System.out.println("size: "+ stars.size());
	       System.out.println("str: "+ stars.stream().allMatch(WebElement::isDisplayed));
	       if (stars.size() != 5) return false;
	return stars.stream().allMatch(WebElement::isDisplayed);
	}
	public int  jamesfivestars_Visible() {
	List<WebElement> jamesstars =driver.findElements(jamesfivestarlocator);
	return jamesstars.size();                                                          
	}
	public int  mariafivestars_Visible() {
	List<WebElement> mariastars =driver.findElements(mariafivestarlocator);

	return mariastars.size();                                                          
	}
	public int robertfivestars_Visible() {
	List<WebElement> mariastars =driver.findElements(robertfivestarslocator);

	return mariastars.size();  
	}
	public boolean heading_visible() {
	WebElement headingele = driver.findElement(headinglocator);
	return headingele.isDisplayed();
	}
	public boolean checkyourriskbutton_visible() {
	WebElement checkyourriskele = driver.findElement(checkyourrisklocator);
	return checkyourriskele.isDisplayed();
	}
	}


	
	


