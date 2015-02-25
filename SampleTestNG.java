package com.shweta.tests;

import org.testng.annotations.Test;



public class SampleTestNG {
	
	@Test(dependsOnMethods={"testCaseRegister"})
	public void testCaseLoginTest(){
		System.out.println("Logging into Application");
	}
	
	@Test
	public void testCaseRegister(){
		System.out.println("Registering User");
	}
	
	@Test(dependsOnMethods={"testCaseRegister","testCaseRegister"})
	public void testCasePasswordChange(){
		System.out.println("Password Change");
	}

}
