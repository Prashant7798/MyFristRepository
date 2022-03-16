package com.test.testng.calsses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	
	@Test(description="Verify that user is able to login with valid cridential",priority=2,groups={"smoke","sanity","regression"})
	public void TC1() {
		System.out.println("I am entering valid username");
		System.out.println("I am entering validn password");
		System.out.println("Click on login button");
		System.out.println("Verify the Dashboard lable");
		//System.out.println("I am frist test case");
		//Excepted -User should be ablle to login and navigate to dashboard page
		SoftAssert obj=new SoftAssert();
		//Assert.assertEquals(false, true);
		obj.assertEquals("MyInfo", "Dashboard");
		System.out.println("I am after assert fail");
		
	}
	
	@Test(description="Verify that system should not allow to login with invalid credential",priority=1,groups= {"sanity"})
	public void TC2() {
		System.out.println("I am entering Invalid username");
		System.out.println("I am entering validn password");
		System.out.println("Click on login button");
		System.out.println("Verify the error massage");
		Assert.assertEquals("Invalid credential", "Invalid credential");
		System.out.println("I am after assert pass");
		
	}
	
	@Test(enabled=true,description="Verify the forgot password functionality",groups= {"regression"},dependsOnMethods="TC2")
	public void TC3() {
		System.out.println("I am third test case");
		Reporter.log("I am Login information from TC3");
		
	}
	
    //sanity 2,smoke 1,regression 2
	



}
