@PremiumUserHomepage
Feature: Home Page Validation for Registered premium Account User

  Background: User is in password auth page
    Given User click on login button of Launch Page
    #User is in password auth page
    When User enters userid "Teamcoders@gmail.com" and password "Numpy@123"

  #User clicks sign in after entering password
  @TC_01
  Scenario: Verify order of text in navigation bar
    Then User should see the navigation bar displaying items in the order: Home,Logbook,Dashboard,Education

  @TC_02
  Scenario: Verify the presence of animation in challenge yourself button
    Then User should see flashing challenge yourself button

  @TC_03
  Scenario: Verify the duration of animation
    Then Flashes in 0.2s

  @TC_04
  Scenario: Verify the presence of  Challenge yourself today button
    Then User should see a  "Challenge yourself today! " button

  @TC_05
  Scenario: Verify the presence of gender image in the grid
    Then User should see a gender-specific image based on the gender selected during the onboarding process

  @TC_06
  Scenario: Verify the presence of emoji on the top right of gender image
    Then User should see an emoji displayed on the top-right corner of the gender image

  @TC_07
  Scenario: Verify the presence of  label for gender image
    Then User should see label "Mood:" below the gender image

  @TC_08
  Scenario: Verify the presence of log button
    Then User should see log button under gender image

  @TC_09
  Scenario: Verify display mood text based on emoji
    Then User should see mood text based on the emoji

  @TC_10
  Scenario: Verify the presence of Weekly plan button
    Then User should see Week plan button

  @TC_11
  Scenario: Verify the presence of "Record New Data" in the bottom
    Then User should see "Record New Data"text
  