package com.rohit.exceptionHandling;

/*@Auth: Rohit Raja 
 *@Date: 08/05/16
 *@Description: In method overloading can be done only on no of parameter and type of parameter 
 * 
 */
public class OverloadingDef {
	
	public int sum(int a){
		return a;
	}
	public int sum(int a,int b){
		return a+b;
	}
	
//	public String sum(int a){
//		return "Rohit";
//	}
	public double sum(int a,double b){
		System.out.println("int,double");
		return a+b;
	}
	public double sum(double a,double b){
		System.out.println("double,double");
		return a+b;
	}
	
	
	public static void main(String ar[]){
		OverloadingDef obj = new OverloadingDef();
		System.out.println(obj.sum(1,2.02));
	}
	
}
