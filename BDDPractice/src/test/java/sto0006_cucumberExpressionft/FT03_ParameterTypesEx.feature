Feature: Regular Expression Example
Scenario: Login as Admin User

Given FT03_User is on the login page
When FT03_User Enter 1, 3.5, "UserName", {}  Details
Then FT03_User Profile Page Will Be Display
And FT03_User Details Will Be Display