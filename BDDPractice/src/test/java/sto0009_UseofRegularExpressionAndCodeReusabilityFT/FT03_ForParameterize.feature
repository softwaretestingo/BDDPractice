Feature:

Scenario Outline: User Page Default Login
 
Given FT03_User is on the netbanking landing page
When FT03_User login into application with "<UserName>" and password "<Password>"
Then FT03_Home page is displayed
And FT03_Cards are displayed

Examples:
# Inside Bracket Whatever you have given same name should be given here so that it will treat that as header

	|	UserName	|	Password		|
	|	User1	|	11111111		|
	|	User2	|	22222222		|
	|	User3	|	33333333		|