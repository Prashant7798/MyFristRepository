package com.test.testng.calsses;

import org.testng.annotations.Test;

public class FristTestProject {
	
	@Test
	void setup() {
		System.out.println("Opening Browser");
	}
	
	@Test
	void login() {
		System.out.println("This is Login test");
	}
	
	@Test
	void ClosingBrowser() {
		System.out.println("Closing Browser");
	}

}
