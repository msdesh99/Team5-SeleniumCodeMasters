Feature: Upgrade to Premium Subscription
Background:
Given User is on stepthroughonbardingpage for upgrading the page

Scenario: Verify User able to do payment with valid payment details
When User clicks the "Pay $9.99 USD" button with valid payment details
Then User should be redirected to the confirmation or home page with premium access enabled

Scenario: verify user able to redirect to free user page
When User clicks the free user button with valid payment details
Then User should be redirected to the free user page frim steponboarding

