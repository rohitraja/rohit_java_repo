package com.rohit.exceptionHandling;

/*
 * @dec: Question asked in Pega System
 * output: A Excpetion
 */

class A{
	public void process(){
		System.out.println("A");
	}
}

class B extends A{
	
	public void process() throws RuntimeException{
		super.process();
		if(true) throw new RuntimeException();
		System.out.println("B");
	}
}
public class ExceptonEg2 {
	

	public static void main(String arg[]){
		
		
		A instB = new B();
		
		try {
			instB.process();
		} catch (Exception e) {
			System.out.println(" Exception");
		}
		
		
	}
		
}
