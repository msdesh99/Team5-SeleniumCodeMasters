package steps;

import java.util.Arrays;
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
import utils.CommonMethods;
import utils.SoftAssertUtils;
import utils.TestContext;

public class PdfuploadSteps {

    TestContext testContext;
    WebDriver driver;
    PdFfileUploadPage pdfuploadpage;
    Loginpage loginpage;

    SoftAssertUtils softAssertUtils;

    public PdfuploadSteps(TestContext testContext) {
        this.testContext = testContext;
        this.driver = this.testContext.base.getDriver();
        this.pdfuploadpage = this.testContext.pageObjectManager.getPdFfileUploadPage();
        this.loginpage = this.testContext.pageObjectManager.getLoginpage();
        this.softAssertUtils = new SoftAssertUtils();
    }      
       

        @Given("User is on blood report modal")
        public void user_is_on_blood_report_modal() {
        	loginpage.clickonloginbtn();
        	List<String>emailList= loginpage.getEmailId();
            String email = emailList.get(9); 
            loginpage.enterEmailid(email);
            loginpage.clickSubmitbtn();

            Map<String, List<String>> allData = loginpage.getCreateFormData();
            Map<String, String> singleRow = new HashMap<>();
            
            singleRow.put("FullName", allData.get("FullName").get(9));
            loginpage.enterFullname(singleRow.get("FullName"));  

            singleRow.put("Username", allData.get("Username").get(9));
            loginpage.enterUsername(singleRow.get("Username"));  

            singleRow.put("Password", allData.get("Password").get(9));
            loginpage.enterPasswordname(singleRow.get("Password"));  
            loginpage.checkTermscondition();
            loginpage.waitUntilCreateAccountButtonEnabled(); 
            loginpage.clickoncreateNewAcc();
       		
        	loginpage.clickonPdfbtn();
        }

        @When("User hovers over the upload box on PDF upload Page")
        public void user_hovers_over_the_upload_box_on_pdf_upload_page() {
        	pdfuploadpage.user_hovers_over_upload_box();
            
        }

        @Then("Upload box should show drag & drop interaction on PDF upload Page")
        public void upload_box_should_show_drag_drop_interaction_on_pdf_upload_page() {
        	Assert.assertTrue(pdfuploadpage.upload_box_should_show_drag_drop_interaction());
        }

        @When("User tries to upload a non-PDF file")
        public void user_tries_to_upload_a_non_pdf_file() {
        	loginpage.clickonloginbtn();
        	List<String>emailList= loginpage.getEmailId();
            String email = emailList.get(10); 
            loginpage.enterEmailid(email);
            loginpage.clickSubmitbtn();

            Map<String, List<String>> allData = loginpage.getCreateFormData();
            Map<String, String> singleRow = new HashMap<>();
            
            singleRow.put("FullName", allData.get("FullName").get(10));
            loginpage.enterFullname(singleRow.get("FullName"));  

            singleRow.put("Username", allData.get("Username").get(10));
            loginpage.enterUsername(singleRow.get("Username"));  

            singleRow.put("Password", allData.get("Password").get(10));
            loginpage.enterPasswordname(singleRow.get("Password"));  
            loginpage.checkTermscondition();
            loginpage.waitUntilCreateAccountButtonEnabled(); 
            loginpage.clickoncreateNewAcc();
            loginpage.clickonPdfbtn();
       		
        	pdfuploadpage.uploadnonPDffile();
        }

        @Then("User should see {string} error on PDF upload Page")
        public void user_should_see_error_on_pdf_upload_page(String string) {
        	Assert.assertTrue(pdfuploadpage.errrorMsgdiaplyed(), "Expected error message did not appear.");
   
        }

        @When("User uploads a PDF file over 10MB on PDF upload Page")
        public void user_uploads_a_pdf_file_over_10mb_on_pdf_upload_page() {
        	loginpage.clickonloginbtn();
        	List<String>emailList= loginpage.getEmailId();
            String email = emailList.get(11); 
            loginpage.enterEmailid(email);
            loginpage.clickSubmitbtn();

            Map<String, List<String>> allData = loginpage.getCreateFormData();
            Map<String, String> singleRow = new HashMap<>();
            
            singleRow.put("FullName", allData.get("FullName").get(11));
            loginpage.enterFullname(singleRow.get("FullName"));  

            singleRow.put("Username", allData.get("Username").get(11));
            loginpage.enterUsername(singleRow.get("Username"));  

            singleRow.put("Password", allData.get("Password").get(11));
            loginpage.enterPasswordname(singleRow.get("Password"));  
            loginpage.checkTermscondition();
            loginpage.waitUntilCreateAccountButtonEnabled(); 
            loginpage.clickoncreateNewAcc();
            loginpage.clickonPdfbtn();
       		
        	pdfuploadpage.uploafile10MBnPDffile();
        
        	
            
        }
        @Then("User should see {string} error on PDF upload Page of Blood Report")
        public void user_should_see_error_on_pdf_upload_page_of_blood_report(String string) {
        	Assert.assertTrue(pdfuploadpage.errrorMsgdiaplyed(), "Expected error message did not appear.");

        }


