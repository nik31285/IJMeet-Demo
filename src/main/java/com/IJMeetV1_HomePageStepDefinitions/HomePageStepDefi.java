package com.IJMeetV1_HomePageStepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.IJMeet_V1.keywords.UIKeywords;

import io.cucumber.java.en.*;

public class HomePageStepDefi {
	@Given("Launch browser and open URL")
	public void Launch_browser_and_open_URL() throws IOException {
		UIKeywords.launchBrowser();
		UIKeywords.launchURL();
	}

	@Then("to check visibility of IJMeet Logo")
	public void logo_visibility_check() throws IOException {
		UIKeywords.isVisible();
	}
	
	@And("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() throws IOException {
		UIKeywords.click("signInButton_xpath");
	}

	@When("User enters valid email address and password")
	public void user_enters_valid_email_address_and_password() throws IOException {
		UIKeywords.EnterText("emailAddress_css","valid_email_id");
		UIKeywords.EnterText("password_css","valid_password");
	}
	@When("select remember me check box")
	public void select_remember_me_check_box() throws IOException {
		UIKeywords.click("show_password_css");
		UIKeywords.click("remember_me_css");
		UIKeywords.click("show_password_css");
	}
	@Then("click on sign in button")
	public void click_on_sign_in_button() throws IOException {
		UIKeywords.click("submitSignIn_css");
	}
	@Then("click on Schedule Meeting icon")
	public void click_on_Schedule_Meeting_() throws IOException {
		UIKeywords.click("schedule_meeting_css");
	}
	@Then("select TimeZone")
	public void select_TimeZone() throws IOException {
		UIKeywords.selectDropdown("Time_Zone_css","(GMT+05:30) Asia/Kolkata");
	}
	@And("Enter Meeting Topic")
	public void Enter_Meeting_Topic() throws IOException {
		UIKeywords.EnterText("Meeting_Topic_css", "Meeting_Topic_text");
	}
	@And("Enter Meeting Description")
	public void Enter_Meeting_Description() throws IOException {
		UIKeywords.EnterText("Meeting_Description_css","Meeting_Description_text");
	}
	@And("Select date")
	public void select_date() throws IOException {
		UIKeywords.click("Meeting_Date_css");
		UIKeywords.selectDropdown("Month_Select_css","Jul");
		UIKeywords.selectDropdown("Year_Select_xpath","2022");
		UIKeywords.click("Day");
	}
	@And("Select Time")
	public void select_time() throws IOException {
		UIKeywords.click("MeetingTime_css");
		UIKeywords.clear("MeetingTime_css");
		UIKeywords.EnterText("MeetingTime_css","MeetingTime");
	}
	@And("Set Meeting Duration")
	public void set_Meeting_Duration() throws IOException {
		UIKeywords.selectDropdown("Duration_hours_css","04");
		UIKeywords.selectDropdown("Duration_minutes_css","25");
	}
	@And("select Email Template Launguage")
	public void select_Email_Template_() throws IOException {
		UIKeywords.selectDropdown("Email_Template_Laungauge_css","English");
	}
	@And("check on Require meeting passcode")
	public void check_Require_meeting_() throws IOException {
		UIKeywords.click("Require_meeting_passcode_xpath");
	}
	@And("Enter Meeting Passcode")
	public void Enter_Meeting_Passcode() throws IOException {
		UIKeywords.EnterText("Meeting_passcode_css","Meeting_passcode");
	}
	@Then("check on Enable waiting room")
	public void check_on_enable_waiting_room() throws IOException {
	    UIKeywords.click("Enable_waiting_room_xpath");
	}

	@Then("check on Enable restricted mode")
	public void check_on_enable_restricted_mode() throws IOException {
	    UIKeywords.click("Enable_restricted_mode_xpath");
	}
	@And("on Host Video while starting meeting")
	public void on_Host_Video_while_starting_meeting() throws IOException {
		UIKeywords.click("Host_Video_xpath");
	}
	@And("check on Mute participants option")
	public void check_on_Mute_participants_option() throws IOException {
		UIKeywords.click("Mute_Participant_xpath");
	}
	@Then("click on schedule meeting")
	public void click_on_schedule_meeting() throws IOException {
		UIKeywords.click("Schedule_Meeting_css");
	}
//
//	@Then("User Navigated to home page")
//	public void user_navigated_to_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}


}
