package com.test.testng.calsses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglePractice {
	
	
    @Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\WORKSPACE\\\\SeleniumProject\\\\Resources\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}

}
