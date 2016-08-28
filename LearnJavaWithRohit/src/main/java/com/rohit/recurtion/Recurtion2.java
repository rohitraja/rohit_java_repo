package com.rohit.recurtion;

public class Recurtion2 {
	
	public static int sum(int x){
		if(x==0)
			return 0;
		else
			return x+sum(x-1);
	}
	
	public static void main(String ar[]){
		
		System.out.println(sum(4));
		
	}

}
