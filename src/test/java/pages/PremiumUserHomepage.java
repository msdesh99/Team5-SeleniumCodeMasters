package pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PremiumUserHomepage {

	WebDriver driver;

	public PremiumUserHomepage(WebDriver driver) {
		this.driver = driver;
	}

	public List<String> VerifyNavBar() {
		List<WebElement> navigatebarItems = driver.findElements(By.xpath("//div[@class='flex space-x-8']/button"));
		List<String> navItems = new ArrayList<>();
		for (WebElement item : navigatebarItems) {
			navItems.add(item.getText());
		}
		return navItems;

	}

	
}