        @When("User uploads valid PDF file")
        public void user_uploads_valid_pdf_file() {
        	loginpage.clickonloginbtn();
        	List<String>emailList= loginpage.getEmailId();
            String email = emailList.get(12); 
            loginpage.enterEmailid(email);
            loginpage.clickSubmitbtn();

            Map<String, List<String>> allData = loginpage.getCreateFormData();
            Map<String, String> singleRow = new HashMap<>();
            
            singleRow.put("FullName", allData.get("FullName").get(12));
            loginpage.enterFullname(singleRow.get("FullName"));  

            singleRow.put("Username", allData.get("Username").get(12));
            loginpage.enterUsername(singleRow.get("Username"));  

            singleRow.put("Password", allData.get("Password").get(12));
            loginpage.enterPasswordname(singleRow.get("Password"));  
            loginpage.checkTermscondition();
            loginpage.waitUntilCreateAccountButtonEnabled(); 
            loginpage.clickoncreateNewAcc();
            loginpage.clickonPdfbtn();
            pdfuploadpage.uploafile1validnPDffile();
            
        }

        @Then("Upload should see processing percentage bar on PDF upload Page")
        public void upload_should_see_processing_percentage_bar_on_pdf_upload_page() {
        	Assert.assertTrue(pdfuploadpage.isUploadBtnEnabled());
        }

        @When("User uploads valid PDF file on PDF upload Page")
        public void user_uploads_valid_pdf_file_on_pdf_upload_page() {
        	loginpage.clickonloginbtn();
        	List<String>emailList= loginpage.getEmailId();
            String email = emailList.get(13); 
            loginpage.enterEmailid(email);
            loginpage.clickSubmitbtn();

            Map<String, List<String>> allData = loginpage.getCreateFormData();
            Map<String, String> singleRow = new HashMap<>();
            
            singleRow.put("FullName", allData.get("FullName").get(13));
            loginpage.enterFullname(singleRow.get("FullName"));  

            singleRow.put("Username", allData.get("Username").get(13));
            loginpage.enterUsername(singleRow.get("Username"));  

            singleRow.put("Password", allData.get("Password").get(13));
            loginpage.enterPasswordname(singleRow.get("Password"));  
            loginpage.checkTermscondition();
            loginpage.waitUntilCreateAccountButtonEnabled(); 
            loginpage.clickoncreateNewAcc();
            loginpage.clickonPdfbtn();
            pdfuploadpage.uploafile1validnPDffile();

        }

        @Then("{string} button should be enabled on PDF upload Page")
        public void button_should_be_enabled_on_pdf_upload_page(String string) {
        	Assert.assertTrue(pdfuploadpage.isUploadBtnEnabled());
        }

        @When("User clicks {string} on PDF upload Page")
        public void user_clicks_on_pdf_upload_page(String string) {
        	loginpage.clickonloginbtn();
        	List<String>emailList= loginpage.getEmailId();
            String email = emailList.get(14); 
            loginpage.enterEmailid(email);
            loginpage.clickSubmitbtn();

            Map<String, List<String>> allData = loginpage.getCreateFormData();
            Map<String, String> singleRow = new HashMap<>();
            
            singleRow.put("FullName", allData.get("FullName").get(14));
            loginpage.enterFullname(singleRow.get("FullName"));  

            singleRow.put("Username", allData.get("Username").get(14));
            loginpage.enterUsername(singleRow.get("Username"));  

            singleRow.put("Password", allData.get("Password").get(14));
            loginpage.enterPasswordname(singleRow.get("Password"));  
            loginpage.checkTermscondition();
            loginpage.waitUntilCreateAccountButtonEnabled(); 
            loginpage.clickoncreateNewAcc();
            loginpage.clickonPdfbtn();
            pdfuploadpage.clickoncancelbtn();
            
        }

        @Then("Modal should be closed and user returned to previous screen on PDF upload Page")
        public void modal_should_be_closed_and_user_returned_to_previous_screen_on_pdf_upload_page() {
        	Assert.assertTrue(loginpage.isBloodreportPageDisplayed());
        }

