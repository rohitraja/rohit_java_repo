package com.rohit.recurtion;

public class Recurtion4 {

	public static void method(int n){
		if(n<=0)
			return;
		if(n>=1000)
			return;
		System.out.print(n);
		System.out.println();
		method(n*2);
		System.out.print(n);
	}
	
	public static void main(String ar[]){
		
		method(0);
	}
}
