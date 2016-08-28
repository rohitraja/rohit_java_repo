package com.rohit.recurtion;

public class BinaryByRecurtion {
	
	public static void binaryDigit(int base10){
		if(base10==0)
			return;
		else{
			binaryDigit(base10/2);
			System.out.print(base10%2);
		}
	}
	
	
	public static void main(String ar[]){
		binaryDigit(64);
	}

}
