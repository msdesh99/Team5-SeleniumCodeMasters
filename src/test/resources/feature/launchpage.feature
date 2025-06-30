Feature: Home Page feature

Scenario: Validate the presence of App Name on the home page 
Given User launches the browser
When User enters the SweetBalance url
Then User should see app name on the top left

Scenario: Validate the presence of policy details
Given User launches the browser
When User enters the SweetBalance url
Then User should see text "Our Terms of Service and Privacy Policy have recently been updated"