        @When("User clicks {string} after uploading valid file on PDF upload Page")
        public void user_clicks_after_uploading_valid_file_on_pdf_upload_page(String string) {
        	loginpage.clickonloginbtn();
        	List<String>emailList= loginpage.getEmailId();
            String email = emailList.get(15); 
            loginpage.enterEmailid(email);
            loginpage.clickSubmitbtn();

            Map<String, List<String>> allData = loginpage.getCreateFormData();
            Map<String, String> singleRow = new HashMap<>();
            
            singleRow.put("FullName", allData.get("FullName").get(15));
            loginpage.enterFullname(singleRow.get("FullName"));  

            singleRow.put("Username", allData.get("Username").get(15));
            loginpage.enterUsername(singleRow.get("Username"));  

            singleRow.put("Password", allData.get("Password").get(15));
            loginpage.enterPasswordname(singleRow.get("Password"));  
            loginpage.checkTermscondition();
            loginpage.waitUntilCreateAccountButtonEnabled(); 
            loginpage.clickoncreateNewAcc();
            loginpage.clickonPdfbtn();
            pdfuploadpage.uploafile1validnPDffile();
            pdfuploadpage.clickonuploadBtn();
            
        }

        @Then("User should see Report analysis on PDF upload Page")
        public void user_should_see_report_analysis_on_pdf_upload_page() {
        	Assert.assertTrue(pdfuploadpage.waitForReportAnalysisPage());     	      	
        	Assert.assertTrue(pdfuploadpage.iscontinueOnboardingBtndisplayed());
        }

        @Then("User should see onboarding button on PDF upload Page")
        public void user_should_see_onboarding_button_on_pdf_upload_page() {
            
        }
        @When("User clicks {string} after uploading valid file on PDF upload Page for data")
        public void user_clicks_after_uploading_valid_file_on_pdf_upload_page_for_data(String string) {
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
            loginpage.clickonPdfbtn();
            pdfuploadpage.uploafile1validnPDffile();
            pdfuploadpage.clickonuploadBtn();
            pdfuploadpage.waitForReportAnalysisPage();
        }

        @Then("User should see Blood Test Results, Complete Blood Count, Medical Conditions, Abnormal Values, Recommendations on PDF upload Page")
        public void user_should_see_blood_test_results_complete_blood_count_medical_conditions_abnormal_values_recommendations_on_pdf_upload_page() {
        	Assert.assertTrue(
                    pdfuploadpage.isbloodReportsectionDisplayed(),
                    "Blood report sections are not displayed on the page!"
                );
			    
        	
        }
//-----------------------------Step1--------------------------
      
        @When("User clicks Onboarding button on PDF upload page for Step1")
        public void user_clicks_onboarding_button_on_pdf_upload_page_for_step1() {
        	loginpage.clickonloginbtn();
        	List<String>emailList= loginpage.getEmailId();
            String email = emailList.get(17); 
            loginpage.enterEmailid(email);
            loginpage.clickSubmitbtn();

            Map<String, List<String>> allData = loginpage.getCreateFormData();
            Map<String, String> singleRow = new HashMap<>();
            
            singleRow.put("FullName", allData.get("FullName").get(17));
            loginpage.enterFullname(singleRow.get("FullName"));  

            singleRow.put("Username", allData.get("Username").get(17));
            loginpage.enterUsername(singleRow.get("Username"));  

            singleRow.put("Password", allData.get("Password").get(17));
            loginpage.enterPasswordname(singleRow.get("Password"));  
            loginpage.checkTermscondition();
            loginpage.waitUntilCreateAccountButtonEnabled(); 
            loginpage.clickoncreateNewAcc();
            loginpage.clickonPdfbtn();
            pdfuploadpage.uploafile1validnPDffile();
            pdfuploadpage.clickonuploadBtn();
            pdfuploadpage.waitForReportAnalysisPage();
            pdfuploadpage.clickcontinuetostep1page();
        }

        @Then("User should see text field for Age, height, weight on PDF upload page")
        public void user_should_see_text_field_for_age_height_weight_on_pdf_upload_page() {
        	Assert.assertTrue(pdfuploadpage.isheightlocatorDisplyed());
        }

        @When("User clicks Onboarding button on PDF upload page for dropdown")
        public void user_clicks_onboarding_button_on_pdf_upload_page_for_dropdown() {
        	loginpage.clickonloginbtn();
        	List<String>emailList= loginpage.getEmailId();
            String email = emailList.get(17); 
            loginpage.enterEmailid(email);
            loginpage.clickSubmitbtn();

            Map<String, List<String>> allData = loginpage.getCreateFormData();
            Map<String, String> singleRow = new HashMap<>();
            
            singleRow.put("FullName", allData.get("FullName").get(17));
            loginpage.enterFullname(singleRow.get("FullName"));  

            singleRow.put("Username", allData.get("Username").get(17));
            loginpage.enterUsername(singleRow.get("Username"));  

            singleRow.put("Password", allData.get("Password").get(17));
            loginpage.enterPasswordname(singleRow.get("Password"));  
            loginpage.checkTermscondition();
            loginpage.waitUntilCreateAccountButtonEnabled(); 
            loginpage.clickoncreateNewAcc();
            loginpage.clickonPdfbtn();
            pdfuploadpage.uploafile1validnPDffile();
            pdfuploadpage.clickonuploadBtn();
            pdfuploadpage.waitForReportAnalysisPage();
            pdfuploadpage.clickcontinuetostep1page();
        }

