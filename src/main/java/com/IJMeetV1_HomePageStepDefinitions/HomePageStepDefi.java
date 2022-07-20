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

	@Then("to check visibility of IJMeet Logo")
	public void logo_visibility_check() throws IOException {
		UIKeywords.isVisible();
	}
	
	@Given("User clicks on sign in button")
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
	public void select_TimeZone() {
//		UIKeywords.selectDropdown("Time_Zone_css","(GMT+05:30) Asia/Kolkata");
	}
//
//	@Then("User Navigated to home page")
//	public void user_navigated_to_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}


}
