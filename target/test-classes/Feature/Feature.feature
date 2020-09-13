Feature: Verifying user details

Scenario: Verifying faceboook valid login details
Given user is on the facebook page
When user enters"<username>","<password>"
Then user should click the login button


@Reg
Scenario: Verifying amazon valid login details
Given user is on the amazon page
When user pass the any product
Then user should click the search button

