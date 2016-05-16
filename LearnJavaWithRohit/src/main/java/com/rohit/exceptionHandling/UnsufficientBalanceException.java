package com.rohit.exceptionHandling;

public class UnsufficientBalanceException extends Exception{
	
	public UnsufficientBalanceException(){
		
	}
	public UnsufficientBalanceException(String exceptionString){
		super(exceptionString);
	}

}
