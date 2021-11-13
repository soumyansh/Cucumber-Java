Feature: User registration
Scenario: User registration with different data
Given When user is on registration page
When user enters following data
	|soumyansh|soumyansh@gmail.com|9999999|
	|Naveen|Naveen@gmail.com|99912349999|
Then user registration is successfull


Scenario: User login with different data
Given When user is on login page
When user enters mapping data
	|Name|Email|Phone|
	|soumyansh|soumyansh@gmail.com|9999999|
	|Naveen|Naveen@gmail.com|99912349999|
Then user login is successfull

