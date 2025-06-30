@loginOnce
Feature: Functional Testing of Exercise Module HomePage for Premium User

Background: User is Logged into the app for premium user homePage
Given  User click on login button of Launch Page 
#When User enters userid "Team05@gmail.com" and password "Usanumpy@2024"
When User enters userid "abcd@abcd.com" and password "abcd1234"  
And User logs in and clicks "Exercise" option from the side panel for premium user homePage

Scenario Outline:Verify success dialog is shown after marking as completed for different tabs for premium user homePage
When User clicks the "Mark as Completed" button for "<tab>" for premium user homePage
Then Success dialog is shown for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

