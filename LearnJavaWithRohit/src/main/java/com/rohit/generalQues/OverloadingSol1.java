package com.rohit.generalQues;


public class OverloadingSol1 {
	
	public void load(Long val){
		System.out.println("Long");
	}
	public void load(Short val){
		System.out.println("Short");
	}
	public void load(int val){
		System.out.println("int");
	}
	
	public static void main(String arg[]){
		OverloadingSol1 obj = new OverloadingSol1();
		Long x = (long) 10.00;
		int y = 2;
		Short z =1;
		obj.load(y);
		obj.load(z);
	}

}
