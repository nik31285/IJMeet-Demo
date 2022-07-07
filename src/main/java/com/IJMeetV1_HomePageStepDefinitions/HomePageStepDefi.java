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

}
