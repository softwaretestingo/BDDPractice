Feature: Add to Cart Feature
Scenario: Add From Store

Given FT04_Add One Quantity to the Cart
When FT04_I'm On the Store Page
Then FT04_I add a "Product Name" to the Cart
And FT04_I See 1 Product in the Cart
And FT04_I See 2 Products in the Cart