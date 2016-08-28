package com.rohit.recurtion;

public class Recurtion5 {
	
	public static void method(int n){
		
		if(n>0){
			method(--n);
			System.out.print(n);
			method(--n);
		}
	}
	
	public static void main(String arg[]){
		
		method(5);
	}

}
