Feature: Onboarding Step 1 UI validation


Scenario: Verify navigation to step 1 for onboarding on Blood report page
    
    When User clicks on step for onboarding button on Blood report page
    Then User should navigate to onboarding Step 1 on Blood report page

  Scenario: Verify Step 1 heading is visible on Blood report page
    When User clicks on step for onboarding button on step1heading
    Then Page should display title "So, Which sugar rebellion are we dealing with?" on Blood report page

  Scenario: Verify Step 1 sub text on Blood report page
    When User clicks on step for onboarding button onon step2heading
    Then Page should have sub text "This will help us tailor your plan to your condition" on Blood report page

  Scenario: Progress bar reflects Step 1 of 12 on Blood report page
    When User clicks on step for onboarding button on step throughonboarding
    Then Progress bar should visually indicate "Step 1 of 12" on step throughonboarding

  Scenario: Verify Step 1 progress is highlighted on Blood report page
    When User clicks on step for onboarding button on step throughonboardingProgrss1
    Then Step 1 indicator should be highlighted on Blood report page on stepthroughonborading

  Scenario: Verify options are displayed on stepthroughonboarding
    When User clicks on step forstepthroughonboarding
    Then User should see options labeled "Type 2, I don't know" on Blood report page
