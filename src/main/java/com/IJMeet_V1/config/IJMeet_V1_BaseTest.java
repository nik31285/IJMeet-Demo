package com.IJMeet_V1.config;

import java.io.IOException;

import com.IJMeet_V1.keywords.UIKeywords;

import io.cucumber.java.BeforeAll;

public class IJMeet_V1_BaseTest {

	@BeforeAll
	public static void before_all() throws IOException {
		UIKeywords.launchBrowser();
		UIKeywords.launchURL();
	}
}
