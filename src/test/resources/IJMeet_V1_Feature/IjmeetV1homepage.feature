Feature: IJMeet_V1_Home_Page

	Scenario: Sign In Scenario
	Given Launch browser and open URL 
	And User clicks on sign in button
	When User enters valid email address and password
	And select remember me check box
	Then click on sign in button
	And click on Schedule Meeting icon
	And Enter Meeting Topic
	And Enter Meeting Description
	And Select date
	And Select Time
	And Set Meeting Duration
	And select TimeZone
	And select Email Template Launguage
	And check on Require meeting passcode
	And Enter Meeting Passcode
	And check on Enable waiting room
	And check on Enable restricted mode
	And on Host Video while starting meeting
	And check on Mute participants option
	Then click on schedule meeting
#	Then User Navigated to home page

