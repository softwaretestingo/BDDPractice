Feature: Application Login
Scenario: Login as Normal User

Given User is on the CucumberOptions login page
When User login into the CucumberOptions application
Then CucumberOptions My account page will be displayed
And CucumberOptions My Account Header will be displayed	