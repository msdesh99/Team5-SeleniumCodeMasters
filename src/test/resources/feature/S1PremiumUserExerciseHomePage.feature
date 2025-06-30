@loginOnce
Feature: Functional Testing of Exercise Module HomePage for Premium User

Background: User is Logged into the app for premium user homePage
Given  User click on login button of Launch Page 
#When User enters userid "Team05@gmail.com" and password "Usanumpy@2024"
When User enters userid "abcd@abcd.com" and password "abcd1234"  
And User logs in and clicks "Exercise" option from the side panel for premium user homePage

Scenario: Verify "View Full Schedule" button is displayed on right for premium user homePage
Then "View Full Schedule" button is displayed on the right for premium user homePage

Scenario: Verify navigation to "Today's Exercise Schedule" page for premium user homePage
When User clicks the "View Full Schedule" button for premium user homePage
Then User is redirected to "Today's Exercise Schedule" page for premium user homePage

Scenario: Verify "Warm Up" tab is displayed for premium user homePage
Then "Warm Up" tab is visible for premium user homePage
Scenario: Verify "Main Workout" tab is displayed for premium user homePage
Then "Main Workout" tab is visible for premium user homePage
Scenario: Verify "Cool Down" tab is displayed for premium user homePage
Then "Cool Down" tab is visible for premium user homePage

Scenario: Verify Exercise name is displayed under "Warm Up" tab for premium user homePage
Then Exercise name is displayed under "Warm Up" tab for premium user homePage
Scenario: Verify Exercise name is displayed under "Main Workout" tab for premium user homePage
Then Exercise name is displayed under "Main Workout" tab for premium user homePage
Scenario: Verify Exercise name is displayed under "Cool Down" tab for premium user homePage
Then Exercise name is displayed under "Cool Down" tab for premium user homePage


