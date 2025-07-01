
Feature: Verify Homepage navigation components



Scenario: Verify redirection from Start Today button

    Given User is on SweetBalance homepage

   

    When User click the "Start Today" button

    Then User should be redirected to the login1 page

    

 Scenario: Validate Login link visibility

    When User look at the top right corner

    Then User  should see a link labeled "Login1"

       

 Scenario: Validate Login link redirection

    When User click on the "Login1" link

    Then User should be redirected to the homenavigation page

    

 Scenario: Verify redirection from Check Your Risk button

    When User click on "Check Your Risk" button  

    Then User should be redirected to the assessment modal dialog