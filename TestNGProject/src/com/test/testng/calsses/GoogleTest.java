package com.test.testng.calsses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class GoogleTest {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver,chrome,driver", "..\\\\Resources\\\\chromedriver.exe");
		driver =  new ChromeDriver();  //launch chrome Browser
	}

}