        @Then("User should see dropdown option for Gender field on PDF upload page")
        public void user_should_see_dropdown_option_for_gender_field_on_pdf_upload_page() {
        	Assert.assertTrue(pdfuploadpage.isgendernameisdisplayed());
        }

        @When("User clicks Onboarding button on PDF upload page for gender validation")
        public void user_clicks_onboarding_button_on_pdf_upload_page_for_gender_validation() {
        	loginpage.clickonloginbtn();
        	List<String>emailList= loginpage.getEmailId();
            String email = emailList.get(17); 
            loginpage.enterEmailid(email);
            loginpage.clickSubmitbtn();

            Map<String, List<String>> allData = loginpage.getCreateFormData();
            Map<String, String> singleRow = new HashMap<>();
            
            singleRow.put("FullName", allData.get("FullName").get(17));
            loginpage.enterFullname(singleRow.get("FullName"));  

            singleRow.put("Username", allData.get("Username").get(17));
            loginpage.enterUsername(singleRow.get("Username"));  

            singleRow.put("Password", allData.get("Password").get(17));
            loginpage.enterPasswordname(singleRow.get("Password"));  
            loginpage.checkTermscondition();
            loginpage.waitUntilCreateAccountButtonEnabled(); 
            loginpage.clickoncreateNewAcc();
            loginpage.clickonPdfbtn();
            pdfuploadpage.uploafile1validnPDffile();
            pdfuploadpage.clickonuploadBtn();
            pdfuploadpage.waitForReportAnalysisPage();
            pdfuploadpage.clickcontinuetostep1page();
        }

        @Then("User should see {string} options in dropdown on PDF upload page")
        public void user_should_see_options_in_dropdown_on_pdf_upload_page(String string) {
        	Assert.assertTrue(pdfuploadpage.isGenderDropdownEnabled());
            
        }

        @When("User clicks Onboarding button on PDF upload page for step {int}")
        public void user_clicks_onboarding_button_on_pdf_upload_page_for_step(Integer int1) {
        	loginpage.clickonloginbtn();
        	List<String>emailList= loginpage.getEmailId();
            String email = emailList.get(17); 
            loginpage.enterEmailid(email);
            loginpage.clickSubmitbtn();

            Map<String, List<String>> allData = loginpage.getCreateFormData();
            Map<String, String> singleRow = new HashMap<>();
            
            singleRow.put("FullName", allData.get("FullName").get(17));
            loginpage.enterFullname(singleRow.get("FullName"));  

            singleRow.put("Username", allData.get("Username").get(17));
            loginpage.enterUsername(singleRow.get("Username"));  

            singleRow.put("Password", allData.get("Password").get(17));
            loginpage.enterPasswordname(singleRow.get("Password"));  
            loginpage.checkTermscondition();
            loginpage.waitUntilCreateAccountButtonEnabled(); 
            
        }

        @Then("User should see enabled {string} button on PDF upload page")
        public void user_should_see_enabled_button_on_pdf_upload_page(String string) {
        	Assert.assertTrue(pdfuploadpage.isContinueBtnEnabled());
        }

        @When("User clicks Onboarding button on PDF upload page to move step {int}")
        public void user_clicks_onboarding_button_on_pdf_upload_page_to_move_step(Integer int1) throws InterruptedException {
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
            loginpage.clickonPdfbtn();
            pdfuploadpage.uploafile1validnPDffile();
            pdfuploadpage.clickonuploadBtn();
            pdfuploadpage.waitForReportAnalysisPage();
            pdfuploadpage.clickcontinuetostep1page();
            pdfuploadpage.enterHeightAndWeight(120, 55); 
//            pdfuploadpage.clicksteponepage();
//            pdfuploadpage.selectExerciseIntensity("Easy");
//            pdfuploadpage.selectDietaryPreference("vegan");
//            pdfuploadpage.selectCuisineOption("Indian");
//            pdfuploadpage.selectAllergy("Nuts");
//            pdfuploadpage.clickallsubmitform();
        }

        @Then("User should move to step {int} on PDF upload page")
        public void user_should_move_to_step_on_pdf_upload_page(Integer int1) {
            
        }

       

    }

