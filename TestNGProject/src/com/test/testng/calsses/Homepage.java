package com.test.testng.calsses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homepage {
	
	@BeforeMethod
	public void Precondition() {
		System.out.println("Home page Before method");
		
	}
	
	@Test
	public void Tc1() {
		System.out.println("I am home page test case");
		
	}
	
	@AfterMethod
	public void AfterCondition() {
		System.out.println("Home page after method");
		
	}

}
