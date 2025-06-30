Feature: User Login with valid Credentials

Scenario:  Verify user can login sucerssfully 
Given  User click on login button of Launch Page 
When User enters userid "Team05@gmail.com" and password "Usanumpy@2024" 
Then User should redirected to Homepage

Scenario: Verify login form header is displayed on LoginPage
Given User is on SweetBalance homepage for UI verfication
When User clicks on "Login" link for UI verfication
Then User should see "Welcome back" heading on Login Page

Scenario: Verify sub text of the header on LoginPage
When User clicks on "Login" link for UI verfication
Then  User should see "Sign in to your account or create a new one" subheading on LoginPage

Scenario: Verify presence of close button on LoginPage
When User clicks on "Login" link for UI verfication
Then  User should see close button at the right corner on Login Page

Scenario: Verify email input field is displayed on LoginPage
When User clicks on "Login" link for UI verfication
Then  User should see an input field to enter email on Login page

Scenario: Validate placeholder text in email field on Login Page
When User clicks on "Login" link for UI verfication
Then  User should see text "Enter Email" in email field placeholder on Login Page

Scenario: Verify Continue with Email button is displayed onLogin Page 
When User clicks on "Login" link for UI verfication
Then  User should see a "Continue with email" button on Login page

Scenario: Verify Continue with Email is enabled on Login Page
When User clicks on "Login" link for UI verfication
Then  User should see "Continue with email" button to be enabled on Login Page

Scenario: Verify Continue with Google button is displayed on login Page
When User clicks on "Login" link for UI verfication
Then User should see a "Continue with Google" button on Loginpage

Scenario: Verify OR separator is visible on Login Page
When User clicks on "Login" link for UI verfication
Then : User should see an "OR" separator on Login Page ofSweet

Scenario: Verify Terms and Privacy message is displayed on Login Page
When User clicks on "Login" link for UI verfication
Then : User should see "By continuing you agree to our T&C and Privacy" on login page

	Scenario: Verify email input accepts valid existing email on login Page
	    Given User clicks on "Login" link for UI verfication
	    When Registered user clicks continue with email button after entering a valid existing email on Login Page
	    Then User should get password field on login Page

  Scenario: Verify email input rejects invalid email on login Page
    Given User clicks on "Login" link for UI verfication
    When User enters an invalid email on login Page
    Then Email field should show validation error on login Page

  Scenario: Verify password field in login page on login Page
    Given User clicks on "Login" link for UI verfication
    When Registered user clicks continue with email button after entering a valid email on login page 
    Then User should see Sign in button on login Page

  Scenario: Verify sub text on login Page
    Given User clicks on "Login" link for UI verfication
    When User clicks continue with email button after entering a valid email on login Page
    Then User should see email id in sub text on login Page

  Scenario: Verify presence of forgot password link on login Page
    Given User clicks on "Login" link for UI verfication
    When Registered user clicks continue with email button after entering a valid email
    Then User should see "Forgot password?" link on login Page

  Scenario: Verify presence of placeholder in password field on login Page
    Given User clicks on "Login" link for UI verfication
    When Registered user clicks continue with email button after entering a valid email on login Page1
    Then User should see text "Enter your password" as placeholder in password field on login Page

  Scenario: Verify password input accepts valid existing user on login Page
    Given User clicks on "Login" link for UI verfication
    When Registered user clicks sign in after entering password on login Page
    Then User should be navigated to home page on login Page

  Scenario: Verify email input accepts valid new email on login Page
    Given User clicks on "Login" link for UI verfication
    When Unregistered user clicks continue with email button after entering a valid new email on login Page
    Then User should get "Complete your profile" form on login Page



