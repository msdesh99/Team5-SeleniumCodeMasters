Feature: Complete Profile Form validation for new user
Background: 
Given User clicks on "Login" link for UI verfication

Scenario: Verify Full Name field is visible on Login Page
    
    When User clicks continue with email button after entering a valid new email on Login Page
    Then "Full Name" input field should be displayed on Login Page

  Scenario: Verify Username field is visible on Login Page
 
    When User clicks continue with email button after entering a valid new email on Login Page
    Then "Username" input field should be displayed on Login Page usernamefield

  Scenario: Verify Password field is visible on Login Page
   
    When User clicks continue with email button after entering a valid new email on Login Page
    Then "Password" input field should be displayed on Login Page passwordfield

  Scenario: Verify Terms & Conditions checkbox is visible on Login Page
    
    When User clicks continue with email button after entering a valid new email on Login Page
    Then Terms & Conditions checkbox should be displayed on Login Page

  Scenario: Verify Create Account button is disabled initially on Login Page
    
    When User clicks continue with email button after entering a valid new email on Login Page
    Then "Create Account" button should be disabled on Login Page
