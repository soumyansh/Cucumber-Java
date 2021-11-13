@Smoke
Feature: Login
Scenario Outline: Verify valid login to facebook

Given user navigates to facebook website
When user validates the homepage title
Then user entered the "<username>" username
And user entered the "<password>" password
Then user logged in "<type>"

Examples:
| username | password | type |
| validUsername | validPassword | success |
| invalidUsername | invalidPassword | fail |

