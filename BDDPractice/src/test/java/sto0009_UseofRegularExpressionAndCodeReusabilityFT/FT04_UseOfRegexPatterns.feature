Feature:

# Scenario Outline: Run The Tests or Scenario With Different Data Sets, That means for parameterizing
# Scenario: When you want to pass some data to a step then that time no need to use scenario outline and example.
#			In Scenario we are running a specific step by utilizing the passed data

Scenario Outline: User Page Default Login
 
Given FT04_User is on the netbanking landing page
When FT04_User login into application with "<UserName>" and password "<Password>"
Then FT04_Home page is displayed
And FT04_Cards are displayed

Examples:
# Inside Bracket Whatever you have given same name should be given here so that it will treat that as header

	|	UserName	|	Password		|
	|	User1	|	11111111		|
	|	User2	|	22222222		|
	|	User3	|	33333333		|