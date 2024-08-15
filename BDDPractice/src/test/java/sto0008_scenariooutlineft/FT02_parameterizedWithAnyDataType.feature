Feature: How to Handle Different DataTypes In Parameterization
Scenario Outline: Login Into the application With Different DataType Input

Given User in Application login page
#The Variable Name Should Be Same as the Example Header Name
When User login into the application by username <FirstValue> and password <SecondValue> 
Then My account page Shows
And My Account Header Shows	

Examples:

| FirstValue | SecondValue |
| username1 | 12Name |
| 8dsjkgk58 | password2 |
| 458966 | 3213546 |

# If There are Multiple Examples Are there then all examples will be executed  