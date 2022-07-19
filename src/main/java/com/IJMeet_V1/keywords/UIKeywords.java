package com.IJMeet_V1.keywords;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
	public static void EnterText(String key1, String key2) throws IOException {
		String css=rpf.get_value(key1);
		String text=rpf.get_value(key2);
		driver.findElement(By.cssSelector(css)).sendKeys(text);
	}
	public static void click(String key) throws IOException {
		String value=rpf.get_value(key);
		if(key.contains("css"))
		driver.findElement(By.cssSelector(value)).click();
		else
			driver.findElement(By.xpath(value)).click();
	}
	public static void selectDropdown(String dropDownName, String textInList) throws IOException {
		String css=rpf.get_value(dropDownName);
		
	}

}
