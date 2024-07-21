Feature: Add to Cart Feature
Scenario: Add From Store

Given Add One Quantity to the Cart
When I'm On trhe Store Page
Then I add a "Product Name" to the Cart
And I See 1 Product in the Cart
And I See 2 Products in the Cart