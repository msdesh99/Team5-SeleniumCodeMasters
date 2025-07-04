@premiumuserexercisefullpage
Feature: Exercise schedule for premium user exercise fullPage

Background: User is Logged into the app for premium user exercise fullPage
Given  User is on Launch Page 
When User enters valid login credetnial for "premiumUser" 
#And User logs in and navigates to "Logbook" option for premium user logbook page
And User logs in and clicks "Exercise" option from the side panel for premium user homePage
And User is on Exercise and clicks "View Full Schedule" option for premium user exercise fullPage

Scenario: Verify page title is displayed for premium user exercise fullPage
Then User should see title "Today's Exercise Schedule" for premium user exercise fullPage

Scenario: Verify "Back to Home" button is visible for premium user exercise fullPage
Then User should see "Back to Home" button on the page for premium user exercise fullPage

Scenario Outline: Verify different section is displayed for premium user exercise fullPage
Then "<tab>" section should be visible for premium user exercise fullPage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Verify Exercise name is displayed under differnt tabs for premium user exercise fullPage
Then Exercise name is displayed under "<tab>" tab for premium user exercise fullPage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Verify Exercise description is displayed under different tabs for premium user exercise fullPage
Then Description is shown below the Exercise name under "<tab>" for premium user exercise fullPage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Duration is displayed under different tabs for premium user exercise fullPage
Then "Duration" is displayed under "<tab>" tab for premium user exercise fullPage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Calories is displayed under different tabs for premium user exercise fullPage
Then "Calories" is displayed under "<tab>" tab for premium user exercise fullPage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Intensity is displayed under different tabs for premium user exercise fullPage
Then "Intensity" is displayed under "<tab>" tab for premium user exercise fullPage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario: Verify total duration matches the sum of individual workout durations for premium user exercise fullPage
Then total "Duration:" should equal the sum of all individual calories for premium user exercise fullPage 

Scenario: Verify total calories matches the sum of individual workout calories for premium user exercise fullPage
Then total "Calories:" should equal the sum of all individual calories for premium user exercise fullPage
