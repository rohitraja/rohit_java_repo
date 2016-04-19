package com.rohit.generalQues;

public class Solution2 {

	public static void main(String[] args) {
		String s =null;
		System.out.println(getB1()&getB2());
		System.out.println(getB1()&&getB2());
		System.out.println("*************************");
		System.out.println(getB1()|getB2());
		System.out.println(getB1()||getB2());
		System.out.println("**************************");

	}

	private static Boolean getB1() {
		System.out.println("B1");
		return false;
	}
	private static Boolean getB2() {
		System.out.println("B2");
		return true;
	}
}
