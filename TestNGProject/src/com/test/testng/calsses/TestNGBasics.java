package com.test.testng.calsses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
//	BeforeSuite 1---setup system property for chrome
//	BeforeTest 2---LaunchChromeBrowser
//	BeforeClass 3---login to app
//	BeforeMethod 4---enter url
//	Test 5.2---- GogleLogoTest
//	AfterMethod 6---logout from app
//	BeforeMethod 4---enter url
//	Test 5---Googel Title Test
//	AfterMethod6---logout from app
//	BeforeMethod4---enter url
//	Test 5.1---search test
//	AfterMethod6---logout from app
//	AfterClass7 ---Close Browser
//	AfterTest8---delete All Cookies
//	PASSED: searchtest
//	PASSED: GogleLogoTest
//	PASSED: googeltitleTest
	

	//pre--condition annotation--starting with before
	
	@BeforeSuite  //1
	public void setup() {
		System.out.println("BeforeSuite 1---setup system property for chrome");
	}
	
	@BeforeTest  //2
	public void BrowserLaunch() {
		System.out.println("BeforeTest 2---LaunchChromeBrowser");
	}
	
	@BeforeClass //3
	public void login() {
		System.out.println("BeforeClass 3---login to app");
	}
	
	
	@BeforeMethod  //4
	public void enterurl() {
		System.out.println("BeforeMethod4---enter url");
	}
	
	//test cases--starting with @Test
	
	@Test  //5
	public void  googeltitleTest() {
		System.out.println("Test 5---Googel Title Test");
	}
	
	@Test  //5.1
	public void  searchtest() {
		System.out.println("Test 5.1---search test");
	}
	
	@Test  //5.2
	public void  GogleLogoTest() {
		System.out.println("Test 5.2---- GogleLogoTest");
	}
	
	//post condition--starting with @After annotation
	
	@AfterMethod  //6
	public void logout() {
		System.out.println("AfterMethod6---logout from app");
	}
	
	@AfterTest  //8
	public void deleteAllCookies() {
		System.out.println("AfterTest8---delete All Cookies");
	}
	
	@AfterClass  //7
	public void CloseBrowser() {
		System.out.println("AfterClass7 ---Close Browser");
	}
	
	@AfterSuite//9
	public void GenrateTestReport() {
		System.out.println("AfterSuite---9Genrate Test Report");
	}
	
	
	
	
	
	
	
	
	
	

}
