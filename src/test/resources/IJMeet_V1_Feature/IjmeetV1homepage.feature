Feature: IJMeet_V1_Home_Page

  Scenario: To verify IJMeet logo is Visible
    Then to check visibility of IJMeet Logo
  
  
	Scenario: Sign In Scenario
	Given User clicks on sign in button
	When User enters valid email address and password
	And select remember me check box
	Then click on sign in button
	And click on Schedule Meeting icon
	And select TimeZone
#	Then User Navigated to home page

