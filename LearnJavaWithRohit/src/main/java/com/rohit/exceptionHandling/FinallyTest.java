package com.rohit.exceptionHandling;
/*
 * @author: Rohit
 * @disc: This is to test finally gets executed 
 * in any case
 */
public class FinallyTest {
	public static boolean check(){
		try {
			return true;
		} finally {
			return false;
		}
	}
	public static void main(String[] args){
		System.out.println(check());
		
	}
}
