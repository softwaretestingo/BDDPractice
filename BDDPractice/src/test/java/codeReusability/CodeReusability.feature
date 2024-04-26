Feature: Application Login
Scenario: Login as Admin User

Given User is on the login page
When User login into the application with username "admin" and password "password123"
Then My account page will be displayed
And My Account Header will be displayed	

Scenario: Login as Normal User

Given User is on the login page
When User login into the application with username "normaluser" and password "password456"
Then My account page will be displayed
And My Account Header will be displayed	