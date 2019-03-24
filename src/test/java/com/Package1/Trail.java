package com.Package1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trail {
	
	
	@Test
	public void loginTest() throws Throwable 
	{
		System.out.println("hi...");
	}
	@BeforeTest
	public void Test() {
		System.out.println("hi abhi");
	}

}
