package pages;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.stream.Collectors;
import org.openqa.selenium.support.ui.Select;
public class PremiumUserLogbookPage {
    WebDriver driver;
    By navigationLocator = By.xpath("//button[text()='Logbook']");
    By sectionLocator = By.xpath("//div//h2");
	By piLocator = By.xpath("//h3[text()='7-Day Aggregate Nutrition']/../div/div/*[name()='g']");
	By statisticCardLocator = By.xpath(
	"//h2[text()='Physical Activity']//..//..//following-sibling::div[contains(@class,'text-sm')]//div[contains(@class,'rounded-xl')]");
	
	By homeLocator = By.xpath("//button[text()='Home']");
	By physicalActivityLogLocator = By.xpath("//span[text()='Physical Activity']");	
	By activityTypeDropdownLocator = By.xpath("//div[@class='mb-6']//select[@id='activityType']");
	By duration = By.xpath("//div[@class='mb-6']//select[@id='activityType']");
	
	By durationDropdownLocator = By.xpath("//select[@name='durationUnit']");
	
	By lightActivityLocator = By.xpath("//button[text()='Light']");
	By saveActivityLocator = By.xpath("//span[text()='Save Activity']");
	By logbookPageLocator = By.xpath("//div//button[text()='Logbook']");
    Map<String,Object> actualMap = new HashMap<String,Object>(); 
    JavascriptExecutor js;
	public PremiumUserLogbookPage(WebDriver driver) {
		 this.driver = driver;
	}
	
	public void navigateToLogbookPage() {
		driver.findElement(navigationLocator).click();
	}
	
