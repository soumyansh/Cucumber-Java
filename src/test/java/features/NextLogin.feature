@Smoke@Sanity
Feature: Next Login

Background:
Given user navigates to facebook website
When user validates the homepage title


Scenario Outline: Verify valid login to facebook

Then user entered the "<Validusername>" username
And user entered the "<Validpassword>" password
Then user logged in "<Validtype>"

Examples:
| Validusername | Validpassword | Validtype |
| validUsername | validPassword | success |



Scenario Outline: Verify invalid login to facebook

Then user entered the "<Invalidusername>" username
And user entered the "<Invalidpassword>" password
Then user logged in "<Invalidtype>"

Examples:
| Invalidusername | Invalidpassword | Invalidtype |
| invalidUsername | invalidPassword | fail |
