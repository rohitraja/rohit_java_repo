package com.rohit.generalQues;

public class StaticSol1 {
	/*
	 * There are two concept of static member and function
	 */
	static String className="StaticSol1";
	String owner ="Rohit";
	
	void print(){
		/*
		 * 1. Static member can be used in Non-Static function or Method
		 */
		System.out.println(className);
	}
	
	public static void owner(){
		/*
		 * 2. Static member can not be used in Non-Static function or Method
		 */
		System.out.println("Owner: "+owner);
	}
	public static void main(String[] args) {
		StaticSol1 sol = new StaticSol1();
		sol.print();

	}

}
