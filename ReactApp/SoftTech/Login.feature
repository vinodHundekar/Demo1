Feature:  Test Ornage HRM Application
Scenario: Test Sanity Login Functionality

Given  user open Ornage HRM URL
When  user enter valid username and valid password
And User click on login button
Then user is on home page
When get titleon home page and validate
And click on contact menu
Then user fill data for contact
