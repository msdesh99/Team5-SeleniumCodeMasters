package runner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;
import configs.BrowserConfig;
import org.testng.annotations.BeforeTest;
@CucumberOptions(		
		glue= {"steps"},
		features={"@rerun/failed-scenarios.txt"},

		plugin= {"pretty",
				"html:target/cucumber-reports/FailedScenario-Rerun-CucumberReport.html",
				"json:target/cucumber-reports/FailedScenarios-Rerun-CucumberReport.json",
				},
		dryRun=false,
		monochrome=false,
		publish=false
		)

public class FailedTestRunner extends AbstractTestNGCucumberTests{

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

