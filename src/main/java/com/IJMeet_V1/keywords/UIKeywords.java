package com.IJMeet_V1.keywords;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.IJMeet_V1.utils.ReadPropertyFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	public static ReadPropertyFile rpf=new ReadPropertyFile();
	public static WebDriver driver;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void launchURL() throws IOException {
		String URL=rpf.getAppUrl();
		driver.get(URL);
	}
	public static void isVisible() throws IOException {
		String logo=rpf.get_logo();
		WebElement element = driver.findElement(By.cssSelector(logo));
				System.out.println(element.isDisplayed());
				Assert.assertTrue(element.isDisplayed());
	}
	public static void click() throws IOException {
		String SignIn=rpf.get_SignIn_Button();
		driver.findElement(By.xpath(SignIn)).click();
	}

}
