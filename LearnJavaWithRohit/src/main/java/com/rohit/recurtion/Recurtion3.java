package com.rohit.recurtion;

public class Recurtion3 {
	
	public static void method(int n){
		
		if(n>1)
			method(n-1);
		for(int i=0;i<n;i++)
			System.out.print(" * ");
		System.out.println();
	}

	
	
	public static void main(String arg[]){
		method(3);
	}

}
