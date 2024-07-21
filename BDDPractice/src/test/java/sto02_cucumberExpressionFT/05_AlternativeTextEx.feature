Feature: Add to Cart Feature

Scenario: Add From Store

Given Add One Quantity to the Cart
When I am On the Store Page
Then I add a "Product Name" to the Cart
And I See Product in the Cart

Scenario: Add From Product

Given Add One Quantity to the Cart
When I am On the Product Page
Then I add a "Product Name" to the Cart
And I See Product in the Cart