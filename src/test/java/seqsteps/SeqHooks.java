package seqsteps;

import utils.Base;
import utils.PageObjectManager;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class SeqHooks {
	
	Base base;
	WebDriver driver;
	PageObjectManager pageObjectManager;
	@Before
	public void setUp() {
		if(driver==null) {
			base = new Base();
			driver = base.getDriver();
			pageObjectManager = new PageObjectManager(base.getConfigs(),driver);
		}			
	}
}
