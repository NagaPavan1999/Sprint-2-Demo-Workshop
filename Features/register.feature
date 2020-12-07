Feature: Registration
Background: User navigates to Demo Web Shop home page and click on Register link
@Successful_Registration
Scenario: Successful registration with valid credentials
Description: This feature will test successful registration functionality
Given User is on registration page
When User enters all valid data
Then message displayed Register Successful  

 
@Unsuccessful_Registration
@first_name_field_validation
Scenario: Failure in registration on leaving the first Name empty 
Description: This feature will test Unsuccessful registration functionality
Given User is on registration page
When user leaves first Name blank
And clicks the register button
Then display firstname error message 
@last_name_field_validation
Scenario: Failure in registration on leaving the last Name blank
Given User is on registration page
When user leaves last Name blank and clicks the button
Then display lastname error message
@email_field_validation
Scenario: Failure in registration on incorrect email format 
Given User is on registration page
When user enters all data
But user enters incorrect email format and clicks the button
Then display email error message
@password_field_validation
Scenario: Failure in registration on leaving the password blank 
Given User is on registration page
When user leaves password blank and clicks the button
Then display password error message
@confirm_password_field_validation
Scenario: Failure in registration on leaving the confirm password blank 
Given User is on registration page
When user leaves confirm password blank and clicks the button
Then display confirm password error message