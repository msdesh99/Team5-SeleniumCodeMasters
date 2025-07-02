@premiumLogbook
Feature: Premium User Logbook Page validation
Background: User is Logged into the app for premium user logbook page
Given  User click on login button of Launch Page 
#When User enters userid "Team05@gmail.com" and password "Usanumpy@2024"
When User enters userid "abcd@abcd.com" and password "abcd1234"  
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


