@PremiumHomePageUserThird
Feature: Homepage Challenge Button Functionality

  Background: User is logged into the app
    Given User is on Launch Page
    When User enters valid login credetnial for "premiumUser"

  @TC_01
  Scenario: Verify the navigation of the Challenge button
    Given User is in home page
    When User clicks Challenge button
    Then User should get pop window

  @TC_02
  Scenario: Verify the title of the popup
    Given User is in home page
    When User clicks Challenge button
    Then User should see title "Choose Your Challenge"Choose Your Challenge

  @TC_03
  Scenario: Verify the subtext in the popup
    Given User is in home page
    When User clicks Challenge button
    Then user should see sub text "Select a program that best fits your health goals"

  @TC_04
  Scenario: Verify the presence of Ten Day challenge option button
    Given User is in home page
    When User clicks Challenge button
    Then User should see Ten Day challenge option

  @TC_05
  Scenario: Verify the presence of Four Week challenge option button
    Given User is in home page
    When User clicks Challenge button
    Then User should see Four Week challenge option

  @TC_06
  Scenario: Verify the first option text
    Given User is in home page
    When User clicks Challenge button
    Then User should see "10-Day Challenge Postprandial Blood Glucose Reduction"  as first option

  @TC_07
  Scenario: Verify the second option text
    Given User is in home page
    When User clicks Challenge button
    Then User should see "4-Week Program Blood Sugar Reduction Plan"  as second option
