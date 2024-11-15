Feature: This is background demo

Background: User is logged in to saucedemo App
Given User is accessing saucedemo login page
When User is enters valid username and password
Then User should be able to nivgate to home page

Scenario: Test Menu Items

And click on breadcrumb icon
Then user should be able to see the menu items

Scenario: verify add to cart functionality


And clicks on Add to button
Then Item should be added to the Cart
