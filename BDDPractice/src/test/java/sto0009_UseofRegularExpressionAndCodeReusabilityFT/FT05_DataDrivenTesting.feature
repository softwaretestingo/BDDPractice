Feature:

Scenario: Registration Page 
 
Given FT05_User is on the Registration page
When FT05_User Register With the Details
|	Rakesh	|
|	Sahu		|
|	testuser@gmail.com	|
|	1234567890	|
Then FT05_Home page is displayed
And FT05_Cards are displayed
