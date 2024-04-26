Feature: Application LoginWith Multiple Credentials
Scenario Outline: Login Into the application With 10 Different User Credentials

Given User is on the Application login page
#The Variable Name Should Be Same as the Example Header Name
When User try to login into the application by username "<UserName>" and password "<Password>" 
Then My account page displayed
And My Account Header displayed	

Examples:

| UserName | Password |
| username1 | password1 |
| username2 | password2 |

# If There are Multiple Examples Are there then all examples will be executed  