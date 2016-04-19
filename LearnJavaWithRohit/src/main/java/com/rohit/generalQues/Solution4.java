package com.rohit.generalQues;

/*
 * @auth: Roht
 * @date: 19/04/16
 * @quest: Is all the methods below is an example of 
 */
public class Solution4 {
	public void addElement(Object obj){
		System.err.println("addElement(Object obj)");
	}
	public void addElement(Object[] obj){
		System.err.println("addElement(Object[] obj)");

	}
	public void addElement(int index, Object obj){
		System.err.println("addElement(int index, Object obj)");
		
	}
	
	public static void main(String arg[]){
		Object ab=null;
		Solution4 solution = new Solution4();
		solution.addElement(ab);
	}

}
