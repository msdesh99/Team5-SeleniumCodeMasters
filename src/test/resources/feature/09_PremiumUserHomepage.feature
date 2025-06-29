@PremiumUserHomepage
Feature: Home Page Validation for Registered premium Account User

  Background: User is in password auth page

  Scenario: Verify order of text in navigation bar
    Given User click on login button of Launch Page
    When User enters userid "Teamcoders@gmail.com" and password "Numpy@123"
    Then User should see the navigation bar displaying items in the order: Home,Logbook,Dashboard,Education
