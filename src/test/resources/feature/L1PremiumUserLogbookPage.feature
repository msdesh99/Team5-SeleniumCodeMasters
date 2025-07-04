@premiumlogbook
Feature: Premium User Logbook Page validation
Background: User is Logged into the app for premium user logbook page
Given  User is on Launch Page 
When User enters valid login credetnial for "premiumUser" 
And User logs in and navigates to "Logbook" option for premium user logbook page

@sectionPresence
Scenario Outline: Verify presence and title of "<section>" section for premium user logbook page
Then User should see "<section>" for premium user logbook page
Examples:
| section |
| Blood Glucose Tracker |
| Meal & Nutrition |
| Physical Activity |
| Medication Dosage |
| Log Review |

@colorcode
Scenario Outline: Verify colour codes for "<tab>" for premium user logbook page
Then User should see "<color>" for "<tab>" for premium user logbook page
Examples: 
| tab | color |
| Fasting | violet |
| Pre-Meal | emerald |
| Post-Meal |amber |
| Bedtime | rose |

@bloodsugarrange
Scenario Outline: Verify Fasting glucose type "<range>" displayed for "<tab>" for premium user logbook page
Then User should see the range for "<tab>" be "<range>" for premium user logbook page
Examples:
| tab | range |
| Fasting | 70-100 mg/dL |
| Pre-Meal | 70-130 mg/dL |
| Post-Meal | <180 mg/dL |
| Bedtime | 100-140 mg/dL |

@daysonxaxis
Scenario Outline: Verify last "7" are displayed on X-axis for "<tab>" for premium user logbook page
Then User should see the X-axis display the last "7" days ending today for "<tab>" for premium user logbook page
Examples:
| tab |
| Blood Glucose Tracker |
| Physical Activity |
# not working | Medication Dosage |
#not working| Daily Nutrition Breakdown |

@yAxisforBlooddailyNutrition
Scenario Outline: Verify Y-axis starts at "<min>" and ends at "<max>" in "<tab>" for premium user logbook page
Then User should see Y-axis minimum value "<min>" and maximum value  "<max>" in "<tab>" for premium user logbook page
Examples:
| tab | min | max |
| Blood Glucose Tracker | 70 | 180 |

@iconPremiumUserLogbook
Scenario Outline: Verify icon for "<tab>" section is displayed for premium user logbook page
Then User should see Icon  on the left side of "<tab>" title for premium user logbook page
Examples: 
| tab |
| Meal & Nutrition |
| Physical Activity |
| Medication Dosage |

@mealsection
Scenario Outline: Verify the presence of "<section>" section in Meal & Nutrition section for premium user logbook page
Then User should see the section "<section>" for premium user logbook page
Examples:
| section |
| 7-Day Aggregate Nutrition |
| Daily Nutrition Breakdown |

@colorAggregateNutrition
Scenario Outline: Verify text color of "<tab>" in 7-day aggregate nutrition section for premium user logbook page
Then User should see "<tab>" text colour "<color>" for premium user logbook page
Examples:
| tab | color |
| Carbs | #FF6384 |
| Protein | #36A2EB |
| Fats | #FFCE56 | 

@yAxisForPhysicalActivity
Scenario: Verify Y-axis has text "Calories" in "Physical Activity" section calories for premium user logbook page
Then User should see y-axis  clearly labeled with the text "Calories" in "Physical Activity"

@barfornoactivitylog
Scenario: Verify bar is not displayed in chart when physical activity not logged home page for premium user logbook page
Then User should see no bars in the chart when Physical Activity not logged in home page for premium user logbook page

@barchartafteractivityadded
Scenario: Verify display of in chart when physical activity log is added home page for premium user logbook page
When User clicks "<Home>" from logbook page for premium user logbook page 
Then User clicks Physical Activity from Add Data section and adds the Physical activity details for premium user logbook page
Then User clicks logbook page for premium user logbook page
Then User should see bars  in the chart when Physical Activity "<activity>" log in Physical Activity for premium user logbook page

