Feature: Application Login
@normal @smoke
Scenario: Login as Normal User

Given Normal User is on the CucumberOptions login page
When Normal User login into the CucumberOptions application
Then CucumberOptions Normal user My account page will be displayed
And CucumberOptions Normal User My Account Header will be displayed	

@admin @sanity @regression
Scenario: Login as Admin User

Given Admin User is on the CucumberOptions login page
When Admin User login into the CucumberOptions application
Then CucumberOptions Admin user My account page will be displayed
And CucumberOptions Admin User My Account Header will be displayed	

@guest @smoke
Scenario: Login as Guest User

Given Guest User is on the CucumberOptions login page
When Guest User login into the CucumberOptions application
Then CucumberOptions Guest user My account page will be displayed
And CucumberOptions Guest User My Account Header will be displayed	

@test
Scenario: Login as Test User

Given Test User is on the CucumberOptions login page
When Test User login into the CucumberOptions application
Then CucumberOptions Test user My account page will be displayed
And CucumberOptions Test User My Account Header will be displayed
