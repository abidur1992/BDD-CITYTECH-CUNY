 Feature: Login Action
 
 Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<UserName>" and "<Password>"
	Then Message displayed Login Successfully
 	When User Logout from the Application
	Then Message displayed Logout Successfully
	Examples:
	| UserName | Password   |
	| abidur92 | Fahad0358# |
