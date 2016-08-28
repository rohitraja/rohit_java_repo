package com.rohit.exceptionHandling;

public class TestClass {
	public static void main(String []args){
		
		Object obj = new Object();
		
		try {
			if(9<10){
				throw new UnsufficientBalanceException("You dont have sufficient balance");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
