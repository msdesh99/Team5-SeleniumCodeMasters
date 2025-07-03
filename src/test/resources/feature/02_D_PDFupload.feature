Feature: Blood Report Upload Modal

Scenario: Verify upload box supports drag & drop on PDF upload Page
    Given User is on blood report modal
    When User hovers over the upload box on PDF upload Page
    Then Upload box should show drag & drop interaction on PDF upload Page

  Scenario: Verify supported file types (PDF) on PDF upload Page   
    When User tries to upload a non-PDF file
    Then User should see "Only PDF files are supported" error on PDF upload Page

  Scenario: Verify file size limit (10MB) on PDF upload Page
    
    When User uploads a PDF file over 10MB on PDF upload Page
    Then User should see "File exceeds 10MB" error on PDF upload Page of Blood Report

  Scenario: Verify valid PDF file upload on PDF upload Page
    
    When User uploads valid PDF file
    Then Upload should see processing percentage bar on PDF upload Page

  Scenario: Verify "Upload & Process" button is enabled after valid upload on PDF upload Page
    
    When User uploads valid PDF file on PDF upload Page
    Then "Upload & Process" button should be enabled on PDF upload Page

  Scenario: Verify upload cancel button functionality on PDF upload Page
    
    When User clicks "Cancel" on PDF upload Page
    Then Modal should be closed and user returned to previous screen on PDF upload Page

  Scenario: Verify "Upload & Process" processes the file on PDF upload Page 
    When User clicks "Upload & Process" after uploading valid file on PDF upload Page
    Then User should see Report analysis on PDF upload Page

  Scenario: Verify onboarding button in report analysis on PDF upload Page
 
    When User clicks "Upload & Process" after uploading valid file on PDF upload Page
    Then User should see onboarding button on PDF upload Page

  Scenario: Validate fields on report analysis on PDF upload Page
    When User clicks "Upload & Process" after uploading valid file on PDF upload Page for data
    Then User should see Blood Test Results, Complete Blood Count, Medical Conditions, Abnormal Values, Recommendations on PDF upload Page 