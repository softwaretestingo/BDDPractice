Feature: Application Login Feature

Scenario: Login as Notmal User

Given User is on the login page
When user enter the email, password and click the login the button
Then My account page will be displayed
And Logout link will displayed