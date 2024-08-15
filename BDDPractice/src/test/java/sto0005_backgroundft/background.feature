Feature: Application Login With Different User
Background:
Given Setup the Entries in Database
And Launch The Browser Based on config variables
And Hit the Home Page URL of banking site

Scenario: Login as Admin User

#Given Setup the Entries in Database
#And Launch The Browser Based on config variables
#And Hit the Home Page URL of banking site
Given Login Page displayed for user
When Admin User login into the application with Admin Credential username "admin" and password "password123"
Then Admin My account page will be displayed
And Admin My Account Header will be displayed	

Scenario: Login as Normal User

#Given Setup the Entries in Database
#And Launch The Browser Based on config variables
#And Hit the Home Page URL of banking site
Given Normal User is on the login page
When Normal User login into the application with Normal User Credential username "normaluser" and password "password456"
Then Normal My account page will be displayed
And Normal My Account Header will be displayed	