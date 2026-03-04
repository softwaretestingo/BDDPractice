Feature: Add to Cart Feature
Scenario: Add From Store

Given FT06_Go to the Product Page
When FT06_I am On the Product Page
Then FT06_I have add a "Product Name" into the Cart
And FT06_I Can See Product in the Cart
And FT06_I Can See Store in the Cart