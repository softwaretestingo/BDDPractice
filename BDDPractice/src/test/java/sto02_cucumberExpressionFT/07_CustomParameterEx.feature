Feature: Add to cart
Rule: Add from store

Scenario Outline: Add one quantity to the cart

Given I am in the Store page
When I add a "<product_name>" into my Cart
Then I can see the selected product in my Cart page

Examples:
| product_name |
| Blue Shoes |
| Red Shoes |