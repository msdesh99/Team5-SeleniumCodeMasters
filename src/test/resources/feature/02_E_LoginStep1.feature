Feature: Onboarding Form Validation


#Scenario: Verify presence of text field on PDF upload page
    #
    #When User clicks Onboarding button on PDF upload page for Step1 
    #Then User should see text field for Age, height, weight on PDF upload page
#
  #Scenario: Verify presence of dropdown on PDF upload page
    #
    #When User clicks Onboarding button on PDF upload page for dropdown
    #Then User should see dropdown option for Gender field on PDF upload page
#
  #Scenario: Verify dropdown text for gender on PDF upload page
   #
    #When User clicks Onboarding button on PDF upload page for gender validation
    #Then User should see "Male, female, prefer not to say" options in dropdown on PDF upload page
#
  #Scenario: Verify presence of continue button on PDF upload page
    #
    #When User clicks Onboarding button on PDF upload page for step 2
    #Then User should see enabled "Continue" button on PDF upload page

  Scenario: Verify navigation for step 1 onboarding on PDF upload page   
    When User clicks Onboarding button on PDF upload page to move step 2
    Then User should move to step 2 on PDF upload page

  #Scenario: Validate error message for invalid input on PDF upload page
    #
    #When User clicks Onboarding button on PDF upload page for invalid 
    #Then User should receive error message if form has invalid values on PDF upload page
#
  #Scenario: Verify progress bar is visible on PDF upload page
   #
    #When User clicks Onboarding button on PDF upload page for progress bar 
    #Then Progress bar should be visible on PDF upload page
#
  #Scenario: Verify progress shows 1 of 5 steps on PDF upload page
    #
    #When User clicks Onboarding button on PDF upload page to read steps
    #Then Progress text should read "Step 1 of 5" on PDF upload page
#
  #Scenario: Verify step 1 progress is highlighted on PDF upload page
   #
    #When User clicks Onboarding button on PDF upload page for step 1 indicator
    #Then Step 1 indicator should be highlighted on PDF upload page
#
  #Scenario: Verify incomplete steps (2-5) are not highlighted on PDF upload page
    #
    #When User clicks Onboarding button on PDF upload page for uncheck unhighlighted steps
    #Then Steps 2 to 5 should remain unhighlighted or inactive on PDF upload page
