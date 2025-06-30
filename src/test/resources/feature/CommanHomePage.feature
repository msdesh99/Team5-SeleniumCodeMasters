@CommanHomePage
Feature: Home Page Validation for Registered free user

  Background: User is in password auth page
    Given User click on login button of Launch Page
    When User enters userid "Team05@gmail.com" and password "Usanumpy@2024"

  @ChomePage1
  Scenario: Verify app name in free user home page
    Then User should see SweetBalance text  on the left side of the free user page.

  @ChomePage2
  Scenario: Verify user name in free user home page
    Then User should see name displayed at the top-right corner of the  free user home page.

  @ChomePage3
  Scenario: Verify the presence of logout link free user home page
    Then User should see Logout link in the top-right corner of free user page

  @ChomePage4
  Scenario: Verify order of text in navigation bar for free user
    Then User should see the navigation bar displaying items in the order: Home,Dashboard,Education for free user

  @ChomePage5
  Scenario: Verify the text "Current status" in home page	of free user
    Then User should see "Current Status" section heading on the home page of free user

  @ChomePage6
  Scenario: Verify the text "Last updated " in home page
    Then User should see "Last updated" label below Current Status.

  @ChomePage7
  Scenario: Verify Latest HbA1C label is visible for free user
    Then User should see "Latest HbA1C" first label for free user

  @ChomePage8
  Scenario: Verify BMI label is visible	for free user
    Then User should see "BMI" second label for free user

  @ChomePage9
  Scenario: Verify Average Blood Sugar  label is visible for free user
    Then User should see "Average Blood Sugar" third label for free user

  @ChomePage10
  Scenario: Verify the time for last update in home page for free user
    Then User should see timestamp displayed next to the "Last updated" label for free user
