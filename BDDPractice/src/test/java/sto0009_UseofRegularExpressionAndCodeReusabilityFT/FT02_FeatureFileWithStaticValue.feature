Feature:
Scenario: Admin Page Default Login

Given FT02_User is on the netbanking landing page
When FT02_User login into application with "admin" and password "1234"
Then FT02_Home page is displayed
And FT02_Cards are displayed

#Reusable

Scenario: User Page Default Login
 
Given FT02_User is on the netbanking landing page
When FT02_User login into application with "user" and password "5678"
Then FT02_Home page is displayed
And FT02_Cards are displayed
