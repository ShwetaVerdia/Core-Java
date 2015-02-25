package com.shweta.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Read_Data {
	@Test(dataProvider="getData")
	public void login(String u, String p){
		System.out.println(u + "----------" + p);
	}
	
	@DataProvider
	public Object[][]getData(){
		Object [][] data = new Object[3][2];
		data[0][0]= "U1";
		data[0][1]= "P1";
		data[1][0]= "U2";
		data[1][1]= "P2";
		data[2][0]= "U3";
		data[2][1]= "P3";
		return data;
	}
	

}
