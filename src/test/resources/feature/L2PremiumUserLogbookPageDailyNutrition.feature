@premiumlogbookdailynutrition
Feature: Premium User Logbook Page validation for daily nutrition breakdown
Background: User is Logged into the app for premium user logbook page
Given  User is on Launch Page 
When User enters valid login credetnial for "premiumUser" 
And User logs in and navigates to "Logbook" option with no meal logged for premium user logbook page

@nologgedmeals
Scenario: Verify bar chart behavior when user has not logged any meals for premium user logbook page
Then User should see no bars in Daily Nutrition breakdown section for premium user logbook page

@piechart
Scenario: Verify pie chart behavior when user has not logged any meals for premium user logbook page
Then User should see no pie-chart in Daily Nutrition breakdown section for premium user logbook page

@cardsdisplaydailtnutrition
Scenario Outline: Verify "<card>" displays "<value>"  in Daily nutrition breakdown section when there is no logsfor premium user logbook page
Then User should see the "<card>" card  displayed "<value>" for premium user logbook page
Examples:
| card | value |
| Carbs | 0g (0%) |
| Protein | 0g (0%) |
| Fats | 0g (0%) | 

@statisticCardInPhysicalActivitySection
Scenario: Verify the alignment of statistic card on Physical Activity for premium user logbook page
Then User should see exactly "3" statistic cards displayed horizontally for premium user logbook page

@textColorstatisticCard
Scenario Outline: Verify the text colour for "<card>" in Physical Activity on premium user logbook page
Then User should the text in "<color>" for "<card>" in Physical Activity on premium user logbook page
Examples:
| card | color |
| Total Calories | violet |
| Daily Average | amber |
| Peak Day | rose |