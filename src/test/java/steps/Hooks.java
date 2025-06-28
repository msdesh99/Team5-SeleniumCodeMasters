package steps;
import utils.TestContext;
import io.cucumber.java.Before;

import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import configs.BrowserConfig;
import utils.LoggerLoad;
import utils.SoftAssertUtils;

public class Hooks {
	TestContext testContext;
	Scenario scenario;
	WebDriver driver;
	public Hooks(TestContext testContext) {
		this.testContext = testContext;
	}
	@Before
	public void before(Scenario scenario) {
		testContext.set("Scenario", scenario);
		testContext.set("SoftAssertUtils", new SoftAssertUtils());
		String logFileName = "logs/SweetBalance-"+BrowserConfig.getBrowserType()+"-logs.log";
		System.setProperty("logFileName", logFileName);
		this.scenario = scenario;
		testContext.set("Scenario", this.scenario);
		LoggerLoad.info("This is browser specific log file: "+ System.getProperty("logFileName"));
	}
	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("Quiting Driver........ ");

		if(scenario.isFailed()) {
			System.err.println("Scenario: "+ scenario.getName()+" is failed");
		}
		this.testContext.base.getDriver().quit();
		this.testContext.clear();
	}
}
