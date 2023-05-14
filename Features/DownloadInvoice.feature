Feature: Valid Users Able To Download Invoice after purchase the order.

@Functional
Scenario: User Able To Login, Purchase And Download Invoice.

Given Verify that home page is visible successfully 
When Users Able To Click On Products Module
Then Users Able To Verify 'ALL PRODUCTS' Text Are Available On The Screen 
When Users Able To Check All the Products Prices Are Displayed And Print In Console 
Then Users Able To Select 'Cotton Silk Hand Block Print Saree' From Display And Verify The Price
When Users Able To Click On Add To Cart Button 
Then Users Able To Verify 'Your product has been added to cart.' And Click On View Cart 
Then Verify The Same Price As I See Before Click On Add To Cart 
When User able to click on the proceed to checkout button
When User Able To Add Comment About My Order
When User Able To Click On Place Order
Then User able to verify Payment Page
And Enter payment details Name on Card, Card Number, CVC, Expiration date
And Click pay and Confirm Order button
Then Verify success message 'Congratulations! Your order has been confirmed!'
When User able to Click on Download Invoice button and verify invoice is downloaded successfully.
And Click on Continue button
And Click On Logout Button 
Then Verify The Text 'Login to your account'
