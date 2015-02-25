package com.shweta.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class UploadPic {
	
	@Test
	public void uploadPic(){
		//WebDrive Code
		
		
		//actual value and expected value
		String expected ="A";
		String actual ="A";
		//Assertion in TestNG
		Assert.assertEquals(actual, expected);
		Assert.assertTrue(3>12, "Three is not greater than Twelve");
		
	}

}
