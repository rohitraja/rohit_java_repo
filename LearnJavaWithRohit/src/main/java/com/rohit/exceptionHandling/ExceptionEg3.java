/**
 * 
 */
package com.rohit.exceptionHandling;

/**
 * @author Rohit Raja
 * @discription: Question asked in Pega system.
 * @ans: It will print only Before Excetion, 
 * aftere this it will exit the code no "finally" block will be executed
 *
 */
public class ExceptionEg3 {

	public static void main(String[] args) {

		try {
			System.out.println("Before Exception");
			System.exit(0);
		} finally  {
			System.out.println("finally block");
		}
		
		

	}

}
