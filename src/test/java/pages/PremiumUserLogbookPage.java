package pages;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PremiumUserLogbookPage {
    WebDriver driver;
    By navigationLocator = By.xpath("//button[text()='Logbook']");
    By sectionLocator = By.xpath("//div//h2");
    Map<String,Object> actualMap = new HashMap<String,Object>(); 
    
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
}
