#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Registration Action
This Feature will test User Registration

@tag1
Scenario: User Details Entered
Given User is on Home Page
When User Navigates to Registration Page
	And User Enters FirstName and LastName
Then Message Displayed details Entered Successfully

@tag2
Scenario: Updated User Marital Status
When User Selects Marital Status
Then Message Displayed Updated Status 

@tag3
Scenario: Updated User Hobbies
When User Selects Hobbies
Then Message Displayed Selected Hobbies 

@tag4
Scenario: Updated User Country Information
When User selects Country
Then Message Displayed Updated Country 

@tag5
Scenario: Updated Date of Birth
When User Enters Date of Birth
Then Message Displayed Date of Birth Updated 

@tag6
Scenario: Successfully Entered User Contact Information
When User Enters PhoneNumber and UserName
	And User Enters Email
Then Message Displayed Updated Contact Details 

@tag7
Scenario: Successfully Uploaded Picture
When User Uploads Profile Picture
Then Message Displayed Succefully Updated Profile Picture 

@tag8
Scenario: Successfully Updated About User
When User Enters Bio
Then Message Displayed Successfully Bio Updated 

@tag9
Scenario: Successfully Entered Passwords
When User Enters Password and Confirm Password
Then Message Displayed Entered Password

@tag10
Scenario: Successfully Submitted
When User Submits the Application
Then Message Displayed Successfully Submitted 