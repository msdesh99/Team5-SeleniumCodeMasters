package runner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import configs.BrowserConfig;

@CucumberOptions(		
         //tags=("@mealsection"),
        glue= {"steps"},
		features= {"src/test/resources/feature/"},	
		plugin= {"pretty",
				"html:target/cucumber-reports/cucumberReport.html",
				"json:target/cucumber-reports/cucumberReport.json",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"rerun:rerun/failed-scenarios.txt"
				},
		dryRun=false,
		monochrome=false,
		publish=false
		)

public class TestRunner extends AbstractTestNGCucumberTests{

@Override
@DataProvider(parallel=false)
public Object[][] scenarios() {
	return super.scenarios();
}
	
@BeforeTest
@Parameters({"browser"})
public void setBrowser(@Optional("chrome")String browser) {
	BrowserConfig.setBrowserType(browser); 
}
}
