@premiumusexercisehomepage
Feature: Functional Testing of Exercise Module HomePage for Premium User

Background: User is Logged into the app for premium user logbook page
Given  User is on Launch Page 
When User enters valid login credetnial for "premiumUser" 
#And User logs in and navigates to "Logbook" option for premium user logbook page
And User logs in and clicks "Exercise" option from the side panel for premium user homePage
@psce1
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

Scenario Outline: Duration is displayed under different tabs for premium user homePage
Then "Duration" is displayed under "<tab>" tab for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Calories is displayed under different tabs for premium user homePage
Then "Calories" is displayed under "<tab>" tab for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Intensity is displayed under different tabs for premium user homePage
Then "Intensity" is displayed under "<tab>" tab for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

Scenario Outline: Mark as Completed is displayed under different tabs for premium user homePage
Then "Mark as Completed" is displayed under "<tab>" tab for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |

@exerciseMarkasCompleted
Scenario Outline: Verify changes occured after marking as completed for different tabs for premium user homePage
When User clicks the "Mark as Completed" button for "<tab>" for premium user homePage
Then Success dialog appears and changes the button text for "<tab>" for premium user homePage
Then Verify button reverts back after undo for "<tab>" for premium user homePage
Examples:
| tab | 
| Warm Up |
| Main Workout |
| Cool Down |