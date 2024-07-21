Feature: Application Login
Scenario: Login as Normal User

Given User is on the CucumberOptionsDryRun login page
When User login into the CucumberOptionsDryRun application
Then CucumberOptionsDryRun My account page will be displayed
And CucumberOptionsDryRun My Account Header will be displayed	