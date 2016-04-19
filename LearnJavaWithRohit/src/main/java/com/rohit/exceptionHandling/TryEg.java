package com.rohit.exceptionHandling;

import java.io.IOException;
/*
 * @auth: Rohit
 * @date: 19/04/16
 * @disc: Oracle question-> Try catch block can catch only those exception which has the possibility 
 *     	  to occure, else it will compiler error "Unreachable catch block for IOException. 
 *     	  This exception is never thrown from the try statement body"
 */

public class TryEg {

	public static void main(String[] args) {
		
		try {
			System.out.println("Hi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Hi");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
