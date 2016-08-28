package com.rohit.recurtion;

public class Recurtion1 {

	public static int sum(int x,int y){
		if(x==0)
			return y;
		else
			return sum(x-1,x+y);
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum(4,5));

	}

}
