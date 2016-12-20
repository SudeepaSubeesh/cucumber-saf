Feature: Login action

Scenario: Successful login with valid credentials

Given User is on Login page
When User enters Credentials and Login
Then successful login message is displayed

