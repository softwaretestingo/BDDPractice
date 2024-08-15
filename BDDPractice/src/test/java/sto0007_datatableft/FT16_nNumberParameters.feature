Feature: Passing N Number Parameters
Scenario: Passing N Number of Parameters to a Page

Given user is on the Register page
When User enter All the Required Details
| SoftwareTestingo |
| Blog |
| SoftwareTestingo@gmail.com |
| softwaretestingo |
Then User will redirect to Account Create Page
And User can see Your Account Has Been Created! Header