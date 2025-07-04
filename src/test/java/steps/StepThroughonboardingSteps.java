package steps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
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
    String email = emailList.get(21); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(21));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(21));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(21));
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
	Assert.assertTrue(stepthroughonboardingpage.isDisplayedSubscriptionPage());
}

@When("User clicks on step for onboarding button on Blood report page")
public void user_clicks_on_step_for_onboarding_button_on_blood_report_page() {
	loginpage.clickonloginbtn();
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(22); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(22));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(22));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(22));
    loginpage.enterPasswordname(singleRow.get("Password"));  
    loginpage.checkTermscondition();
    loginpage.waitUntilCreateAccountButtonEnabled(); 
    loginpage.clickoncreateNewAcc();
    stepthroughonboardingpage.clickonStepthroughOnboarding();
}

@Then("User should navigate to onboarding Step {int} on Blood report page")
public void user_should_navigate_to_onboarding_step_on_blood_report_page(Integer int1) {
	String expectedUrl = "https://your-app-url.com/onboarding/step-" ;
    String actualUrl = stepthroughonboardingpage.verifyUserIsOnOnboardingPage();
    
    Assert.assertEquals(
        actualUrl,
        expectedUrl,
        "User is not redirected to the onboarding page!"
    
);
}
@When("User clicks on step for onboarding button on step1heading")
public void user_clicks_on_step_for_onboarding_button_on_step1heading() {
	loginpage.clickonloginbtn();
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(23); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(23));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(23));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(23));
    loginpage.enterPasswordname(singleRow.get("Password"));  
    loginpage.checkTermscondition();
    loginpage.waitUntilCreateAccountButtonEnabled(); 
    loginpage.clickoncreateNewAcc();
    stepthroughonboardingpage.clickonStepthroughOnboarding();
}

@Then("Page should display title {string} on Blood report page")
public void page_should_display_title_on_blood_report_page(String string) {
	stepthroughonboardingpage.headingofStepboardisdisplayed();
}

@When("User clicks on step for onboarding button onon step2heading")
public void user_clicks_on_step_for_onboarding_button_onon_step2heading() {
	loginpage.clickonloginbtn();
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(24); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(24));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(24));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(24));
    loginpage.enterPasswordname(singleRow.get("Password"));  
    loginpage.checkTermscondition();
    loginpage.waitUntilCreateAccountButtonEnabled(); 
    loginpage.clickoncreateNewAcc();
    stepthroughonboardingpage.clickonStepthroughOnboarding();
}

@Then("Page should have sub text {string} on Blood report page")
public void page_should_have_sub_text_on_blood_report_page(String string) {
	stepthroughonboardingpage.subheadingofStepboardisdisplayed();
}

@When("User clicks on step for onboarding button on step throughonboarding")
public void user_clicks_on_step_for_onboarding_button_on_step_throughonboarding() {
	loginpage.clickonloginbtn();
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(25); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(25));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(25));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(25));
    loginpage.enterPasswordname(singleRow.get("Password"));  
    loginpage.checkTermscondition();
    loginpage.waitUntilCreateAccountButtonEnabled(); 
    loginpage.clickoncreateNewAcc();
    stepthroughonboardingpage.clickonStepthroughOnboarding();
}

@Then("Progress bar should visually indicate {string} on step throughonboarding")
public void progress_bar_should_visually_indicate_on_step_throughonboarding(String string) {
	stepthroughonboardingpage.progressbarofStepboardisdisplayed();
}

@When("User clicks on step for onboarding button on step throughonboardingProgrss1")
public void user_clicks_on_step_for_onboarding_button_on_step_throughonboarding_progrss1() {
	loginpage.clickonloginbtn();
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(26); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(26));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(26));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(26));
    loginpage.enterPasswordname(singleRow.get("Password"));  
    loginpage.checkTermscondition();
    loginpage.waitUntilCreateAccountButtonEnabled(); 
    loginpage.clickoncreateNewAcc();
    stepthroughonboardingpage.clickonStepthroughOnboarding();
}

@Then("Step {int} indicator should be highlighted on Blood report page on stepthroughonborading")
public void step_indicator_should_be_highlighted_on_blood_report_page_on_stepthroughonborading(Integer int1) {
	stepthroughonboardingpage.progressbarofStepboardisdisplayed();

}
@Given("User is on stepthroughonbardingpage for upgrading the page")
public void user_is_on_stepthroughonbardingpage_for_upgrading_the_page() {
	loginpage.clickonloginbtn();
	
}

@When("User clicks the {string} button with valid payment details")
public void user_clicks_the_button_with_valid_payment_details(String string) {
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(27); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(27));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(27));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(27));
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
    stepthroughonboardingpage.isDisplayedSubscriptionPage();
    stepthroughonboardingpage.clickpremiumuser();
    stepthroughonboardingpage.enterCreditCardDetails("4242 4242 4242 4242", "06/28", "345");
    stepthroughonboardingpage.clickpremiumupoage();
    stepthroughonboardingpage.clickpremiumhomepage();
}

@Then("User should be redirected to the confirmation or home page with premium access enabled")
public void user_should_be_redirected_to_the_confirmation_or_home_page_with_premium_access_enabled() {
	
	String expectedUrl = "https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/";
    String currentUrl = stepthroughonboardingpage.verifyUserIsOnpremiumpage();

    Assert.assertEquals(
        currentUrl,
        expectedUrl,
        "User is not redirected to the Premium page!");
}
@When("User clicks the free user button with valid payment details")
public void user_clicks_the_free_user_button_with_valid_payment_details() {
	List<String>emailList= loginpage.getEmailId();
    String email = emailList.get(26); 
    loginpage.enterEmailid(email);
    loginpage.clickSubmitbtn();

    Map<String, List<String>> allData = loginpage.getCreateFormData();
    Map<String, String> singleRow = new HashMap<>();
    
    singleRow.put("FullName", allData.get("FullName").get(26));
    loginpage.enterFullname(singleRow.get("FullName"));  

    singleRow.put("Username", allData.get("Username").get(26));
    loginpage.enterUsername(singleRow.get("Username"));  

    singleRow.put("Password", allData.get("Password").get(26));
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
    stepthroughonboardingpage.isDisplayedSubscriptionPage();
    stepthroughonboardingpage.clickfreeUser();
}

@Then("User should be redirected to the free user page frim steponboarding")
public void user_should_be_redirected_to_the_free_user_page_frim_steponboarding() {
	String expectedUrl = "https://sweet-balance-test-env-3-numpyninjadiabe.replit.app/free";
    String currentUrl = stepthroughonboardingpage.validatefrreuserurl();

    Assert.assertEquals(
        currentUrl,
        expectedUrl,
        "User is not redirected to the Premium page!");
}



}


