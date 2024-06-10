

  Feature: Feature to test login functionlity
	
Scenario Outline: Check login is successful with valid credentials
Given user is on login page
When user is enter <username> and <password>
And click on login button
Then user is navigate to the homepage

  Examples: 
| username  | password |
| student     | Password123|