	public Map<String,Object> validateSectionPresence(String section) {
		   List<WebElement> sectionList = driver.findElements(sectionLocator);
		   for(WebElement sectionEle: sectionList) {
			   if(sectionEle.getText().contains(section)) {
				   actualMap.put("presence",true);
				   actualMap.put("title", sectionEle.getText());
				   break;
			   }
		   }
		   return actualMap;
	}
	public boolean verifyColorCode(String tab, String color) {
		By tabLocator = By.xpath("//div[text()='"+tab+"']");
		WebElement ele = driver.findElement(tabLocator);	
		return ele.getAttribute("class").contains(color);
	}
	public String verifyDisplayOfBloodSugarRange(String tab) {
		By bloodSugarLocator = By.xpath("//div[text()='"+tab+"']/following-sibling::div");
		return driver.findElement(bloodSugarLocator).getText();
	}
	public List<Boolean> verifyDaysDisplaysOnXaxis(String tab) {
        List<Boolean> result = new ArrayList<Boolean>();
        By daysLocator= null;
        if(tab.equals("Blood Glucose Tracker")) {
 		   daysLocator = By.xpath(
		  "//h2[text()='"+tab+"']/../descendant::*[contains(@class,'recharts-xAxis')]//*[name()='tspan']");
        }
        else if(tab.equals("Physical Activity")) {
 		   daysLocator = By.xpath(
 		  "//h2[text()='"+tab+"']/../../descendant::div/div/div//*[contains(@class,'recharts-xAxis')]//*[name()='tspan']");
        }
        else {
        	daysLocator = By.xpath(
        	 "//h2[text()='"+tab+"']/../descendant::*[contains(@class,'recharts-xAxis')]//*[name()='tspan']");
        }
	      List<WebElement> xAxisList = driver.findElements(daysLocator);
	      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd");
	      LocalDate today = LocalDate.now();	     
	      LocalDate actualDay;
	      for(int i=0; i<xAxisList.size();i++) {
		      actualDay = today.minusDays(6-i);
		      result.add((Boolean)actualDay.format(formatter).equals(xAxisList.get(i).getText()));
	      }
	      return result;
	}
	public List<Boolean> verifyDisplaysMinAndMaxOnYaxis(String min,String max, String tab) {
		List<Boolean> result = new ArrayList<Boolean>();
		By yAxisLocator = By.xpath(
		"//h2[text()='Blood Glucose Tracker']/../../descendant::div//*[contains(@class,'recharts-yAxis')]//*[name()='tspan']");
	    List<WebElement> yList = driver.findElements(yAxisLocator);
	    //yList.stream().map(i->i.getText()).forEach(System.out::println);
        	if(yList.get(0).getText().equals(min)) result.add(true); else result.add(false);
        	if(yList.get(3).getText().equals(max)) result.add(true); else result.add(false);
 	    return result;
	}
	public boolean verifyIcon(String tab) {
		By iconLocator = By.xpath("//h2[text()='"+tab+"']/../*[name()='svg']");
		return driver.findElement(iconLocator).isDisplayed();
	}
	public boolean verifyMealsSubSections(String section) {
		By sectionLocator = By.xpath(
			"//h2[text()='Meal & Nutrition']/../following-sibling::div//h3[text()='"+section+"']");
		return driver.findElement(sectionLocator).isDisplayed();
	}
	public boolean verifyColorOfTextInNutrition(String tab, String color) {
		By colorTextLocator = By.xpath(
				"//ul//li/span[text()='"+tab+"']/../*/*[name()='path']");
		String textColor = driver.findElement(colorTextLocator).getAttribute("fill");
		return (textColor.equals(color));		
	}
	public boolean verifyBarsWhenMealNotLogged(){
		By locator = By.xpath("//h3[text()='Daily Nutrition Breakdown']//..//p[starts-with(text(),'Date:')]");
		try {
			driver.findElement(locator);
		}catch(NoSuchElementException nse) {
			return true;
		}	
		return false;		
	}
	public boolean verifyPieChartWhenMealsNotLogged(){
		try {
			driver.findElement(piLocator);
		}catch(NoSuchElementException nse){
			return true;
		}	
		return false;
	}
	public String verifyCardValuesWhenNoLoggedMeals(String card) {
		By cardValuelocator = By.xpath(
		"//h2[text()='Meal & Nutrition']//../following-sibling::div[contains(@class,'text-sm')]//span[text()='"+card+"']/../../div");		
				List<WebElement> list = driver.findElements(cardValuelocator);
				return list.get(1).getText();
	}
	public Map<String,Object> verifyStatisticCardsPresenceAndAlignmentForPhysicalActivity() {
		Map<String,Object> result = new HashMap<String,Object>();
		   List<WebElement> list =  driver.findElements(statisticCardLocator);
		   List<Integer> yAxisList = list.stream().map(i->i.getLocation().getY()).collect(Collectors.toList());

		 result.put("Count", list.size());
         result.put("IsHorizontal", yAxisList.stream().allMatch(i->i.equals(yAxisList.get(0))));
         return result;
	}
	public String verifyStatisticCardTextColorForPhysicalActivity(String card) {
	//	By cardTextColorLocator = By.xpath(statisticCardLocator+"//div[text()='"+card+"']");
		By cardTextColorLocator = By.xpath(
		"//h2[text()='Physical Activity']//..//..//following-sibling::div[contains(@class,'text-sm')]//div[contains(@class,'rounded-xl')]//div[text()='"+card+"']");
		WebElement ele = driver.findElement(cardTextColorLocator);
		return ele.getAttribute("class");
	}
	public boolean verifyYAxisLabelForPysicalActivity(String label,String section) {
	  By yaxisLocator = By.xpath(
		"//h2[text()='Physical Activity']/../../descendant::div//*[contains(@class,'recharts-yAxis')]//*[name()='tspan']");
	   List<WebElement> yAxisList = driver .findElements(yaxisLocator);
	   return yAxisList.stream().anyMatch(i->i.getText().equals(label));
    }
	public boolean verifyChartWhenPhysicalActivityNotLogged() {
		By chartLocator = By.xpath(
		"//h2[text()='Physical Activity']/../following-sibling::div/div/div//*[name()='g']/*[name()='path']");	
		try {
			  driver.findElement(chartLocator);
		}catch(NoSuchElementException nsc) {
			return false;
		}	
		return true;
	}
	public void gotoHomePage() {
		driver.findElement(homeLocator).click();
	}
	public void addPhysicalActivityLog() {
		driver.findElement(physicalActivityLogLocator).click();
	    Select activitySelect = new Select(driver.findElement(activityTypeDropdownLocator));
	    activitySelect.selectByVisibleText("Cycling");
	    driver.findElement(duration).sendKeys("1");
	   
	    Select durationDropdown = new Select(driver.findElement(durationDropdownLocator));
	    durationDropdown.selectByValue("hours");
	    driver.findElement(lightActivityLocator).click();
	    driver.findElement(saveActivityLocator).click();
	}
	public void gotoLogbookPage() {
				driver.findElement(logbookPageLocator).click();
	}
}
