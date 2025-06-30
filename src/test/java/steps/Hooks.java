package steps;
import java.io.ByteArrayInputStream;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import configs.BrowserConfig;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utils.LoggerLoad;
import utils.SoftAssertUtils;
import utils.TestContext;

public class Hooks {
	TestContext testContext;
	Scenario scenario;
	WebDriver driver;
	SoftAssertUtils softAssertUtils;
	public Hooks(TestContext testContext) {
		this.testContext = testContext;
	}
	@Before
	public void before(Scenario scenario) {
		testContext.set("Scenario", scenario);
		testContext.set("SoftAssertUtils", new SoftAssertUtils());
		softAssertUtils = testContext.get("SoftAssertUtils",SoftAssertUtils.class);
		String logFileName = "logs/SweetBalance-"+BrowserConfig.getBrowserType()+"-logs.log";
		System.setProperty("logFileName", logFileName);
		testContext.set("Scenario", this.scenario);
	
		scenario.log("Logging for "+scenario.getName());
		LoggerLoad.info("Logging for "+scenario.getName());
		Allure.addAttachment("info", "Logging for "+scenario.getName());
	}
	@AfterStep
	public void afterstep(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			LoggerLoad.error("Steps Failed, Taking Screenshot");
			
		// For allure reports
			TakesScreenshot screenshotTaker = (TakesScreenshot) testContext.base.getDriver();
			final byte[] screenshot = screenshotTaker.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Step Failure screenshot");
			Allure.addAttachment("Step Failure Screenshot", new ByteArrayInputStream(screenshot));
		// Extent reports or saving file
			File screenshotFile = screenshotTaker.getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(screenshotFile);
			scenario.attach(fileContent, "image/png", "screenshot");
		}
	}
	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("is scenario failed: "+ scenario.isFailed());
		scenario.log("Quiting Driver for "+scenario.getName()+"........ ");
		LoggerLoad.info("Quiting Driver for "+scenario.getName()+"........ ");
		Allure.addAttachment("info","Quiting Driver for "+scenario.getName()+"........ ");
		if(scenario.isFailed()) {
			scenario.log("Scenario: "+ scenario.getName()+" is failed");
			LoggerLoad.error("Scenario: "+ scenario.getName()+" is failed");
			Allure.addAttachment("Failed Scenario","Scenario: "+ scenario.getName()+" is failed");
		}
		//this.testContext.base.getDriver().quit();
		this.testContext.clear();
	}
}
