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

