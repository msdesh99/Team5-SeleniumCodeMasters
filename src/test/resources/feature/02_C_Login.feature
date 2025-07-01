Feature: Profile form verification
Background: 
Given User clicks continue with email button after entering a valid new email for new account user

Scenario: Verify Create Account button is enabled after valid input on Login Page
    Given User is on complete profile form page for new account user
    When User checks the Terms & conditions box after filling all fields for new account user
    Then "Create Account" button should be enabled for new account user

  Scenario: Verify Create account form with valid data on Login Page
    Given User is on complete profile form page for new account user
    When User clicks create account button after filling valid data in all fields for new account user on login Page
    Then User should be redirected to upload blood report for new account user

  Scenario: Verify Create account form with invalid data on Login Page
    Given User is on complete profile form page for new account user
    When User clicks create account button after filling invalid data for new account user
    Then User should see error message for new account user

  Scenario: Verify presence of Step Through Onboarding button on Login Page
    Given User is on complete profile form page for new account user
    When User clicks create account button after filling valid data in all fields for new account user on login Page1
    Then User should see Step Through Onboarding button or new account user

  Scenario: Verify presence of Upload Blood Report button on Login Page
    Given User is on complete profile form page for new account user
    When User clicks create account button after filling valid data in all fields for new account user on login Page of blood report modal
    Then User should see Upload Blood Report modal for new account user
    