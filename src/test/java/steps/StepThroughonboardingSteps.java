package steps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpage;
import pages.PdFfileUploadPage;
import pages.StepthroughonboardingPage;
import utils.SoftAssertUtils;
import utils.TestContext;

public class StepThroughonboardingSteps {
	TestContext testContext;
    WebDriver driver;
    PdFfileUploadPage pdfuploadpage;
    Loginpage loginpage;
    StepthroughonboardingPage stepthroughonboardingpage;;

    SoftAssertUtils softAssertUtils;

    public StepThroughonboardingSteps(TestContext testContext) {
        this.testContext = testContext;
        this.driver = this.testContext.base.getDriver();
        this.pdfuploadpage = this.testContext.pageObjectManager.getPdFfileUploadPage();
        this.loginpage = this.testContext.pageObjectManager.getLoginpage();
        this.stepthroughonboardingpage = this.testContext.pageObjectManager.getstepthroughonboarding();
        this.softAssertUtils = new SoftAssertUtils();
    }      
    

@When("User clicks on step forstepthroughonboarding")
public void user_clicks_on_step_forstepthroughonboarding() {
	loginpage.clickonloginbtn();
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(16); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(16));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(16));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(16));
    loginpage.enterPasswordname(singleRow.get("Password"));  
    loginpage.checkTermscondition();
    loginpage.waitUntilCreateAccountButtonEnabled(); 
    loginpage.clickoncreateNewAcc();
    stepthroughonboardingpage.clickonStepthroughOnboarding();
    stepthroughonboardingpage.clickOptionOnStep1();
    stepthroughonboardingpage.selectgender();
    stepthroughonboardingpage.selectOption();
    stepthroughonboardingpage.selectOption1();
    stepthroughonboardingpage.selectOption2();
    stepthroughonboardingpage.clickOneDietaryPrefOption();
    stepthroughonboardingpage.clickOnecusionOption();
    stepthroughonboardingpage.clickAllergiesOption();
    stepthroughonboardingpage.clickDairyCheckbox();
    stepthroughonboardingpage.clickcontinuetostepbtn();
    stepthroughonboardingpage.clickmedicationCheckbox();
    stepthroughonboardingpage.clickcontinuetostepbtn();
    stepthroughonboardingpage.selectFirstExerciseOption();
    stepthroughonboardingpage.enterH1bacValue("5");
    stepthroughonboardingpage.clickoncontinue();
        
    
}

@Then("User should see options labeled {string} on Blood report page")
public void user_should_see_options_labeled_on_blood_report_page(String string) {
//    Assert.assertTrue(stepthroughonboardingpage.isDisplayedSubscriptionPage);
}


}
