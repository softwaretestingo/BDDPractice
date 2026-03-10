Feature: Search a Product

@parallel
Scenario: Search Experience

Given User is on the Product Landing Page
When User Search "Powder Canister" in the SearchBox
Then "Powder Canister" product Should be Displayed
And Validate Proudct Name

@parallel
Scenario: Search Experience

Given User is on the Product Landing Page
When User Search "Calvin Klein CK One" in the SearchBox
Then "Calvin Klein CK One" product Should be Displayed
And Validate Proudct Name

@parallel
Scenario: Search Experience

Given User is on the Product Landing Page
When User Search "Apple HomePod Mini Cosmic Grey1" in the SearchBox
Then "Apple HomePod Mini Cosmic Grey" product Should be Displayed
And Validate Proudct Name