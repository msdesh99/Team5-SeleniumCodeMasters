Feature: LaunchPage2 feature
Background: User launches the browser and on the launch page of the SweetBalance url
Scenario: Verify the homepage heading is visible
When User checks the heading
Then User should see the heading "Smart Diabetes Tracking Powered by AI" 
Scenario: Verify the Start Today input button is visible
When User checks "Start Today" input button
Then User should see a "Start Today" input button is visible