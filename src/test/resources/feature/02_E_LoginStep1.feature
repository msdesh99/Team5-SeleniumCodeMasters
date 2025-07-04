Feature: Onboarding Form Validation


Scenario: Verify presence of text field on PDF upload page
    
    When User clicks Onboarding button on PDF upload page for Step1 
    Then User should see text field for Age, height, weight on PDF upload page

  Scenario: Verify presence of dropdown on PDF upload page
    
    When User clicks Onboarding button on PDF upload page for dropdown
    Then User should see dropdown option for Gender field on PDF upload page

  Scenario: Verify dropdown text for gender on PDF upload page
   
    When User clicks Onboarding button on PDF upload page for gender validation
    Then User should see "Male, female, prefer not to say" options in dropdown on PDF upload page

  Scenario: Verify presence of continue button on PDF upload page
    
    When User clicks Onboarding button on PDF upload page for step 2
    Then User should see enabled "Continue" button on PDF upload page

  Scenario: Verify navigation for step 1 onboarding on PDF upload page   
    When User clicks Onboarding button on PDF upload page to move step 2
    Then User should move to step 2 on PDF upload page

 