Feature: Functional and non functional test validation for premium account user

  Background: User is logged into the app
    Given User click on login button of Launch Page
    When User enters userid "Teamcoders@gmail.com" and password "Numpy@123"

  #User clicks sign in after entering password
  @TC_01
  Scenario: Verify the presence of "Pre-meal" title in each meal section
    Given User is in home page
    When User clicks meal section
    Then User should see "Pre-Meal" title

  @TC_02
  Scenario: Verify the presence of icon for Pre-meal  in each meal section
    Given User is in home page
    When User clicks meal section
    Then User should see alarm clock icon

  @TC_03
  Scenario: Verify pre-meal title is shown before main meal
    Given User is in home page
    When User clicks meal section
    Then User should see pre-meal in first place of  each meal section

  @TC_04
  Scenario: Verify "None" is displayed for Pre-Meal Snack by default
    Given User is in home page
    When User clicks snack section
    Then User should see Pre-Meal entry displays as "None" by default

  @TC_05
  Scenario: Verify calorie in pre-meal snack
    Given User is in home page
    When User clicks snack section
    Then User should see 0 calorie in pre-meal snack

  @TC_06
  Scenario: Verify the presence of meal title for main meal in snack
    Given User is in home page
    When User clicks snack section
    Then User should see meal title for main-meal in snack

  @TC_07
  Scenario: Verify meal section contains dish description in snack
    Given User is in home page
    When User clicks snack section
    Then User should see description for the dish in snack

  @TC_08
  Scenario: Verify the presence of Sub title "Main-Meal"
    Given User is in home page
    When User clicks meal section
    Then User should see " Main Meal " as sub title

  @TC_09
  Scenario: Verify the presence of icon for main -meal
    Given User is in home page
    When User clicks meal section
    Then User should see utensil icon for each main-meal

  @TC_10
  Scenario: Verify the time format in each main-meal
    Given User is in home page
    When User clicks meal section
    Then User should see  "hh:mm" based time in main-meal (eg : 1:00)

  @TC_11
  Scenario: Validate the indicator for breakfast main-meal
    Given User is in home page
    When User clicks meal section
    Then User should see indicator "AM" for breakfast main-meal

  @TC_12
  Scenario: Validate the indicator for lunch main-meal
    Given User is in home page
    When User clicks meal section
    Then User should see indicator "PM" for lunch  main-meal

  @TC_13
  Scenario: Validate the indicator for dinner main-meal
    Given User is in home page
    When User clicks meal section
    Then UUser should see indicator "PM" for dinner  main-meal

  @TC_14
  Scenario: Validate the indicator for snack main-meal
    Given User is in home page
    When User clicks meal section
    Then User should see indicator "PM" for snack  main-meal

  @TC_15
  Scenario: Verify the time in  main-breakfast
    Given User is in home page
    When User clicks meal section
    Then User should see 7:30 o'clock

  @TC_16
  Scenario: Verify the time in main-lunch
    Given User is in home page
    When User clicks meal section
    Then User should see 12:30 o'clock

  @TC_17
  Scenario: Verify the time in main-dinner
    Given User is in home page
    When User clicks meal section
    Then User should see 6:30 o'clock

  @TC_18
  Scenario: Verify the time in main-snack
    Given User is in home page
    When User clicks meal section
    Then User should see 3:30 o'clock

  @TC_19
  Scenario: Verify calories for main-meal is shown for each meal
    Given User is in home page
    When User clicks meal section
    Then User should see the main-meal calorie value

  @TC_20
  Scenario: Validate the text  " Calorie" in main-meal
    Given User is in home page
    When User clicks meal section
    Then User should see text "calorie" after the calorie value in main meal
