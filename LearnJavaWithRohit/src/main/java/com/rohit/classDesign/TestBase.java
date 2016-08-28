package com.rohit.classDesign;

/*
 * @auth: Rohit
 * @date: 19/04/16
 * @quest: Which line there will be error;
 */
public class TestBase implements Base {
	boolean checkFlag(){  // *2
		return false;
	}
	
	public static void main(String arg[]){
		System.err.println(new TestBase().checkFlag()); // *3
	}
	
}
