@CommanHomePage_MealSection
Feature: Validation on meal section for free user

  Background: User is in password auth page
    Given User click on login button of Launch Page
    When User enters userid "Team05@gmail.com" and password "Usanumpy@2024"

  @MealSectionClickable
  Scenario Outline: Verify "<meal>" section is clickable to show details for free user
    When User clicks on the "<meal>" section for free user
    Then <meal> details become visible for free user

    Examples: 
      | meal      |
      | Breakfast |
      | Lunch     |
      | Dinner    |
      | Snacks    |

  @MealSection1
  Scenario: Verify meal section contains dish title for free user
    When User clicks on the "<meal>" section for free user
    Then User should see dish title for free user

  @MealSection2
  Scenario: Verify meal section contains dish description	for free user
    Then User should see description for the dish	for free user

  @MealSection3
  Scenario: Verify pre-meal item is shown for each meal for free user
    Then User should see the pre-meal item name for free user

  @MealSection4
  Scenario: Verify calories for pre-meal is shown for each meal for free user
    Then User should see the pre-meal calorie value for free user

  @MealSection5
  Scenario: Verify the time in pre-breakfast for free user
    Then User should see "hh:mm" based time in pre-meal for free user

  @MealSection6
  Scenario: Verify the navigation of "View Full Schedule" button for free user
    When User clicks view full schedule button after reaching exercise section for free user
    Then User should redirected to subscription page for free user

  @MealSection7
  Scenario: Verify Carbs bar color for each meal for free user
    Then User should see green color for Carbs for free user

  @MealSection9
  Scenario: Verify Fat bar color for free user
    Then User should see purple color for Fat for free user

  @MealSection10
  Scenario: Verify Fat bar color for free user
    Then User should see pink color for Protein for free user

  @MealSection11
  Scenario: Verify unit of measurement for Carbs is in grams for free user
    Then It should display the unit as "g" for free user for free user

  @MealSection12
  Scenario: Verify unit of measurement for Protein is in grams for free user
     Then It should display the unit as "g" for free user for free user

  @MealSection13
  Scenario: Verify unit of measurement for Fat is in grams for free user
     Then It should display the unit as "g" for free user for free user
    
    @MealSection13 
     Scenario: Validate the text "calories" in pre-meal			
     ThenUser should see text "calories" after the calorie value in pre meal		
     
    @MealSection14 
     Scenario: 			
     ThenUser should see text "calories" after the calorie value in pre meal																		

