Feature: Test the Login functionality of OrangeHRM

Scenario: Test the valid login.

Given user is on Loginpage
When user enters Username and Password
And click on Login button
Then user should land on home page

Scenario: Test the valid login1.

Given user is on Loginpage
When user enters Username and Password
And click on Login button
Then user should land on home page