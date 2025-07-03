package steps;

import utils.TestContext;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DiabetesRiskAnalyzer;
import utils.LoggerLoad;
//import pages.Launchgpage1;
import utils.SoftAssertUtils;
import utils.TestContext;


public class DiabetesriskAnalyzerSteps {
	
TestContext testContext;
WebDriver driver;
SoftAssertUtils softAssertUtils;
 DiabetesRiskAnalyzer diabetesriskanalyzerObj;
public DiabetesriskAnalyzerSteps(TestContext testContext) {
this.testContext = testContext;
this.driver = this.testContext.base.getDriver();
this.diabetesriskanalyzerObj = this.testContext.pageObjectManager.getDiabetesRiskAnalyzer();
}


@Given("User is on SweetBalance homepage")
public void user_is_on_launch_page() {
	LoggerLoad.info("User is on the Log-in page");
}
//When("User clicks "{String}" button")
 //public void User clicks "Check Your Risk" button
@Then("User should see {string} header")
public void user_should_see_header(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}





	
}
