@CommanHomePage
Feature: Home Page Validation for Registered free user

  Background: User is Logged into the app for Free User
	Given  User is on Launch Page 
	When User enters valid login credetnial for "freeUser" 
  
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

  @ChomePage11
  Scenario: Verify HbA1C value is visible for free user
    Then User should see Latest HbA1C value for free user

  @ChomePage12
  Scenario: Verify BMI value is visible for free user
    Then User should see BMI value for free user

  @ChomePage13
  Scenario: Verify Average Blood Sugar is visible for free user
    Then User should see Average Blood Sugar value for free user

  @ChomePage14
  Scenario: Verify title in flex container for free user
    Then User should see "Today's Meal Plan" title for free user

  @ChomePage15
  Scenario: Verify "Today’s Meal Plan" section is visible	for free user
    Then User should see tabs: Breakfast, Lunch, Dinner, Snacks for free user

  @ChomePage16
  Scenario: Verify the presence of side tab in flex container for free user
    Then User should see sidebar tab container within the flex layout for free user

  @ChomePage17
  Scenario Outline: Verify the text "<label>" in flex container for free user
  Then User should see "<label>" label in the sidebar section for free user

    Examples: 
      | label     |
      | Meal Plan |
      | Exercise  |

  @ChomePage18
  Scenario: Verify View Full Plan button is visible for free user
   Then User should see "View Full Plan" button in the Meal Plan section for free user

  @ChomePage19
  Scenario: Verify the symbol utensil cross in "Meal plan" 	for free user
   Then User should see utensil icon (crossed fork and knife) in the Meal Plan tab for free user

  @ChomePage20
  Scenario: Verify the symbol dumbbell in  "Exercise" for free user
   Then User should see dumbbell icon in the Exercise tab for free user
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
