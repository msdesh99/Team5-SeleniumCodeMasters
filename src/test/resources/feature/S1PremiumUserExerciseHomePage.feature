@loginOnce
Feature: Functional Testing of Exercise Module HomePage for Premium User

Background: User is Logged into the app for premium user homePage
Given  User click on login button of Launch Page 
#When User enters userid "Team05@gmail.com" and password "Usanumpy@2024"
When User enters userid "abcd@abcd.com" and password "abcd1234"  
And User logs in and clicks "Exercise" option from the side panel for premium user homePage

Scenario: Verify "View Full Schedule" button is displayed on right for premium user homePage
Then "View Full Schedule" button is displayed on the right for premium user homePage

Scenario: Verify navigation to "Today's Exercise Schedule" page for premium user home#Page
When User clicks the "View Full Schedule" button for premium user homePage
Then User is redirected to "Today's Exercise Schedule" page for premium user homePage

Scenario Outline: Verify different tabs are displayed for premium user homePage
Then "<tab>" tab is visible for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Verify Exercise name is displayed under differnt tabs for premium user homePage
Then Exercise name is displayed under "<tab>" tab for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Verify Exercise description is displayed under different tabs for premium user homePage
Then Description is shown below the Exercise name under "<tab>" for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

